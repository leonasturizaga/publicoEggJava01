
package Servicios;

import Entidades.CuentaBancaria;
import java.util.Scanner;

public class CuentaBancariaServicio {
//1. Realizar una clase llamada CuentaBancaria en el paquete Entidades con los siguientes atributos: numeroCuenta(entero), 
//dniCliente(entero largo), saldoActual. Agregar constructor vacío, con parámetros, getters y setters.
//Agregar la clase CuentaBancariaServicio en el paquete Servicios que contenga:
private Scanner leer = new Scanner(System.in).useDelimiter("\n");

//metodos
//a) Método para crear cuenta pidiéndole los datos al usuario.

//CuentaBancaria obj1 = new CuentaBancaria();

public CuentaBancaria crearCuenta(){
	System.out.println("ingrese numero de cuenta");
	int numeroCuenta = leer.nextInt();
	System.out.println("ingrese dni");
	long dniCliente = leer.nextLong();
	System.out.println("ingrese saldo actual");
	double saldoActual = leer.nextDouble();
	
	return new CuentaBancaria(numeroCuenta, dniCliente, saldoActual); //retorna nuevo contenido al objeto que lo llama.
}	
	
//b) Método ingresar(double): recibe una cantidad de dinero a ingresar y se le sumará al saldo actual.

public void ingresar3(CuentaBancaria obj){
	System.out.println("ingrese el monto a depositar: ");
	double ing = leer.nextDouble();
	obj.setSaldoActual( ing + obj.getSaldoActual());
}

//c) Método retirar(double): recibe una cantidad de dinero a retirar y se le restara al saldo actual. Si la cuenta no tiene
// la cantidad de dinero a retirar se retirará el máximo posible hasta dejar la cuenta en 0.
public void retirar(CuentaBancaria obj){
	System.out.println("ingrese el monto a retirar: ");
	double ing = leer.nextDouble();
	if (obj.getSaldoActual()>=ing) {
		obj.setSaldoActual(obj.getSaldoActual() - ing);
		System.out.println("el nuevo salgo es: " + obj.getSaldoActual());
	}else {
		System.out.println("saldo insuficiente, solo puede retirar: " + obj.getSaldoActual());
		obj.setSaldoActual(0);
	}
}

//d) Método extraccionRapida: le permitirá sacar solo un 20% de su saldo. Validar que el usuario no saque más del 20%.
public void extraccionRapida(CuentaBancaria obj){
	System.out.println("ingrese el monto a retirar: ");
	double ing = leer.nextDouble();
	if (obj.getSaldoActual()*0.2 >=ing) {
		obj.setSaldoActual(obj.getSaldoActual() - ing);
		System.out.println("el nuevo salgo es: " + obj.getSaldoActual());
	}else {
		System.out.println("solo puede retirar un 20% de su  cuenta: " + obj.getSaldoActual()*0.2);
		obj.setSaldoActual(obj.getSaldoActual() - obj.getSaldoActual()*0.2);
	}
}

//e) Método consultarSaldo: permitirá consultar el saldo disponible en la cuenta.
public void consultarSaldo(CuentaBancaria obj){
	System.out.println("saldo actual: " + obj.getSaldoActual());
}
//f) Método consultarDatos: permitirá mostrar todos los datos de la cuenta.
public void consultarDatos(CuentaBancaria obj){
	System.out.println("Numero de cuenta: " + obj.getNumeroCuenta());
	System.out.println("DNI: " + obj.getDniCliente());
	System.out.println("saldo actual: " + obj.getSaldoActual());
}

}
