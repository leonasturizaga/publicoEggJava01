
package eggguiapoo;

import java.util.Scanner;


public class Cuenta {
//4. Crea una clase "Cuenta" que tenga atributos como "saldo" y "titular". Luego, crea un método "retirar_dinero" que
//permita retirar una cantidad de dinero del saldo de la cuenta. Asegúrate de que el saldo nunca sea negativo después
//de realizar una transacción de retiro.

//atributos
private double saldo;
private String titular;

//constructor
	public Cuenta(double saldo, String titular) {
		this.saldo = saldo;
		this.titular = titular;
	}
	public Cuenta() {
	}

//metodos setter y getter

	public double getSaldo() {
		return saldo;
	}
	
	
//metodos	

public void retirar_dinero(){
	Scanner leerNum = new Scanner(System.in);
	double valor;
		System.out.println("ingrese valor a retirar");
	valor = leerNum.nextDouble();
	
	if (valor <= this.saldo) {
	this.saldo = this.saldo - valor;
	
	} else {
		System.out.println("saldo insuficiente");
	}
}


	
}
