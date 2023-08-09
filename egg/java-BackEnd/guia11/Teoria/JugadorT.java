
package Teoria;


public class JugadorT {
private String nombre;
private String apellido;
private String posicion;
private int numero;

	public JugadorT() {
	}


	public JugadorT(String nombre, String apellido, String posicion, int numero) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.posicion = posicion;
		this.numero = numero;
	}



	@Override
	public String toString() {
		return "Jugador{" + "nombre=" + nombre + ", apellido=" + apellido + ", posicion=" + posicion + ", numero=" + numero + '}';
	}


}
