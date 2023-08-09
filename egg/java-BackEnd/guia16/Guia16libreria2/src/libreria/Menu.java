
package libreria;

import java.util.Collection;
import java.util.Scanner;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import libreria.entidades.Autor;
import libreria.entidades.Libro;
import libreria.servicios.AutorServicio;
import libreria.servicios.ClienteServicio;
import libreria.servicios.EditorialServicio;
import libreria.servicios.LibroServicio;
import libreria.servicios.PrestamoServicio;


public class Menu {
private Scanner leerN = new Scanner(System.in).useDelimiter("\n");	
private AutorServicio aus = new AutorServicio();
private EditorialServicio eds = new EditorialServicio();
private LibroServicio lis = new LibroServicio();
private ClienteServicio cls = new ClienteServicio();
private PrestamoServicio prs = new PrestamoServicio();
private int var;

public void menu() throws Exception {
	do {
		System.out.println("*********************MENU************************");
		System.out.println("1) Altas");
		System.out.println("2) Bajas");
		System.out.println("3) Modificacion");
		System.out.println("4) Consulta");
		System.out.println("5) Devolucion");
		System.out.println("0) Salir");
		System.out.println("*************************************************");

		var = leerN.nextInt();

		switch (var) {
			case 0:
				System.out.println("Programa finalizado");
				break;
			case 1:
				altas();
				menu();
				break;
			case 2:
				bajas();
				menu();
				break;
			case 3:
				modificacion();
				menu();
				break;
			case 4:
				consulta();
				menu();
				break;
			case 5:
				prs.devolverPrestamo();
				menu();
				break;				
			default:
				System.out.println("Ingrese una opcion valida");
		}
	} while (var != 0);
}

public void altas() throws Exception {
	do {
		System.out.println("*********************ALTAS***********************");
		System.out.println("1) Autor");
		System.out.println("2) Editorial");
		System.out.println("3) Libro");
		System.out.println("4) Cliente");
		System.out.println("5) Prestamo");
		System.out.println("0) Volver al menu principal");
		System.out.println("*************************************************");

		var = leerN.nextInt();
		switch (var) {
			case 0:
				System.out.println("Menu principal");
				break;
			case 1:
				aus.crearAutor();
				altas();
				break;
			case 2:
				eds.crearEditorial();
				altas();
				break;
			case 3:
				lis.crearLibro();
				altas();
				break;
			case 4:
				cls.crearCliente();
				altas();
				break;
			case 5:
				prs.crearPrestamo();
				altas();
				break;				
			default:
				System.out.println("Ingrese una opcion valida");
		}
	} while (var != 0);
}

public void bajas() throws Exception {
	do {
		System.out.println("*********************BAJAS***********************");
		System.out.println("1) Autor");
		System.out.println("2) Editorial");
		System.out.println("3) Libro");
		System.out.println("4) Cliente");
		System.out.println("5) Prestamo");		
		System.out.println("0) Volver al menu principal");
		System.out.println("*************************************************");

		var = leerN.nextInt();
		switch (var) {
			case 0:
				System.out.println("Menu principal");
				break;
			case 1:
				aus.eliminarAutor();
				bajas();
				break;
			case 2:
				eds.eliminarEditorial();
				bajas();
				break;
			case 3:
				lis.eliminarLibro();
				bajas();
				break;
			case 4:
				cls.eliminarCliente();
				altas();
				break;
			case 5:
				prs.eliminarPrestamo();
				altas();
				break;					
			default:
				System.out.println("Ingrese una opcion valida");
		}
	} while (var != 0);
}

public void modificacion() throws Exception {
	do {
		System.out.println("*********************MODIFICACION***************");
		System.out.println("1) Autor");
		System.out.println("2) Editorial");
		System.out.println("3) Libro");
		System.out.println("4) Cliente");
		System.out.println("5) Prestamo");			
		System.out.println("0) Volver al menu principal");
		System.out.println("*************************************************");

		var = leerN.nextInt();
		switch (var) {
			case 0:
				System.out.println("Menu principal");
				break;
			case 1:
				aus.modificarAutor();
				modificacion();
				break;
			case 2:
				eds.modificarEditorial();
				modificacion();
				break;
			case 3:
				lis.modificarLibro();
				modificacion();
				break;
			case 4:
				cls.modificarCliente();
				altas();
				break;
			case 5:
				prs.modificarPrestamo();
				altas();
				break;					
			default:
				System.out.println("Ingrese una opcion valida");
		}
	} while (var != 0);
}

public void consulta() throws Exception {
	do {
		System.out.println("*********************CONSULTA*******************");
		System.out.println("11) Autor por ID");
		System.out.println("12) Autor por Nombre");
		System.out.println("13) Autores Lista");
		System.out.println("21) Editorial por ID");
		System.out.println("22) Editorial por Nombre");
		System.out.println("23) Editoriales Lista");
		System.out.println("31) Libro por ISBN");
		System.out.println("32) Libro por Titulo");
		System.out.println("33) Libros Lista");
		System.out.println("41) Cliente por ID");
		System.out.println("42) Cliente por Documento");
		System.out.println("43) Clientes Lista");
		System.out.println("51) Prestamo por ID");
		System.out.println("52) Prestamos por Documento");
		System.out.println("53) Prestamos Lista");				
		System.out.println("0) Volver al menu principal");
		System.out.println("*************************************************");

		var = leerN.nextInt();
		switch (var) {
			case 0:
				System.out.println("Menu principal");
				break;
			case 11:
				aus.mostrarAutorPorId();
				consulta();
				break;
			case 12:
				aus.mostrarAutorPorNombre();
				consulta();
				break;
			case 13:
				aus.mostrarAutores();
				consulta();
				break;
			case 21:
				eds.mostrarEditorialPorId();
				consulta();
				break;
			case 22:
				eds.mostrarEditorialPorNombre();
				consulta();
				break;
			case 23:
				eds.mostrarEditoriales();
				consulta();
				break;
			case 31:
				lis.mostrarLibroPorId();
				consulta();
				break;
			case 32:
				lis.mostrarLibroPorTitulo();
				consulta();
				break;
			case 33:
				lis.mostrarLibros();
				consulta();
				break;
			case 41:
				cls.mostrarClientePorId();
				consulta();
				break;
			case 42:
				cls.mostrarClientePorDocumento();
				consulta();
				break;
			case 43:
				cls.mostrarClientes();
				consulta();
				break;
			case 51:
				prs.mostrarPrestamoPorId();
				consulta();
				break;
			case 52:
				prs.mostrarPrestamosPorDocumento();
				consulta();
				break;
			case 53:
				prs.mostrarPrestamos();
				consulta();
				break;				
			default:
				System.out.println("Ingrese una opcion valida");
		}
	} while (var != 0);
}



}
