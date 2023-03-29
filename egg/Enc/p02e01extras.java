
package egg.p02;

import static java.lang.Math.random;
import java.util.Scanner;


public class p02e01extras {

public static void main(String[] args) {
	Scanner leerNum = new Scanner(System.in);
	Scanner leerText = new Scanner(System.in);
	
//1. Dado un tiempo en minutos, calcular su equivalente en días y horas. Por
//ejemplo, si el usuario ingresa 1600 minutos, el sistema debe calcular su
//equivalente: 1 día, 2 horas.
	
	double n1,eqd,eqh;
	System.out.println("ingrese tiempo en minutos");
	n1 = leerNum.nextInt();
	eqh = n1/60;
	eqd = n1/60/24;
	System.out.println("equivalente en horas: " + eqh);
	System.out.println("equivalente en dias: " + eqd);
	
//2. Declarar cuatro variables de tipo entero A, B, C y D y asignarle un valor
//diferente a cada una. A continuación, realizar las instrucciones
//necesarias para que: B tome el valor de C, C tome el valor de A, A tome
//el valor de D y D tome el valor de B. Mostrar los valores iniciales y los
//valores finales de cada variable. Utilizar sólo una variable auxiliar.

	int a,b,c,d,n2;
	a=1;
	b=2;
	c=3;
	d=4;

	System.out.println("a:" + a +" b:" + b +" c:" + c + " d:" + d);
	
	n2 = b;
	b=c;
	System.out.println("valor inicial de b: " +  n2 + ", valor final : " + b);				
	c=a;
	System.out.println("valor inicial de c: " + b + ", valor final : " + c);				
	a=d;
	System.out.println("valor inicial de a: " +  c + ", valor final : " + a);				
	d=n2;
	System.out.println("valor inicial de d: " +  a + ", valor final : " + d);				

	System.out.println("a:" + a +" b:" + b +" c:" + c + " d:" + d);
	
//3. Elaborar un algoritmo en el cuál se ingrese una letra y se detecte si se
//trata de una vocal. Caso contrario mostrar un mensaje. Nota: investigar
//la función equals() de la clase String.

String t3;
	System.out.println("Ingrese una vocal");
t3 = leerText.nextLine();	
	if (t3.equalsIgnoreCase("A") || t3.equalsIgnoreCase("E") || t3.equalsIgnoreCase("I") || t3.equalsIgnoreCase("O") ||t3.equalsIgnoreCase("U")) {
		System.out.println(t3);
	} else {
		System.out.println("No es vocal");
	}

//4. Elaborar un algoritmo en el cuál se ingrese un número entre 1 y 10 y se
//muestre su equivalente en romano.

int n4;
	System.out.println("Ingrese un numero para numeros romanos");
n4 = leerNum.nextInt();

	if (n4 >=0 && n4 <=10) {
		switch (n4) {
			case 1:
				System.out.println("I");
				break;
			case 2:
				System.out.println("II");
				break;
			case 3:
				System.out.println("III");
				break;
			case 4:
				System.out.println("IV");
				break;
			case 5:
				System.out.println("V");
				break;
			case 6:
				System.out.println("VI");
				break;
			case 7:
				System.out.println("VII");
				break;
			case 8:
				System.out.println("VIII");
				break;
			case 9:
				System.out.println("IX");
				break;
			case 10:
				System.out.println("X");
				break;
		}
	} else {
		System.out.println("Ingrese un numero entre 1 y 10");
	}

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

String t5;
double n5;  //Costo teorico del tratamiento.
n5 = 1100;
	System.out.println("Ingrese tipo de socio A,B o C");
	t5 = leerText.nextLine();
	t5 = t5.toUpperCase();

	switch ( t5 ) {
		case "A":
			System.out.println("costo del tratamiento A: " + n5);
			System.out.println("Importe a pagar: " + n5*(1 - (double)50/100) );
			break;
		case "B":
			System.out.println("costo del tratamiento B: " + n5);
			System.out.println("Importe a pagar: " + n5*(1 - (double)35/100) );
			break;
		case "C":
			System.out.println("costo del tratamiento C: " + n5);
			System.out.println("Importe a pagar: " + n5*(1 - (double)0/100) );
			break;			
		default:
			System.out.println("ingrese A, B o C");
			
	}

//6. Leer la altura de N personas y determinar el promedio de estaturas que
//se encuentran por debajo de 1.60 mts. y el promedio de estaturas en
//general.

	int n6,n6c;
	double n6r,n6sumG,n6sumC;
	System.out.println("ingrese numero N de alturas");
	n6=leerNum.nextInt();
	n6c=0;
	n6sumG=0;
	n6sumC=0;
	
	for (int i = 0; i < n6; i++) {
		n6r =  0.60 + random()*(2.3 - 0.60);
			System.out.println(n6r);
		n6sumG=n6sumG + n6r;

		if (n6r<1.60) {
			n6sumC=n6sumC + n6r;
			n6c++;
		}
	}
	System.out.println("-------");
	System.out.println(n6);
	System.out.println("promedio general: " + n6sumG/n6);
	System.out.println(n6c);
	System.out.println("promedio menor a 1.60 mts: " + n6sumC/n6c);

//7. Realice un programa que calcule y visualice el valor máximo, el valor
//mínimo y el promedio de n números (n>0). El valor de n se solicitará al
//principio del programa y los números serán introducidos por el usuario.
//Realice dos versiones del programa, una usando el bucle “while” y otra
//con el bucle “do - while”.

int n7,n7N,n7min,n7max,n7sum,n7c;
	System.out.println("Ingrese numero N");
	n7N = leerNum.nextInt();
	n7c=0;
	n7sum=0;

//		System.out.println("ingrese un numero");
//		n7 = leerNum.nextInt();
//			n7min = n7;
//			n7max = n7;
//			n7sum = n7sum + n7;
//			n7c++;
//
//	while (n7c >0 && n7c < n7N) {
//		System.out.println("ingrese un numero");
//		n7 = leerNum.nextInt();		
//		if (n7<n7min) {
//			n7min=n7;
//		}
//		if (n7>n7max) {
//			n7max=n7;	
//		}
//		n7sum = n7sum + n7;
//		n7c++;	
//	}

		System.out.println("ingrese un numero");
		n7 = leerNum.nextInt();
		n7min = n7;
		n7max = n7;
		n7sum = n7sum + n7;
		n7c++;
	do {
		System.out.println("ingrese un numero");
		n7 = leerNum.nextInt();		
		if (n7<n7min) {
			n7min=n7;
		}
		if (n7>n7max) {
			n7max=n7;	
		}
		n7sum = n7sum + n7;
		n7c++;	
	} while (n7c > 0 && n7c < n7N);

	System.out.println("max: " + n7max);
	System.out.println("min: " + n7min);
	System.out.println("prom: " + n7sum/n7N);
	System.out.println("-----------");	
	
//8. Escriba un programa que lea números enteros. Si el número es múltiplo
//de cinco debe detener la lectura y mostrar la cantidad de números
//leídos, la cantidad de números pares y la cantidad de números impares.
//Al igual que en el ejercicio anterior los números negativos no deben
//sumarse. Nota: recordar el uso de la sentencia break.

int n8,n8cp,n8ci;
n8 = 0;
n8cp = 0;
n8ci = 0;

	do {
		System.out.println("ingrese un numero entero positivo");
		n8 = leerNum.nextInt();
		if (n8>0 && n8%2==0 ) {
			n8cp++;
		}
		if (n8>0 && n8%2!=0 && n8!=5) {
			n8ci++;
		}
	} while (n8 != 5);

	System.out.println("cantidad de numeros: " + (n8cp + n8ci) );
	System.out.println("cantidad de pares: " + n8cp);
	System.out.println("cantidad de impares: " + n8ci);
	
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

int n9a,n9b,n9coc,n9res;

	System.out.println("ingrese dos numeros positivos para dividir");
	n9a = leerNum.nextInt();
	n9b = leerNum.nextInt();
	
	n9res = n9a;
	n9coc=0;
	
	while (n9res>=n9b) {
		n9res = n9res - n9b;
		n9coc++;
	}
	System.out.println("Cociente: " + n9coc);
	System.out.println("Residuo: " + n9res);

//10.Realice un programa para que el usuario adivine el resultado de una
//multiplicación entre dos números generados aleatoriamente entre 0 y 10.
//El programa debe indicar al usuario si su respuesta es o no correcta. En
//caso que la respuesta sea incorrecta se debe permitir al usuario ingresar
//su respuesta nuevamente. Para realizar este ejercicio investigue como
//utilizar la función Math.random() de Java.

int n10a,n10b,n10,n10c;

n10a = (int)(random()*10);
n10b = (int)(random()*10);
//	System.out.println(n10a);
//	System.out.println(n10b);
	System.out.println(n10a*n10b);
	
	System.out.println("adivine el numero");
	n10 = leerNum.nextInt();
	
	while (n10 != n10a*n10b) {
			System.out.println("respuesta incorrecta, ingrese un numero nuevamente");
			n10 = leerNum.nextInt();
	}
	System.out.println("respuesta correcta: N=" + n10a*n10b);


//11. Escribir un programa que lea un número entero y devuelva el número de
//dígitos que componen ese número. Por ejemplo, si introducimos el
//número 12345, el programa deberá devolver 5. Calcular la cantidad de
//dígitos matemáticamente utilizando el operador de división. Nota:
//recordar que las variables de tipo entero truncan los números o
//resultados.

int n11,n11c;
	System.out.println("ingrese un numero entero");
	n11 = leerNum.nextInt();
	n11c=0;
	
	do {
		n11 = n11/10;
		n11c++;
	} while (n11>0);
	System.out.println("numero de digitos: " + n11c);
	
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

String t12,t12u,t12d,t12c;
int n12,n12u,n12d,n12c;
n12=0;

	do {
		n12c = n12/100;
		n12d = n12/10 - n12c*10; 
		n12u = n12 - n12c*100 - n12d*10;
		if (n12c==3 || n12d ==3 || n12u == 3) {
			t12c=String.valueOf(n12c);
			t12d=String.valueOf(n12d);
			t12u=String.valueOf(n12u);

			if (t12c.equals("3")) {
				t12c="E";
			}
			if (t12d.equals("3")) {
				t12d="E";
			}
			if (t12u.equals("3")) {
				t12u="E";
			}
			//System.out.print(t12c + " " +t12d + " " +t12u + " ");			
			System.out.println( t12c + "X" + t12d + "X" + t12u );

		} else {
			System.out.println( n12c + "X" + n12d + "X" + n12u );
		}
		
		n12++;

	} while (n12<=999);

//13.Crear un programa que dibuje una escalera de números, donde cada
//línea de números comience en uno y termine en el número de la línea.
//Solicitar la altura de la escalera al usuario al comenzar. Ejemplo: si se
//ingresa el número 3ր
//1
//12
//123

int n13,n13aux;
	System.out.println("Ingrese numero para la altura");
	n13 = leerNum.nextInt();
	n13aux=0;
	for (int i = 0; i < n13; i++) {
		for (int j = 0; j < i+1; j++) {
			n13aux = j+1;
			System.out.print(n13aux);
		}
		n13aux=0;
		System.out.println("");
	}

//14.Se dispone de un conjunto de N familias, cada una de las cuales tiene
//una M cantidad de hijos. Escriba un programa que pida la cantidad de
//familias y para cada familia la cantidad de hijos para averiguar la media
//de edad de los hijos de todas las familias.

int n14n,n14m,n14cf,n14ch,n14edad,n14sumedad,n14sumhijos;

	n14cf=0;   //contador de familias
	n14ch=0;   //contador de hijos de cada familia
	n14sumedad=0; //suma de las edades de todos los hijos
	n14sumhijos=0;  //contador de los hijos de todas las familias
	
	System.out.println("ingrese cantidad N de familias");
	n14n = leerNum.nextInt();
	do {
		n14cf++;
		System.out.println("ingrese cantidad M de hijos de la familia " + (n14cf) );
		n14m = leerNum.nextInt();
		
		while (n14ch<n14m) {
			n14ch++;
			System.out.println("ingrese edad del hijo numero " + n14ch);
			n14edad = leerNum.nextInt();
			n14sumedad = n14sumedad + n14edad;
		}
		n14sumhijos = n14sumhijos + n14ch;
		n14ch=0;
	} while (n14cf<n14n);
	System.out.println("suma de edades " + n14sumedad);
	System.out.println("promedio de edaddes " + (double)n14sumedad/n14sumhijos);
	
}

}
