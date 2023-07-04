/*
2. Abrir el script de la base de datos llamada “jardineria.sql” y ejecutarlo para crear todas las
tablas e insertar datos en las mismas. Deberá obtener un diagrama de entidad relación igual al
que se muestra a continuación:
A continuación, se deben realizar las siguientes consultas sobre la base de datos:
*/

-- Consultas sobre una tabla
-- 1. Devuelve un listado con el código de oficina y la ciudad donde hay oficinas.
use jardinera;
select codigo_oficina, ciudad from jardineria.oficina;

-- 2. Devuelve un listado con la ciudad y el teléfono de las oficinas de España.
select ciudad, telefono from jardineria.oficina
where pais = 'España';

-- 3. Devuelve un listado con el nombre, apellidos y email de los empleados cuyo jefe tiene un código de jefe igual a 7.
select nombre, apellido1, apellido2, email from jardineria.empleado
where codigo_jefe = '7';

-- 4. Devuelve el nombre del puesto, nombre, apellidos y email del jefe de la empresa.
select puesto, nombre, apellido1, apellido2, email from jardineria.empleado
where  codigo_jefe is null;

-- 5. Devuelve un listado con el nombre, apellidos y puesto de aquellos empleados que no sean representantes de ventas.
select nombre, apellido1, apellido2, puesto from jardineria.empleado
where puesto <> 'Representante ventas';

-- 6. Devuelve un listado con el nombre de los todos los clientes españoles.
select nombre from jardineria.empleado
where codigo_oficina like '%-ES';

-- 7. Devuelve un listado con los distintos estados por los que puede pasar un pedido.
select estado from jardineria.pedido
group by estado;
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

-- 9. Devuelve un listado con el código de pedido, código de cliente, fecha esperada y fecha de entrega de los pedidos que no han sido entregados a tiempo.
select codigo_pedido, codigo_cliente, fecha_esperada, fecha_entrega from jardineria.pedido
where fecha_esperada < fecha_entrega;

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

-- 11. Devuelve un listado de todos los pedidos que fueron rechazados en 2009.
select * from jardineria.pedido
where estado = 'Rechazado' and year(fecha_pedido)='2009';

-- 12. Devuelve un listado de todos los pedidos que han sido entregados en el mes de enero de cualquier año.
select * from jardineria.pedido
where month(fecha_entrega)='01' and estado='Entregado'; 

-- 13. Devuelve un listado con todos los pagos que se realizaron en el año 2008 mediante Paypal Ordene el resultado de mayor a menor.
select * from jardineria.pago
where forma_pago = 'Paypal' and year(fecha_pago)='2008'
order by total desc;

-- 14. Devuelve un listado con todas las formas de pago que aparecen en la tabla pago. Tenga en cuenta que no deben aparecer formas de pago repetidas.
select forma_pago from jardineria.pago
group by forma_pago;

-- 15. Devuelve un listado con todos los productos que pertenecen a la gama Ornamentales y que tienen más de 100 unidades en stock. 
-- El listado deberá estar ordenado por su precio de venta, mostrando en primer lugar los de mayor precio.
select * from jardineria.producto
where gama = 'Ornamentales' and cantidad_en_stock > 100
order by precio_venta desc;

-- 16. Devuelve un listado con todos los clientes que sean de la ciudad de Madrid y cuyo representante de ventas tenga el código de empleado 11 o 30.
select * from jardineria.cliente
where ciudad = 'Madrid' and codigo_empleado_rep_ventas in (11, 30);

-- Consultas multitabla (Composición interna)
-- Las consultas se deben resolver con INNER JOIN.
-- 1. Obtén un listado con el nombre de cada cliente y el nombre y apellido de su representante de ventas.
select cliente.nombre_cliente, concat(empleado.nombre, " ", empleado.apellido1, " ", empleado.apellido2) as 'rep ventas' from jardineria.cliente
inner join jardineria.empleado
on cliente.codigo_empleado_rep_ventas = empleado.codigo_empleado;

-- 2. Muestra el nombre de los clientes que hayan realizado pagos junto con el nombre de sus representantes de ventas.
select cliente.nombre_cliente, concat(empleado.nombre, " ", empleado.apellido1, " ", empleado.apellido2) as 'rep ventas' from jardineria.cliente
inner join jardineria.empleado
on cliente.codigo_empleado_rep_ventas = empleado.codigo_empleado
where cliente.codigo_cliente in (select codigo_cliente from jardineria.pago group by codigo_cliente);

-- 3. Muestra el nombre de los clientes que no hayan realizado pagos junto con el nombre de sus representantes de ventas.
select cliente.nombre_cliente, concat(empleado.nombre, " ", empleado.apellido1, " ", empleado.apellido2) as 'rep ventas' from jardineria.cliente
inner join jardineria.empleado
on cliente.codigo_empleado_rep_ventas = empleado.codigo_empleado
where cliente.codigo_cliente NOT in (select codigo_cliente from jardineria.pago group by codigo_cliente);

-- 4. Devuelve el nombre de los clientes que han hecho pagos y el nombre de sus representantes junto con la ciudad de la oficina a la que pertenece el representante.
select t1.nombre_cliente, concat(t2.nombre, " ", t2.apellido1, " ", t2.apellido2) as rep_ventas, t3.ciudad  from jardineria.cliente as t1
inner join jardineria.empleado as t2 on t1.codigo_empleado_rep_ventas = t2.codigo_empleado 
INNER JOIN jardineria.oficina as t3 on t3.codigo_oficina = t2.codigo_oficina
where t1.codigo_cliente in (select t4.codigo_cliente from jardineria.pago as t4 group by codigo_cliente);

-- 5. Devuelve el nombre de los clientes que no hayan hecho pagos y el nombre de sus representantes junto con la ciudad de la oficina a la que pertenece el representante.
select t1.nombre_cliente, concat(t2.nombre, " ", t2.apellido1, " ", t2.apellido2), t3.ciudad from jardineria.cliente as t1
inner join jardineria.empleado as t2 on t1.codigo_empleado_rep_ventas = t2.codigo_empleado
inner join jardineria.oficina as t3 on t2.codigo_oficina = t3.codigo_oficina
where t1.codigo_cliente not in (select codigo_cliente from jardineria.pago group by codigo_cliente) ;

-- 6. Lista la dirección de las oficinas que tengan clientes en Fuenlabrada.
select t1.linea_direccion1, t1.linea_direccion2, t3.ciudad from jardineria.oficina as t1
inner join jardineria.empleado as t2 on t1.codigo_oficina = t2.codigo_oficina
inner join jardineria.cliente as t3 on t2.codigo_empleado = t3.codigo_empleado_rep_ventas
where t3.ciudad = 'Fuenlabrada'
group by t1.codigo_oficina;

-- 7. Devuelve el nombre de los clientes y el nombre de sus representantes junto con la ciudad de la oficina a la que pertenece el representante.
select t1.nombre_cliente, concat(t2.nombre, " ", t2.apellido1), t3.ciudad  from jardineria.cliente as t1
inner join jardineria.empleado as t2 on t1.codigo_empleado_rep_ventas = t2.codigo_empleado
inner join jardineria.oficina as t3 on t2.codigo_oficina = t3.codigo_oficina;

-- 8. Devuelve un listado con el nombre de los empleados junto con el nombre de sus jefes.
select concat(t1.nombre, " ", t1.apellido1, " ", t1.apellido2) as 'empleado', concat(t2.nombre, " ", t2.apellido1, " ", t2.apellido2) as 'nombre jefe' from jardineria.empleado as t1
inner join jardineria.empleado as t2 
on t1.codigo_jefe = t2.codigo_empleado; 

-- 9. Devuelve el nombre de los clientes a los que no se les ha entregado a tiempo un pedido.
select t1.nombre_cliente from jardineria.cliente as t1
inner join jardineria.pedido as t2 on t1.codigo_cliente = t2.codigo_cliente
where t2.estado = 'Entregado' and fecha_entrega>fecha_esperada
group by t1.codigo_cliente;

-- 10. Devuelve un listado de las diferentes gamas de producto que ha comprado cada cliente.
select t1.codigo_cliente, t1.nombre_cliente, t4.gama from jardineria.cliente as t1     
inner join jardineria.pedido as t2 on t1.codigo_cliente = t2.codigo_cliente   
inner join jardineria.detalle_pedido as t3 on t2.codigo_pedido = t3.codigo_pedido
inner join jardineria.producto as t4 on t3.codigo_producto = t4.codigo_producto
group by concat(t1.codigo_cliente, t4.gama)
order by t1.codigo_cliente;
select t1.codigo_cliente, t1.nombre_cliente, t2.codigo_pedido, t3.codigo_pedido, t4.codigo_producto, t4.codigo_producto, t4.gama from jardineria.cliente as t1     -- producto as t4
inner join jardineria.pedido as t2 on t1.codigo_cliente = t2.codigo_cliente   
inner join jardineria.detalle_pedido as t3 on t2.codigo_pedido = t3.codigo_pedido
inner join jardineria.producto as t4 on t3.codigo_producto = t4.codigo_producto;

-- Consultas multitabla (Composición externa)
-- Resuelva todas las consultas utilizando las cláusulas LEFT JOIN, RIGHT JOIN, JOIN.
-- 1. Devuelve un listado que muestre solamente los clientes que no han realizado ningún pago.
select nombre_cliente from jardineria.cliente
left join jardineria.pago on cliente.codigo_cliente = pago.codigo_cliente
where cliente.codigo_cliente not in (select codigo_cliente from jardineria.pago group by codigo_cliente);

-- 2. Devuelve un listado que muestre solamente los clientes que no han realizado ningún pedido.
select nombre_cliente from jardineria.cliente
left join jardineria.pedido on cliente.codigo_cliente = pedido.codigo_cliente
where cliente.codigo_cliente not in (select codigo_cliente from jardineria.pedido group by codigo_cliente);

-- 3. Devuelve un listado que muestre los clientes que no han realizado ningún pago y los que no han realizado ningún pedido.
select nombre_cliente from jardineria.cliente
left join jardineria.pedido on cliente.codigo_cliente = pedido.codigo_cliente
left join jardineria.pago on cliente.codigo_cliente = pago.codigo_cliente
where pedido.codigo_cliente is null or pago.codigo_cliente is null
group by cliente.codigo_cliente;
select cliente.nombre_cliente, pedido.codigo_cliente, pago.codigo_cliente from jardineria.cliente
left join jardineria.pedido on cliente.codigo_cliente = pedido.codigo_cliente
left join jardineria.pago on cliente.codigo_cliente = pago.codigo_cliente
where pedido.codigo_cliente is null or pago.codigo_cliente is null
group by cliente.codigo_cliente;

-- 4. Devuelve un listado que muestre solamente los empleados que no tienen una oficina asociada.
select concat(nombre, " ", apellido1, " ", apellido2) from jardineria.empleado
left join jardineria.oficina on empleado.codigo_oficina = oficina.codigo_oficina
where empleado.codigo_oficina is null;
select concat(nombre, " ", apellido1, " ", apellido2), oficina.codigo_oficina from jardineria.empleado
left join jardineria.oficina on empleado.codigo_oficina = oficina.codigo_oficina;

-- 5. Devuelve un listado que muestre solamente los empleados que no tienen un cliente asociado.
select concat(nombre, " ", apellido1, " ", apellido2) from jardineria.empleado
left join jardineria.cliente on empleado.codigo_empleado = cliente.codigo_empleado_rep_ventas
where codigo_empleado not in (select codigo_empleado_rep_ventas from jardineria.cliente group by codigo_empleado_rep_ventas);
select concat(nombre, " ", apellido1, " ", apellido2), codigo_empleado from jardineria.empleado
left join jardineria.cliente on empleado.codigo_empleado = cliente.codigo_empleado_rep_ventas
where codigo_empleado not in (select codigo_empleado_rep_ventas from jardineria.cliente group by codigo_empleado_rep_ventas);

-- 6. Devuelve un listado que muestre los empleados que no tienen una oficina asociada y los que no tienen un cliente asociado.
select concat(nombre, " ", apellido1, " ", apellido2) from jardineria.empleado
left join jardineria.oficina on empleado.codigo_oficina = oficina.codigo_oficina
left join jardineria.cliente on empleado.codigo_empleado = cliente.codigo_empleado_rep_ventas
where empleado.codigo_oficina is null and cliente.codigo_empleado_rep_ventas is not null
group by empleado.codigo_empleado;
select concat(nombre, " ", apellido1, " ", apellido2) from jardineria.empleado
left join jardineria.oficina on empleado.codigo_oficina = oficina.codigo_oficina
left join jardineria.cliente on empleado.codigo_empleado = cliente.codigo_empleado_rep_ventas
where empleado.codigo_oficina is not null and cliente.codigo_empleado_rep_ventas is null
group by empleado.codigo_empleado;
select concat(nombre, " ", apellido1, " ", apellido2), oficina.codigo_oficina, cliente.codigo_empleado_rep_ventas from jardineria.empleado
left join jardineria.oficina on empleado.codigo_oficina = oficina.codigo_oficina
left join jardineria.cliente on empleado.codigo_empleado = cliente.codigo_empleado_rep_ventas
group by empleado.codigo_empleado;

-- 7. Devuelve un listado de los productos que nunca han aparecido en un pedido.
select nombre from jardineria.producto
left join jardineria.detalle_pedido on producto.codigo_producto = detalle_pedido.codigo_producto
where producto.codigo_producto not in (select codigo_producto from jardineria.detalle_pedido group by codigo_producto); 
select t1.nombre, t2.codigo_producto, t2.codigo_pedido from jardineria.producto as t1
left join jardineria.detalle_pedido as t2 on t1.codigo_producto = t2.codigo_producto
where t1.codigo_producto in (select codigo_producto from jardineria.detalle_pedido group by codigo_producto); 

-- 8. Devuelve las oficinas donde no trabajan ninguno de los empleados que hayan sido los
-- representantes de ventas de algún cliente que haya realizado la compra de algún producto de la gama Frutales. 
select t1.codigo_oficina from jardineria.oficina as t1
left join jardineria.empleado as t2 on t1.codigo_oficina = t2.codigo_oficina
where t2.codigo_empleado not in (select t3.codigo_empleado_rep_ventas from jardineria.cliente as t3      -- codigo auxiliar para extraer los empleados que VENDIERON productos de la gama 'frutales'
	left join jardineria.pedido as t4 on t3.codigo_cliente = t4.codigo_cliente
	left join jardineria.detalle_pedido as t5 on t4.codigo_pedido = t5.codigo_pedido
	left join jardineria.producto as t6 on t5.codigo_producto = t6.codigo_producto
	where t6.gama = 'Frutales'
	group by t3.codigo_empleado_rep_ventas)
group by t1.codigo_oficina;    

select t3.codigo_empleado_rep_ventas from jardineria.cliente as t3      -- codigo auxiliar para extraer los empleados que VENDIERON productos de la gama 'frutales'
	left join jardineria.pedido as t4 on t3.codigo_cliente = t4.codigo_cliente
	left join jardineria.detalle_pedido as t5 on t4.codigo_pedido = t5.codigo_pedido
	left join jardineria.producto as t6 on t5.codigo_producto = t6.codigo_producto
	where t6.gama = 'Frutales'
	group by t3.codigo_empleado_rep_ventas;

select t1.codigo_oficina, t2.codigo_oficina, t3.codigo_empleado_rep_ventas, t4.codigo_cliente, t5.codigo_pedido, t6.codigo_producto, t6.gama from jardineria.oficina as t1
left join jardineria.empleado as t2 on t1.codigo_oficina = t2.codigo_oficina
left join jardineria.cliente as t3 on t2.codigo_empleado = t3.codigo_empleado_rep_ventas
left join jardineria.pedido as t4 on t3.codigo_cliente = t4.codigo_cliente
left join jardineria.detalle_pedido as t5 on t4.codigo_pedido = t5.codigo_pedido
left join jardineria.producto as t6 on t5.codigo_producto = t6.codigo_producto
where t6.gama = 'Frutales'
group by t3.codigo_empleado_rep_ventas;

select * from jardineria.cliente;
select * from jardineria.producto;
select * from jardineria.pedido;
select * from jardineria.detalle_pedido;
select * from jardineria.pago;
select * from jardineria.empleado;
select * from jardineria.oficina;
/*

9. Devuelve un listado con los clientes que han realizado algún pedido, pero no han realizado
ningún pago.
10. Devuelve un listado con los datos de los empleados que no tienen clientes asociados y el
nombre de su jefe asociado.
Consultas resumen
1. ¿Cuántos empleados hay en la compañía?
2. ¿Cuántos clientes tiene cada país?
3. ¿Cuál fue el pago medio en 2009?
4. ¿Cuántos pedidos hay en cada estado? Ordena el resultado de forma descendente por el
número de pedidos.
5. Calcula el precio de venta del producto más caro y más barato en una misma consulta.
6. Calcula el número de clientes que tiene la empresa.
7. ¿Cuántos clientes tiene la ciudad de Madrid?
8. ¿Calcula cuántos clientes tiene cada una de las ciudades que empiezan por M?
9. Devuelve el nombre de los representantes de ventas y el número de clientes al que atiende
cada uno.
10. Calcula el número de clientes que no tiene asignado representante de ventas.
11. Calcula la fecha del primer y último pago realizado por cada uno de los clientes. El listado
deberá mostrar el nombre y los apellidos de cada cliente.
12. Calcula el número de productos diferentes que hay en cada uno de los pedidos.
13. Calcula la suma de la cantidad total de todos los productos que aparecen en cada uno de
los pedidos.
14. Devuelve un listado de los 20 productos más vendidos y el número total de unidades que
se han vendido de cada uno. El listado deberá estar ordenado por el número total de
unidades vendidas.
15. La facturación que ha tenido la empresa en toda la historia, indicando la base imponible, el
IVA y el total facturado. La base imponible se calcula sumando el coste del producto por el
número de unidades vendidas de la tabla detalle_pedido. El IVA es el 21 % de la base
imponible, y el total la suma de los dos campos anteriores.
16. La misma información que en la pregunta anterior, pero agrupada por código de producto.
17. La misma información que en la pregunta anterior, pero agrupada por código de producto
filtrada por los códigos que empiecen por OR.
18. Lista las ventas totales de los productos que hayan facturado más de 3000 euros. Se
mostrará el nombre, unidades vendidas, total facturado y total facturado con impuestos (21%
IVA)
Subconsultas con operadores básicos de comparación
1. Devuelve el nombre del cliente con mayor límite de crédito.
2. Devuelve el nombre del producto que tenga el precio de venta más caro.
3. Devuelve el nombre del producto del que se han vendido más unidades. (Tenga en cuenta
que tendrá que calcular cuál es el número total de unidades que se han vendido de cada
producto a partir de los datos de la tabla detalle_pedido. Una vez que sepa cuál es el código
del producto, puede obtener su nombre fácilmente.)
4. Los clientes cuyo límite de crédito sea mayor que los pagos que haya realizado. (Sin utilizar
INNER JOIN).
5. Devuelve el producto que más unidades tiene en stock.
6. Devuelve el producto que menos unidades tiene en stock.
7. Devuelve el nombre, los apellidos y el email de los empleados que están a cargo de Alberto
Soria.
Subconsultas con ALL y ANY
1. Devuelve el nombre del cliente con mayor límite de crédito.
2. Devuelve el nombre del producto que tenga el precio de venta más caro.
3. Devuelve el producto que menos unidades tiene en stock.
Subconsultas con IN y NOT IN
1. Devuelve el nombre, apellido1 y cargo de los empleados que no representen a ningún
cliente.
2. Devuelve un listado que muestre solamente los clientes que no han realizado ningún pago.
3. Devuelve un listado que muestre solamente los clientes que sí han realizado ningún pago.
4. Devuelve un listado de los productos que nunca han aparecido en un pedido.
5. Devuelve el nombre, apellidos, puesto y teléfono de la oficina de aquellos empleados que
no sean representante de ventas de ningún cliente.
Subconsultas con EXISTS y NOT EXISTS
1. Devuelve un listado que muestre solamente los clientes que no han realizado ningún
pago.
2. Devuelve un listado que muestre solamente los clientes que sí han realizado ningún pago.
3. Devuelve un listado de los productos que nunca han aparecido en un pedido.
4. Devuelve un listado de los productos que han aparecido en un pedido alguna vez.
*/

