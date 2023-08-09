
package Entidades;


public class Cafetera {
//2. Programa Nespresso. Desarrolle una clase Cafetera en el paquete Entidades con los atributos capacidadMáxima 
//(la cantidad máxima de café que puede contener la cafetera) y cantidadActual (la cantidad actual de café que hay 
//en la cafetera). Agregar constructor vacío y con parámetros así como setters y getters. 
	private int capacidadMaxima;
	private int cantidadActual;

	public Cafetera() {
	}
	public Cafetera(int capacidadMaxima, int cantidadActual) {
		this.capacidadMaxima = capacidadMaxima;
		this.cantidadActual = cantidadActual;
	}

	// metodos setters and getters
	public void setCapacidadMaxima(int capacidadMaxima) {
		this.capacidadMaxima = capacidadMaxima;
	}
	public void setCantidadActual(int cantidadActual) {
		this.cantidadActual = cantidadActual;
	}
	public int getCapacidadMaxima() {
		return capacidadMaxima;
	}
	public int getCantidadActual() {
		return cantidadActual;
	}

	@Override
	public String toString() {
		return "Cafetera{" + "capacidadMaxima=" + capacidadMaxima + ", cantidadActual=" + cantidadActual + '}';
	}
	
	
	
}
