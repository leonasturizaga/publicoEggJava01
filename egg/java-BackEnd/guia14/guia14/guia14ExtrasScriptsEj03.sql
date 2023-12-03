/*
3. Importar el script de la base de datos llamada “pokemondb.sql” y ejecutarlo para crear todas
las tablas e insertar los registros en las mismas. A continuación, generar el modelo de entidad
relación y reorganizar las tablas para mayor claridad de sus relaciones. Deberá obtener un
diagrama de entidad de relación similar al que se muestra a continuación:
*/

-- A continuación, se deben realizar las siguientes consultas:
-- 1. Mostrar el nombre de todos los pokemon.
use pokemondb;
select nombre from pokemondb.pokemon;

-- 2. Mostrar los pokemon que pesen menos de 10k.
select nombre from pokemondb.pokemon
where peso < 10;

-- 3. Mostrar los pokemon de tipo agua.
select nombre from pokemondb.pokemon
where numero_pokedex in (select numero_pokedex from pokemondb.pokemon_tipo where id_tipo = 1)
order by nombre;
select t1.nombre, t2.id_tipo, t3.nombre from pokemondb.pokemon as t1
inner join pokemondb.pokemon_tipo as t2 on t1.numero_pokedex = t2.numero_pokedex
inner join pokemondb.tipo as t3 on t2.id_tipo=t3.id_tipo
where t3.nombre = 'Agua'
order by t1.nombre;

-- 4. Mostrar los pokemon de tipo agua, fuego o tierra ordenados por tipo.
select nombre from pokemondb.pokemon
where numero_pokedex in (select numero_pokedex from pokemondb.pokemon_tipo where id_tipo in (1, 6, 13) order by id_tipo);
select t1.nombre, t2.id_tipo, t3.nombre from pokemondb.pokemon as t1
inner join pokemondb.pokemon_tipo as t2 on t1.numero_pokedex = t2.numero_pokedex
inner join pokemondb.tipo as t3 on t2.id_tipo=t3.id_tipo
where t3.nombre in ('Agua', 'fuego','Tierra')
order by t3.id_tipo;

-- 5. Mostrar los pokemon que son de tipo fuego y volador.
select t1.nombre, t2.id_tipo, t3.id_tipo, t4.nombre from pokemondb.pokemon as t1
inner join pokemondb.pokemon_tipo as t2 on t1.numero_pokedex = t2.numero_pokedex
inner join pokemondb.pokemon_tipo as t3 on t2.numero_pokedex=t3.numero_pokedex
inner join pokemondb.tipo as t4 on t3.id_tipo=t4.id_tipo
where (t2.id_tipo=6 and t3.id_tipo=15) or (t2.id_tipo=15 and t3.id_tipo=6);  -- solo hace falta una de las dos condiciones.

-- 6. Mostrar los pokemon con una estadística base de ps mayor que 200.
select t1.nombre, t2.ps from pokemondb.pokemon as t1
inner join pokemondb.estadisticas_base as t2 on t1.numero_pokedex=t2.numero_pokedex
where t2.ps > 200;

-- 7. Mostrar los datos (nombre, peso, altura) de la prevolución de Arbok.
select nombre, peso, altura from pokemondb.pokemon
where numero_pokedex = (select numero_pokedex from pokemondb.pokemon_forma_evolucion where id_forma_evolucion = (select numero_pokedex from pokemondb.pokemon where nombre = 'Arbok'));

-- 8. Mostrar aquellos pokemon que evolucionan por intercambio.
select nombre from pokemondb.pokemon
where numero_pokedex in (select numero_pokedex from pokemondb.pokemon_forma_evolucion where id_forma_evolucion = (select id_tipo_evolucion from pokemondb.tipo_evolucion where tipo_evolucion = 'Intercambio'));

-- 9. Mostrar el nombre del movimiento con más prioridad.
select nombre from pokemondb.movimiento
where prioridad = (select max(prioridad) from pokemondb.movimiento);

-- 10. Mostrar el pokemon más pesado.
select nombre, peso from pokemondb.pokemon
where peso = (select max(peso) from pokemondb.pokemon);

-- 11. Mostrar el nombre y tipo del ataque con más potencia.
select nombre, id_tipo from pokemondb.movimiento
where potencia = (select max(potencia) from pokemondb.movimiento);

-- 12. Mostrar el número de movimientos de cada tipo.
select id_tipo, count(id_tipo) from pokemondb.movimiento
group by id_tipo;

-- 13. Mostrar todos los movimientos que puedan envenenar.
select nombre, descripcion from pokemondb.movimiento
where descripcion like '%envenenar%';

-- 14. Mostrar todos los movimientos que causan daño, ordenados alfabéticamente por nombre.
select nombre, descripcion from pokemondb.movimiento
where descripcion like '%daño%'
order by nombre;

-- 15. Mostrar todos los movimientos que aprende pikachu.
select t1.nombre from pokemondb.movimiento as t1
inner join pokemondb.pokemon_movimiento_forma as t2 on t1.id_movimiento=t2.id_movimiento
where t2.numero_pokedex = (select numero_pokedex from pokemondb.pokemon where nombre='pikachu')
group by t1.id_movimiento;

-- 16. Mostrar todos los movimientos que aprende pikachu por MT (tipo de aprendizaje).
select t1.nombre from pokemondb.movimiento as t1
inner join pokemondb.pokemon_movimiento_forma as t2 on t1.id_movimiento=t2.id_movimiento
where t2.numero_pokedex = (select numero_pokedex from pokemondb.pokemon where nombre='pikachu') and t2.id_forma_aprendizaje = (select id_tipo_aprendizaje from pokemondb.tipo_forma_aprendizaje where tipo_aprendizaje = 'MT')
group by t1.id_movimiento;

-- 17. Mostrar todos los movimientos de tipo normal que aprende pikachu por nivel.
select t1.nombre, t1.id_tipo from pokemondb.movimiento as t1
inner join pokemondb.pokemon_movimiento_forma as t2 on t1.id_movimiento=t2.id_movimiento
where t2.numero_pokedex = (select numero_pokedex from pokemondb.pokemon where nombre='pikachu') 
group by t1.id_movimiento
order by id_tipo;

-- 18. Mostrar todos los movimientos de efecto secundario cuya probabilidad sea mayor al 30%.
select nombre from pokemondb.movimiento
where id_movimiento in (select id_movimiento from pokemondb.movimiento_efecto_secundario where probabilidad >30 );

-- 19. Mostrar todos los pokemon que evolucionan por piedra.
select t1.nombre, t2.numero_pokedex, t3.id_forma_evolucion, t3.tipo_evolucion from pokemondb.pokemon as t1
inner join  pokemondb.pokemon_forma_evolucion as t2 on t1.numero_pokedex=t2.numero_pokedex
inner join pokemondb.forma_evolucion as t3 on t2.id_forma_evolucion=t3.id_forma_evolucion
where t3.tipo_evolucion = (select id_tipo_evolucion from pokemondb.tipo_evolucion where tipo_evolucion='Piedra');

-- 20. Mostrar todos los pokemon que no pueden evolucionar.
select t1.nombre, t1.numero_pokedex, t2.pokemon_origen from pokemondb.pokemon as t1
left join pokemondb.evoluciona_de as t2 on t1.numero_pokedex = t2.pokemon_evolucionado
where t1.numero_pokedex not in (select pokemon_origen from pokemondb.evoluciona_de); 
 
-- 21. Mostrar la cantidad de los pokemon de cada tipo.
select t1.nombre, t2.id_tipo, count(t2.id_tipo) from pokemondb.tipo as t1
inner join pokemondb.pokemon_tipo as t2 on t1.id_tipo=t2.id_tipo
group by t1.id_tipo;
