
package Entidades;

import java.util.HashMap;


public class Tienda {
//6. Se necesita una aplicación para una tienda en la cual queremos almacenar los distintos productos que venderemos y el
//precio que tendrán. Además, se necesita que la aplicación cuente con las funciones básicas.

private HashMap<String, Double> producto = new HashMap();

	public Tienda() {
	}

	public HashMap<String, Double> getProducto() {
		return producto;
	}

	public void setProducto(HashMap<String, Double> producto) {
		this.producto = producto;
	}


}
