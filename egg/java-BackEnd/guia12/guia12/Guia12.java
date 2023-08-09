
package guia12;

import Entidades.Caballo;
import Entidades.Formas;
import Entidades.Gato;
import Entidades.Lavadora;
import Entidades.Perro;
import Entidades.Televisor;
import Interfaces.calculosFormas;
import SuperClases.Electrodomestico;
import java.util.ArrayList;
import java.util.Scanner;


public class Guia12 {


public static void main(String[] args) {
//1. Tenemos una clase padre Animal junto con sus 3 clases hijas Perro, Gato, Caballo.
//La clase Animal tendrá como atributos el nombre, alimento, edad y raza del Animal.
//Crear un método en la clase Animal a través del cual cada clase hija deberá mostrar luego un
//mensaje por pantalla informando de que se alimenta. Generar una clase Main que realice lo siguiente:

//Perro pe = new Perro("stich", "carnivoro", 15, "doberman");
//pe.alimentarse();
//Perro pe2 = new Perro("teddy", "croquetas", 10, "chiguagua");
//pe2.alimentarse();
//Gato ga = new Gato("pelusa", "galletas", 15, "siames");
//ga.alimentarse();
//Caballo ca = new Caballo("spark", "pasto", 25, "fino");
//ca.alimentarse();


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


		//Electrodomestico el = new Electrodomestico();
		//el.crearElectrodomestico();
		//el.precioFinal();
		//	System.out.println("el precio final es: " + el.getPrecio());
		//	System.out.println(el.toString());
	
//A continuación, se debe crear una subclase llamada Lavadora, con el atributo carga, además de los atributos heredados.
//Los constructores que se implementarán serán:
//• Un constructor vacío.
//• Un constructor con la carga y el resto de los atributos heredados. Recuerda que debes llamar al constructor de la clase padre.
//Los métodos que se implementara serán:
//• Método get y set del atributo carga.
//• Método crearLavadora (): este método llama a crearElectrodomestico() de la clase padre, lo utilizamos para llenar los
//atributos heredados del padre y después llenamos el atributo propio de la lavadora.
//• Método precioFinal(): este método será heredado y se le sumará la siguiente funcionalidad. Si tiene una carga mayor
//de 30 kg, aumentará el precio en $500, si la carga es menor o igual, no se incrementará el precio. Este método debe llamar al
//método padre y añadir el código necesario. Recuerda que las condiciones que hemos visto en la clase Electrodoméstico 
//también deben afectar al precio.

//		Lavadora la = new Lavadora();
//			System.out.println("para lavadora");
//		la.crearLavadora();
//		la.precioFinal();
//			System.out.println(la.toString());

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
//Finalmente, en el main debemos realizar lo siguiente:
//Vamos a crear una Lavadora y un Televisor y llamar a los métodos necesarios para mostrar el precio final de los dos electrodomésticos.

//		Televisor te = new Televisor();
//			System.out.println("para televisor");
//		te.crearTelevisor();
//		te.precioFinal();
//			System.out.println(te.toString());
			
			
//3. Siguiendo el ejercicio anterior, en el main vamos a crear un ArrayList de Electrodomésticos para guardar 4 electrodomésticos,
//ya sean lavadoras o televisores, con valores ya asignados. Luego, recorrer este array y ejecutar el método precioFinal() 
//en cada electrodoméstico. Se deberá también mostrar el precio de cada tipo de objeto, es decir, el precio de todos los
//televisores y el de las lavadoras. Una vez hecho eso, también deberemos mostrar, la suma del precio de todos los Electrodomésticos. 
//Por ejemplo, si tenemos una lavadora con un precio de 2000 y un televisor de 5000, el resultado final será de 7000 (2000+5000) 
//para electrodomésticos, 2000 para lavadora y 5000 para televisor.	

//ArrayList<Electrodomestico> listaElectro = new ArrayList();
//int cant =0;
//	Scanner leer = new Scanner(System.in).useDelimiter("\n");
//	
//	do {
//		System.out.println("elegir electrodomestico, 1) lavadora, 2) televisor");
//		int opcion = leer.nextInt();
//		Lavadora la = new Lavadora();
//		Televisor te = new Televisor();
//		switch (opcion) {
//			case 1:
//				la.crearLavadora();
//				la.precioFinal();
//				listaElectro.add(la);
//				cant++;
//				break;
//			case 2:
//				te.crearTelevisor();
//				te.precioFinal();
//				listaElectro.add(te);
//				cant++;
//				break;
//			default:
//				System.out.println("elija una opcion valida");
//		}
//	} while (cant < 4);
//	
//	for (Electrodomestico electrodomestico : listaElectro) {
//		System.out.println(electrodomestico.toString());
//	}

//4. Se plantea desarrollar un programa que nos permita calcular el área y el perímetro de formasgeométricas, en este caso
//un círculo y un rectángulo. Ya que este cálculo se va a repetir en las dos formas geométricas, vamos a crear una Interfaz, 
//llamada calculosFormas que tendrá, los dos métodos para calcular el área, el perímetro y el valor de PI como constante.
//Desarrollar el ejercicio para que las formas implementen los métodos de la interfaz y se calcule el área y el perímetro de 
//los dos. En el main se crearán las formas y se mostrará el resultado final.
//Área circulo: PI * radio ^ 2 / Perímetro circulo: PI * diámetro.
//Área rectángulo: base * altura / Perímetro rectángulo: (base + altura) * 2.	

	Scanner leer = new Scanner(System.in).useDelimiter("\n");
	System.out.println("Radio del circulo");
	int radio=leer.nextInt();
	System.out.println("Base del Rectangulo");
	int base=leer.nextInt();
	System.out.println("Altura del Rectangulo");
	int altura=leer.nextInt();
	
	calculosFormas fo = new Formas();   //creamos objeto de la interfaz y lo instanciamos con el constructor de la clase Formas.
	fo.areaCirculo(radio);
	fo.perimetroCirculo(radio);
	fo.areaRectangulo(base, altura);
	fo.perimetroRectangulo(base, altura);


}


}
