-- 12. Obtener el valor total a pagar a cada empleado del departamento 3000, que resulta
-- de: sumar el salario y la comisión, más una bonificación de 500. Mostrar el nombre del
-- empleado y el total a pagar, en orden alfabético.
SELECT nombre, (sal_emp + comision_emp + 500) as 'total a pagar' FROM personal.empleados
WHERE id_depto = '3000';
SELECT nombre, sal_emp, comision_emp, 500 , id_depto, (sal_emp + comision_emp + 500) as 'total a pagar' FROM personal.empleados
WHERE id_depto = '3000';

-- 22. Mostrar el nombre del último empleado de la lista por orden alfabético.
SELECT * FROM personal.empleados
ORDER BY nombre desc
LIMIT 1;

-- 23. Hallar el salario más alto, el más bajo y la diferencia entre ellos.
SELECT max(sal_emp), min(sal_emp), (max(sal_emp) - min(sal_emp)) as 'diferencia' FROM personal.empleados;

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


