
package Servicios;
import java.util.Date;
import java.util.Scanner;

public class FechaService {
Scanner leer = new Scanner(System.in);
//Crearemos la clase FechaService, en paquete Servicios, que tenga los siguientes métodos:
//a) Método fechaNacimiento que pregunte al usuario día, mes y año de su nacimiento. Luego los pase por parámetro a un 
//nuevo objeto Date.
//El método debe retornar el objeto Date. Ejemplo fecha: Date fecha = new Date(anio, mes, dia);
public Date fechaNacimiento(){
	System.out.println("ingrese fecha de nacimiento, año:");
	int anio = leer.nextInt();
		System.out.println("mes:");
	int mes = leer.nextInt();
		System.out.println("dia:");
	int dia = leer.nextInt();
	
//	 Date fechaNac = new Date(anio - 1900, mes - 1, dia);  
//year - the year minus 1900. month - the month between 0-11. date - the day of the month between 1-31.

	return new Date(anio - 1900, mes - 1, dia);
}

//b) Método fechaActual que cree un objeto fecha con el día actual. Para esto usaremos el constructor vacío de la clase Date.
//Ejemplo: Date fechaActual = new Date();
//El método debe retornar el objeto Date.
public Date fechaActual(){
	return new Date();
}

//c) Método diferencia que reciba las dos fechas por parámetro y retorna la diferencia de años entre una y otra (edad del usuario).
public int diferencia(Date fechaActual, Date fecha){
	int edad = fechaActual.getYear() - fecha.getYear();
	return edad;
}




}
