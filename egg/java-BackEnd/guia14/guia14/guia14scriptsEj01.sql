/*
 Abrir el script llamado “personal” y ejecutarlo de modo tal que se cree la base de datos
“personal”, se creen las tablas y se inserten todos los datos en las tablas para que quede de la
siguiente manera:
*/

-- a) A continuación, realizar las siguientes consultas sobre la base de datos personal:
-- 1. Obtener los datos completos de los empleados.
use personal;
SELECT * FROM personal.empleados;

-- 2. Obtener los datos completos de los departamentos.
SELECT * FROM personal.departamentos;

-- 3. Listar el nombre de los departamentos.
SELECT nombre_depto FROM personal.departamentos;

-- 4. Obtener el nombre y salario de todos los empleados.
SELECT nombre, sal_emp FROM personal.empleados;

-- 5. Listar todas las comisiones.
SELECT comision_emp FROM personal.empleados;

-- 6. Obtener los datos de los empleados cuyo cargo sea ‘Secretaria’.
SELECT * FROM personal.empleados
WHERE cargo_emp = 'Secretaria';

-- 7. Obtener los datos de los empleados vendedores, ordenados por nombre alfabéticamente.
SELECT * FROM personal.empleados
 WHERE cargo_emp = 'Vendedor'
 ORDER BY nombre;

-- 8. Obtener el nombre y cargo de todos los empleados, ordenados por salario de menor a mayor.
SELECT nombre, cargo_emp FROM personal.empleados
ORDER BY sal_emp asc;
SELECT nombre, cargo_emp, sal_emp FROM personal.empleados
ORDER BY sal_emp asc;

-- 9. Obtener el nombre de o de los jefes que tengan su departamento situado en la ciudad de “Ciudad Real”
SELECT nombre_jefe_depto FROM personal.departamentos
WHERE ciudad = 'Ciudad Real'; 
SELECT nombre_jefe_depto, ciudad FROM personal.departamentos
WHERE ciudad = 'Ciudad Real'; 

-- 10. Elabore un listado donde para cada fila, figure el alias ‘Nombre’ y ‘Cargo’ para las 
-- respectivas tablas de empleados.
SELECT nombre as 'Nombre', cargo_emp as 'Cargo'  FROM personal.empleados;

-- 11. Listar los salarios y comisiones de los empleados del departamento 2000, ordenado
-- por comisión de menor a mayor.
SELECT sal_emp, comision_emp FROM personal.empleados
WHERE id_depto = '2000';

-- 12. Obtener el valor total a pagar a cada empleado del departamento 3000, que resulta
-- de: sumar el salario y la comisión, más una bonificación de 500. Mostrar el nombre del
-- empleado y el total a pagar, en orden alfabético.
SELECT nombre, (sal_emp + comision_emp + 500) as 'total a pagar' FROM personal.empleados
WHERE id_depto = '3000';
SELECT nombre, sal_emp, comision_emp, 500 , id_depto, (sal_emp + comision_emp + 500) as 'total a pagar' FROM personal.empleados
WHERE id_depto = '3000';

-- 13. Muestra los empleados cuyo nombre empiece con la letra J.
SELECT nombre FROM personal.empleados
WHERE nombre LIKE ('J%');

-- 14. Listar el salario, la comisión, el salario total (salario + comisión) y nombre, de aquellos
-- empleados que tienen comisión superior a 1000.
SELECT sal_emp, comision_emp, (sal_emp + comision_emp) as 'salario total', nombre FROM personal.empleados
WHERE comision_emp > 1000;

-- 15. Obtener un listado similar al anterior, pero de aquellos empleados que NO tienen comisión.
SELECT sal_emp, comision_emp, (sal_emp + comision_emp) as 'salario total empleados sin comision', nombre FROM personal.empleados
WHERE comision_emp = 0;

-- 16. Obtener la lista de los empleados que ganan una comisión superior a su sueldo.
SELECT nombre FROM personal.empleados
WHERE comision_emp > sal_emp;
SELECT nombre, sal_emp, comision_emp, (comision_emp-sal_emp) as 'diferencia' FROM personal.empleados
WHERE comision_emp > sal_emp;

-- 17. Listar los empleados cuya comisión es menor o igual que el 30% de su sueldo.
SELECT nombre FROM personal.empleados
WHERE comision_emp <= sal_emp*0.3;
SELECT nombre, sal_emp, comision_emp FROM personal.empleados
WHERE comision_emp <= sal_emp*0.3;

-- 18. Hallar los empleados cuyo nombre no contiene la cadena “MA”
	SELECT nombre FROM personal.empleados
	WHERE nombre NOT LIKE '%MA%';
	SELECT nombre FROM personal.empleados
	WHERE nombre LIKE '%MA%';

-- 19. Obtener los nombres de los departamentos que sean “Ventas”, “Investigación” o ‘Mantenimiento.
SELECT nombre_depto FROM personal.departamentos
WHERE nombre_depto IN ('Ventas', 'Investigación', 'Mantenimiento');

-- 20. Ahora obtener el contrario, los nombres de los departamentos que no sean “Ventas” ni “Investigación” ni ‘Mantenimiento.
SELECT nombre_depto FROM personal.departamentos
WHERE nombre_depto NOT IN ('Ventas', 'Investigación', 'Mantenimiento');

-- 21. Mostrar el salario más alto de la empresa.
SELECT max(sal_emp) FROM personal.empleados;
SELECT * FROM personal.empleados
ORDER BY sal_emp desc;


-- 22. Mostrar el nombre del último empleado de la lista por orden alfabético.
SELECT * FROM personal.empleados
ORDER BY nombre desc
LIMIT 1;

-- 23. Hallar el salario más alto, el más bajo y la diferencia entre ellos.
SELECT max(sal_emp), min(sal_emp), (max(sal_emp) - min(sal_emp)) as 'diferencia' FROM personal.empleados;

-- 24. Hallar el salario promedio por departamento.
SELECT id_depto, avg(sal_emp) FROM personal.empleados
GROUP BY id_depto;

-- Consultas con Having
-- 25. Hallar los departamentos que tienen más de tres empleados. Mostrar el número de empleados de esos departamentos.
SELECT id_depto, count(*) FROM personal.empleados
GROUP BY id_depto
HAVING count(id_depto) > 3;

-- 26. Hallar los departamentos que no tienen empleados
SELECT id_depto FROM personal.empleados
GROUP BY id_depto
HAVING count(*)=0;

-- Consulta con Subconsulta
-- 28. Mostrar la lista de los empleados cuyo salario es mayor o igual que el promedio de la empresa. Ordenarlo por departamento.
SELECT nombre, sal_emp, id_depto FROM personal.empleados
WHERE sal_emp >= (SELECT avg(sal_emp) FROM personal.empleados)     -- avg(sal_emp)=2115384.6153846155
ORDER BY id_depto;

SELECT nombre, sal_emp, empleados.id_depto , nombre_depto FROM personal.empleados
INNER JOIN personal.departamentos
ON personal.empleados.id_depto = personal.departamentos.id_depto
GROUP BY id_emp
HAVING sal_emp > (SELECT avg(sal_emp) FROM personal.empleados)      -- avg(sal_emp)=2115384.6153846155
ORDER BY nombre_depto;


