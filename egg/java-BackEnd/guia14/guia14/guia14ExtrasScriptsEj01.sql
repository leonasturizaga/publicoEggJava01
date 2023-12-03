/*
EJERCICIOS DE APRENDIZAJE EXTRA
1. Abrir el script de la base de datos llamada “nba.sql” y ejecutarlo para crear todas las tablas e
insertar datos en las mismas. A continuación, generar el modelo de entidad relación. Deberá
obtener un diagrama de entidad relación igual al que se muestra a continuación:
*/
-- A continuación, se deben realizar las siguientes consultas sobre la base de datos:
-- 1. Mostrar el nombre de todos los jugadores ordenados alfabéticamente.
use nba;
select Nombre from nba.jugadores
order by Nombre; 

-- 2. Mostrar el nombre de los jugadores que sean pivots (‘C’) y que pesen más de 200 libras,
-- ordenados por nombre alfabéticamente.
select Nombre, Peso, posicion from nba.jugadores
where Posicion like '%C%' and Peso > 200
order by Nombre asc;

-- 3. Mostrar el nombre de todos los equipos ordenados alfabéticamente.
select Nombre from nba.equipos
order by Nombre asc;

-- 4. Mostrar el nombre de los equipos del este (East).
select Nombre from nba.equipos
where Conferencia='East';

-- 5. Mostrar los equipos donde su ciudad empieza con la letra ‘c’, ordenados por nombre.
select Nombre from nba.equipos
where Ciudad like 'c%';
select Nombre, ciudad from nba.equipos
where Ciudad like 'c%';

-- 6. Mostrar todos los jugadores y su equipo ordenados por nombre del equipo.
select Nombre, Nombre_equipo from nba.jugadores
order by Nombre_equipo;

-- 7. Mostrar todos los jugadores del equipo “Raptors” ordenados por nombre.
select Nombre from nba.jugadores
where Nombre_equipo='Raptors';

-- 8. Mostrar los puntos por partido del jugador ‘Pau Gasol’.
select Puntos_por_partido from nba.estadisticas
where jugador = (select codigo from nba.jugadores where Nombre = 'Pau Gasol');

-- 9. Mostrar los puntos por partido del jugador ‘Pau Gasol’ en la temporada ’04/05′.
select Puntos_por_partido from nba.estadisticas
where jugador = (select codigo from nba.jugadores where Nombre = 'Pau Gasol') and temporada = '04/05';

-- 10. Mostrar el número de puntos de cada jugador en toda su carrera.
select jugador, sum(Puntos_por_partido) as 'total puntos' from nba.estadisticas
group by jugador;

-- 11. Mostrar el número de jugadores de cada equipo.
select Nombre_equipo, count(Nombre) as 'Num Jugadores' from nba.jugadores
group by Nombre_equipo;

-- 12. Mostrar el jugador que más puntos ha realizado en toda su carrera.
select jugador, jugadores.Nombre, sum(Puntos_por_partido) as 'max puntos' from nba.estadisticas
inner join nba.jugadores
on estadisticas.jugador=jugadores.codigo
group by jugador
order by sum(Puntos_por_partido) desc
limit 1;

-- 13. Mostrar el nombre del equipo, conferencia y división del jugador más alto de la NBA.
select Nombre, Conferencia, Division from nba.equipos
where Nombre = (select Nombre_equipo from nba.jugadores order by Altura desc limit 1 );
select Nombre_equipo, Altura from nba.jugadores order by Altura desc; 

-- 14. Mostrar el partido o partidos (equipo_local, equipo_visitante y diferencia) con mayor diferencia de puntos.
select equipo_local, equipo_visitante, abs(puntos_local - puntos_visitante) as 'diferencia' from nba.partidos
where abs(puntos_local - puntos_visitante) = (select max(abs(puntos_local - puntos_visitante)) from nba.partidos);
select equipo_local, equipo_visitante, puntos_local, puntos_visitante, abs(puntos_local - puntos_visitante) as 'diferencia' from nba.partidos
order by abs(puntos_local - puntos_visitante) desc;

-- 15. Mostrar quien gana en cada partido (codigo, equipo_local, equipo_visitante, equipo_ganador), en caso de empate sera null.
select codigo, equipo_local,equipo_visitante, (case when puntos_local > puntos_visitante then equipo_local when puntos_local < puntos_visitante then equipo_visitante else null end) as equipo_ganador from nba.partidos; 
select codigo, equipo_local, equipo_visitante, (puntos_local - puntos_visitante) from nba.partidos;

-- formato condicional CASE --
SELECT
  CASE 
    WHEN @SelectField1 = 1 THEN Field1
    WHEN @SelectField2 = 1 THEN Field2
    ELSE NULL
  END AS NewField
FROM Table