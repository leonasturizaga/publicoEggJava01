
package Entidades;


public class Revolver {
//Clase Revolver de agua: esta clase posee los siguientes atributos: posición actual (posición del tambor 
//que se dispara, puede que esté el agua o no) y posición agua (la posición del tambor donde se encuentra el agua). Estas
//dos posiciones, se generarán aleatoriamente.
//Métodos:
//• llenarRevolver(): le pone los valores de posición actual y de posición del agua. Los valores deben ser aleatorios.
//• mojar(): devuelve true si la posición del agua coincide con la posición actual
//• siguienteChorro(): cambia a la siguiente posición del tambor
//• toString(): muestra información del revolver (posición actual y donde está el agua)
private int posAct;
private int posAgua;

	public Revolver() {

	}

	//metodos
public void llenarRevolver() {
	this.posAct = (int) (Math.random() * (6 - 1 + 1) + 1);  //(X-Y+1)+Y
	this.posAgua = (int) (Math.random() * (6 - 1 + 1) + 1);
}
public boolean mojar(){
	boolean mojar=false;
	if (this.posAct==this.posAgua) {
		mojar=true;
	}
	return mojar;
}
public void siguienteChorro(){
	if (this.posAct==6) {
		this.posAct=1;
	} else {
		this.posAct++;
	}
}
	
	@Override
	public String toString() {
		return "Revolver{" + "posAct=" + posAct + ", posAgua=" + posAgua + '}';
	}




}
