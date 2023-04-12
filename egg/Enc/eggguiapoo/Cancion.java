
package eggguiapoo;


public class Cancion {
//1. Desarrollar una clase Cancion con los siguientes atributos: título y autor.
//Se deberá definir además dos constructores: uno vacío que inicializa el título y el autor a cadenas vacías y otro que 
//reciba como parámetros eltítulo y el autor de la canción. Se deberán además definir los métodos getters y setters
// correspondientes.

//atributos
public String titulo;
public String autor;

	public Cancion() {
	}

	public Cancion(String titulo, String autor) {
		this.titulo = titulo;
		this.autor = autor;
	}

//metodos setters y getters	
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getTitulo() {
		return titulo;
	}

	public String getAutor() {
		return autor;
	}




}
