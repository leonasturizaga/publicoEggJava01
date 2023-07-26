
package libreria.servicios;

import java.util.Collection;
import java.util.Scanner;
import libreria.entidades.Editorial;
import libreria.persistencia.EditorialDAO;


public class EditorialServicio {
private Scanner leerT = new Scanner(System.in).useDelimiter("\n");
private Scanner leerN = new Scanner(System.in).useDelimiter("\n");
private final EditorialDAO dao;

	public EditorialServicio() {
		this.dao = new EditorialDAO();
	}

	public void mostrarEditorialPorId() throws Exception{
		System.out.println("Ingrese ID de la editorial");
	int dato = leerN.nextInt();
	Editorial editorial = dao.buscarPorId(dato);
	System.out.println(editorial.getNombre());
}

public void mostrarEditorialPorNombre() throws Exception {
	System.out.println("Ingrese nombre de la Editorial");
	String nombre =leerT.nextLine();
	Editorial editorial = dao.buscarPorNombre(nombre);
	System.out.println(editorial.getNombre());
}

public void mostrarEditoriales() throws Exception {
	Collection<Editorial> editoriales = dao.mostrarContenido();
	for (Editorial editoriale : editoriales) {
		System.out.println(editoriale.toString());
	}
}
public void crearEditorial(){
	try {
	Editorial editorial = new Editorial();
	System.out.println("codigo de editorial?");
	editorial.setId(leerN.nextInt());
	System.out.println("Nombre de editorial?");
	editorial.setNombre(leerT.nextLine());
	editorial.setAlta(true);
	dao.crearEditorial(editorial);
		System.out.println("Editorial creada: " + editorial.toString());
		
	} catch (Exception e) {
		System.out.println("Error en la creacion de la editorial");
	}
}

public void modificarEditorial() throws Exception {
	System.out.println("Modificar por:  1) id, 2) nombre");
	int var = leerN.nextInt();
	Editorial editorial = new Editorial();
	try {
		switch (var) {
			case 1:
				System.out.println("Ingrese Id");				
				int dato = leerN.nextInt();
				editorial = dao.buscarPorId(dato);
				break;
			case 2:
				System.out.println("Ingrese Nombre");				
				String nombre = leerT.nextLine();
				editorial = dao.buscarPorNombre(nombre);
				break;			
			default:
				System.out.println("ingrese una opcion valida");
		}
		if (editorial.getId() != null) {
		System.out.println("Nombre actual: " + editorial.getNombre() + ", Ingrese nuevo nombre");
		editorial.setNombre(leerT.nextLine());
		System.out.println("Alta actual: " + editorial.getAlta() + ", Ingrese nuevo estado 'true' o 'false'");
		editorial.setAlta(leerT.nextBoolean());
		
		dao.modificarEditorial(editorial);			
		} else {
			System.out.println("no se encontro editorial con el valor ingresado");
		}

		
	} catch (Exception e) {
		e.printStackTrace();
		System.out.println("Error en la modificacion");
	}
}

public void eliminarEditorial() throws Exception {
	System.out.println("Eliminar por:  1) id, 2) nombre");
	int var = leerN.nextInt();
	Editorial editorial = new Editorial();
	
	try {
		switch (var) {
			case 1:
				System.out.println("Ingrese Id");				
				int dato = leerN.nextInt();
				editorial = dao.buscarPorId(dato);
				System.out.println(editorial.toString());
				break;
			case 2:
				System.out.println("Ingrese Nombre");				
				String nombre = leerT.nextLine();
				editorial = dao.buscarPorNombre(nombre);
				System.out.println(editorial.toString());
				break;			
			default:
				System.out.println("ingrese una opcion valida");
		}
		System.out.print("");
		System.out.println("Confirma eliminar SI/NO");
		String salir = leerT.nextLine();			
		if (salir.equalsIgnoreCase("SI")) {
			dao.eliminarEditorial(editorial);
		} else {
			System.out.println("no se realizaron cambios");
		}
		
	} catch (Exception e) {
		e.printStackTrace();
		System.out.println("Error al eliminar la editorial");
	}
}	

public int editorialIdMax(){
	return dao.editorialIdMax();
}

}
