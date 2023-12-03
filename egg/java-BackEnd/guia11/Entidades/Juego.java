
package Entidades;

import java.util.ArrayList;
import java.util.Scanner;


public class Juego {
//Clase Juego: esta clase posee los siguientes atributos: Jugadores (conjunto de Jugadores) y Revolver
//Métodos:
//• llenarJuego(ArrayList<Jugador>jugadores, Revolver r): este método recibe los jugadores y el revolver para guardarlos
//en los atributos del juego.
//• ronda(): cada ronda consiste en un jugador que se apunta con el revolver de agua y aprieta el gatillo. Sí el revolver tira
//el agua el jugador se moja y se termina el juego, sino se moja, se pasa al siguiente jugador hasta que uno se moje. Si o
//si alguien se tiene que mojar. Al final del juego, se debe mostrar que jugador se mojó.
//Pensar la lógica necesaria para realizar esto, usando los atributos de la clase Juego.

private ArrayList<Jugador> jugadores;
private Revolver revolver;

	public Juego(ArrayList<Jugador> jugadores, Revolver revolver) {
		this.jugadores = jugadores;
		this.revolver = revolver;
	}

//metodos
public void llenarJuego(ArrayList<Jugador> jugadores, Revolver obj) {
	Scanner leer = new Scanner(System.in);
	System.out.println("Ingrese numero de jugadores (hasta 6)");
	int n = leer.nextInt();
	if (n < 1 || n > 6) {
		n = 6;
	}
	for (int i = 0; i < n; i++) {
		int id = i + 1;
		String nombre = "nom" + (i + 1);
		boolean mojado = false;
		Jugador aux = new Jugador(id, nombre, mojado);
		this.jugadores.add(aux);
	}
	obj.llenarRevolver();
	this.revolver= obj;
}
public void ronda() {
	Revolver r = this.revolver;
	boolean mojado = false;
	int n = 0;
	while (mojado == false) {
		mojado = r.mojar();
		if (mojado == true) {
			if (n == jugadores.size()) {
				n = 0;
			}
			jugadores.get(n).setMojado(mojado);
			System.out.println("jugador " + jugadores.get(n) + " esta mojado " + mojado);
		} else {
			if (n == jugadores.size()) {
				n = 0;
			}
			r.siguienteChorro();
			n++;
			System.out.println(n + " r: " + revolver);
		}
	}

}

	@Override
	public String toString() {
		return "Juego{" + "jugadores=" + jugadores + ", revolver=" + revolver + '}';
	}


}
