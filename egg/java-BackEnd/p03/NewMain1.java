
package p03;

import java.util.Scanner;


public class NewMain1 {


public static void main(String[] args) {
	Scanner leerNum = new Scanner(System.in);
	Scanner leerText = new Scanner(System.in);
	
//1. Crea una aplicación que le pida dos números al usuario y este pueda
//elegir entre sumar, restar, multiplicar y dividir. La aplicación debe tener
//una función para cada operación matemática y deben devolver sus
//resultados para imprimirlos en el main.

int n1a,n1b;
double n1c;
	System.out.println("ingrese dos numeros para operar");
n1a = leerNum.nextInt();
n1b = leerNum.nextInt();

n1c = opArit(n1a,n1b);

	System.out.println("resultado: " + n1c);
	
}

//METODOS
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
				System.out.println("opcion incorrecta");

				break;
		}
	System.out.println("opeArit: " + res);	
	}

	return res;
}


}
