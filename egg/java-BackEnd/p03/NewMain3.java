
package p03;

import java.util.Scanner;


public class NewMain3 {


public static void main(String[] args) {

//3. Crea una aplicación que a través de una función nos convierta una
//cantidad de euros introducida por teclado a otra moneda, estas pueden
//ser a dólares, yenes o libras. La función tendrá como parámetros, la
//cantidad de euros y la moneda a convertir que será una cadena, este no
//devolverá ningún valor y mostrará un mensaje indicando el cambio
//(void).
//El cambio de divisas es:
//i. * 0.86 libras es un 1 €
//ii. * 1.28611 $ es un 1 €
//iii. * 129.852 yenes es un 1 €

convEuro();
	
}
//METODO
public static void convEuro(){
	Scanner leerNum = new Scanner(System.in);
	Scanner leerText = new Scanner(System.in);	
	double euro;
	String moneda;
	
	System.out.println("Ingrese cantidad de Euros para convertir");
	euro = leerNum.nextDouble();
	System.out.println("Ingrese tipo de moneda destino: dolar, yen o libra");
	moneda = leerText.nextLine();
	moneda = moneda.toLowerCase();
	
	switch (moneda) {
		case "dolar":
			System.out.println(euro + "€ en dolares es: " + (euro*1.28611) );
			break;
		case "yen":
			System.out.println(euro + "€ en yenes es: " + (euro*129.852) );
			break;
		case "libra":
			System.out.println(euro + "€ en libras es: " + (euro*0.86) );
			break;			
		default:
			System.out.println("Ingrese tipo de moneda destino valido: dolar, yen o libra");
	}
	
}

}
