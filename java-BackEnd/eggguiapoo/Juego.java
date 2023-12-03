
package eggguiapoo;

import java.util.Scanner;


public class Juego {
//3. Crea una clase "Juego" que tenga un método "iniciar_juego" que permita a dos jugadores jugar un juego de adivinanza
//de números. El primerjugador elige un número y el segundo jugador intenta adivinarlo. Elsegundo jugador tiene un
//número limitado de intentos y recibe una pista de "más alto" o "más bajo" después de cada intento. El juego
//termina cuando el segundo jugador adivina el número o se queda sin intentos.
//Registra el número de intentos necesarios para adivinar el número y el número de veces que cada jugador ha ganado.

//atributos
public int numero;
public int limite;
public int jugador1;
public int jugador2;

//constructor

//metodos
public void iniciar_juego(){

	Scanner leerNum = new Scanner(System.in);
	int num;
	int intentos;

	intentos=0;
	System.out.println("jugador 1, ingrese numero");
	this.numero= leerNum.nextInt();
	
		do {
			System.out.println("jugador 2, adivine el numero");
			num = leerNum.nextInt();
			if (num == this.numero) {
				System.out.println("numero correcto");
				this.jugador2++;
			}
			if (num < this.numero) {
				System.out.println("pista: mas alto");
				intentos++;
			}
			if (num > this.numero) {
				System.out.println("pista: mas bajo");
				intentos++;
			} 			
		} while (num != this.numero && intentos <limite );
		
		if (num != this.numero) {
			this.jugador1++;
		}
		System.out.println("");
	System.out.println("fin del juego" + "\nJugador 1: " +this.jugador1+ " puntos" + "\nJugador 2: " +this.jugador2+ " puntos");
}

}
