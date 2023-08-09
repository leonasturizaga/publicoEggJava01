
package Servicios;

import Entidades.Perro;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;


public class PerroService {
//El programa pedirá una raza de
//perro en un bucle, el mismo se guardará en la lista y después se le preguntará al usuario si quiere guardar otro perro o 
//si quiere salir. Si decide salir, se mostrará todos los perros guardados en el ArrayList.

Scanner leer = new Scanner(System.in);

ArrayList<String> perros; // = new ArrayList<>();

public PerroService() {
	this.perros = new ArrayList();
}

public void crearRazas() {
	String raza = "";
	do {
		System.out.println("Ingrese raza de perro, o escriba SI para salir");
		raza = leer.next();
		if (raza.equalsIgnoreCase("SI")) {
			mostrarRazas();
		} else {
			perros.add(raza);
		}

	} while (!raza.equalsIgnoreCase("SI"));
}


public void mostrarRazas(){
	for (String aux : perros) {
		System.out.println(aux);
	}
	System.out.println("cantidad de razas:" + perros.size());
}


//2. Continuando el ejercicio anterior, después de mostrar los perros, al usuario se le pedirá un perro y se recorrerá la lista
//con un Iterator, se buscará el perro en la lista. Si el perro está en la lista, se eliminará el perro que ingresó el usuario y
//se mostrará la lista ordenada. Si el perro no se encuentra en la lista, se le informará al usuario y se mostrará la lista
//ordenada.
public void fabricaRazas(int cantidad){
	for (int i = 0; i < cantidad; i++) {
		perros.add("raza" + i);
	}
}


public void eliminarIterator(){
	System.out.println("ingrese raza a eliminar");
	String raza = leer.next();
	
	Iterator<String> it = perros.iterator();
	
	while (it.hasNext()) {
		String aux = it.next();
		if (aux.equalsIgnoreCase(raza)) {
			it.remove();
		}
	}
}
public void ordenarLista(){
	Collections.sort(perros);
	mostrarRazas();
}

public void reverseLista(){
	Collections.reverse(perros);
	mostrarRazas();
}

}
