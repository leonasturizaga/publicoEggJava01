
package guia07;


public class Guia07 {


public static void main(String[] args) {
//1. Crear una clase llamada Libro que contenga los siguientes atributos:
//ISBN, Título, Autor, Número de páginas, y un constructor con todos los
//atributos pasados por parámetro y un constructor vacío. Crear un
//método para cargar un libro pidiendo los datos al usuario y luego
//informar mediante otro método el número de ISBN, el título, el autor del
//libro y el número de páginas
System.out.println("---- ejercicio 01 ----");
	Libro lib = new Libro();
	lib.cargarLibro();
	lib.mostrarLibro();

//2. Declarar una clase llamada Circunferencia que tenga como atributo
//privado el radio de tipo real. A continuación, se deben crear los siguientes métodos:
//a) Método constructor que inicialice el radio pasado como parámetro.
//b) Métodos get y set para el atributo radio de la clase Circunferencia.
//c) Método para crearCircunferencia(): que le pide el radio y lo guarda en el atributo del objeto.
//d) Método area(): para calcular el área de la circunferencia (Area=π*(radio)^2).
//e) Método perimetro(): para calcular el perímetro (Perimetro=2*π*radio).	
System.out.println("---- ejercicio 02 ----");
Circunferencia cir = new Circunferencia(10);
	System.out.println("radio1: " + cir.getRadio());

cir.crearCircunferencia();
System.out.println("radio2: " + cir.getRadio());
	System.out.println("");
	System.out.println("area2: " + cir.area());
	System.out.println("perimetro2: " + cir.perimetro());
}

}
