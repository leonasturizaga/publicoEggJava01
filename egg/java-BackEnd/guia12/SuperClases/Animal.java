
package SuperClases;


public class Animal {
//1. Tenemos una clase padre Animal junto con sus 3 clases hijas Perro, Gato, Caballo.
//La clase Animal tendrá como atributos el nombre, alimento, edad y raza del Animal.
//Crear un método en la clase Animal a través del cual cada clase hija deberá mostrar luego un
//mensaje por pantalla informando de que se alimenta.
protected String nombre;
protected String alimento;
protected Integer edad;
protected String raza;

	public Animal(String nombre, String alimento, Integer edad, String raza) {
		this.nombre = nombre;
		this.alimento = alimento;
		this.edad = edad;
		this.raza = raza;
	}

//metodo
public void alimentarse(){
	System.out.println(this.nombre + ", raza " + this.raza + " se alimenta de: " + this.alimento);
}	
//Crear un método en la clase Animal a través del cual cada clase hija deberá mostrar luego un
//mensaje por pantalla informando de que se alimenta.	





}
