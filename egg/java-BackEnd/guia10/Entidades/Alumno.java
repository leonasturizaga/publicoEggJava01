
package Entidades;

import java.util.ArrayList;
import java.util.Arrays;


public class Alumno {
//3. Crear una clase llamada Alumno que mantenga información sobre las notas de distintos alumnos. La clase Alumno tendrá
//como atributos, su nombre y una lista de tipo Integer con sus 3 notas.

private String nombre;
private ArrayList <Integer> nota;




	public Alumno() {
		this.nombre = nombre;
		this.nota = nota;
	}

	public Alumno(String nombre, ArrayList<Integer> nota) {
		this.nombre = nombre;
		this.nota = nota;
	}


	public Alumno(String nombre) {
		this.nombre = nombre;
		this.nota = new ArrayList<>();
	}


	
	public String getNombre() {
		return nombre;
	}

	public ArrayList<Integer> getNota() {
		return nota;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setNota(ArrayList<Integer> nota) {
		this.nota = nota;
	}


//	@Override
//	public String toString() {
//		return "Alumno{" + "nombre=" + nombre + ", nota=" + Arrays.toString(nota.toArray()) + '}';
//	}

	@Override
	public String toString() {
		return "Alumno{" + "nombre=" + nombre + ", nota=" + nota + '}';
	}



	

	
	


}
