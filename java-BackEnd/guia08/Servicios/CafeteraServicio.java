
package Servicios;

import Entidades.Cafetera;
import java.util.Scanner;

public class CafeteraServicio {
Scanner leer = new Scanner(System.in).useDelimiter("\n");
//Crear clase CafeteraServicio en el paquete Servicios con los siguiente:
//a) Método llenarCafetera(): hace que la cantidad actual sea igual a la capacidad máxima.
public Cafetera llenarCafetera(){
	int llenar = 1000;
	return new Cafetera(llenar, llenar);
}

//b) Método servirTaza(int): se pide el tamaño de una taza vacía, el método recibe el tamaño de la taza y simula la acción
//de servir la taza con la capacidad indicada. Si la cantidad actual de café “no alcanza” para llenar la taza, se sirve lo
//que quede. El método le informará al usuario si se llenó o no la taza, y de no haberse llenado en cuanto quedó la taza.
public void servirTaza(Cafetera obj){
	System.out.println("tamaño de taza?");
	int taza = leer.nextInt();
		if (taza <= obj.getCantidadActual()) {
		obj.setCantidadActual(obj.getCantidadActual() - taza);
			System.out.println("taza servida");
	} else {
		System.out.println("no alcanza, solo se sirve " + obj.getCantidadActual());	
		obj.setCantidadActual(0);
	}
}

//c) Método vaciarCafetera(): pone la cantidad de café actual en cero.
public void vaciarCafetera(Cafetera obj){
	obj.setCantidadActual(0);
}

//d) Método agregarCafe(int): se le pide al usuario una cantidad de café, el método lo recibe y se añade a la cafetera
//la cantidad de café indicada.
public void agregarCafe(Cafetera obj){
	System.out.println("cantidade de cafe?");
	int cantidad = leer.nextInt();
	if ( cantidad <= (obj.getCapacidadMaxima()-obj.getCantidadActual()) ) {
		obj.setCantidadActual(obj.getCantidadActual() + cantidad);
	} else {
		System.out.println("va a revalsar, solo puede agregar " + (obj.getCapacidadMaxima()-obj.getCantidadActual()) );
	}

}


}
