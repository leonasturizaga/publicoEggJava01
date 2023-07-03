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

-- 15. Mostrar quien gana en cada partido (codigo, equipo_local, equipo_visitante, equipo_ganador), en caso de empate sera null.
select codigo, equipo_local,equipo_visitante, (case when puntos_local > puntos_visitante then equipo_local when puntos_local < puntos_visitante then equipo_visitante else null end) as equipo_ganador from nba.partidos; 
select codigo, equipo_local, equipo_visitante, (puntos_local - puntos_visitante) from nba.partidos;

-- formato condicional CASE no esta en la guia--
SELECT
  CASE 
    WHEN @SelectField1 = 1 THEN Field1
    WHEN @SelectField2 = 1 THEN Field2
    ELSE NULL
  END AS NewField
FROM Table

-- 8. Devuelve un listado con el código de cliente de aquellos clientes que realizaron algún pago en 2008. 
-- Tenga en cuenta que deberá eliminar aquellos códigos de cliente que aparezcan repetidos. Resuelva la consulta:
-- o Utilizando la función YEAR de MySQL.
-- o Utilizando la función DATE_FORMAT de MySQL.    ***https://www.w3schools.com/sql/func_mysql_date_format.asp***
-- o Sin utilizar ninguna de las funciones anteriores.
select codigo_cliente, fecha_pago from jardineria.pago
where year(fecha_pago)=2008;
select codigo_cliente, fecha_pago from jardineria.pago 
where date_format(fecha_pago, "%Y") = '2008';       -- DATE_FORMAT("2017-06-15", "%M %d %Y") => muestra "Junio 15 2017",  
select codigo_cliente, fecha_pago from jardineria.pago
where fecha_pago like '2008%';

-- 10. Devuelve un listado con el código de pedido, código de cliente, fecha esperada y fecha de entrega de los pedidos cuya
-- fecha de entrega ha sido al menos dos días antes de la fecha esperada.
-- o Utilizando la función ADDDATE de MySQL.
-- o Utilizando la función DATEDIFF de MySQL.
select codigo_pedido, codigo_cliente, fecha_esperada, fecha_entrega from jardineria.pedido
where adddate(fecha_entrega, interval 2 day) <=fecha_esperada;      -- ADDDATE(date, INTERVAL value addunit), SELECT ADDDATE("2017-06-15", INTERVAL 10 DAY);
select codigo_pedido, codigo_cliente, fecha_esperada, fecha_entrega from jardineria.pedido
where datediff(fecha_entrega, fecha_esperada) <= -2;     -- DATEDIFF(date1, date2) returns days between (date1 - date2), SELECT DATEDIFF("2017-06-25", "2017-06-15");
select codigo_pedido, codigo_cliente, fecha_esperada, fecha_entrega from jardineria.pedido
where date_add(fecha_entrega, interval 2 day) <=fecha_esperada;     -- DATE_ADD(date, INTERVAL value addunit), SELECT DATE_ADD("2017-06-15", INTERVAL -2 MONTH);  YEAR/MONTH/WEEK/DAY/HOUR/MINUTE 
select codigo_pedido, codigo_cliente, fecha_esperada, fecha_entrega, date_add(fecha_entrega, interval 2 day) from jardineria.pedido
where date_add(fecha_entrega, interval 2 day) <=fecha_esperada;

-- 4. Devuelve el nombre de los clientes que han hecho pagos y el nombre de sus representantes junto con la ciudad de la oficina a la que pertenece el representante. (adicional agrupado, ordenado)
select t1.nombre_cliente, concat(t2.nombre, " ", t2.apellido1, " ", t2.apellido2) as rep_ventas, t3.ciudad  from jardineria.cliente as t1
inner join jardineria.empleado as t2 on t1.codigo_empleado_rep_ventas = t2.codigo_empleado 
INNER JOIN jardineria.oficina as t3 on t3.codigo_oficina = t2.codigo_oficina
where t1.codigo_cliente in (select t4.codigo_cliente from jardineria.pago as t4 group by codigo_cliente)
group by t3.ciudad
order by rep_ventas;

-- 10. Devuelve un listado de las diferentes gamas de producto que ha comprado cada cliente.
select t1.codigo_cliente, t1.nombre_cliente, t4.gama from jardineria.cliente as t1     
inner join jardineria.pedido as t2 on t1.codigo_cliente = t2.codigo_cliente   
inner join jardineria.detalle_pedido as t3 on t2.codigo_pedido = t3.codigo_pedido
inner join jardineria.producto as t4 on t3.codigo_producto = t4.codigo_producto
group by concat(t1.codigo_cliente, t4.gama)
order by t1.codigo_cliente;