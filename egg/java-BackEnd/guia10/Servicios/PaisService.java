
package Servicios;

import Entidades.Pais;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;


public class PaisService {
//5. Se requiere un programa que lea y guarde países, y para evitar que se ingresen repetidos usaremos un conjunto. El
//programa pedirá un país en un bucle, se guardará el país en el conjunto y después se le preguntará al usuario si quiere
//guardar otro país o si quiere salir, si decide salir, se mostrará todos los países guardados en el conjunto. (Recordemos 
//hacer los servicios en la clase correspondiente) Después deberemos mostrar el conjunto ordenado alfabéticamente: para 
// esto recordar cómo se ordena un conjunto.
//Por último, al usuario se le pedirá un país y se recorrerá el conjunto con un Iterator, se buscará el país en el conjunto y 
//si está en el conjunto se eliminará el país que ingresó el usuario y se mostrará el conjunto. Si el país no se encuentra en 
// el conjunto se le informará al usuario.

private Scanner leer = new Scanner(System.in);
	Pais obj = new Pais();
public void ingresarPais(){

	String salir = "";
	do {
		System.out.println("Ingresar pais");
		//String pais = leer.nextLine();
		String pais = "pais_" + (int)((Math.random()*99)+1);
		obj.getPais().add(pais);
		System.out.println("quiere seguir ingresandro paises 'SI'?  para salir 'NO' ");
		salir = leer.nextLine();
	} while (!salir.equalsIgnoreCase("NO"));
	
	mostrarPaises(obj.getPais());
}

public void mostrarPaises(HashSet<String> pais){
	for (String var : pais) {
		System.out.println(var);
	}
}

//Después deberemos mostrar el conjunto ordenado alfabéticamente: para esto recordar cómo se ordena un conjunto.
public void ordenarAlfaPais(){
	HashSet<String> aux = new HashSet();
	for (String var : obj.getPais()) {
		aux.add(var);
	}
	ArrayList<String> listaPais = new ArrayList(aux);
	Collections.sort(listaPais);
	for (String listaPai : listaPais) {
		System.out.println(listaPai);
	}
}

//Por último, al usuario se le pedirá un país y se recorrerá el conjunto con un Iterator, se buscará el país en el conjunto y 
//si está en el conjunto se eliminará el país que ingresó el usuario y se mostrará el conjunto. Si el país no se encuentra en 
// el conjunto se le informará al usuario.

public void buscarPais(){
	System.out.println("Ingrese pais a buscar");
	String pais = leer.nextLine();

	HashSet<String> aux = new HashSet();
		for (String string : obj.getPais()) {
			aux.add(string);
		}
	Iterator<String> it = aux.iterator();
		while (it.hasNext()) {
			String var = it.next();
			if (var.equalsIgnoreCase(pais)) {
				it.remove();
			}
		}
		if (aux.size()<obj.getPais().size()) {
			System.out.println("-------------");
			for (String string : aux) {
			System.out.println(string);
			}
		} else {
			System.out.println(" el pais " + pais + " no esta en la lista");
		}
}


}
