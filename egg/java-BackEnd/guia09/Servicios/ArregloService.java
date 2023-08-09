
package Servicios;

import java.util.Arrays;


public class ArregloService {
//Crear la clase  ArregloService, en el paquete servicio, con los siguientes métodos:
//1) Método inicializarA recibe un arreglo por parámetro y lo inicializa con números aleatorios.
public void inicializarA(double[] array){
	for (int i = 0; i < array.length; i++) {
		array[i]=Math.round(Math.random()*(99));
	}
}

//2) Método mostrar recibe un arreglo por parámetro y lo muestra por pantalla.
public void mostrar(double[] array){
	for (int i = 0; i < array.length; i++) {
		if (i==0) {
			System.out.print( "{"+array[i]+ " " );
		}
		if (i>0 && i<array.length-1) {
			System.out.print(array[i]+", ");
		}
		if (i==array.length-1) {
			System.out.print(array[i]+ "}" );
		}
	}
	System.out.println("");
}

//3) Método ordenar recibe un arreglo por parámetro y lo ordena de mayor a menor.
public void ordenar(double[] array){
	Arrays.sort(array);
	mostrar(array);
}

//4) Método inicializarB copia los primeros 10 números del arreglo A en el arreglo B. Luego llenar las últimas 10 posiciones 
//del arreglo B con 0.5.
public void inicializarB(double[] array1, double[] array2){
	for (int i = 0; i < array2.length; i++) {
		if (i>=0 && i<10) {
			array2[i]=array1[i];
		}
		if (i>=array2.length-10-1) {
			array2[i]=0.5;
		}
	}
}




}
