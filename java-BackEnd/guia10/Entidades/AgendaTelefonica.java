
package Entidades;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;


public class AgendaTelefonica {
//1) Crear una clase llamada "AgendaTelefónica" que permita almacenar contactos con su nombre y número de teléfono. 
//La clase debe tener métodos para agregar un contacto nuevo, buscar un contacto por nombre, mostrar todos los contactos y
// mostrar los contactos ordenados alfabéticamente por nombre.
//En el programa principal, crear un mapa (HashMap) de tipo "String" (nombre del contacto) y "Integer" (número de teléfono).
// Luego, mostrar un menú que le dé al usuario la opción de agregar un contacto, buscar un contacto por nombre, mostrar
// todos los contactos o mostrar los contactos ordenados alfabéticamente.
private Scanner leer = new Scanner(System.in).useDelimiter("\n");
private Scanner leerN = new Scanner(System.in).useDelimiter("\n");

private HashMap<String,Integer> agenda = new HashMap();


public void agregarContacto(){
	System.out.println("ingrese nombre");
	String nombre= leer.nextLine();
		System.out.println("ingrese telefono");
	Integer telefono= leerN.nextInt();
	agenda.put(nombre, telefono);
}

public void buscarContacto(){
	System.out.println("ingrese nombre a buscar");
	String nom = leer.nextLine();
	for (Map.Entry<String, Integer> entry: agenda.entrySet()) {
		if (entry.getKey().equalsIgnoreCase(nom)) {
			System.out.println("contacto: "+ entry.getKey()+ " Telefono: " + entry.getValue());
		}
	}
}

public void mostrarContactos(){
	for (Map.Entry<String, Integer> entry : agenda.entrySet()) {
		String key = entry.getKey();
		Integer value = entry.getValue();
		System.out.println("contacto: "+ entry.getKey()+ " Telefono: " + entry.getValue());
	}
}

public void mostrarConAlfa(){
	TreeMap<String,Integer> aux = new TreeMap();
	for (Map.Entry<String, Integer> entry : agenda.entrySet()) {
		String key = entry.getKey();
		Integer value = entry.getValue();
		aux.put(key, value);
	}
	for (Map.Entry<String, Integer> entry : aux.entrySet()) {
		System.out.println("contacto: "+ entry.getKey()+ " Telefono: " + entry.getValue());
	}
}

public void menu(){
	int var = 0;
	do {
		System.out.println("--------------------------");
		System.out.println("1) Agregar contacto");
		System.out.println("2) Buscar contacto");
		System.out.println("3) Mostrar agenda");
		System.out.println("4) Mostrar Alfabetico");
		System.out.println("0) Salir");
		System.out.println("--------------------------");
		var = leerN.nextInt();
		switch (var) {
			case 0:
				break;
			case 1:
				agregarContacto();
				break;
			case 2:
				agregarContacto();
				break;
			case 3:
				mostrarContactos();
				break;
			case 4:
				mostrarConAlfa();
				break;

			default:
				System.out.println("ingrese una opcion valida");
		}
	} while (var!=0);
	
}



}
