
package eggguiapoo;

import java.util.Scanner;


public class Rectangulo {

//4. Crear una clase Rectángulo que modele rectángulos por medio de un atributo privado base y un atributo privado altura.
//La clase incluirá un método para crear el rectángulo con los datos del Rectángulo dados por el usuario. También incluirá 
//un método para calcular la superficie del rectángulo y un método para calcular el perímetro del rectángulo. Por último,
//tendremos un método que dibujará el rectángulo mediante asteriscos usando la base y la altura. Se deberán además
//definir los métodos getters, setters y constructores correspondientes.
//Superficie = base * altura / Perímetro = (base + altura) * 2

private int base;
private int altura;

//constructor

//	public Rectangulo() {
//	}

//	public Rectangulo(int base, int altura) {
//		this.base = base;
//		this.altura = altura;
//	}
//metodos get y set
	public int getBase() {
		return base;
	}

	public int getAltura() {
		return altura;
	}

	public void setBase(int base) {
		this.base = base;
	}

	public void setAltura(int altura) {
		this.altura = altura;
	}
	

//metodos

public void crearRectangulo(){
Scanner leerNum = new Scanner(System.in);	
	System.out.println("ingrese base del rectangulo");
	this.base=leerNum.nextInt();
	System.out.println("ingrese atura del rectangulo");
	this.altura=leerNum.nextInt();
}

public void superficieRectangulo(){
	System.out.println("Superficie del rectangulo: " + (this.base*this.altura) );
}
public void perimetroRectangulo(){
	System.out.println("Perimetro del rectangulo: " + ((this.base+this.altura)*2) );
}

public void dibujarRectangulo(){
	for (int i = 0; i < this.altura; i++) {
		for (int j = 0; j < this.base; j++) {
			System.out.print("*");
		}
		System.out.println("");
	}
}

}
