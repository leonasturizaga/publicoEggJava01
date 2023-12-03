
package Entidades;

import java.util.Arrays;
import java.util.Scanner;


public class Curso {
//6. Un profesor particular está dando cursos para grupos de cinco alumnos y necesita un programa para organizar la información 
//de cada curso. Para ello, crearemos una clase entidad llamada Curso, cuyos atributos serán: nombreCurso, cantidadHorasPorDia,
//cantidadDiasPorSemana, turno (mañana o tarde), precioPorHora y alumnos. Donde alumnos es un arreglo de tipo String de 
//dimensión 5 (cinco), donde se alojarán los nombres de cada alumno. A continuación, se implementarán los siguientes métodos:
//a) Un constructor por defecto.
//b) Un constructor con todos los atributos como parámetro.
//c) Métodos getters y setters de cada atributo.

//atributos
private String nombreCurso;
private int cantidadHorasPorDia;
private int cantidadDiasPorSemana;
private String turno; // (mañana o tarde), 
private double precioPorHora;
private String[] alumnos = new String[5];  //nombres de los alumnos

//constructores

	public Curso() {
	}

	public Curso(String nombreCurso, int cantidadHorasPorDia, int cantidadDiasPorSemana, String turno, double precioPorHora, String[] alumnos) {
		this.nombreCurso = nombreCurso;
		this.cantidadHorasPorDia = cantidadHorasPorDia;
		this.cantidadDiasPorSemana = cantidadDiasPorSemana;
		this.turno = turno;
		this.precioPorHora = precioPorHora;
		this.alumnos = alumnos;
	}


//setters y getters
	public String getNombreCurso() {
		return nombreCurso;
	}
	public void setNombreCurso(String nombreCurso) {
		this.nombreCurso = nombreCurso;
	}
	public int getCantidadHorasPorDia() {
		return cantidadHorasPorDia;
	}
	public void setCantidadHorasPorDia(int cantidadHorasPorDia) {
		this.cantidadHorasPorDia = cantidadHorasPorDia;
	}
	public int getCantidadDiasPorSemana() {
		return cantidadDiasPorSemana;
	}
	public void setCantidadDiasPorSemana(int cantidadDiasPorSemana) {
		this.cantidadDiasPorSemana = cantidadDiasPorSemana;
	}
	public String getTurno() {
		return turno;
	}
	public void setTurno(String turno) {
		this.turno = turno;
	}
	public double getPrecioPorHora() {
		return precioPorHora;
	}
	public void setPrecioPorHora(double precioPorHora) {
		this.precioPorHora = precioPorHora;
	}
	public String[] getAlumnos() {
		return alumnos;
	}
	public void setAlumnos(String[] alumnos) {
		this.alumnos = alumnos;
	}

/*	//metodos
Scanner leerNum = new Scanner(System.in);	
Scanner leerText = new Scanner(System.in);
//d) Método cargarAlumnos(): este método le permitirá al usuario ingresar los alumnos que asisten a las clases. Nosotros nos 
//encargaremos de almacenar esta información en un arreglo e iterar con un bucle, solicitando en cada repetición que se ingrese
//el nombre de cada alumno.
public void cargarAlumnos(String[] alumnos){
	for (int i = 0; i < alumnos.length; i++) {
		System.out.println("Ingrese nombre del alumno");
		alumnos[i]=leerText.nextLine();
	}
	//return new Curso();
}
	
//e) Método crearCurso(): el método crear curso, le pide los valores de los atributos al usuario y después se le asignan a sus 
//respectivos atributos para llenar el objeto Curso. En este método invocamos al método cargarAlumnos() para asignarle valor 
//al atributo alumnos
public Curso crearCurso() {
	System.out.println("Nombre del curso");
	String nombreCurso = leerText.nextLine();
	System.out.println("cantidad de Horas Por Dia");
	int cantidadHorasPorDia = leerNum.nextInt();
	System.out.println("cantidad de Dias Por Semana");
	int cantidadDiasPorSemana = leerNum.nextInt();
	System.out.println("turno mañana o tarde 'M'/'T'");
	String turno = leerText.nextLine();
	System.out.println("Precio por hora");
	double precioPorHora = leerNum.nextDouble();

	cargarAlumnos(this.alumnos);

	return new Curso(nombreCurso, cantidadHorasPorDia, cantidadDiasPorSemana, turno, precioPorHora, alumnos);
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
*/
	@Override
	public String toString() {
		return "Curso{" + "nombreCurso=" + nombreCurso + ", cantidadHorasPorDia=" + cantidadHorasPorDia + ", cantidadDiasPorSemana=" + cantidadDiasPorSemana + ", turno=" + turno + ", precioPorHora=" + precioPorHora + ", alumnos=" +Arrays.toString(alumnos) + '}';    //+ Arrays.toString(alumnos) + '}';
	}



}
