
package egg;

import static java.lang.Math.sqrt;
import java.util.Scanner;


public class E01P01 {
public static void main(String[] args) {
	
	Scanner leerNum = new Scanner(System.in);
	Scanner leerText = new Scanner(System.in);  //se crea dos scanners para evitar errores de lectura en el pasaje de numeros a texto.
//1. Escribir un programa que pida dos números enteros por teclado y calcule la suma de los dos. El programa deberá después mostrar el resultado de la suma;
	int e1;
	int e2;
	
	System.out.println("Ingrese dos numeros enteros");
	e1 = leerNum.nextInt();
	e2 =leerNum.nextInt();   
	
	System.out.println("la suma es: " + (e1 + e2) );
	
//2. Escribir un programa que pida tu nombre, lo guarde en una variable y lo muestre por pantalla.
	//leer.nextLine();  //esta linea es necesaria para limpiar el Scanner cuando se usan varios scanners al pasar de enteros a texto en una misma clase.
	
	String nombre;
	
	System.out.println("Ingrese su nombre");
	nombre = leerText.nextLine();
	
	System.out.println("Su nombre es: " + nombre);

//3. Escribir un programa que pida una frase y la muestre toda en mayúsculas y después toda en minúsculas. 
//Nota: investigar la función toUpperCase() y toLowerCase() en Java.
	String frase;
	
	System.out.println("Ingrese una frase");
	frase = leerText.nextLine();
		
	
	System.out.println("En mayusculas: " + frase.toUpperCase());
	System.out.println("En minusculas; " + frase.toLowerCase());
	

//4. Dada una cantidad de grados centígrados se debe mostrar su equivalente en grados Fahrenheit. La fórmula correspondiente es: F = 32 + (9 * C / 5).
	double C;
	double F;    // se puede definir F = 32 + (9 * C / 5) y en el sout mostrar solo F en lugar de la formula.
	
	System.out.println("Ingrese los grados Centrigrados");
	C = leerNum.nextDouble();
	
	System.out.println(C + " grados centrigrados serian " + (32 + 9 * C/5) + " grados Fahrenheit");

//5. Escribir un programa que lea un número entero por teclado y muestre por pantalla el doble, el triple y la raíz cuadrada de ese número. 
//Nota: investigar la función Math.sqrt().
	double num;

	System.out.println("Ingrese un numero entero");
	num = leerNum.nextInt();
	
	System.out.println("El doble es: " + (num * 2));
	System.out.println("el triple es: " + (num * 3));
	System.out.println("La raiz cuadrada es: " + sqrt(num) );

}


}
