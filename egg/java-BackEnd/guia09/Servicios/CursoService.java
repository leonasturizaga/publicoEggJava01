
package Servicios;

import Entidades.Curso;
import java.util.Scanner;


public class CursoService {
	//metodos
Scanner leerNum = new Scanner(System.in);	
Scanner leerText = new Scanner(System.in);
//d) Método cargarAlumnos(): este método le permitirá al usuario ingresar los alumnos que asisten a las clases. Nosotros nos 
//encargaremos de almacenar esta información en un arreglo e iterar con un bucle, solicitando en cada repetición que se ingrese
//el nombre de cada alumno.
public Curso cargarAlumnos(String[] alumnos){
	for (int i = 0; i < alumnos.length; i++) {
		System.out.println("Ingrese nombre del alumno");
		alumnos[i]=leerText.nextLine();
	}
	return new Curso();
}
	
//e) Método crearCurso(): el método crear curso, le pide los valores de los atributos al usuario y después se le asignan a sus 
//respectivos atributos para llenar el objeto Curso. En este método invocamos al método cargarAlumnos() para asignarle valor 
//al atributo alumnos
public Curso crearCurso(Curso obj) {
	System.out.println("Nombre del curso");
	obj.setNombreCurso(leerText.nextLine());
	System.out.println("cantidad de Horas Por Dia");
	obj.setCantidadHorasPorDia(leerNum.nextInt());
	System.out.println("cantidad de Dias Por Semana");
	obj.setCantidadDiasPorSemana(leerNum.nextInt());
	System.out.println("turno mañana o tarde 'M'/'T'");
	obj.setTurno(leerText.nextLine());
	System.out.println("Precio por hora");
	obj.setPrecioPorHora(leerNum.nextDouble());

	cargarAlumnos(obj.getAlumnos());

	return new Curso(obj.getNombreCurso(), obj.getCantidadHorasPorDia(), obj.getCantidadDiasPorSemana(), obj.getTurno(), obj.getPrecioPorHora(), obj.getAlumnos());
}

//f) Método calcularGananciaSemanal(): este método se encarga de calcular la ganancia en una semana por curso. Para ello, 
//se deben multiplicar la cantidad de horas por día, el precio por hora, la cantidad de alumnos y la cantidad de días a la semana
//que se repite el encuentro.	
public double calcularGananciaSemanal(Curso obj){
	return obj.getCantidadHorasPorDia() *obj.getPrecioPorHora() * 5 * obj.getCantidadDiasPorSemana();
}


public String[] mostrarAlumnos(String[] array){
	for (int i = 0; i < array.length; i++) {
		System.out.print(array[i] +" ");
	}
	System.out.println("");
	return array;
}




}
