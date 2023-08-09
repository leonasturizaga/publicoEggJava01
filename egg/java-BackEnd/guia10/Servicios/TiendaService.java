
package Servicios;

import Entidades.Tienda;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;


public class TiendaService {
//6. Se necesita una aplicación para una tienda en la cual queremos almacenar los distintos productos que venderemos y el
//precio que tendrán. Además, se necesita que la aplicación cuente con las funciones básicas.
//Estas las realizaremos en el servicio. Como, introducir un elemento, modificar su precio, eliminar un producto y mostrar 
//los productos que tenemos con su precio (Utilizar Hashmap). El HashMap tendrá de llave el nombre del producto y de valor el 
//precio. Realizar un menú para lograr todas las acciones previamente mencionadas.

private Scanner leer = new Scanner(System.in).useDelimiter("\n");
private Scanner leerN = new Scanner(System.in);
Tienda obj = new Tienda();

// introducir un elemento
public void introducirElemento(){
	String salir="";
	do {
		System.out.println("ingrese nombre del producto");
		//String nombre = leer.nextLine();
		String nombre = "prod_" + (int)(Math.random()*(99)+1);
		System.out.println("ingrese precio del producto");
		//Double precio = leerN.nextDouble();
		Double precio = Math.round( (Math.random()*99 )*100) /100.0;
		obj.getProducto().put(nombre, precio);
		
		System.out.println("salir ? 'SI/NO'");
		salir = leer.nextLine();
	} while (!salir.equalsIgnoreCase("SI"));
	

	
}
//modificar su precio
public void modificarPrecio() {
	System.out.println("ingrese nombre del producto a modificar");
	String nombre = leer.nextLine();
	System.out.println("ingrese nuevo precio del producto");
	Double precio = leerN.nextDouble();
	for (String nom : obj.getProducto().keySet()) {
		String var = nom;
		if (var.equalsIgnoreCase(nombre)) {
			obj.getProducto().replace(nombre, precio);
		}
	}
}
//eliminar un producto
public void eliminarProducto() {
	System.out.println("ingrese nombre del producto a eliminar");
	String nombre = leer.nextLine();
Iterator<String> iter = obj.getProducto().keySet().iterator();
	while (iter.hasNext()) {
		String var = iter.next();
		if (var.equalsIgnoreCase(nombre)) {
			iter.remove();
		}
	}
}
// mostrar los productos 
public void mostrarProducto(){
	for (Map.Entry<String, Double> entry : obj.getProducto().entrySet() ) {
		System.out.println("[" + entry.getKey() + ", " + entry.getValue() + "]");
	}
}

//menu
public void memu(){
	int op =0;
	do {
		System.out.println("--------------------------");
		System.out.println("1) introducir elemento");
		System.out.println("2) mostrar productos");
		System.out.println("3) modificar precio");
		System.out.println("4) eliminar producto");
		System.out.println("0) salir");
		System.out.println("--------------------------");
		op = leerN.nextInt();
		switch (op) {
			case 0:
				break;
			case 1:
				introducirElemento();
				break;
			case 2:
				mostrarProducto();
				break;
			case 3:
				modificarPrecio();
				break;
			case 4:
				eliminarProducto();
				break;

			default:
				System.out.println("ingrese una opcion valida");
		}

	} while (op != 0);
}


}
