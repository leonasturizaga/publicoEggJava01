
package eggguiapoo;

import java.util.Scanner;


public class Operacion {
//3. Crear una clase llamada Operacion que tenga como atributos privados numero1 y numero2. A continuación,
//se deben crear los siguientes métodos:
//a) Método constructor con todos los atributos pasados por parámetro.
//b) Método constructor sin los atributos pasados por parámetro.
//c) Métodos get y set.
//d) Método para crearOperacion(): que le pide al usuario los dos números y los guarda en los atributos del objeto.
//e) Método sumar(): calcular la suma de los números y devolver el resultado al main.
//f) Método restar(): calcular la resta de los números y devolver el resultado al main
//g) Método multiplicar(): primero valida que no se haga una multiplicación por cero, si fuera a multiplicar por cero,
//el método devuelve 0 y se le informa al usuario el error. Si no, se hace la multiplicación y se devuelve el resultado al main
//h) Método dividir(): primero valida que no se haga una división por cero, si fuera a pasar una división por cero,
//el método devuelve 0 y se le informa al usuario el error se le informa al usuario. Si no, se hace la división y se devuelve
//el resultado al main.

//atributos
private double numero1;
private double numero2;

//constructor
public Operacion(double numero1, double numero2) {
		this.numero1 = numero1;
		this.numero2 = numero2;
	}

public Operacion(){
	
}

//metodos get y set

	public double getNumero1() {
		return numero1;
	}
	public double getNumero2() {
		return numero2;
	}

	public void setNumero1(double numero1) {
		this.numero1 = numero1;
	}
	public void setNumero2(double numero2) {
		this.numero2 = numero2;
	}


//metodos
	public void crearOperacion(){
	Scanner leerNum = new Scanner(System.in);		
		System.out.println("ingrese numero 1");
		this.numero1 = leerNum.nextInt();
		System.out.println("ingrese numero 2");
		this.numero2 = leerNum.nextInt();	
	}
	
public double sumar(){
	double resultado;
		resultado = this.numero1 + this.numero2;
	return resultado;
}
public double restar(){
	double resultado;
		resultado = this.numero1 - this.numero2;
	return resultado;
}	
public double multiplicar(){
	double resultado;
	if (this.numero1 == 0 || this.numero2 == 0) {
		System.out.println("Multiplicacion por cero");
		resultado = 0;
	} else {
		resultado = this.numero1*this.numero2;
	}
	return resultado;
}	

public double dividir(){
	double resultado;
	if ( this.numero2 == 0) {
		System.out.println("division por cero");
		resultado = 0;
	} else {
		resultado = this.numero1/this.numero2;
	}
	return resultado;
}

	@Override
	public String toString() {
		return "Operacion{" + "numero1=" + numero1 + ", numero2=" + numero2 + '}';
	}



}
