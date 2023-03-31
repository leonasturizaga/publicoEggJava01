
package p03;

import java.util.Scanner;


public class p03e01metodos {

//METODOS

//1. Crea una aplicación que le pida dos números al usuario y este pueda
//elegir entre sumar, restar, multiplicar y dividir. La aplicación debe tener
//una función para cada operación matemática y deben devolver sus
//resultados para imprimirlos en el main.
public static double opArit(int a, int b){
	Scanner leer = new Scanner(System.in);
	double res;
	int var;
	res=0;
	var = 0;
	
	while (var != 5) {
	System.out.println("ingrese opcion:\n1.Sumar\n2.Restar\n3.Multiplicar\n4.Dividir\n5.Salir");
	var = leer.nextInt();
		switch (var) {
			case 1:
				res = a + b;
				break;
			case 2:
				res = a - b;
				break;
			case 3:
				res = a * b;
				break;
			case 4:
				res = (double)a / b;
				break;
			case 5:

				break;			
			default:
				throw new AssertionError();
		}
	System.out.println("opeArit: " + res);	
	}

	return res;
}

//2. Diseñe una función que pida el nombre y la edad de N personas e
//imprima los datos de las personas ingresadas por teclado e indique si
//son mayores o menores de edad. Después de cada persona, el programa
//debe preguntarle al usuario si quiere seguir mostrando personas y frenar
//cuando el usuario ingrese la palabra “No”.

public static void nomEdad(){

	Scanner leerNum = new Scanner(System.in);
	Scanner leerText = new Scanner(System.in);
	String nom,salir;
	int edad;
	salir="";
	
	do {
		System.out.println("Ingrese Nombre");
		nom = leerText.nextLine();
		System.out.println("Ingrese edad");
		edad = leerNum.nextInt();
		if (edad<18) {
			System.out.println("Nombre: " +nom+ " Edad: " +edad+ ", es menor de edad" );
		} else {
			System.out.println("Nombre: " +nom+ " Edad: " +edad+ ", es mayor de edad" );
		}
		System.out.println("Ingresar nuevo nombre y edad? Si/No");
		salir = leerText.nextLine();
		
	} while ( !salir.equalsIgnoreCase("NO") );
}
	
//3. Crea una aplicación que a través de una función nos convierta una
//cantidad de euros introducida por teclado a otra moneda, estas pueden
//ser a dólares, yenes o libras. La función tendrá como parámetros, la
//cantidad de euros y la moneda a convertir que será una cadena, este no
//devolverá ningún valor y mostrará un mensaje indicando el cambio
//(void).
//El cambio de divisas es:
//i. * 0.86 libras es un 1 €
//ii. * 1.28611 $ es un 1 €
//iii. * 129.852 yenes es un 1 €

public static void convEuro(){
	Scanner leerNum = new Scanner(System.in);
	Scanner leerText = new Scanner(System.in);	
	double euro;
	String moneda;
	
	System.out.println("Ingrese cantidad de Euros para convertir");
	euro = leerNum.nextDouble();
	System.out.println("Ingrese tipo de moneda destino: dolar, yen o libra");
	moneda = leerText.nextLine();
	moneda = moneda.toLowerCase();
	
	switch (moneda) {
		case "dolar":
			System.out.println(euro + "€ en dolares es: " + (euro*1.28611) );
			break;
		case "yen":
			System.out.println(euro + "€ en yenes es: " + (euro*129.852) );
			break;
		case "libra":
			System.out.println(euro + "€ en libras es: " + (euro*0.86) );
			break;			
		default:
			System.out.println("Ingrese tipo de moneda destino valido: dolar, yen o libra");
	}
	
}


//4. Crea una aplicación que nos pida un número por teclado y con una
//función se lo pasamos por parámetro para que nos indique si es o no un
//número primo, debe devolver true si es primo, sino false.
//Un número primo es aquel que solo puede dividirse entre 1 y sí mismo.
//Por ejemplo: 25 no es primo, ya que 25 es divisible entre 5, sin embargo,
//17 si es primo.

public static boolean numPrimo(int num){
	boolean primo;
	double resto;
	int cont;
	cont=0;
	primo=false;
	for (int i = 2; i <= num; i++) {
		resto = num%i;
		if (resto == 0) {
			cont++;
			System.out.print("["+i+"]");
		} 
	}
	System.out.println("");
	if (cont==1) {
		primo=true;
	}
	System.out.println("cont(" +cont+ ") " +primo);

	return primo;
}

//¿Qué son los números primos?
//Básicamente, un número primo es un número natural que tiene solo dos
//divisores o factores: 1 y el mismo número. Es decir, es primo aquel
//número que se puede dividir por uno y por el mismo número.
//El primer número primo es 2, y hay 25 números primos entre 1 y 100,
//ellos son: 2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67,
//71, 73, 79, 83, 89 y 97.

}
