
package Entidades;


public class Persona {
//1. Realizar una clase llamada Persona en el paquete de entidades que tengan los siguientes atributos: nombre, edad,
//sexo (‘H’ para hombre, ‘M’ para mujer, ‘O’ para otro), peso y altura. Si desea añadir algún otro atributo, puede hacerlo. 
//Agregar constructores, getters y setters. 
private String nombre;
private int edad;
private char sexo;
private double peso;
private double altura;

private int imc;
private boolean mayor;

	public Persona() {
	}
	public Persona(String nombre, int edad, char sexo, double peso, double altura) {
		this.nombre = nombre;
		this.edad = edad;
		this.sexo = sexo;
		this.peso = peso;
		this.altura = altura;
	}

	public String getNombre() {
		return nombre;
	}
	public int getEdad() {
		return edad;
	}
	public char getSexo() {
		return sexo;
	}
	public double getPeso() {
		return peso;
	}
	public double getAltura() {
		return altura;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public void setSexo(char sexo) {
		this.sexo = sexo;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}

	public int getImc() {
		return imc;
	}
	public boolean getMayor() {
		return mayor;
	}
	public void setImc(int imc) {
		this.imc = imc;
	}
	public void setMayor(boolean mayor) {
		this.mayor = mayor;
	}

public boolean esMayorDeEdad(Persona obj){
	boolean mayor;
	if (obj.getEdad()>=18) {
		mayor = true;
	} else {
		mayor = false;
	}
	return mayor;
}	
	
//	@Override
//	public String toString() {
//		return "Persona{" + "nombre=" + nombre + ", edad=" + edad + ", sexo=" + sexo + ", peso=" + peso + ", altura=" + altura + '}';
//	}

	@Override
	public String toString() {
		return "Persona{" + "nombre=" + nombre + ", edad=" + edad + ", sexo=" + sexo + ", peso=" + peso + ", altura=" + altura + ", imc=" + imc + ", mayor=" + mayor + '}';
	}
	
	





}
