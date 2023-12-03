
package Servicios;

import Entidades.Pelicula;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

import java.util.Iterator;
import java.util.Scanner;


public class PeliculaService {
//En el servicio deberemos tener un bucle que crea un objeto Pelicula pidiéndole al usuario todos sus datos y guardándolos 
//en el objeto Pelicula.
//Después, esa Pelicula se guarda una lista de Peliculas y se le pregunta al usuario si quiere crear otra Pelicula o no.
//Después de ese bucle realizaremos las siguientes acciones:
//• Mostrar en pantalla todas las películas.
//• Mostrar en pantalla todas las películas con una duración mayor a 1 hora.
//• Ordenar las películas de acuerdo a su duración (de mayor a menor) y mostrarlo en pantalla.
//• Ordenar las películas de acuerdo a su duración (de menor a mayor) y mostrarlo en pantalla.
//• Ordenar las películas por título, alfabéticamente y mostrarlo en pantalla.
//• Ordenar las películas por director, alfabéticamente y mostrarlo en pantalla.

private Scanner leer = new Scanner(System.in);
private ArrayList<Pelicula> lista = new ArrayList();

	public ArrayList<Pelicula> getLista() {
		return lista;
	}



public void crearPelicula(){
	Pelicula obj; // = new Pelicula();
	String crear = "";
	do {
		System.out.println("titulo");
		//String titulo = leer.nextLine();
		String titulo = "pel_"+(int)(Math.random()*(99-10+1)+10);
		System.out.println("director");
		//String director = leer.nextLine();
		String director = "dir_"+(int)(Math.random()*(99-10+1)+10);
		System.out.println("duracion");
		//Double duracion = leer.nextDouble();
		Double duracion = (Math.random()*(3-0+1)+0)*100/100.0;
		duracion = Math.round(duracion*100)/100.0;
		obj = new Pelicula(titulo, director, duracion);
		lista.add(obj);
		
		System.out.println("quiere crear otra pelicula? NO para salir");
		crear = leer.nextLine();
	} while (!crear.equalsIgnoreCase("NO"));
}

//• Mostrar en pantalla todas las películas.
public void mostrarPelicula(){
	for (Pelicula pelicula : lista) {
		System.out.println(pelicula.toString());
	}
}
//• Mostrar en pantalla todas las películas con una duración mayor a 1 hora.
public void mostrarPelicula1hora(){
	for (Pelicula pelicula : lista) {
		if (pelicula.getDuracion()>1) {
		System.out.println(pelicula.toString());			
		}
	}
}

//• Ordenar las películas de acuerdo a su duración (de mayor a menor) y mostrarlo en pantalla.

public ArrayList<Pelicula> ordenarPorDuracion(){
	ArrayList<Pelicula> aux1 = new ArrayList();
	for (Pelicula pelicula : lista) {
		aux1.add(pelicula);
	}
	ArrayList<Pelicula> aux2 = new ArrayList();
	Pelicula objm;
	Double dur = 0.0;

	for (int i = 0; i < lista.size(); i++) {
		for (Pelicula peli : aux1) {
			if (peli.getDuracion()>=dur) {
				dur=peli.getDuracion();
			}
		}
		for (int j = 0; j < aux1.size(); j++) {
			objm = aux1.get(j);
			if (objm.getDuracion()==dur) {
				aux2.add(objm);
			}
		}
		Iterator<Pelicula> iter = aux1.iterator();
		while (iter.hasNext()) {
			Pelicula obj2 = iter.next();
			if (obj2.getDuracion()==dur) {
				iter.remove();
			}
		}
		dur=0.0;
		}
	return aux2;
}


public void duracionMayorAmenor(){
	ArrayList<Pelicula> aux2 = ordenarPorDuracion();
		for (Pelicula pelicula : aux2) {
		System.out.println(pelicula);
	}
}
//• Ordenar las películas de acuerdo a su duración (de menor a mayor) y mostrarlo en pantalla.
public void duracionMenorAmayor(){
	ArrayList<Pelicula> aux2 = ordenarPorDuracion();
	for (int i = aux2.size()-1; i >=0; i--) {
		System.out.println(aux2.get(i));
	}
}

//• Ordenar las películas por título, alfabéticamente y mostrarlo en pantalla.
public void ordenarAlfaTitulo() {
	ArrayList<Pelicula> aux1 = new ArrayList();
		for (Pelicula pelicula : lista) {
			aux1.add(pelicula);
		}
	Collections.sort(aux1, Comparator.comparing(Pelicula::getTitulo));
	for (Pelicula pelicula : aux1) {
		System.out.println(pelicula);
	}
}

//• Ordenar las películas por director, alfabéticamente y mostrarlo en pantalla.
public void ordenarAlfaDirector() {
	ArrayList<Pelicula> aux1 = new ArrayList();
		for (Pelicula pelicula : lista) {
			aux1.add(pelicula);
		}
	Collections.sort(aux1, Comparator.comparing(Pelicula::getDirector));
	for (Pelicula pelicula : aux1) {
		System.out.println(pelicula);
	}
}

}
