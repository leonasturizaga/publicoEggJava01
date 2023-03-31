
package p03;

import java.util.Scanner;


public class NewMain2 {


public static void main(String[] args) {

//2. Diseñe una función que pida el nombre y la edad de N personas e
//imprima los datos de las personas ingresadas por teclado e indique si
//son mayores o menores de edad. Después de cada persona, el programa
//debe preguntarle al usuario si quiere seguir mostrando personas y frenar
//cuando el usuario ingrese la palabra “No”.

nomEdad();
	
}

//METODO
public static void  nomEdad(){
	Scanner leerNum = new Scanner(System.in);
	Scanner leerText = new Scanner(System.in);
	
	String nombre,salir;
	int edad;
	salir="";
	
	while ( !salir.equalsIgnoreCase("NO") ) {
		System.out.println("ingrese nombre");
		nombre = leerText.nextLine();
		System.out.println("ingrese la edad");
		edad = leerNum.nextInt();
		
		if (edad<18) {
			System.out.println("nombre: " +nombre+ " edad: " +edad + ", menor de edad");
		} else {
			System.out.println("nombre: " +nombre+ " edad: " +edad + ", mayor de edad");
		}
		
		System.out.println("ingresar nueva persona, Si/No");
		salir = leerText.nextLine();
	}
}



}
