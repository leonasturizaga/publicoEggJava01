
package Entidades;

import java.util.ArrayList;
import java.util.Scanner;


public class Cine {
//2. Nos piden hacer un programa sobre un Cine, que tiene una sala con un conjunto de asientos(8 filas por 6 columnas). De Cine
// nos interesa conocer la película que se está reproduciendo, la sala con los espectadores y el precio de la entrada. 

//Para representar la sala con los espectadores vamos a utilizar una matriz. Los asientos son etiquetados por una letra y un 
//número la fila A1 empieza al final del mapa como se muestra enla tabla. También  deberemos saber si el asiento está 
//ocupado por un espectador o no, si esta ocupado se muestra una X, sino un espacio vacío.
//8 A X | 8 B X | 8 C X | 8 D | 8 E X | 8 F X
//7 A X | 7 B X | 7 C X | 7 D X | 7 E | 7 F X
//6 A X | 6 B X | 6 C | 6 D X | 6 E X | 6 F
//5 A X | 5 B X | 5 C X | 5 D X | 5 E X | 5 F X
//4 A X | 4 B X | 4 C X | 4 D X | 4 E X | 4 F X
//3 A X | 3 B X | 3 C X | 3 D | 3 E X | 3 F X
//2 A X | 2 B | 2 C X | 2 D X | 2 E X | 2 F
//1 A X | 1 B X | 1 C X | 1 D X | 1 E X | 1 F X
//Se debe realizar una pequeña simulación, en la que se generen muchos espectadores y se los ubique en los asientos aleatoriamente
// (no se puede ubicar un espectador donde ya esteocupado el asiento). Los espectadores serán ubicados de uno en uno y para
// ubicarlos tener en cuenta que sólo sepodrá sentar a un espectador si tiene el dinero suficiente para pagar la entrada, si hay
// espacio libre en la sala y si tiene la edad requerida para ver la película. En caso de que el asiento este ocupado se le debe
// buscar uno libre. Al final del programa deberemos mostrar la tabla, podemos mostrarla con la letra y numero de cada asiento o 
// solo las X y espacios vacíos.
private String pelicula="peli1";
private double precio=200;
int n=8;
int m=6;
private String[][] sala = new String[n][m];

	public String[][] getSala() {
		return sala;
	}
	public void setSala(String[][] sala) {
		this.sala = sala;
	}
	public String getPelicula() {
		return pelicula;
	}
	public double getPrecio() {
		return precio;
	}

	//metodos
public void crearSala(String[][] sala){
	String[] aux = {"A","B","C","D","E","F"};
	for (int i = 0; i < sala.length; i++) {
		for (int j = 0; j < sala[i].length; j++) {
			sala[i][j]=(sala.length-i)+aux[j]	+ " ";
		}
	}
}
public void mostrarSala(String[][] sala) {
	for (int i = 0; i < sala.length; i++) {
		for (int j = 0; j < sala[i].length; j++) {
			System.out.print("|" + sala[i][j] + "|");
		}
		System.out.println("");
	}
}

public void ubicarEspectador(String[][] sala, ArrayList<Espectador> esp, ArrayList<Pelicula> pelis) {
	int espectador = 0;
	int auxi;
	int auxj;
	Scanner leer = new Scanner(System.in);
	System.out.println("ingrese numero de pelicula 1 a 3");
	int	peli = leer.nextInt()-1;
	do {
		if (pelis.get(peli).getEdad()<=esp.get(espectador).getEdad() && this.precio <= esp.get(espectador).getDinero()) {
			auxi = (int) (Math.random() * (sala.length));
			auxj = (int) (Math.random() * (sala[0].length));
			if (sala[auxi][auxj].contains("x")) {
				System.out.println("espectador: " + (espectador+1) + " lugar ocupado");
			} else {
				sala[auxi][auxj] = sala[auxi][auxj].substring(0, 2) + "x";
				System.out.println("espectador: " + (espectador+1)  + " lugar asignado: " + sala[auxi][auxj]);
				espectador++;
			}
		} else {
			System.out.println("espectador " + (espectador+1)  +  " no cumple con los requisitos");
			espectador++;
		}

	} while (espectador < esp.size());
}

}
