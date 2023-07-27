
package libreria;

import java.util.Collection;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import libreria.entidades.Autor;
import libreria.entidades.Editorial;
import libreria.entidades.Libro;
import libreria.servicios.AutorServicio;
import libreria.servicios.ClienteServicio;
import libreria.servicios.EditorialServicio;
import libreria.servicios.LibroServicio;
import libreria.servicios.PrestamoServicio;


public class Guia16libreria {


public static void main(String[] args) {

	try {
	Menu menu = new Menu();
	menu.menu();

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

//		System.out.println("probar libro");
//		LibroServicio lbs = new LibroServicio();
//	lbs.mostrarLibroPorId();
//	lbs.mostrarLibroPorTitulo();
//	lbs.mostrarLibros();
//		System.out.println("crear libro");
//		lbs.crearLibro();
//		System.out.println("modificar libro");
//		lbs.modificarLibro();
//		System.out.println("eliminar libro");
//		lbs.eliminarLibro();

//		System.out.println("probar cliente");
//		ClienteServicio cls = new ClienteServicio();
//		System.out.println("crear cliente");
//		cls.crearCliente();
//		System.out.println("crear otro cliente");
//		cls.crearCliente();
//		System.out.println("mostrar cliente");
//		cls.mostrarClientePorId();
//		cls.mostrarClientePorDocumento();
//		cls.mostrarClientesPorApellido();
//		cls.mostrarClientes();
//		System.out.println("modificar cliente");
//		cls.modificarCliente();
//		System.out.println("eliminar cliente");
//		cls.eliminarCliente();
//		cls.mostrarClientes();

//		System.out.println("probar prestamo");
//		PrestamoServicio prs = new PrestamoServicio();
//		System.out.println("crear prestamo");
//		prs.crearPrestamo();
//		System.out.println("crear otro prestamo");
//		prs.crearPrestamo();
//		System.out.println("mostrar prestamo");
//		prs.mostrarPrestamoPorId();
//		prs.mostrarPrestamosPorDocumento();
//		prs.mostrarPrestamos();
//		System.out.println("modificar prestamo");
//		prs.modificarPrestamo();
//		System.out.println("eliminar prestamo");
//		prs.eliminarPrestamo();
//		prs.mostrarPrestamos();		
		
		
	} catch (Exception e) {
		e.printStackTrace();
		System.out.println("error de sistema");
	}
	
	
}

}
