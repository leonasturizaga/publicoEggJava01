
package Entidades;

import java.util.Date;


public class Persona {
//5. Implemente la clase Persona en el paquete entidades. Una persona tiene un nombre y una fecha de nacimiento (Tipo Date), 
//constructor vacío, constructor parametrizado, get y set. 
//atributos
private String nombre;
private Date fechaNac;

//constructores
	public Persona() {
	}
	public Persona(String nombre, Date fechaNac) {
		this.nombre = nombre;
		this.fechaNac = fechaNac;
	}

//getters and setters
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Date getFechaNac() {
		return fechaNac;
	}
	public void setFechaNac(Date fechaNac) {
		this.fechaNac = fechaNac;
	}

	@Override
	public String toString() {
		return "Persona{" + "nombre=" + nombre + ", fechaNac=" + fechaNac + '}';
	}




}
