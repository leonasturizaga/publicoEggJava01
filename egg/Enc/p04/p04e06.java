
package p04;


public class p04e06 {


public static void main(String[] args) {
//6. Un cuadrado mágico 3 x 3 es una matriz 3 x 3 formada por números del 1 al 9 donde la suma de sus filas, 
//sus columnas y sus diagonales son idénticas. Crear un programa que permita introducir un cuadrado por
//teclado y determine si este cuadrado es mágico o no. El programa deberá comprobar que los números
//introducidos son correctos, es decir, están entre el 1 y el 9.

int[][] mat6 = new int[3][3];
boolean k;
int n=0;
	do {
	mat6=matriz1a9();
//	int[][] mat6={{8,1,6},
//				{3,5,7},
//				{4,9,2}};
	k=validarMagico(mat6);
	n++;
		if (k==true) {
			mostrarMatriz(mat6);
			System.out.println(n);
		}
	} while ( k != true);
	
}

//metodos
public static int[][] matriz1a9(){
	int[][] mat = new int[3][3];
	int[] vec = {1,2,3,4,5,6,7,8,9};
	int rand=0;
	boolean valido=false;	

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
			while (valido==false) {
				rand=(int)(Math.random()*(9-1+1)+1);
					if (vec[rand-1]==rand) {
						mat[i][j]=rand;
						//System.out.print(vec[rand-1]);
						vec[rand-1]=0;
						valido=true;
						//System.out.println(vec[rand-1]);
					}
				}
			valido=false;
			}
		}
	return mat;
}

public static void mostrarMatriz(int[][] mat){
	for (int i = 0; i < 3; i++) {
		for (int j = 0; j < 3; j++) {
			System.out.print("[" +mat[i][j]+ "]");
		}
		System.out.println("");
	}
}

public static boolean validarMagico(int[][] mat){
	boolean k=false;
	int suma=0,aux=0,cont=0;
		suma = mat[0][0]+mat[0][1]+mat[0][2];
	//sumar filas
	for (int i = 0; i < 3; i++) {
		for (int j = 0; j < 3; j++) {
			aux = aux + mat[i][j];
			}
			if (suma != aux) {
				cont++;
				//System.out.println("filas" +cont);
			}
		aux=0;
		}
	//sumar columnas
	for (int j = 0; j < 3; j++) {
		for (int i = 0; i < 3; i++) {
			aux = aux + mat[i][j];
		}
			if (suma != aux) {
				cont++;
				//System.out.println("columnas" +cont);
			}
		aux=0;
	}
	//diagonal principal
	aux=0;
	for (int i = 0; i < 3; i++) {
		for (int j = 0; j < 3; j++) {
			if (i==j) {
				aux = aux + mat[i][j];
			}
		}
	}
	if (suma != aux) {
		cont++;
		//System.out.println("diagPri" +cont);
	}
	//diagonal secundaria
	aux=0;	
	for (int i = 0; i < 3; i++) {
		for (int j = 0; j < 3; j++) {
			if (i+j==2) {
				aux = aux + mat[i][j];
			}
		}
	}
	if (suma != aux) {
		cont++;
		//System.out.println("diagSec" +cont);
	}	
	
	if (cont==0) {
		k=true;
		System.out.println("es magico");
	} else {
		System.out.println("no es magico");
	}
	return k;
	}
}


