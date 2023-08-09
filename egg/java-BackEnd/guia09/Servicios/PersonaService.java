
package Servicios;

import Entidades.Persona;
import java.util.Date;
import java.util.Scanner;


public class PersonaService {
//Crear una clase PersonaService, en el paquete servicio, con los siguientes métodos:
//a) Método crearPersona que pida al usuario Nombre y fecha de nacimiento de la persona a crear. Retornar el objeto Persona creado.
public Persona crearPersona(){
	Scanner leer = new Scanner(System.in);
	System.out.println("Ingrese nombre");
	String nombre = leer.nextLine();
	System.out.println("ingrese fecha de nacimiento, año:");
	int anio = leer.nextInt();
		System.out.println("mes:");
	int mes = leer.nextInt();
		System.out.println("dia:");
	int dia = leer.nextInt();
	Date fechaNac = new Date(anio-1900,mes-1,dia);
	
	return new Persona(nombre, fechaNac );
}

//b) Método calcularEdad que calcule la edad del usuario utilizando el atributo de fecha de nacimiento y la fecha actual.
public int calcularEdad(Persona obj){
	Date hoy = new Date();
	
	return (hoy.getYear() - obj.getFechaNac().getYear());
}

//c) Método menorQue recibe como parámetro una Persona y una edad. Retorna true si la persona es menor que la edad consultada
//o false en caso contrario.
public boolean menorQue(Persona obj, int edad){
	Date hoy = new Date();
	//int menor = (hoy.getYear() - obj.getFechaNac().getYear()) ;
	return (hoy.getYear() - obj.getFechaNac().getYear()) < edad;
}

//d) Método mostrarPersona que muestra la información de la persona deseada.
public void mostrarPersona(Persona obj){
	System.out.println("Nombre: " + obj.getNombre() + ", Fecha de Nacimiento: " + obj.getFechaNac());
}


}
