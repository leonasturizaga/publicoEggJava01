package SuperClases;

import java.util.Scanner;

public class Electrodomestico {
//2. Crear una superclase llamada Electrodoméstico con los siguientes atributos: precio, color, consumo energético (letras entre A y F) y peso.
//Los constructores que se deben implementar son los siguientes:
//• Un constructor vacío.
//• Un constructor con todos los atributos pasados por parámetro.
//Los métodos a implementar son:
//• Métodos getters y setters de todos los atributos.
//• Método comprobarConsumoEnergetico(char letra): comprueba que la letra es correcta, sino es correcta usara la letra F
//por defecto. Este método se debe invocar al crear el objeto y no será visible.
//• Método comprobarColor(String color): comprueba que el color es correcto, y si no lo es, usa el color blanco por defecto. 
// Los colores disponibles para los electrodomésticos son blanco, negro, rojo, azul y gris. No importa si el nombre está 
//  en mayúsculas o en minúsculas. Este método se invocará al crear el objeto y no será visible.
//• Metodo crearElectrodomestico(): le pide la información al usuario y llena el
//electrodoméstico, también llama los métodos para comprobar el color y el consumo. Al
//precio se le da un valor base de $1000.
//• Método precioFinal(): según el consumo energético y su tamaño, aumentará el valor del
//precio. Esta es la lista de precios:
//LETRA PRECIO
//A $1000
//B $800
//C $600
//D $500
//E $300
//F $100

//	PESO PRECIO
//Entre 1 y 19 kg $100
//Entre 20 y 49 kg $500
//Entre 50 y 79 kg $800
//Mayor que 80 kg $1000

//atributos
protected Double precio;
protected String color;
protected char consumo;  
protected Double peso;

//constructores
public Electrodomestico() {
}
public Electrodomestico(Double precio, String color, char consumo, Double peso) {
	this.precio = precio;
	this.color = color;
	this.consumo = consumo;
	this.peso = peso;
	
}

//setters & getters

	public Double getPrecio() {
		return precio;
	}
	public void setPrecio(Double precio) {
		this.precio = precio;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public char getConsumo() {
		return consumo;
	}
	public void setConsumo(char consumo) {
		this.consumo = consumo;
	}
	public Double getPeso() {
		return peso;
	}
	public void setPeso(Double peso) {
		this.peso = peso;
	}


//metodos
//• Método comprobarConsumoEnergetico(char letra): comprueba que la letra es correcta, sino es correcta usara la letra F
//por defecto. Este método se debe invocar al crear el objeto y no será visible.
private void comprobarConsumoEnergetico(char letra){
	String consumos="ABCDEF";
	String aux = String.valueOf(letra).toUpperCase();
	if (consumos.contains(aux)) {
		this.consumo=aux.charAt(0);
	} else {
		this.consumo= 'F';
	}
}

//• Método comprobarColor(String color): comprueba que el color es correcto, y si no lo es, usa el color blanco por defecto. 
// Los colores disponibles para los electrodomésticos son blanco, negro, rojo, azul y gris. No importa si el nombre está 
//  en mayúsculas o en minúsculas. Este método se invocará al crear el objeto y no será visible.
private void comprobarColor(String color){
	String[] colores = {"BLANCO","NEGRO","ROJO","AZUL","GRIS"};
	this.color="BLANCO";
	for (int i = 0; i < colores.length; i++) {
		if (colores[i].equalsIgnoreCase(color)) {
			this.color = color.toUpperCase();
		} 
	}
}

//• Metodo crearElectrodomestico(): le pide la información al usuario y llena el
//electrodoméstico, también llama los métodos para comprobar el color y el consumo. Al
//precio se le da un valor base de $1000.
public void crearElectrodomestico(){
	Scanner leer = new Scanner(System.in).useDelimiter("\n");
		this.precio=1000.0;
	System.out.println("ingresar consumo:");
	char letra = leer.nextLine().charAt(0);
	System.out.println("ingreesar color");
	String color = leer.nextLine();
		comprobarConsumoEnergetico(letra);
		comprobarColor(color);
}

//• Método precioFinal(): según el consumo energético y su tamaño, aumentará el valor del
//precio. Esta es la lista de precios:
//LETRA PRECIO
//A $1000
//B $800
//C $600
//D $500
//E $300
//F $100

//	PESO PRECIO
//Entre 1 y 19 kg $100
//Entre 20 y 49 kg $500
//Entre 50 y 79 kg $800
//Mayor que 80 kg $1000

public void precioFinal(){
	Scanner leerN = new Scanner(System.in).useDelimiter("\n");	
	System.out.println("ingrese peso");
	this.peso = leerN.nextDouble();
	
	switch (this.consumo) {
		case 'A':
			if (this.peso >= 1 && this.peso<=19) {
				this.precio = precio + 1000.0 + 100.0;
			}
			if (this.peso >=20 && this.peso<=49) {
				this.precio = precio + 1000.0 + 500.0;
			}
			if (this.peso >= 50 && this.peso<=79) {
				this.precio = precio + 1000.0 + 800.0;
			}
			if (this.peso >= 80 ) {
				this.precio = precio + 1000.0 + 1000.0;
			}			
			break;
		case 'B':
			if (this.peso >= 1 && this.peso<=19) {
				this.precio = precio + 800.0 + 100.0;
			}
			if (this.peso >=20 && this.peso<=49) {
				this.precio = precio + 800.0 + 500.0;
			}
			if (this.peso >= 50 && this.peso<=79) {
				this.precio = precio + 800.0 + 800.0;
			}
			if (this.peso >= 80 ) {
				this.precio = precio + 800.0 + 1000.0;
			}
			break;
		case 'C':
			if (this.peso >= 1 && this.peso<=19) {
				this.precio = precio + 600.0 + 100.0;
			}
			if (this.peso >=20 && this.peso<=49) {
				this.precio = precio + 600.0 + 500.0;
			}
			if (this.peso >= 50 && this.peso<=79) {
				this.precio = precio + 600.0 + 800.0;
			}
			if (this.peso >= 80 ) {
				this.precio = precio + 600.0 + 1000.0;
			}
			break;
		case 'D':
			if (this.peso >= 1 && this.peso<=19) {
				this.precio = precio + 500.0 + 100.0;
			}
			if (this.peso >=20 && this.peso<=49) {
				this.precio = precio + 500.0 + 500.0;
			}
			if (this.peso >= 50 && this.peso<=79) {
				this.precio = precio + 500.0 + 800.0;
			}
			if (this.peso >= 80 ) {
				this.precio = precio + 500.0 + 1000.0;
			}
			break;
		case 'E':
			if (this.peso >= 1 && this.peso<=19) {
				this.precio = precio + 300.0 + 100.0;
			}
			if (this.peso >=20 && this.peso<=49) {
				this.precio = precio + 300.0 + 500.0;
			}
			if (this.peso >= 50 && this.peso<=79) {
				this.precio = precio + 300.0 + 800.0;
			}
			if (this.peso >= 80 ) {
				this.precio = precio + 300.0 + 1000.0;
			}
			break;
		case 'F':
			if (this.peso >= 1 && this.peso<=19) {
				this.precio = precio + 100.0 + 100.0;
			}
			if (this.peso >=20 && this.peso<=49) {
				this.precio = precio + 100.0 + 500.0;
			}
			if (this.peso >= 50 && this.peso<=79) {
				this.precio = precio + 100.0 + 800.0;
			}
			if (this.peso >= 80 ) {
				this.precio = precio + 100.0 + 1000.0;
			}
			break;				
		default:
			System.out.println("peso o tipo de consumo incorrecto");
	}
}

	@Override
	public String toString() {
		return "Electrodomestico{" + "precio=" + precio + ", color=" + color + ", consumo=" + consumo + ", peso=" + peso + '}';
	}



}
