
package p04;

import java.util.Scanner;


public class p04e02 {


public static void main(String[] args) {
	Scanner leer = new Scanner(System.in);
//2. Realizar un algoritmo que llene un vector de tamaño N con valores
//aleatorios y le pida al usuario un número a buscar en el vector. El
//programa mostrará dónde se encuentra el numero y si se encuentra
//repetido

int n;
n=10;
int[] vec2 = new int[n];
llenarVecN(vec2,n);
leerVector(vec2,n);

//leer vector otra forma
	System.out.println("");
	String aux = "";
	for (int elemento : vec2) {
		aux += " "+ elemento;
	}
	System.out.println(aux);

//buscar numero
	int num;
	System.out.println("Ingrese numero a buscar");
	num=leer.nextInt();
	buscarValor(vec2,n,num);
	

}
//metodos
public static int[] llenarVecN(int[] vec, int n){
	for (int i = 0; i < n; i++) {
		vec[i]=(int)(Math.random()*(10-1+1)+1); //(int)(Math.random()*(x-y+1)+y); para aleatorios int dentro de un rango (y<x).
	}
	return vec;
}

public static void buscarValor(int[] vec, int n, int num){
	String pos = "";
	int cont = 0;
	for (int i = 0; i < n; i++) {
		if (num==vec[i]) {
			pos += " " + i;
			cont++;
		}
	}
	System.out.println("posicion: " + pos);
	System.out.println("se repite " + cont + " veces");
}
public static void leerVector(int[] vec,int n){
	for (int i=0; i < n; i++) {
		System.out.print(vec[i] +",");
	}
	System.out.println("");
}


}
