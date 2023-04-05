
package p04;

import java.util.Scanner;

public class p04ex06 {


public static void main(String[] args) {
//6. Construya un programa que lea 5 palabras de mínimo 3 y hasta 5 caracteres y, a medida que el usuario las va ingresando, construya una
//“sopa de letras para niños” de tamaño de 20 x 20 caracteres. Las palabras se ubicarán todas en orden horizontal en una fila que será
//seleccionada de manera aleatoria. Una vez concluida la ubicación de las palabras, rellene los espacios no utilizados con un número aleatorio del 0
//al 9. Finalmente imprima por pantalla la sopa de letras creada.
//Nota: Para resolver el ejercicio deberá investigar cómo se utilizan las siguientes funciones de Java substring(), Length() y Math.random().
Scanner leerNum = new Scanner(System.in);
Scanner leerText = new Scanner(System.in);

char[][] sopa = new char[20][20];
String[] vec6 = new String[5];
int[] posh = new int[20];
int[] posv = new int[20];


	for (int i = 0; i < sopa.length; i++) {
		for (int j = 0; j < sopa[0].length; j++) {
			sopa[i][j]='*';
		}
	}
mostrarMatriz(sopa);
palabraPosicion(sopa,vec6,posh);
mostrarVector(vec6);
mostrarVector(posh);
mostrarMatriz(sopa);
	System.out.println("");
rellenarMatriz(sopa);
mostrarMatriz(sopa);
}

//metodos
public static void mostrarMatriz(char[][] sopa){
	for (int i = 0; i < sopa.length; i++) {
		for (int j = 0; j < sopa[0].length; j++) {
			System.out.print(sopa[i][j]);
		}
		System.out.println("");
	}
}
public static void	rellenarMatriz(char[][] sopa){
	int x;
	for (int i = 0; i < sopa.length; i++) {
		for (int j = 0; j < sopa[0].length; j++) {
			if (sopa[i][j] =='*') {
				x =(int)(Math.random()*(9-0+1)+0);
				sopa[i][j]= (char)(x +'0');
			}
		}
	}
}
public static void mostrarVector(String[] vec){
	for (int i = 0; i < vec.length; i++) {
		System.out.println(vec[i] +" ");
	}
	System.out.println("");
}
public static void mostrarVector(int[] vec){
	for (int i = 0; i < vec.length; i++) {
		System.out.print(vec[i] + " ");
	}
	System.out.println("");
}

public static void palabraPosicion(char[][] sopa,String[] vec6,int[] posh){
	Scanner leerText = new Scanner(System.in);
	String palabra="";
	int posv=-1;
	int k=0;
	int[] aux = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
	int rand=0;
	boolean valido=false;

	for (int i = 0; i < vec6.length; i++) {
		do {
			System.out.println("Ingrese palabra de 3 a 5 caracters");
			palabra=leerText.nextLine();
			palabra=palabra.toUpperCase();
				if (palabra.length()>=3 && palabra.length()<=5) {
					vec6[i]=palabra.toUpperCase();
					valido=true;		
				}
		} while (valido==false);
		
		valido=false;
		while (valido==false) {
			rand=(int)(Math.random()*(20-1+1)+1);
			if (aux[rand-1]==rand) {
				aux[i]=0;
				posh[rand-1]=rand;
				valido=true;
				
				posv=(int)(Math.random()*((19-palabra.length())-0+1)+0);
				for (int j = posv; j < posv+palabra.length(); j++) {
					sopa[rand-1][j] = palabra.charAt(k);  //palabra.substring(0,1); si la matriz sopa seria String[][]
					k++;
				}
				k=0;
			}
		}
		valido=false;
	}
}

}
