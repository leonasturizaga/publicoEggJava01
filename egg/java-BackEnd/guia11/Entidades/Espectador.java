
package Entidades;

import java.util.ArrayList;
import java.util.Scanner;


public class Espectador {
//Por último, del espectador, nos interesa saber su nombre, edad y el dinero que tiene disponible. 

//Se debe realizar una pequeña simulación, en la que se generen muchos espectadores y se los ubique en los asientos aleatoriamente
// (no se puede ubicar un espectador donde ya esteocupado el asiento). Los espectadores serán ubicados de uno en uno y para
// ubicarlos tener en cuenta que sólo sepodrá sentar a un espectador si tiene el dinero suficiente para pagar la entrada, si hay
// espacio libre en la sala y si tiene la edad requerida para ver la película. En caso de que el asiento este ocupado se le debe
// buscar uno libre. Al final del programa deberemos mostrar la tabla, podemos mostrarla con la letra y numero de cada asiento o 
// solo las X y espacios vacíos.
private String nombre;
private int edad;
private double dinero;
private ArrayList<Espectador> espectadores = new ArrayList();

	public Espectador() {
	}


	public Espectador(String nombre, int edad, double dinero) {
		this.nombre = nombre;
		this.edad = edad;
		this.dinero = dinero;
	}

	public String getNombre() {
		return nombre;
	}
	public int getEdad() {
		return edad;
	}
	public double getDinero() {
		return dinero;
	}
	public ArrayList<Espectador> getEspectadores() {
		return espectadores;
	}


//metodos
public void crearEspectador(){
	Scanner leer = new Scanner(System.in).useDelimiter("\n");
	System.out.println("cuantos espectadores quiere generar?");
	int esp = leer.nextInt();
	for (int i = 0; i < esp ; i++) {
		nombre = "n" + i;
		edad = (int)(Math.random()*(100-5+1)+5);
		dinero = Math.round(Math.random()*10000)/10.0;
		Espectador aux = new Espectador(nombre, edad, dinero);
		espectadores.add(aux);
	}
	
}

	@Override
	public String toString() {
		return "Espectador{" + "nombre=" + nombre + ", edad=" + edad + ", dinero=" + dinero + '}';
	}



}
