
package libreria.servicios;

import java.util.Collection;
import java.util.Scanner;
import libreria.entidades.Autor;
import libreria.persistencia.AutorDAO;


public class AutorServicio {
private Scanner leerT = new Scanner(System.in).useDelimiter("\n");
private Scanner leerN = new Scanner(System.in).useDelimiter("\n");
private final AutorDAO dao;

	public AutorServicio() {
		this.dao = new AutorDAO();
	}

	public void mostrarAutorPorId() throws Exception{
	int dato = 1;
	Autor autor = dao.buscarPorId(dato);
	System.out.println(autor.getNombre());
}
	
	public void mostrarAutorPorId2(){
	int dato = 2;
	Autor autor = dao.buscarPorId2(dato);
	System.out.println(autor.getNombre());
}

public void mostrarAutorPorNombre() throws Exception {
	String nombre = "segundo autor";
	Autor autor = dao.buscarPorNombre(nombre);
	System.out.println(autor.getNombre());
}

public void mostrarAutores() throws Exception {
	Collection<Autor> autores = dao.mostrarContenido();
	for (Autor autore : autores) {
		System.out.println(autore.toString());
	}
}
public void crearAutor(){
	try {
	Autor autor = new Autor();
	System.out.println("codigo de autor?");
	autor.setId(leerN.nextInt());
	System.out.println("Nombre de autor?");
	autor.setNombre(leerT.nextLine());
	autor.setAlta(true);
	dao.crearAutor(autor);
		System.out.println("Autor creado: " + autor.toString());
		
	} catch (Exception e) {
		System.out.println("Error en la creacion del autor");
	}
}

public void modificarAutor() throws Exception {
	System.out.println("Modificar por:  1) id, 2) nombre");
	int var = leerN.nextInt();
	Autor autor = new Autor();
	try {
		switch (var) {
			case 1:
				System.out.println("Ingrese Id");				
				int dato = leerN.nextInt();
				autor = dao.buscarPorId(dato);
				break;
			case 2:
				System.out.println("Ingrese Nombre");				
				String nombre = leerT.nextLine();
				autor = dao.buscarPorNombre(nombre);
				break;			
			default:
				System.out.println("ingrese una opcion valida");
		}
		if (autor.getId() != null) {
		System.out.println("Nombre actual: " + autor.getNombre() + ", Ingrese nuevo nombre");
		autor.setNombre(leerT.nextLine());
		System.out.println("Alta actual: " + autor.isAlta() + ", Ingrese nuevo estado 'true' o 'false'");
		autor.setAlta(leerT.nextBoolean());
		
		dao.modificarAutor(autor);			
		} else {
			System.out.println("no se encontro autor con el valor ingresado");
		}

		
	} catch (Exception e) {
		e.printStackTrace();
		System.out.println("Error en la modificacion");
	}
}

public void eliminarAutor() throws Exception {
	System.out.println("Eliminar por:  1) id, 2) nombre");
	int var = leerN.nextInt();
	Autor autor = new Autor();
	
	try {
		switch (var) {
			case 1:
				System.out.println("Ingrese Id");				
				int dato = leerN.nextInt();
				autor = dao.buscarPorId(dato);
				System.out.println(autor.toString());
				break;
			case 2:
				System.out.println("Ingrese Nombre");				
				String nombre = leerT.nextLine();
				autor = dao.buscarPorNombre(nombre);
				System.out.println(autor.toString());
				break;			
			default:
				System.out.println("ingrese una opcion valida");
		}

		System.out.println("Confirma eliminar SI/NO");
		String salir = leerT.nextLine();			
		if (salir.equalsIgnoreCase("SI")) {
			dao.eliminarAutor(autor);
		} else {
			System.out.println("no se realizaron cambios");
		}
		
	} catch (Exception e) {
		e.printStackTrace();
		System.out.println("Error al eliminar el autor");
	}
}

public int autorIdMax(){
	return dao.autorIdMax();
}

}
