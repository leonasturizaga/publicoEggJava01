
package guia10;

import Entidades.Alumno;
import Entidades.Pelicula;
import Servicios.AlumnoService;
import Servicios.PaisService;
import Servicios.PeliculaService;
import Servicios.PerroService;
import Servicios.TiendaService;
import Utilidades.Comparadores;
import java.util.Collections;


public class Guia10 {


public static void main(String[] args) {
	
//1. Diseñar un programa que lea y guarde razas de perros en un ArrayList de tipo String. El programa pedirá una raza de
//perro en un bucle, el mismo se guardará en la lista y después se le preguntará al usuario si quiere guardar otro perro o 
//si quiere salir. Si decide salir, se mostrará todos los perros guardados en el ArrayList.

//PerroService pes = new PerroService();
//pes.crearRazas();


//2. Continuando el ejercicio anterior, después de mostrar los perros, al usuario se le pedirá un perro y se recorrerá la lista
//con un Iterator, se buscará el perro en la lista. Si el perro está en la lista, se eliminará el perro que ingresó el usuario y
//se mostrará la lista ordenada. Si el perro no se encuentra en la lista, se le informará al usuario y se mostrará la lista
//ordenada.

//pes.fabricaRazas(5);
//pes.mostrarRazas();
//
//pes.eliminarIterator();
//pes.mostrarRazas();
//
//	System.out.println("ordenar lista");
//pes.ordenarLista();
//	System.out.println("reverse order");
//pes.reverseLista();

//3. Crear una clase llamada Alumno que mantenga información sobre las notas de distintos alumnos. La clase Alumno tendrá
//como atributos, su nombre y una lista de tipo Integer con sus 3 notas.
//En el servicio de Alumno deberemos tener un bucle que crea un objeto Alumno. Se pide toda la información al usuario y 
//ese Alumno se guarda en una lista de tipo Alumno y se le pregunta al usuario si quiere crear otro Alumno o no.
//Después de ese bucle tendremos el siguiente método en el servicio de Alumno:
//Método notaFinal(): El usuario ingresa el nombre del alumno que quiere calcular su nota final y se lo busca en la lista de
//Alumnos. Si está en la lista, se llama al método. Dentro del método se usará la lista notas para calcular el promedio final 
// de alumno. Siendo este promedio final, devuelto por el método y mostrado en el main.
//Pueden encontrar un ejemplo de Colección como Atributo en tu Aula Virtual.


//AlumnoService als = new AlumnoService();
//Alumno al;
//al=als.crearAlumno();
//als.notaFinal();

	//System.out.println(al.getAlumnos());
//	System.out.println("-----mostrar objetos mem");
//als.mostrarObjetosMem();
//	System.out.println("-----mostrar objetos-----");
//	als.mostrarObjetos();
//	System.out.println("----mostrar ArrayList-----");
//	als.mostrarArrayList();
//	System.out.println("-----objeto Alumno to string");
//	System.out.println(al.toString());
	

//4. Un cine necesita implementar un sistema en el que se puedan cargar peliculas. Para esto, tendremos una clase Pelicula
//con el título, director y duración de la película (en horas). Implemente las clases y métodos necesarios para esta situación,
//teniendo en cuenta lo que se pide a continuación:
//En el servicio deberemos tener un bucle que crea un objeto Pelicula pidiéndole al usuario todos sus datos y guardándolos 
//en el objeto Pelicula.
//Después, esa Pelicula se guarda una lista de Peliculas y se le pregunta al usuario si quiere crear otra Pelicula o no.
//Después de ese bucle realizaremos las siguientes acciones:
//• Mostrar en pantalla todas las películas.
//• Mostrar en pantalla todas las películas con una duración mayor a 1 hora.
//• Ordenar las películas de acuerdo a su duración (de mayor a menor) y mostrarlo en pantalla.
//• Ordenar las películas de acuerdo a su duración (de menor a mayor) y mostrarlo en pantalla.
//• Ordenar las películas por título, alfabéticamente y mostrarlo en pantalla.
//• Ordenar las películas por director, alfabéticamente y mostrarlo en pantalla.

PeliculaService pes = new PeliculaService();

pes.crearPelicula();
	System.out.println("mostrar peliculas");
pes.mostrarPelicula();
	System.out.println("mostrar peliculas de mas de 1 hora");
pes.mostrarPelicula1hora();
	System.out.println("ordenar por duracion Mayor a Menor");
pes.duracionMayorAmenor();
	System.out.println("ordenar por duracion Menor a Mayor");
pes.duracionMenorAmayor();
	System.out.println("ordenar alfa por titulo");
pes.ordenarAlfaTitulo();
	System.out.println("ordenar alfa por director");
pes.ordenarAlfaDirector();
	System.out.println("ordenar usando comparator");
	Collections.sort(pes.getLista(), Comparadores.ordenDuracion);
	pes.mostrarPelicula();
	Collections.sort(pes.getLista(), Comparadores.titulo);
	pes.mostrarPelicula();


//5. Se requiere un programa que lea y guarde países, y para evitar que se ingresen repetidos usaremos un conjunto. El
//programa pedirá un país en un bucle, se guardará el país en el conjunto y después se le preguntará al usuario si quiere
//guardar otro país o si quiere salir, si decide salir, se mostrará todos los países guardados en el conjunto. (Recordemos 
//hacer los servicios en la clase correspondiente) Después deberemos mostrar el conjunto ordenado alfabéticamente: para 
// esto recordar cómo se ordena un conjunto.
//Por último, al usuario se le pedirá un país y se recorrerá el conjunto con un Iterator, se buscará el país en el conjunto y 
//si está en el conjunto se eliminará el país que ingresó el usuario y se mostrará el conjunto. Si el país no se encuentra en 
// el conjunto se le informará al usuario.

//PaisService pas = new PaisService();
//
//pas.ingresarPais();
//	System.out.println("odenar pais alfabeticamente");
//pas.ordenarAlfaPais();
//	System.out.println("buscar pais para eliminarlo");
//pas.buscarPais();


//6. Se necesita una aplicación para una tienda en la cual queremos almacenar los distintos productos que venderemos y el
//precio que tendrán. Además, se necesita que la aplicación cuente con las funciones básicas.
//Estas las realizaremos en el servicio. Como, introducir un elemento, modificar su precio, eliminar un producto y mostrar 
//los productos que tenemos con su precio (Utilizar Hashmap). El HashMap tendrá de llave el nombre del producto y de valor el 
//precio. Realizar un menú para lograr todas las acciones previamente mencionadas.
	
//TiendaService tis = new TiendaService();
//tis.memu();

//	tis.introducirElemento();
//	System.out.println("mostrar Productos");
//	tis.mostrarProducto();
//	System.out.println("modificar Precio de producto");
//	tis.modificarPrecio();
//	tis.mostrarProducto();
//	System.out.println("eliminar producto");
//	tis.eliminarProducto();
//	tis.mostrarProducto();


}

}
