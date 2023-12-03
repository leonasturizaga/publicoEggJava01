
package libreria;

import java.util.Collection;
import java.util.Scanner;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import libreria.entidades.Autor;
import libreria.entidades.Libro;
import libreria.servicios.AutorServicio;
import libreria.servicios.EditorialServicio;
import libreria.servicios.LibroServicio;


public class Menu {
private Scanner leerN = new Scanner(System.in).useDelimiter("\n");	
private AutorServicio aus = new AutorServicio();
private EditorialServicio eds = new EditorialServicio();
private LibroServicio lis = new LibroServicio();
private int var;

public void menu() throws Exception {
	do {
		System.out.println("*********************MENU************************");
		System.out.println("1) Altas");
		System.out.println("2) Bajas");
		System.out.println("3) Modificacion");
		System.out.println("4) Consulta");
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
		System.out.println("13) Lista de Autores");
		System.out.println("21) Editorial por ID");
		System.out.println("22) Editorial por Nombre");
		System.out.println("23) Lista de Editoriales");
		System.out.println("31) Libro por ISBN");
		System.out.println("32) Libro por Titulo");
		System.out.println("33) Lista de Libros");
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
			default:
				System.out.println("Ingrese una opcion valida");
		}
	} while (var != 0);
}



}
