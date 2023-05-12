
package Entidades;

import java.util.ArrayList;


public class Alumno {
//3. Crear una clase llamada Alumno que mantenga información sobre las notas de distintos alumnos. La clase Alumno tendrá
//como atributos, su nombre y una lista de tipo Integer con sus 3 notas.

private String nombre;
private ArrayList <Integer> nota;

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
	
	


}
