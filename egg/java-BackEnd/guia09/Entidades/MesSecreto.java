
package Entidades;

import java.util.Scanner;


public class MesSecreto {
//1. Crea una clase en Java donde declares una variable de tipo array de Strings que contenga los doce meses del año,
//en minúsculas. A continuación, declara una variable mesSecreto de tipo String, y hazla igual a un elemento del array
//(por ejemplo, mesSecreto = mes[9]. El programa debe pedir al usuario que adivine el mes secreto. Si el usuario
//acierta mostrar un mensaje, y si no lo hace, pedir que vuelva a intentar adivinar el mes secreto. Un ejemplo de ejecución
//del programa podría ser este: Adivine el mes secreto. Introduzca el nombre del mes en minúsculas: febrero No ha acertado. 
//Intente adivinarlo  introduciendo otro mes: agosto ¡Ha acertado!
private String[] mes = {"enero","febrero","marzo","abril","mayo","junio","julio","agosto","septiembre","octubre","noviembre","diciembre"};
private String mesSecreto = mes[9];

public void adivinarMes() {
	Scanner leer = new Scanner(System.in);
	String aux = "";
	do {
		System.out.println("Adivine el mes secreto");
		 aux = leer.nextLine();
		if (aux.equalsIgnoreCase(mes[9])) {
			System.out.println("correcto, mes secreto: " + mes[9]);
		} else {
			System.out.println("incorrecto, vuelva a intentarlo");
		}
	} while (!aux.equalsIgnoreCase(mes[9]));

}


}
