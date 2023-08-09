/* CANDADO A
Posición: El candado A está ubicado en la posición calculada a partir del número obtenido en la/s siguiente/s consulta/s:
Teniendo el máximo de asistencias por partido, muestre cuantas veces se logró dicho máximo.
Este resultado nos dará la posición del candado (1, 2, 3 o 4)
Clave: La clave del candado A estará con formada por la/s siguientes consulta/s a la base de datos:
Muestre la suma total del peso de los jugadores, donde la conferencia sea Este y la posición sea centro o esté comprendida en otras posiciones.
*/

-- POSICION CANDADO A = 2
select  count(Asistencias_por_partido) from nba.estadisticas
where Asistencias_por_partido = (select max(Asistencias_por_partido) from nba.estadisticas);
select max(Asistencias_por_partido) from nba.estadisticas;
select * from nba.estadisticas order by Asistencias_por_partido desc;
-- CLAVE CANDADO A = 14043
select t1.Peso, t1.Posicion, t1.Nombre_equipo, t2.conferencia, sum(t1.peso), avg(t1.peso) from nba.jugadores as t1
inner join nba.equipos as t2 on t1.Nombre_equipo=t2.Nombre
where t2.conferencia = 'East' and t1.posicion like '%C%';
select t1.Peso, t1.Posicion, t1.Nombre_equipo, t2.conferencia from nba.jugadores as t1
inner join nba.equipos as t2 on t1.Nombre_equipo=t2.Nombre
where t2.conferencia = 'East' and t1.posicion like '%C%';

/*
CANDADO B
Posición: El candado B está ubicado en la posición calculada a partir del número obtenido en la/s
siguiente/s consulta/s:
Muestre la cantidad de jugadores que poseen más asistencias por partidos, que el numero de
jugadores que tiene el equipo Heat.
Este resultado nos dará la posición del candado (1, 2, 3 o 4)
Clave: La clave del candado B estará con formada por la/s siguientes consulta/s a la base de
datos:
La clave será igual al conteo de partidos jugados durante las temporadas del año 1999.
*/
-- POSICION CANDADO B = 3
select count(jugador) from nba.estadisticas 
where asistencias_por_partido > (select count(nombre_equipo) from nba.jugadores where nombre_equipo='Heat');
select * from nba.estadisticas 
where asistencias_por_partido > (select count(nombre_equipo) from nba.jugadores where nombre_equipo='Heat');
select count(nombre_equipo) from nba.jugadores where nombre_equipo='Heat';
-- CLAVE CANDADO B = 3480
select count(*) from nba.partidos
where temporada like '%99%'
LIMIT 100000; 

/*
CANDADO C
Posición: El candado C está ubicado en la posición calculada a partir del número obtenido en la/s
siguiente/s consulta/s:
La posición del código será igual a la cantidad de jugadores que proceden de Michigan y forman
parte de equipos de la conferencia oeste.
Al resultado obtenido lo dividiremos por la cantidad de jugadores cuyo peso es mayor o igual a
195, y a eso le vamos a sumar 0.9945.
Este resultado nos dará la posición del candado (1, 2, 3 o 4)
Clave: La clave del candado B estará con formada por la/s siguientes consulta/s a la base de
datos:
Para obtener el siguiente código deberás redondear hacia abajo el resultado que se devuelve de
sumar: el promedio de puntos por partido, el conteo de asistencias por partido, y la suma de
tapones por partido. Además, este resultado debe ser, donde la división sea central.
*/
-- POSICION CANDADO C = 1
select ( (select count(codigo) from nba.jugadores as t1 inner join nba.equipos as t2 on t1.nombre_equipo = t2.nombre where t1.procedencia='Michigan' and t2.conferencia='West') / (select count(codigo) from nba.jugadores where peso>195) + 0.9945) as 'valor1/valor2 + 0.9945'from nba.jugadores;
select count(codigo) from nba.jugadores as t1 inner join nba.equipos as t2 on t1.nombre_equipo = t2.nombre
where t1.procedencia='Michigan' and t2.conferencia='West';
select * from nba.jugadores as t1 inner join nba.equipos as t2 on t1.nombre_equipo = t2.nombre
where t1.procedencia='Michigan' and t2.conferencia='West';
select count(codigo) from nba.jugadores where peso>195; 
-- CLAVE CANDADO C = 4753
select sum(puntos_por_partido), sum(asistencias_por_partido), sum(tapones_por_partido), (sum(puntos_por_partido)+ sum(asistencias_por_partido) + sum(tapones_por_partido)) as 'suma' from nba.estadisticas where jugador in (select codigo from nba.jugadores where nombre_equipo in (select nombre from nba.equipos where division='Central'))  LIMIT 100000;
select nombre from nba.equipos where division='Central'  LIMIT 100000;
select codigo from nba.jugadores where nombre_equipo in (select nombre from nba.equipos where division='Central') LIMIT 100000;
select sum(puntos_por_partido), sum(asistencias_por_partido), sum(tapones_por_partido), (sum(puntos_por_partido)+ sum(asistencias_por_partido) + sum(tapones_por_partido)) as 'suma' from nba.estadisticas where jugador =201 LIMIT 100000;

/*
CANDADO D
Posición: El candado D está ubicado en la posición calculada a partir del número obtenido en la/s
siguiente/s consulta/s:
Muestre los tapones por partido del jugador Corey Maggette durante la temporada 00/01. Este
resultado debe ser redondeado. Nota: el resultado debe estar redondeado
Este resultado nos dará la posición del candado (1, 2, 3 o 4)
3
Clave: La clave del candado D estará con formada por la/s siguientes consulta/s a la base de
datos:
Para obtener el siguiente código deberás redondear hacia abajo, la suma de puntos por partido
de todos los jugadores de procedencia argentina.
*/
-- POSICION CANDADO D = 4
select round(tapones_por_partido) from nba.estadisticas where jugador = (select codigo from nba.jugadores where nombre = 'Corey Maggette') and temporada = '00/01';
select codigo from nba.jugadores where nombre = 'Corey Maggette';
select tapones_por_partido from nba.estadisticas where jugador = (select codigo from nba.jugadores where nombre = 'Corey Maggette') and temporada = '00/01';
-- CLAVE CANDADO D = 191
select floor(sum(puntos_por_partido)) from nba.estadisticas where jugador in (select codigo from nba.jugadores where procedencia = 'Argentina');
select codigo, nombre from nba.jugadores where procedencia = 'Argentina';
select jugador, sum(puntos_por_partido) from nba.estadisticas where jugador in (select codigo from nba.jugadores where procedencia = 'Argentina') group by jugador;




select * from nba.equipos LIMIT 100000;
select * from nba.estadisticas LIMIT 100000;
select * from nba.jugadores LIMIT 100000;
select * from nba.partidos LIMIT 100000;


