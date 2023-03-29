
package egg.p02;

import static java.lang.Math.floor;
import java.util.Scanner;


public class p02e01extras {

public static void main(String[] args) {
	Scanner leerNum = new Scanner(System.in);
	Scanner leerText = new Scanner(System.in);
	
//1. Dado un tiempo en minutos, calcular su equivalente en días y horas. Por
//ejemplo, si el usuario ingresa 1600 minutos, el sistema debe calcular su
//equivalente: 1 día, 2 horas.
	
//	double n1,eqd,eqh;
//	System.out.println("ingrese tiempo en minutos");
//	n1 = leerNum.nextInt();
//	eqh = n1/60;
//	eqd = n1/60/24;
//	System.out.println("equivalente en horas: " + eqh);
//	System.out.println("equivalente en dias: " + eqd);
	
//2. Declarar cuatro variables de tipo entero A, B, C y D y asignarle un valor
//diferente a cada una. A continuación, realizar las instrucciones
//necesarias para que: B tome el valor de C, C tome el valor de A, A tome
//el valor de D y D tome el valor de B. Mostrar los valores iniciales y los
//valores finales de cada variable. Utilizar sólo una variable auxiliar.

//	int a,b,c,d,n2;
//	a=1;
//	b=2;
//	c=3;
//	d=4;
//
//	System.out.println("a:" + a +" b:" + b +" c:" + c + " d:" + d);
//	
//	n2 = b;
//	b=c;
//	System.out.println("valor inicial de b: " +  n2 + ", valor final : " + b);				
//	c=a;
//	System.out.println("valor inicial de c: " + b + ", valor final : " + c);				
//	a=d;
//	System.out.println("valor inicial de a: " +  c + ", valor final : " + a);				
//	d=n2;
//	System.out.println("valor inicial de d: " +  a + ", valor final : " + d);				
//
//	System.out.println("a:" + a +" b:" + b +" c:" + c + " d:" + d);
	
//3. Elaborar un algoritmo en el cuál se ingrese una letra y se detecte si se
//trata de una vocal. Caso contrario mostrar un mensaje. Nota: investigar
//la función equals() de la clase String.

//String t3;
//	System.out.println("Ingrese una vocal");
//t3 = leerText.nextLine();	
//	if (t3.equalsIgnoreCase("A") || t3.equalsIgnoreCase("E") || t3.equalsIgnoreCase("I") || t3.equalsIgnoreCase("O") ||t3.equalsIgnoreCase("U")) {
//		System.out.println(t3);
//	} else {
//		System.out.println("No es vocal");
//	}

//4. Elaborar un algoritmo en el cuál se ingrese un número entre 1 y 10 y se
//muestre su equivalente en romano.

//int n4;
//	System.out.println("Ingrese un numero para numeros romanos");
//n4 = leerNum.nextInt();
//
//	if (n4 >=0 && n4 <=10) {
//		switch (n4) {
//			case 1:
//				System.out.println("I");
//				break;
//			case 2:
//				System.out.println("II");
//				break;
//			case 3:
//				System.out.println("III");
//				break;
//			case 4:
//				System.out.println("IV");
//				break;
//			case 5:
//				System.out.println("V");
//				break;
//			case 6:
//				System.out.println("VI");
//				break;
//			case 7:
//				System.out.println("VII");
//				break;
//			case 8:
//				System.out.println("VIII");
//				break;
//			case 9:
//				System.out.println("IX");
//				break;
//			case 10:
//				System.out.println("X");
//				break;
//		}
//	} else {
//		System.out.println("Ingrese un numero entre 1 y 10");
//	}

//5. Una obra social tiene tres clases de socios:
//○ Los socios tipo ‘A’ abonan una cuota mayor, pero tienen un 50% de
//descuento en todos los tipos de tratamientos.
//○ Los socios tipo ‘B’ abonan una cuota moderada y tienen un 35% de
//descuento para los mismos tratamientos que los socios del tipo A.
//○ Los socios que menos aportan, los de tipo ‘C’, no reciben
//descuentos sobre dichos tratamientos.
//○ Solicite una letra (carácter) que representa la clase de un socio, y
//luego un valor real que represente el costo del tratamiento (previo
//al descuento) y determine el importe en efectivo a pagar por dicho
//socio.

//String t5;
//double n5;  //Costo teorico del tratamiento.
//n5 = 1100;
//	System.out.println("Ingrese tipo de socio A,B o C");
//	t5 = leerText.nextLine();
//	t5 = t5.toUpperCase();
//
//	switch ( t5 ) {
//		case "A":
//			System.out.println("costo del tratamiento A: " + n5);
//			System.out.println("Importe a pagar: " + n5*(1 - (double)50/100) );
//			break;
//		case "B":
//			System.out.println("costo del tratamiento B: " + n5);
//			System.out.println("Importe a pagar: " + n5*(1 - (double)35/100) );
//			break;
//		case "C":
//			System.out.println("costo del tratamiento C: " + n5);
//			System.out.println("Importe a pagar: " + n5*(1 - (double)0/100) );
//			break;			
//		default:
//			System.out.println("ingrese A, B o C");
//			
//	}

//6. Leer la altura de N personas y determinar el promedio de estaturas que
//se encuentran por debajo de 1.60 mts. y el promedio de estaturas en
//general.
//7. Realice un programa que calcule y visualice el valor máximo, el valor
//mínimo y el promedio de n números (n>0). El valor de n se solicitará al
//principio del programa y los números serán introducidos por el usuario.
//Realice dos versiones del programa, una usando el bucle “while” y otra
//con el bucle “do - while”.
//8. Escriba un programa que lea números enteros. Si el número es múltiplo
//de cinco debe detener la lectura y mostrar la cantidad de números
//leídos, la cantidad de números pares y la cantidad de números impares.
//Al igual que en el ejercicio anterior los números negativos no deben
//sumarse. Nota: recordar el uso de la sentencia break.
//9. Simular la división usando solamente restas. Dados dos números enteros
//mayores que uno, realizar un algoritmo que calcule el cociente y el
//residuo usando sólo restas. Método: Restar el dividendo del divisor hasta
//obtener un resultado menor que el divisor, este resultado es el residuo, y
//el número de restas realizadas es el cociente.
//Por ejemplo: 50 / 13ր
//50 – 13 = 37 una resta realizada
//37 – 13 = 24 dos restas realizadas
//24 – 13 = 11 tres restas realizadas
//dado que 11 es menor que 13, entonces: el residuo es 11 y el cociente es
//3.
//¿Aún no lo entendiste? Recomendamos googlear división con restas
//sucesivas.
//10.Realice un programa para que el usuario adivine el resultado de una
//multiplicación entre dos números generados aleatoriamente entre 0 y 10.
//El programa debe indicar al usuario si su respuesta es o no correcta. En
//caso que la respuesta sea incorrecta se debe permitir al usuario ingresar
//su respuesta nuevamente. Para realizar este ejercicio investigue como
//utilizar la función Math.random() de Java.
//311. Escribir un programa que lea un número entero y devuelva el número de
//dígitos que componen ese número. Por ejemplo, si introducimos el
//número 12345, el programa deberá devolver 5. Calcular la cantidad de
//dígitos matemáticamente utilizando el operador de división. Nota:
//recordar que las variables de tipo entero truncan los números o
//resultados.
//12.Necesitamos mostrar un contador con 3 dígitos ՄX՞X՞XՅ, que muestre los
//números del 0՞0՞0 al 9՞9՞9, con la particularidad que cada vez que
//aparezca un 3 lo sustituya por una E. Ejemplo:
//0՞0՞0
//0՞0՞1
//0՞0՞2
//0՞0՞E
//0՞0՞4
//0՞1՞2
//0՞1՞E
//Nota: investigar función equals() y como convertir números a String.
//13.Crear un programa que dibuje una escalera de números, donde cada
//línea de números comience en uno y termine en el número de la línea.
//Solicitar la altura de la escalera al usuario al comenzar. Ejemplo: si se
//ingresa el número 3ր
//11
//2
//123
//14.Se dispone de un conjunto de N familias, cada una de las cuales tiene
//una M cantidad de hijos. Escriba un programa que pida la cantidad de
//familias y para cada familia la cantidad de hijos para averiguar la media
//de edad de los hijos de todas las familias.
//	
	
}

}
