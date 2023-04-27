
package guia07;

import java.util.Scanner;


public class Circunferencia {
//2. Declarar una clase llamada Circunferencia que tenga como atributo
//privado el radio de tipo real. A continuación, se deben crear los siguientes métodos:
//a) Método constructor que inicialice el radio pasado como parámetro.
//b) Métodos get y set para el atributo radio de la clase Circunferencia.
//c) Método para crearCircunferencia(): que le pide el radio y lo guarda en el atributo del objeto.
//d) Método area(): para calcular el área de la circunferencia (Area=π*(radio)^2).
//e) Método perimetro(): para calcular el perímetro (Perimetro=2*π*radio).	

//atributos
private double radio;

//constructores

	public Circunferencia(double radio) {
		this.radio = radio;
	}


//metodos getters y setters

	public double getRadio() {
		return radio;
	}

	public void setRadio(double radio) {
		this.radio = radio;
	}
	
//metodos
public void crearCircunferencia(){
	Scanner leerDouble = new Scanner(System.in);
	System.out.println("Ingrese radio");
	this.radio = leerDouble.nextDouble();
}	
	
public double area(){
	double area;
	area = (Math.PI)*(Math.pow(this.radio, 2) );
	return area;
}
public double perimetro(){
	double perimetro;
	perimetro = 2*Math.PI*this.radio;
	return perimetro;
}



}
