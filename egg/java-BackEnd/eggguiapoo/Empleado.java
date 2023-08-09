
package eggguiapoo;


public class Empleado {
//5. Crea una clase "Empleado" que tenga atributos como "nombre", "edad" y"salario". Luego, crea un método 
//"calcular_aumento" que calcule elaumento salarial de un empleado en función de su edad y salario actual.
//El aumento salarial debe ser del 10% si el empleado tiene más de 30años o del 5% si tiene menos de 30 años.

//atributos
private String nombre;
private int edad;
private double salario;

//constructor

	public Empleado() {
	}

	public Empleado(String nombre, int edad, double salario) {
		this.nombre = nombre;
		this.edad = edad;
		this.salario = salario;
	}

//metodos setter y getter

	public String getNombre() {
		return nombre;
	}

	public int getEdad() {
		return edad;
	}

	public double getSalario() {
		return salario;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
	
//metodos
public double calcular_aumento(){
	if (this.edad < 30) {
		this.salario = this.salario*5/100;
	} else {
		this.salario = this.salario*10/100;
	}
	return this.salario;
}	
	
	
	
}
