
package Teoria;

import java.util.ArrayList;


public class Equipo {
	private ArrayList<JugadorT> jugadores;

	public Equipo() {
	}

	public Equipo(ArrayList<JugadorT> jugadores) {
		this.jugadores = jugadores;
	}

	
	
	public void setJugadores(ArrayList<JugadorT> jugadores) {
		this.jugadores = jugadores;
	}

	public ArrayList<JugadorT> getJugadores() {
		return jugadores;
	}

	//metodo, no es necesario solo de prueba
	public void adicionarJugador(JugadorT obj){
		this.jugadores.add(obj);
	}
	
	@Override
	public String toString() {
		return "Equipo{" + "jugadores=" + jugadores + '}';
	}

	
}
