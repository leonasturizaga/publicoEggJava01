
package Entidades;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;


public class Baraja {
//La baraja estará compuesta por un conjunto de cartas, 40 exactamente.
//Las operaciones que podrá realizar la baraja son:
//• barajar(): cambia de posición todas las cartas aleatoriamente.
//• siguienteCarta(): devuelve la siguiente carta que está en la baraja, cuando no haya más o
//se haya llegado al final, se indica al usuario que no hay más cartas.
//• cartasDisponibles(): indica el número de cartas que aún se puede repartir.
//• darCartas(): dado un número de cartas que nos pidan, le devolveremos ese número de
//cartas. En caso de que haya menos cartas que las pedidas, no devolveremos nada, pero
//debemos indicárselo al usuario.
//• cartasMonton(): mostramos aquellas cartas que ya han salido, si no ha salido ninguna
//indicárselo al usuario
//• mostrarBaraja(): muestra todas las cartas hasta el final. Es decir, si se saca una carta y
//luego se llama al método, este no mostrara esa primera carta.	

private ArrayList<Carta> baraja;
private ArrayList<Carta> monton;

	public Baraja() {
	}

	public ArrayList<Carta> getBaraja() {
		return baraja;
	}
	public void setBaraja(ArrayList<Carta> baraja) {
		this.baraja = baraja;
	}
	public ArrayList<Carta> getMonton() {
		return monton;
	}
	public void setMonton(ArrayList<Carta> monton) {
		this.monton = monton;
	}

//metodos

public void barajar(){
	Collections.shuffle(this.baraja);
}

public Carta siguienteCarta() {
	Carta aux = this.baraja.get(0);
	monton.add(aux);
	this.baraja.remove(0);
	return aux;
}
public int cartasDisponibles() {
	return this.baraja.size();
}
public void darCartas(){
	Scanner leer = new Scanner(System.in);
	System.out.println("Cuantas cartas quiere repartir");
	int n = leer.nextInt();
	while (n>0) {
		if (this.baraja.size()>=n) {
			siguienteCarta();
			n--;
		} else {
			System.out.println("No hay suficientes cartas");
			n=0;
		}
	}
}
public void cartasMonton(){
	if (this.monton.size()>0) {
		for (Carta carta : this.monton) {
		System.out.println(carta);
		}
	} else {
		System.out.println("No hay cartas en el monton");
	}
}

public void mostrarBaraja(){
		for (Carta carta : this.baraja) {
		System.out.println(carta);
	}
		System.out.println(this.baraja.size());
}
}
