
package p03;
import p03.p03e01metodos;
import java.util.Scanner;


public class p03e01 {

public static void main(String[] args) {
	
	Scanner leerNum = new Scanner(System.in);
	Scanner leerText = new Scanner(System.in);
	
//1. Crea una aplicación que le pida dos números al usuario y este pueda
//elegir entre sumar, restar, multiplicar y dividir. La aplicación debe tener
//una función para cada operación matemática y deben devolver sus
//resultados para imprimirlos en el main.

//int n1a,n1b;
//double n1c;
//	System.out.println("ingrese dos numeros para operar");
//n1a = leerNum.nextInt();
//n1b = leerNum.nextInt();
//
//n1c = p03e01metodos.opArit(n1a,n1b);
//
//	System.out.println("resultado: " + n1c);

//2. Diseñe una función que pida el nombre y la edad de N personas e
//imprima los datos de las personas ingresadas por teclado e indique si
//son mayores o menores de edad. Después de cada persona, el programa
//debe preguntarle al usuario si quiere seguir mostrando personas y frenar
//cuando el usuario ingrese la palabra “No”.

//p03metodos.nomEdad();

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

//p03metodos.convEuro();


//4. Crea una aplicación que nos pida un número por teclado y con una
//función se lo pasamos por parámetro para que nos indique si es o no un
//número primo, debe devolver true si es primo, sino false.
//Un número primo es aquel que solo puede dividirse entre 1 y sí mismo.
//Por ejemplo: 25 no es primo, ya que 25 es divisible entre 5, sin embargo,
//17 si es primo.

int n4;
	do {
		System.out.println("ingrese un numero primo, '0' para salir");
		n4 = leerNum.nextInt();
		
		p03e01metodos.numPrimo(n4);
		
	} while (n4!=0);

//¿Qué son los números primos?
//Básicamente, un número primo es un número natural que tiene solo dos
//divisores o factores: 1 y el mismo número. Es decir, es primo aquel
//número que se puede dividir por uno y por el mismo número.
//El primer número primo es 2, y hay 25 números primos entre 1 y 100,
//ellos son: 2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67,
//71, 73, 79, 83, 89 y 97.
	
	
}

//METODOS


}
