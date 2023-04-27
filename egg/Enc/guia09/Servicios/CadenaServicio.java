
package Servicios;

import Entidades.Cadena;
import java.util.Scanner;


public class CadenaServicio {

//Crear una clase CadenaServicio en el paquete servicios que implemente los siguientes métodos:

//a) Método mostrarVocales(), deberá contabilizar la cantidad de vocales que tiene la frase ingresada.
public int mostrarVocales(Cadena obj) {
	int vocales = 0;
	for (int i = 0; i < obj.getLongitud(); i++) {
		if (obj.getFrase().substring(i, i+1).toUpperCase().contains("A")
			|| obj.getFrase().substring(i, i+1).toUpperCase().contains("E")
			|| obj.getFrase().substring(i, i+1).toUpperCase().contains("I")
			|| obj.getFrase().substring(i, i+1).toUpperCase().contains("O")
			|| obj.getFrase().substring(i, i+1).toUpperCase().contains("U")) {
			vocales++;
		}
	}
	return vocales;
}

//b) Método invertirFrase(), deberá invertir la frase ingresada y mostrarla por pantalla. Por ejemplo: Entrada: "casa  blanca",
//Salida: "acnalb asac".
public String invertirFrase(Cadena obj){
	String invFrase="";
	
	for (int i = obj.getLongitud()-1; i >= 0; i--) {
		invFrase= invFrase + obj.getFrase().substring(i,i+1);
	}
	return invFrase;
}
	
//c) Método vecesRepetido(String letra), recibirá un carácter ingresad por el usuario y contabilizar cuántas veces se  
//repite el carácter en la frase, por ejemplo:
//d) Entrada: frase = "casa blanca". Salida: El carácter 'a' se repite 4 veces.
public void vecesRepetido(Cadena obj,String letra){
//	Scanner leer = new Scanner(System.in);
//	System.out.println("Ingrese una letra");
//	letra = leer.next();
	int cont = 0;

	for (int i = 0 ; i < obj.getLongitud()-1; i++) {
		if ( obj.getFrase().substring(i, i+1).equalsIgnoreCase(letra) ) {
			cont++;
		}
	}
	System.out.println("El caracter '" +letra+ "' se repite " +cont+ " veces");
}

//e) Método compararLongitud(String frase), deberá comparar la longitud de la frase que compone la clase con otra nueva
//frase ingresada por el usuario.
public void compararLongitud(Cadena obj, String frase){
	if (obj.getLongitud()>frase.length()) {
		System.out.println("'" +obj.getFrase() + "' es mayor");
	}
	if (obj.getLongitud()==frase.length()) {
		System.out.println( " son iguales");
	}
	if (obj.getLongitud()<frase.length()) {
		System.out.println("'" +frase + "' es mayor");
	}
}

//f) Método unirFrases(String frase), deberá unir la frase contenida en la clase Cadena con una nueva frase ingresada por el
//usuario y mostrar la frase resultante.
public void unirFrases(Cadena obj, String frase){
	System.out.println(obj.getFrase() + " " + frase);
}

//g) Método reemplazar(String letra), deberá reemplazar todas las letras “a” que se encuentren en la frase, por algún otro
//carácter seleccionado por el usuario y mostrar la frase resultante.
public void reemplazar(Cadena obj, String letra){
	String aux="";
	 for (int i = 0; i < obj.getLongitud(); i++) {
		 if (obj.getFrase().substring(i, i+1).equalsIgnoreCase("a")) {
			 aux = aux + letra;
		 } else {
			 aux = aux + obj.getFrase().substring(i, i+1);
		 }
	}
	System.out.println(aux);
}

//h) Método contiene(String letra), deberá comprobar si la frase contieneuna letra que ingresa el usuario y devuelve 
// verdadero si la contiene y falso si no.
public boolean contiene(Cadena obj, String letra){
	
	return obj.getFrase().toUpperCase().contains(letra.toUpperCase());
}



}
