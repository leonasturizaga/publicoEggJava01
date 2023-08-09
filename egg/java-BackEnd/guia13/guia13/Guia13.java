
package guia13;

import Entidades.AdivinarNumero;
import Entidades.ClassDos;
import Entidades.ClassUno;
import Entidades.DivisionNumero;
import Entidades.Persona;
import Exepciones.AdivinarNumeroException;
import static java.sql.JDBCType.NULL;
import java.util.InputMismatchException;
import java.util.Scanner;


public class Guia13 {


public static void main(String[] args) throws AdivinarNumeroException {
//1. Inicializar un objeto de la clase Persona ejercicio 3 de la guía 8 Servicios, a null y tratar
//de invocar el método esMayorDeEdad() a través de ese objeto. Luego, englobe el código
//con una cláusula try-catch para probar la nueva excepción que debe ser controlada.

//Persona pe;
//try{
//	boolean aux = pe.esMayorDeEdad(pe);
//} catch (RuntimeException a){
//	System.out.println("RuntimeException, variable no inicializada");
//} catch (Exception e){
//	System.out.println("other exception");
//}

//2. Inicializar un objeto de la clase Persona ejercicio 3 de la guía 8 Servicios, a null y tratar
//de invocar el método esMayorDeEdad() a través de ese objeto. Luego, englobe el código
//con una cláusula try-catch para probar la nueva excepción que debe ser controlada.
//Definir una Clase que contenga algún tipo de dato de tipo array y agregue el código para
//generar y capturar una excepción ArrayIndexOutOfBoundsException (índice de arreglo fuera
//de rango).

//	Persona per;
//	int[] excepciones = new int[3];
//	for (int i = 0; i < excepciones.length + 1; i++) {
//		try {
//			excepciones[i] = i;
//			boolean aux = per.esMayorDeEdad(per);   // no se inicializa el objeto para que de error 
//
//		} catch (ArrayIndexOutOfBoundsException b) {
//			System.out.println("ArrayIndexOutOfBoundsException, indice fuera de rango");
//		} catch (RuntimeException a) {
//			System.out.println("RuntimeException, variable no inicializada");
//		} catch (Exception e) {
//			System.out.println("other exception");
//		}
//	}
//
//	for (int i = 0; i < excepciones.length; i++) {
//		System.out.println(excepciones[i]);
//	}
	



//3. Defina una clase llamada DivisionNumero. En el método main utilice un Scanner para leer dos
//números en forma de cadena. A continuación, utilice el método parseInt() de la clase Integer,
//para convertir las cadenas al tipo int y guardarlas en dos variables de tipo int. Por ultimo realizar
//una división con los dos numeros y mostrar el resultado.

//	Scanner leer = new Scanner(System.in);
//	DivisionNumero obj = new DivisionNumero();
//
//	String n1 = leer.nextLine();
//	String n2 = leer.nextLine();
//try {
//	int a = obj.convertirCadena(n1);
//	int b = obj.convertirCadena(n2);
//
//	System.out.println("division: " + a / b);
//} 
//catch (ArithmeticException a){
//	System.out.println("division por cero");
//} 
//catch (NumberFormatException b){
//	System.out.println("NumberFormatExeption para no ingresar letras");
//}


//4. Todas estas operaciones puede tirar excepciones a manejar, el ingreso por teclado puede
//causar una excepción de tipo InputMismatchException, el método Integer.parseInt() si la cadena
//no puede convertirse a entero, arroja una NumberFormatException y además, al dividir un
//número por cero surge una ArithmeticException. Manipule todas las posibles excepciones
//utilizando bloques try/catch para las distintas excepciones

//	Scanner leer = new Scanner(System.in);
//	String n1;
//	String n2;
//
//	try {
//		System.out.println("ej3) Ingrese dos numeros en formato de texto");
//		n1 = leer.nextLine();
//		n2 = leer.nextLine();
//		double a = Double.parseDouble(n1);   //n1=null para exception d
//		double b = Double.parseDouble(n2);
//		System.out.println("division: " + a / b);
//	} catch (InputMismatchException a) {
//		System.out.println("InputMismatchException, Ingreso por teclado");
//	} catch (NumberFormatException b) {
//		System.out.println("NumberFormatExeption, ingreso de letras o simbolos");
//	} catch (ArithmeticException c) {
//		System.out.println("ArithmeticException, division por cero");
//	} catch (NullPointerException d) {
//		System.out.println("NullPointerException, valor nulo");
//	} catch (RuntimeException f) {
//		System.out.println("RuntimeException: Uncompilable source code - Erroneous tree type: <any>");
//	}

//5. Escribir un programa en Java que juegue con el usuario a adivinar un número. La computadora
//debe generar un número aleatorio entre 1 y 500, y el usuario tiene que intentar adivinarlo. Para
//ello, cada vez que el usuario introduce un valor, la computadora debe decirle al usuario si el
//número que tiene que adivinar es mayor o menor que el que ha introducido el usuario. Cuando
//consiga adivinarlo, debe indicárselo e imprimir en pantalla el número de veces que el usuario
//ha intentado adivinar el número. Si el usuario introduce algo que no es un número, se debe
//controlar esa excepción e indicarlo por pantalla. En este último caso también se debe contar el
//carácter fallido como un intento.

AdivinarNumero ad = new AdivinarNumero();
ad.juego();



//6. Dado el método metodoA de la clase A, indique:
//a) ¿Qué sentencias y en qué orden se ejecutan si se produce la excepción MioException?
//b) ¿Qué sentencias y en qué orden se ejecutan si no se produce la excepción MioException?
//class A {
//public void metodoA() {
//sentencia_a1
//sentencia_a2
//try {
//sentencia_a3
//sentencia_a4
//} catch (MioException e){
//sentencia_a6
//}
//sentencia_a5
//}
//}

//RESPUESTAS
//a) ¿Qué sentencias y en qué orden se ejecutan si se produce la excepción MioException?
//sentencia_a1
//sentencia_a2

//sentencia_a6

//sentencia_a5

//b) ¿Qué sentencias y en qué orden se ejecutan si no se produce la excepción MioException?
//sentencia_a1
//sentencia_a2

//sentencia_a3
//sentencia_a4

//sentencia_a5

//7. Dado el método metodoB de la clase B, indique:
//a) ¿Qué sentencias y en qué orden se ejecutan si se produce la excepción MioException?
//b) ¿Qué sentencias y en qué orden se ejecutan si no se produce la excepción MioException?
//class B {
//public void metodoB() {
//sentencia_b1
//try {
//sentencia_b2
//} catch (MioException e){
//sentencia_b3
//}
//finally
//sentencia_b4
//}
//}

//RESPUESTAS
//a) ¿Qué sentencias y en qué orden se ejecutan si se produce la excepción MioException?
//sentencia_b1
//sentencia_b3
//sentencia_b4

//b) ¿Qué sentencias y en qué orden se ejecutan si no se produce la excepción MioException?
//sentencia_b1
//sentencia_b2
//sentencia_b4


//8. Indique que se mostrará por pantalla cuando se ejecute cada una de estas clases:
//class Uno{
//private static int metodo() {}   }
//public static void main (String[] args) {

//ClassUno uno = new ClassUno();
//int var;
//var = uno.metodo1();
//	System.out.println("var: " + var);
//
////public static void main (String[] args) {
//System.out.println("Main para ClassUno");
//try {
//		System.out.println(ClassUno.metodo1());
//	} catch (Exception e) {
//		System.err.println("Excepcion en metodo() ");
//		e.printStackTrace();
//	}
//
//
////public static void main (String[] args) {
//System.out.println("Main para ClassDos");
//try {
//		System.out.println(ClassDos.metodo2());
//	} catch (Exception e) {
//		System.err.println(" Excepcion en metodo ( ) ");
//		e.printStackTrace();
//	}

//9. Dado el método metodoC de la clase C, indique:
//a) ¿Qué sentencias y en qué orden se ejecutan si se produce la excepción MioException?
//b) ¿Qué sentencias y en qué orden se ejecutan si no se produce la excepción MioException?
//c) ¿Qué sentencias y en qué orden se ejecutan si se produce la excepción TuException?
//class C {
//void metodoC() throws TuException {
//	sentencia_c1
//	try {
//		sentencia_c2
//		sentencia_c3
//	} catch (MioException e) {
//		sentencia_c4
//	} catch (TuException e) {
//		sentencia_c5
//		throw (e)
//	} finally 
//		sentencia_c6
//	}
//}

//RESPUESTAS
//a) ¿Qué sentencias y en qué orden se ejecutan si se produce la excepción MioException?
//	sentencia_c1
//		sentencia_c4
//		sentencia_c6


//b) ¿Qué sentencias y en qué orden se ejecutan si no se produce la excepción MioException?
//	sentencia_c1
//		sentencia_c2
//		sentencia_c3
//		sentencia_c6


//c) ¿Qué sentencias y en qué orden se ejecutan si se produce la excepción TuException?
//	sentencia_c1
//		sentencia_c5
//		sentencia_c6

}

}
