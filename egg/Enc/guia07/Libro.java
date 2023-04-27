
package guia07;

import java.util.Scanner;


public class Libro {
//1. Crear una clase llamada Libro que contenga los siguientes atributos:
//ISBN, Título, Autor, Número de páginas, y un constructor con todos los
//atributos pasados por parámetro y un constructor vacío. Crear un
//método para cargar un libro pidiendo los datos al usuario y luego
//informar mediante otro método el número de ISBN, el título, el autor del
//libro y el número de páginas

//atributos
public String isbn;
public String titulo;
public String autor;
public int numPag;

//constructor
	public Libro(String isbn, String titulo, String autor, int numPag) {
		this.isbn = isbn;
		this.titulo = titulo;
		this.autor = autor;
		this.numPag = numPag;
	}

	public Libro() {
		
	}

//metodos
public void cargarLibro() {
	Scanner leerTexto = new Scanner(System.in);
	System.out.println("Ingrese codigo ISBN");
	isbn = leerTexto.nextLine();
	System.out.println("Ingrese titulo");
	titulo = leerTexto.nextLine();
	System.out.println("Ingrese autor");
	autor = leerTexto.nextLine();
	System.out.println("Ingrese numero de paginas");
	numPag = leerTexto.nextInt();
}
	
public void mostrarLibro() {
	System.out.println("ISBN: " + this.isbn);
	System.out.println("titulo: " + this.titulo);
	System.out.println("autor: " + this.autor);
	System.out.println("numero de paginas: " + this.numPag);
}



}
