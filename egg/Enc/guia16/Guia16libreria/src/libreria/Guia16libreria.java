
package libreria;

import java.util.Collection;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import libreria.entidades.Autor;
import libreria.entidades.Editorial;
import libreria.entidades.Libro;
import libreria.servicios.AutorServicio;
import libreria.servicios.EditorialServicio;
import libreria.servicios.LibroServicio;


public class Guia16libreria {


public static void main(String[] args) {

//	Menu menu = new Menu();
//	menu.ejecutar();
	try {
//		AutorServicio aus = new AutorServicio();
//		aus.mostrarAutorPorId();
//		aus.mostrarAutorPorId2();
//		aus.mostrarAutorPorNombre();
//		aus.mostrarAutores();
//		System.out.println("crear autor");
//		aus.crearAutor();
//		System.out.println("modificar autor");
//		aus.modificarAutor();
//		System.out.println("eliminar autor");
//		aus.eliminarAutor();

//System.out.println("probar editorial");		
//EditorialServicio eds = new EditorialServicio();
//		eds.mostrarEditorialPorId();
//		eds.mostrarEditorialPorNombre();
//		eds.mostrarEditoriales();
//		System.out.println("crear editorial");
//		eds.crearEditorial();
//		System.out.println("modificar editorial");
//		eds.modificarEditorial();
//		System.out.println("eliminar editorial");
//		eds.eliminarEditorial();
//System.out.println(eds.editorialIdMax());

		System.out.println("probar libro");
		LibroServicio lbs = new LibroServicio();
	lbs.mostrarLibroPorId();
	lbs.mostrarLibroPorTitulo();
	lbs.mostrarLibros();
		System.out.println("crear libro");
		lbs.crearLibro();
		System.out.println("modificar libro");
		lbs.modificarLibro();
		System.out.println("eliminar libro");
		lbs.eliminarLibro();

	} catch (Exception e) {
		e.printStackTrace();
		System.out.println("error de sistema");
	}
	

	
	
	
}

}
