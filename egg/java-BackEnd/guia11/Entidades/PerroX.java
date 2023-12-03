
package Entidades;

import java.util.ArrayList;
import java.util.Scanner;


public class PerroX {
//1. Realizar un programa para que una Persona pueda adoptar un Perro. Vamos a contar de dos
//clases. Perro, que tendrá como atributos: nombre, raza, edad y tamaño; y la clase Persona con
//atributos: nombre, apellido, edad, documento y Perro.
private String nombre;
private String raza;
private int edad;
private String tamanio;

private ArrayList<PerroX> perros = new ArrayList();

	public PerroX() {
	}
	public PerroX(String nombre, String raza, int edad, String tamanio) {
		this.nombre = nombre;
		this.raza = raza;
		this.edad = edad;
		this.tamanio = tamanio;
	}

//getters y setters
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getRaza() {
		return raza;
	}
	public void setRaza(String raza) {
		this.raza = raza;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public String getTamanio() {
		return tamanio;
	}
	public void setTamanio(String tamanio) {
		this.tamanio = tamanio;
	}

	public ArrayList<PerroX> getPerros() {
		return perros;
	}

	public void setPerros(ArrayList<PerroX> perros) {
		this.perros = perros;
	}

//metodos
public void crearPerros() {
	Scanner leer = new Scanner(System.in);
	System.out.println("cuantos perros quiere crear");
	int n = leer.nextInt();
	for (int i = 0; i < n; i++) {
		
		String nombre = "perro" + (i + 1);
		String raza = "raza" + (i + 1);
		int edad = (i + 1);
		String tamanio = "tam" + (i + 1);
		PerroX obj = new PerroX(nombre, raza, edad, tamanio);
		perros.add(obj);
	}
}	
	
	@Override
	public String toString() {
		return "Perro{" + "nombre=" + nombre + ", raza=" + raza + ", edad=" + edad + ", tamanio=" + tamanio + '}';
	}




}
