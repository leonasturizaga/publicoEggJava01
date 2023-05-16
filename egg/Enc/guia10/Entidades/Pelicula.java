
package Entidades;


public class Pelicula {
//4. Un cine necesita implementar un sistema en el que se puedan cargar peliculas. Para esto, tendremos una clase Pelicula
//con el título, director y duración de la película (en horas). Implemente las clases y métodos necesarios para esta situación,
//teniendo en cuenta lo que se pide a continuación:
private String titulo;
private String director;
private double duracion;

	public Pelicula(String titulo, String director, double duracion) {
		this.titulo = titulo;
		this.director = director;
		this.duracion = duracion;
	}

	public String getTitulo() {
		return titulo;
	}

	public String getDirector() {
		return director;
	}

	public double getDuracion() {
		return duracion;
	}

	
	
	@Override
	public String toString() {
		return "Pelicula{" + "titulo=" + titulo + ", director=" + director + ", duracion=" + duracion + '}';
	}




}
