
package p04;

import java.util.Scanner;
import javax.swing.JOptionPane;


public class p04ex01 {


public static void main(String[] args) {
//1. Realizar un algoritmo que calcule la suma de todos los elementos de un vector de tamaño N, con los valores ingresados por el usuario.
//Scanner leer = new Scanner(System.in);

	Scanner leerNum = new Scanner(System.in);
	Scanner leerText = new Scanner(System.in);

int n;
	System.out.println("Ingrese N");
//n = Integer.parseInt( JOptionPane.showInputDialog("n") );
n = leerNum.nextInt();

int[] vec= new int[n];
int suma=0;
	for (int i = 0; i < n; i++) {
		//vec[i]=Integer.parseInt(JOptionPane.showInputDialog("ingrese numero, posicion " + (i+1)));
		System.out.println("ingrese un valor");
		vec[i]= leerNum.nextInt();
		suma+= vec[i];
	}
	System.out.println("la suma es: " +suma);

}

}
