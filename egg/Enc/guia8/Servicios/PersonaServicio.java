
package Servicios;

import Entidades.Persona;
import java.util.Scanner;


public class PersonaServicio {
private Scanner leer = new Scanner(System.in).useDelimiter("\n");
private Scanner leerText = new Scanner(System.in);
//En el paquete Servicios crear PersonaServicio con los siguientes 3 métodos:
//a) Método esMayorDeEdad(): indica si la persona es mayor de edad. La función devuelve un booleano.
public boolean esMayorDeEdad(Persona obj){
	boolean mayor;
	if (obj.getEdad()>=18) {
		mayor = true;
	} else {
		mayor = false;
	}
	return mayor;
}

//b) Metodo crearPersona(): el método crear persona, le pide los valores de los atributos al usuario y después se le asignan
//a sus respectivos atributos para llenar el objeto Persona. Además, comprueba que el sexo introducido sea correcto,
//es decir, H, M o O. Si no es correcto se deberá mostrar un mensaje
public Persona crearPersona() {
	System.out.println("ingrese Nombre");
	String nombre = leerText.nextLine();
	System.out.println("ingrese edad");
	int edad = leer.nextInt();
	char sexo = ' ';

	while (!String.valueOf(sexo).equalsIgnoreCase("H")
		&& !String.valueOf(sexo).equalsIgnoreCase("M")
		&& !String.valueOf(sexo).equalsIgnoreCase("O")) {
		System.out.println("ingrese sexo 'H', 'M' u 'O'");
		sexo = leer.next().charAt(0);
	}
	
	System.out.println("ingrese peso");
	double peso = leer.nextInt();
	System.out.println("ingrese altura");
	double altura = leer.nextDouble();

	return new Persona(nombre, edad, sexo, peso, altura);
}

//c) Método calcularIMC() calculara si la persona está en su peso ideal (peso en kg/(altura^2 en mt2)). Si esta fórmula
// da por resultado un valor menor que 20, significa que la persona está por debajo de su peso ideal y la función devuelve
//un -1. Si la fórmula da por resultado un número entre 20 y 25 (incluidos), significa que la persona está en su peso ideal
//y la función devuelve un 0. Finalmente, si el resultado de la fórmula es un valor mayor que 25 significa que la persona
//tiene sobrepeso, y la función devuelve un 1.

public int calcularIMC(Persona obj){
	int aux=0;
	double imc = obj.getPeso()/Math.pow(obj.getAltura(), 2);
	if (imc <20) {
		aux = -1;
	}
		if (imc >=20 && imc <= 25) {
		aux = 0;
	}
			if (imc >25) {
		aux = 1;
	}
	return aux;
}


//A continuación, en la clase main hacer lo siguiente:
//● Crear 4 objetos de tipo Persona con distintos valores, a continuación, llamaremos todos los métodos para cada objeto,
//deberá comprobar si la persona está en su peso ideal, tiene sobrepeso o está por debajo de su peso ideal e indicar para
//cada objeto si la persona es mayor de edad.
//● Por último, guardaremos los resultados de los métodos calcularIMC y esMayorDeEdad en distintas variables(arrays),
//para después calcular un porcentaje de esas 4 personas cuantas están por debajo de su peso, cuantas en su peso ideal
//y cuantos, por encima, y también calcularemos un porcentaje de cuantos son mayores de edad y cuantos menores. Para
//esto, podemos crear unos métodos adicionales.

//metodos adicionales
public void porcentajeIMC(int[] imc){
	double porDebajo=0;
	double porIdeal=0;
	double porEncima=0;
	for (int i = 0; i < imc.length; i++) {
		if (imc[i]==-1) {
			porDebajo++;
		}
		if (imc[i]==0) {
			porIdeal++;
		}
		if (imc[i]==1) {
			porEncima++;
		}		
	}
	System.out.println("Porcentaje por debajo: " + (porDebajo/4)*100);
	System.out.println("Porcentaje por Ideal: " + (porIdeal/4)*100);
	System.out.println("Porcentaje por Encima: " + (porEncima/4)*100);
}

public void porcentajeMayorEdad(boolean[] mayor){
	int contMayor = 0;
	int contMenor = 0;
	for (int i = 0; i < mayor.length; i++) {
		if (mayor[i]==true) {
			contMayor++;
		} else {
			contMenor++;
		}			
	}
	System.out.println("Porcentaje Mayores de edad: " + ((double)contMayor/4)*100);
	System.out.println("Porcentaje Menores de edad: " + ((double)contMenor/4)*100);
}



}
