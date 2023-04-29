
package Servicios;

import Entidades.Ahorcado;
import java.util.Arrays;
import java.util.Scanner;


public class AhorcadoService1 {
//Definir  los siguientes métodos en AhorcadoService:
Scanner leerNum = new Scanner(System.in);
Scanner leerText = new Scanner(System.in);
//● Metodo crearJuego(): le pide la palabra al usuario y cantidad de jugadas máxima. Con la palabra del usuario, pone la
//longitud de la palabra, como la longitud del vector. Después ingresa la palabra en el vector, letra por letra, quedando
// cada letra de la palabra en un índice del vector. Y también, guarda la cantidad de jugadas máximas y el valor que
// ingresó el usuario.
public Ahorcado crearJuego(Ahorcado obj){
	System.out.println("Ingrese palabra a buscar:");
	String palabra = leerText.nextLine();
	System.out.println("Ingrese cantidad de jugadas maxima");
	int cantJug = leerNum.nextInt();
	String[] vec0 = new String[palabra.length()];
	for (int i = 0; i < palabra.length(); i++) {
		vec0[i]=palabra.substring(i, i+1);
	}
	
	return new Ahorcado(cantJug, 0, palabra.length(), vec0);
}


//● Método longitud(): muestra la longitud de la palabra que se debe encontrar. Nota: buscar como se usa el vector.length.
public int longitud(String[] vec){
	return vec.length;
}

//● Método buscar(letra): este método recibe una letra dada por el usuario y busca si la letra ingresada es parte de la
// palabra o no. También informará si la letra estaba o no.
public void buscar(Ahorcado obj, String letra) {
	String[] aux = obj.getVec();
	int cont = 0;
	for (int i = 0; i < obj.getVec().length; i++) {
			if (aux[i].equalsIgnoreCase(letra)) {
				cont++;
			}
		}
	if (cont > 0){
		System.out.println("La letra pertenece a la palabra");
	} else {
		System.out.println("La letra no pertenece a la palabra");
	}
}

//● Método encontradas(letra): que reciba una letra ingresada por el usuario y muestre cuantas letras han sido 
//encontradas y cuántas le faltan. Este método además deberá devolver true si la letra estaba y false si la letra no
// estaba, ya que, cada vez que se busque una letra que no esté, se le restará uno a sus oportunidades.
public boolean encontradas(Ahorcado obj, String letra) {
	int cont = 0;
	String[] aux = obj.getVec();
	for (int i = 0; i < obj.getVec().length; i++) {
			if (aux[i].equalsIgnoreCase(letra)) {
				obj.setCantEnc(obj.getCantEnc() + 1);
				cont++;
			}
		}
	System.out.print("Número de letras (encontradas, faltantes): (" + obj.getCantEnc() + "," + (obj.getVec().length - obj.getCantEnc()) + ")");
	if (cont == 0) {
		obj.setCantJug(obj.getCantJug() - 1 );
	} 	
	return cont > 0;
}


//● Método intentos(): para mostrar cuántas oportunidades le queda al jugador.
public void intentos(Ahorcado obj){
	System.out.print("Número de oportunidades restantes: " + obj.getCantJug());
}

//● Método juego(): el método juego se encargará de llamar todos los métodos previamente mencionados e informará cuando
// el usuario descubra toda la palabra o se quede sin intentos. Este método se llamará en el main.
public void juego(){
	Ahorcado obj = new Ahorcado();
	obj = crearJuego(obj);
	String[] aux1 = new String[obj.getVec().length];
	Arrays.fill(aux1,"_");
	do {
		System.out.println("Ingrese una letra:");
		String letra = leerText.nextLine();
		System.out.println("Longitud de la palabra: " + longitud(obj.getVec()));
		System.out.println(obj.toString());
		buscar(obj, letra);
		System.out.print(encontradas(obj, letra));
		System.out.println("");
		intentos(obj);
		System.out.println("");
		System.out.println("--------------------------------------");
		mostrarVector(obj.getVec(),aux1,letra);
		System.out.println("--------------------------------------");
		
	} while (obj.getCantJug() != 0 && obj.getCantEnc()<obj.getVec().length);
	if (obj.getCantEnc()==obj.getVec().length) {
		System.out.println("palabra encontrada");
	} else {
		System.out.println("se terminaron las oportunidades");
	}

}

//metodo auxiliar, nostrar vector
public void mostrarVector(String[] vec, String[] aux1, String letra){
	for (int i = 0; i < vec.length; i++) {
		if (vec[i].equalsIgnoreCase(letra)) {
			aux1[i]=letra;
		}
		System.out.print(aux1[i] +" ");
	}
	System.out.println("");
}

//Ingrese una letra:
//a
//Longitud de la palabra: 6
//Mensaje: La letra pertenece a la palabra
//Número de letras (encontradas, faltantes): (3,4)
//Número de oportunidades restantes: 4
//----------------------------------------------

}
