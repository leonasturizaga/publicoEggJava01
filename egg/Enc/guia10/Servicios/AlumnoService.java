
package Servicios;

import Entidades.Alumno;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;


public class AlumnoService {
//En el servicio de Alumno deberemos tener un bucle que crea un objeto Alumno. Se pide toda la información al usuario y 
//ese Alumno se guarda en una lista de tipo Alumno y se le pregunta al usuario si quiere crear otro Alumno o no.
//Después de ese bucle tendremos el siguiente método en el servicio de Alumno:
//Método notaFinal(): El usuario ingresa el nombre del alumno que quiere calcular su nota final y se lo busca en la lista de
//Alumnos. Si está en la lista, se llama al método. Dentro del método se usará la lista notas para calcular el promedio final 
// de alumno. Siendo este promedio final, devuelto por el método y mostrado en el main.
//Pueden encontrar un ejemplo de Colección como Atributo en tu Aula Virtual.

private Scanner leerNum = new Scanner(System.in);
private Scanner leerText = new Scanner(System.in).useDelimiter("\n");

private ArrayList<Alumno> alumnos;
	 Alumno aux;

	public AlumnoService() {
		this.alumnos = new ArrayList<Alumno>();
	}
	
public Alumno crearAlumno(){
	String crear="";
	int n=0;
	do {

//		System.out.println("Ingrese nombre");
//		String nombre = leerText.next();

		System.out.println("Ingrese nombre " + n);
		String nombre = "nom"+String.valueOf(n+1);
		
		ArrayList<Integer> arr = new ArrayList();
			for (int i = 0; i < 3; i++) {
				System.out.println("ingrese nota " + (i + 1) + " del alumno " + nombre);
				int nota = n + i + 1;
				arr.add(nota);
			}
		aux = new Alumno(nombre,arr);
//			System.out.println(n+": " + aux.getNombre() + " i: " + aux.getNota());
		alumnos.add(aux);
		System.out.println(aux.toString());
		n++;
		System.out.println("Quiere crear un alumno? 'NO' para salir");
		crear = leerText.nextLine();
	} while (!crear.equalsIgnoreCase("NO"));
	for (int i = 0; i < alumnos.size(); i++) {
			System.out.println("arrayPosicion"+(i) +": " + alumnos.get(i).toString());
	}

	return aux;
}

public void notaFinal(){
	System.out.println("Ingrese nombre para nota final");
	String nombre = leerText.nextLine();
	int cont=0;
	Iterator<Alumno> it = this.alumnos.iterator();
	while (it.hasNext()) {
		Alumno var = it.next();
		if (var.getNombre().equalsIgnoreCase(nombre)) {
			System.out.println("promedio final: "+ promedioFinal(var));   			//opcion para remover   it.remove();
		} else {
			cont++;
		}
	}
	if(cont>0) {
			System.out.println("nombre no encontrado");
		}
}

public double promedioFinal(Alumno obj){
	int suma=0;
	for (int i = 0; i < 3; i++) {
		suma = suma +obj.getNota().get(i);
	}
	return suma/3;
}


public void mostrar(Alumno obj){
	System.out.println(" nombreAl: " + obj.getNombre() );
	System.out.println(" notasAl: " + obj.getNota().toString());
}

public void mostrarObjetosMem() {
	for (Object var : alumnos) {
		System.out.print(var);
		String var1 = aux.getNombre();  //imprime solo valores del ultimo objeto en memoria aux
		ArrayList<Integer> var2 = aux.getNota();  //imprime solo valores del ultimo objeto en memoria aux

		System.out.println(" Nombre: " + var1 + " n: " + var2);  //imprime solo valores del ultimo objeto en memoria aux
	}
	System.out.println("cantidad alumnos: " + alumnos.size());
}

public void mostrarObjetos() {
	Iterator it = this.alumnos.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
	}
	System.out.println("cantidad alumnos: " + alumnos.size());
}

public void mostrarArrayList(){
	for (Object var : alumnos) {
		System.out.println(" notas: "+var);
	}
}









}
