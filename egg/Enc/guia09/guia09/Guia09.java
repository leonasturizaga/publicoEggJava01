
package guia09;

import Entidades.Cadena;
import Servicios.CadenaServicio;
import java.util.Scanner;


public class Guia09 {

public static void main(String[] args) {
//1. Realizar una clase llamada Cadena, en el paquete de entidades, que tenga como atributos una frase (String) y su
// longitud. Agregar constructor vacío y con atributo frase solamente. Agregar getters y setters. El constructor con 
// frase como atributo debe setear la longitud de la frase de manera automática. Crear una clase CadenaServicio en el
//paquete servicios que implemente los siguientes métodos:
//a) Método mostrarVocales(), deberá contabilizar la cantidad de vocales que tiene la frase ingresada.
//b) Método invertirFrase(), deberá invertir la frase ingresada y mostrarla por pantalla. Por ejemplo: Entrada: "casa  blanca",
//Salida: "acnalbasac".
//c) Método vecesRepetido(String letra), recibirá un carácter ingresad por el usuario y contabilizar cuántas veces se  
//repite el carácter en la frase, por ejemplo:
//d) Entrada: frase = "casa blanca". Salida: El carácter 'a' se repite 4 veces.
//e) Método compararLongitud(String frase), deberá comparar la longitud de la frase que compone la clase con otra nueva
//frase ingresada por el usuario.
//f) Método unirFrases(String frase), deberá unir la frase contenida en la clase Cadena con una nueva frase ingresada por el
//usuario y mostrar la frase resultante.
//g) Método reemplazar(String letra), deberá reemplazar todas las letras “a” que se encuentren en la frase, por algún otro
//carácter seleccionado por el usuario y mostrar la frase resultante.
//h) Método contiene(String letra), deberá comprobar si la frase contieneuna letra que ingresa el usuario y devuelve 
// verdadero si la contiene y falso si no.
Scanner leerText = new Scanner(System.in);
	CadenaServicio cas = new CadenaServicio();
	Cadena ca;
	ca = new Cadena("Alguna frase tres");
	System.out.println("cuantas vocales? " + cas.mostrarVocales(ca) );
	
	System.out.println("frase invertida: " + cas.invertirFrase(ca));
	System.out.println("Ingrese letra");
	cas.vecesRepetido(ca,leerText.next());
	
	System.out.println("ingrese una frase para comparar");
	cas.compararLongitud(ca, leerText.next());
	
	System.out.println("ingrese una frase para unir");
	cas.unirFrases(ca, leerText.nextLine());
	
	System.out.println("ingrese un caracter para reemplazar 'a'");
	cas.reemplazar(ca, leerText.next());
	
	System.out.println("Ingrese una letra para ver la frase la contiene");
	System.out.println("la contiene? " + cas.contiene(ca, leerText.next()) );




	
}

}
