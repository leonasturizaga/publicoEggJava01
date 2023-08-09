
package Entidades;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;


public class PersonaX {
//1. Realizar un programa para que una Persona pueda adoptar un Perro. Vamos a contar de dos
//clases. Perro, que tendrá como atributos: nombre, raza, edad y tamaño; y la clase Persona con
//atributos: nombre, apellido, edad, documento y Perro.
private String nombre;
private String apellido;
private int edad;
private int documento;
private PerroX perro;

private ArrayList<PersonaX> personas = new ArrayList();

	public PersonaX() {
	}

	public PersonaX(String nombre, String apellido, int edad, int documento, PerroX perro) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.documento = documento;
		this.perro = perro;
	}



//getters y setters
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public int getDocumento() {
		return documento;
	}
	public void setDocumento(int documento) {
		this.documento = documento;
	}
	public PerroX getPerro() {
		return perro;
	}
	public void setPerro(PerroX perro) {
		this.perro = perro;
	}
	public ArrayList<PersonaX> getPersonas() {
		return personas;
	}
	public void setPersonas(ArrayList<PersonaX> personas) {
		this.personas = personas;
	}

	// metodos
public void crearPersona() {
	Scanner leer = new Scanner(System.in);
	System.out.println("cuantas personas quiere crear");
	int n = leer.nextInt();
	for (int i = 0; i < n; i++) {
		String nombre = "nom" + (i+1);
		String apellido = "ape"  + (i+1);
		int edad = 10 + (i+1);;
		int documento= (i+1)*11111111;
		PerroX perro=null;
		PersonaX obj = new PersonaX(nombre, apellido, edad, documento, perro);
		personas.add(obj);
	}
}

public void asignarPerro(ArrayList<PerroX> obj) {
	int salir = 0;
	int n = 0;

	ArrayList<PerroX> aux = obj;
	do {
		Scanner leerT = new Scanner(System.in).useDelimiter("\n");
		Scanner leerN = new Scanner(System.in).useDelimiter("\n");
		System.out.println(personas.get(n).nombre + " ingrese nombre del perro a adoptar");
		String perro = leerT.nextLine();
		int cont = 0;
		for (int i = 0; i < aux.size(); i++) {
			String nom = aux.get(i).getNombre();
			if (nom.equalsIgnoreCase(perro)) {
				personas.get(n).setPerro(aux.get(i));
			}
		}
		Iterator<PerroX> iter = aux.iterator();
		while (iter.hasNext()) {
			if (iter.next().getNombre().equalsIgnoreCase(perro)) {
				iter.remove();
				cont++;
			} 
		}
		if (cont > 0) {
			n++;
		} else {
			System.out.println("el perro no existe o ya fue adoptado");
		}
		System.out.println(" 1) seguir adoptando?,  0)  para salir");
		salir = leerN.nextInt();
	} while (salir != 0);
}
	
	
	@Override
	public String toString() {
		return "Persona{" + "nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + ", documento=" + documento + ", perro=" + perro + '}';
	}



}
