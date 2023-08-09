
package Entidades;

import SuperClases.Electrodomestico;
import java.util.Scanner;


public class Televisor extends Electrodomestico{
//Se debe crear también una subclase llamada Televisor con los siguientes atributos:
//resolución (en pulgadas) y sintonizador TDT (booleano), además de los atributos heredados.
//Los constructores que se implementarán serán:
//• Un constructor vacío.
//• Un constructor con la resolución, sintonizador TDT y el resto de los atributos heredados. Recuerda que debes llamar al constructor de la clase padre.
//Los métodos que se implementara serán:
//• Método get y set de los atributos resolución y sintonizador TDT.
//• Método crearTelevisor(): este método llama a crearElectrodomestico() de la clase padre, lo utilizamos para llenar 
//los atributos heredados del padre y después llenamos los atributos del televisor.
//• Método precioFinal(): este método será heredado y se le sumará la siguiente funcionalidad. Si el televisor tiene una 
//resolución mayor de 40 pulgadas, se incrementará el precio un 30% y si tiene un sintonizador TDT incorporado, aumentará
//$500. Recuerda que las condiciones que hemos visto en la clase Electrodomestico también deben afectar al precio.

//atributos
private Integer resolucion;
private boolean tdt;

//constructores

	public Televisor() {
	}
	public Televisor(Integer resolucion, boolean tdt, Double precio, String color, char consumo, Double peso) {
		super(precio, color, consumo, peso);
		this.resolucion = resolucion;
		this.tdt = tdt;
	}
//setters y getters

	public Integer getResolucion() {
		return resolucion;
	}
	public void setResolucion(Integer resolucion) {
		this.resolucion = resolucion;
	}
	public boolean isTdt() {
		return tdt;
	}
	public void setTdt(boolean tdt) {
		this.tdt = tdt;
	}

//metodos
public void crearTelevisor(){
	Scanner leerN = new Scanner(System.in).useDelimiter("\n");
	Scanner leer = new Scanner(System.in).useDelimiter("\n");
	super.crearElectrodomestico();
	System.out.println("ingrese resolucion en pulgadas");
	this.resolucion = leerN.nextInt();
	System.out.println("ingrese TDT, si/no");
	String aux = leer.nextLine();
	if (aux.equalsIgnoreCase("SI")) {
		this.tdt=true;
	} else {
		this.tdt = false;
	}
	
}	
@Override
public void precioFinal(){
	super.precioFinal();
	if (this.resolucion>40) {
		this.precio = precio*(1+30/100);
	}
	if (this.tdt=true) {
		this.precio = this.precio + 500;
	} 
}

}
