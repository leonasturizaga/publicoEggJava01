
package Entidades;

import java.util.ArrayList;
import java.util.Scanner;


public class Pelicula {
// Luego, de las películas nos interesa saber el título, duración, edad mínima y director.	
private String titulo;
private double duracion;
private int edad;
private String director;
private ArrayList<Pelicula> pelis = new ArrayList();

	public Pelicula() {
	}


	public Pelicula(String titulo, double duracion, int edad, String director) {
		this.titulo = titulo;
		this.duracion = duracion;
		this.edad = edad;
		this.director = director;
	}

	public ArrayList<Pelicula> getPelis() {
		return pelis;
	}

	public String getTitulo() {
		return titulo;
	}

	public int getEdad() {
		return edad;
	}



public void crearPelicula() {
	Scanner leerT = new Scanner(System.in).useDelimiter("\n");
	Scanner leerN = new Scanner(System.in).useDelimiter("\n");
//	titulo = leerT.nextLine();
//	duracion = leerN.nextDouble();
//	edad = leerN.nextInt();
//	director = leerT.nextLine();
	int k = 3;
	for (int i = 0; i < k; i++) {
		titulo = "peli" + (i + 1);
		duracion = 1.1 + (i + 1);
		edad = 10 + (i * 4);
		director = "dir" + (i + 1);
		Pelicula peli = new Pelicula(titulo, duracion, edad, director);
		pelis.add(peli);
	}
}	

public void mostrarPelis(){
	for (Pelicula peli : pelis) {
		System.out.println(peli.toString());
	}
}

	@Override
	public String toString() {
		return "Pelicula{" + "titulo=" + titulo + ", duracion=" + duracion + ", edad=" + edad + ", director=" + director + '}';
	}


}
