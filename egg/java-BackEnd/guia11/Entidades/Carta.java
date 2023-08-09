
package Entidades;

import java.util.ArrayList;
import java.util.HashMap;


public class Carta {
//3. Realizar una baraja de cartas españolas orientada a objetos. Una carta tiene un número entre 1
//y 12 (el 8 y el 9 no los incluimos) y un palo (espadas, bastos, oros y copas). Esta clase debe
//contener un método toString() que retorne el número de carta y el palo. La baraja estará
//compuesta por un conjunto de cartas, 40 exactamente.

private Integer numero;
private String palo;

	public Carta() {
	}

	public Carta(Integer numero, String palo) {
		this.numero = numero;
		this.palo = palo;
	}


//metodo 
	
public ArrayList<Carta> generarBaraja() {
	ArrayList<Carta> baraja = new ArrayList();
	String[] palos = {"es", "ba", "or", "co"};
	Carta carta;
	for (int i = 0; i < 12; i++) {
		for (int j = 0; j < 4; j++) {
			if ((i >= 0 && i < 7) || (i >= 9 && i < 12)) {
				this.numero = i + 1;
				this.palo = palos[j];
				carta = new Carta(this.numero, this.palo);
				baraja.add(carta);
			}
		}
	}
	return baraja;
}	
	@Override
	public String toString() {
		return "Carta{" +  numero +  palo + '}';
	}








}
