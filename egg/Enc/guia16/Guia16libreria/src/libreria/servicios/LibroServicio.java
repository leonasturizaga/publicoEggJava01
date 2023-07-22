
package libreria.servicios;

import java.util.Collection;
import java.util.Scanner;
import libreria.entidades.Autor;
import libreria.entidades.Editorial;
import libreria.entidades.Libro;
import libreria.persistencia.LibroDAO;


public class LibroServicio {
private Scanner leerT = new Scanner(System.in).useDelimiter("\n");
private Scanner leerN = new Scanner(System.in).useDelimiter("\n");
private final LibroDAO dao;

	public LibroServicio() {
		this.dao = new LibroDAO();
	}

	public void mostrarLibroPorId() throws Exception{
	long dato = 1;
	Libro libro = dao.buscarPorId(dato);
	System.out.println(libro.getTitulo());
}

public void mostrarLibroPorTitulo() throws Exception {
//	System.out.println("ingrese titulo del libro");
//	String titulo = leerT.nextLine();
	String titulo = "titulo 01";
	Collection <Libro> libros = dao.buscarLibrosPorTitulo(titulo);
	for (Libro libro : libros) {
		System.out.println(libro.toString());
	}
}

public void mostrarLibros() throws Exception {
	Collection<Libro> libros = dao.mostrarContenido();
	for (Libro libro : libros) {
		System.out.println(libro.toString());
	}
}
public void crearLibro(){
	try {
	Libro libro;
	System.out.println("isbn de libro generado automaticamente");
	System.out.print("Ingrese titulo: ");
	String titulo = leerT.nextLine();
	System.out.print("Ingrese año: ");
	Integer anio = leerN.nextInt();
	System.out.print("Ingrese numero de ejemplares: ");
	Integer ejemplares = leerN.nextInt();
	System.out.print("Ingrese numero de ejemplares prestados: ");
	Integer ejemplaresPrestados = leerN.nextInt();
	System.out.print("Ingrese numero de ejemplares restantes: ");
	Integer ejemplaresRestantes = leerN.nextInt();

	Boolean alta = true;
	Autor autor = new Autor();
		do {
			System.out.println("Ingrese Nombre del autor");
			String nombre = leerT.nextLine();
			try {
				autor = dao.buscarAutorPorNombre(nombre);
				
			} catch (Exception e) {
				System.out.println("Autor no encontrado");
			} 
			if (autor == null) {
				System.out.println("Nombre de autor no encontrado, ingresarlo como nuevo SI/NO");
				String aux = leerT.nextLine();
				System.out.println("");
				if (aux.equalsIgnoreCase("SI")) {
					dao.altaNuevoAutor(nombre);
					autor = dao.buscarAutorPorNombre(nombre);
				}
			}
		} while (autor == null);

		Editorial editorial = new Editorial();
		do {
			System.out.println("Ingrese Nombre de la Editorial");
			String nombre = leerT.nextLine();
			try {
				editorial = dao.buscarEditorialPorNombre(nombre);
			} catch (Exception e) {
				System.out.println("Editorial no encontrada");
			} 
			if (editorial == null) {
				System.out.println("Nombre de la editorial no encontrado, ingresarlo como nuevo SI/NO");
				String aux = leerT.nextLine();
				System.out.println("");
				if (aux.equalsIgnoreCase("SI")) {
					dao.altaNuevaEditorial(nombre);
					editorial = dao.buscarEditorialPorNombre(nombre);
				}
			}

		} while (editorial == null);

		libro=new Libro(titulo, anio, ejemplares, ejemplaresPrestados, ejemplaresRestantes, alta, autor, editorial);	
	dao.crearLibro(libro);
		System.out.println("Libro creado: " + libro.toString());
		
	} catch (Exception e) {
		System.out.println("Error en la creacion del libro");
	}
}

public void modificarLibro() throws Exception {
	System.out.println("Modificar por:  1) id, 2) nombre");
	int var = leerN.nextInt();
	Libro libro = new Libro();
	try {
		switch (var) {
			case 1:
				System.out.println("Ingrese Id");				
				long dato = leerN.nextInt();
				libro = dao.buscarPorId(dato);
				break;
			case 2:
				System.out.println("Ingrese titulo");				
				String titulo = leerT.nextLine();
				libro = dao.buscarPorTitulo(titulo);
				break;			
			default:
				System.out.println("ingrese una opcion valida");
		}
		if (libro.getIsbn() != null) {
		System.out.println("Titulo actual: " + libro.getTitulo() + ", Ingrese nuevo titulo");
		libro.setTitulo(leerT.nextLine());
		System.out.println("Alta actual: " + libro.getAlta() + ", Ingrese nuevo estado 'true' o 'false'");
		libro.setAlta(leerT.nextBoolean());
			System.out.print("Ingrese titulo: ");
		System.out.print("Ingrese año: ");
		libro.setAnio(leerN.nextInt());
		System.out.print("Ingrese numero de ejemplares: ");
		libro.setEjemplares(leerN.nextInt());
		System.out.print("Ingrese numero de ejemplares prestados: ");
		libro.setEjemplaresPrestados(leerN.nextInt());
		System.out.print("Ingrese numero de ejemplares restantes: ");
		libro.setEjemplaresRestantes(leerN.nextInt());
			System.out.println("");
		dao.modificarLibro(libro);			
		} else {
			System.out.println("no se encontro libro con el valor ingresado");
		}

		
	} catch (Exception e) {
		e.printStackTrace();
		System.out.println("Error en la modificacion");
	}
}

public void eliminarLibro() throws Exception {
	System.out.println("Eliminar por:  1) id, 2) nombre");
	int var = leerN.nextInt();
	Libro libro = new Libro();
	
	try {
		switch (var) {
			case 1:
				System.out.println("Ingrese Id");				
				long dato = leerN.nextInt();
				libro = dao.buscarPorId(dato);
				System.out.println(libro.toString());
				break;
			case 2:
				System.out.println("Ingrese titulo");				
				String titulo = leerT.nextLine();
				libro = dao.buscarPorTitulo(titulo);
				System.out.println(libro.toString());
				break;			
			default:
				System.out.println("ingrese una opcion valida");
		}
		System.out.println("");
		System.out.println("Confirma eliminar SI/NO");
		String salir = leerT.nextLine();		
		System.out.println("");
		if (salir.equalsIgnoreCase("SI")) {
			dao.eliminarLibro(libro);
		} else {
			System.out.println("no se realizaron cambios");
		}
		
	} catch (Exception e) {
		e.printStackTrace();
		System.out.println("Error al eliminar libro");
	}
}


}
