
package p04;

import java.util.Scanner;


public class p04ex04 {


public static void main(String[] args) {
//4. Los profesores del curso de programación de Egg necesitan llevar un registro de las notas adquiridas por sus 10 alumnos para luego obtener
//una cantidad de aprobados y desaprobados. Durante el período de cursado cada alumno obtiene 4 notas, 2 por trabajos prácticos
//evaluativos y 2 por parciales. Las ponderaciones de cada nota son:
//Primer trabajo práctico evaluativo 10%
//Segundo trabajo práctico evaluativo 15%
//Primer Integrador 25%
//Segundo integrador 50%
//Una vez cargadas las notas, se calcula el promedio y se guarda en el arreglo. Al final del programa los profesores necesitan obtener por
//pantalla la cantidad de aprobados y desaprobados, teniendo en cuenta que solo aprueban los alumnos con promedio mayor o igual al 7 de sus
//notas del curso.
Scanner leerNum = new Scanner(System.in);
String[] tit = {"tp1", "tp2", "int1", "int2"};
int contap=0;

int[] notas = new int[4];  //notas trabajos e integradores
double[] vec = new double[10];

	for (int i = 0; i < 10; i++) {
		for (int j = 0; j < 4; j++) {
			System.out.println("alumno " +(i+1) + " nota "+(tit[j]));
			//notas[j] = leerNum.nextInt();
			notas[j]=(int)(Math.random()*(10-2+1)+2);
			System.out.println(notas[j]);
		}
		vec[i]=pondNota(notas);
	}
	
	mostrarVec(vec);
	System.out.println("");
	
	for (int i = 0; i < vec.length; i++) {
		if (vec[i]>=7) {
			contap++;
		}
	}
	System.out.println("aprobados: " +contap);
	System.out.println("desprobados: " +(vec.length - contap));
}


//metodo registro de notas
public static double pondNota(int[] notas){
	double prom=0;
	double[] pond = {10,15,25,50};

	for (int i = 0; i < 4; i++) {
		prom =prom + notas[i]*pond[i]/100;
	}
	return prom;
}

public static void mostrarVec(double[] vec){
	for (int i = 0; i < vec.length; i++) {
		System.out.print(vec[i]+" ");
	}
}

}
