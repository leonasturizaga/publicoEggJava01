
package eggguiapoo;

import java.util.Scanner;


public class Libro {

//1. Crear una clase llamada Libro que contenga los siguientes atributos :
//ISBN , Título, Autor, Número de páginas, y un constructor con todos los atributos pasados por parámetro y un 
//constructor vacío.
//Crear un método para cargar un libro pidiendo los datos al usuario y luego
//informar mediante otro método el número de ISBN, el título , el autor del
//libro y el número de páginas

//atributos
public String isbn;
public String titulo;
public String autor;
public int numPag;

//constructor

public Libro(){
	
}

public Libro(String isbn, String titulo, String autor, int numPag) {
		this.isbn = isbn;
		this.titulo = titulo;
		this.autor = autor;
		this.numPag = numPag;
	}

//metodos
public void pedirDatos(){
	Scanner leerNum = new Scanner(System.in);
	Scanner leerText = new Scanner(System.in);
	
		System.out.println("Ingrese ISBN");
	this.isbn=leerText.nextLine();	
		System.out.println("Ingrese titulo");
	this.titulo=leerText.nextLine();
		System.out.println("Ingrese autor");
	this.autor=leerText.nextLine();
		System.out.println("Ingrese numPag");
	this.numPag=leerNum.nextInt();

}
public void mostrarDatos() {
	System.out.println("ISBN: " +this.isbn+ "\nTitulo: " +titulo+ "\nAutor: " +autor+ "\nNumero de paginas: " +numPag  );
}
}
