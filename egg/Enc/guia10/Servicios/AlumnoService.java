
package Servicios;

import Entidades.Alumno;
import java.util.Scanner;


public class AlumnoService {
//En el servicio de Alumno deberemos tener un bucle que crea un objeto Alumno. Se pide toda la información al usuario y 
//ese Alumno se guarda en una lista de tipo Alumno y se le pregunta al usuario si quiere crear otro Alumno o no.
//Después de ese bucle tendremos el siguiente método en el servicio de Alumno:
//Método notaFinal(): El usuario ingresa el nombre del alumno que quiere calcular su nota final y se lo busca en la lista de
//Alumnos. Si está en la lista, se llama al método. Dentro del método se usará la lista notas para calcular el promedio final 
// de alumno. Siendo este promedio final, devuelto por el método y mostrado en el main.
//Pueden encontrar un ejemplo de Colección como Atributo en tu Aula Virtual.

//private Scanner leerNum = new Scanner(System.in);
private Scanner leerText = new Scanner(System.in).useDelimiter("\n");
public Alumno crearAlumno(){
	
	System.out.println("Ingrese nombre");
	String nombre = leerText.next();
	Alumno aux = new Alumno(nombre);
	System.out.println("ingrese las 3 notas del alumno");
	for (int i = 0; i < 3; i++) {
		//aux.getNota().;
	}
	return null;
}


}
