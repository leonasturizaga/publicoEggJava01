
package p04;

public class p04ex05 {


public static void main(String[] args) {
//5. Realizar un programa que llene una matriz de tamaño NxM con valores aleatorios y muestre la suma de sus elementos.
int n,m;
int suma5=0;
n=4;
m=5;
int[][] mat5 = new int[n][m];

matrizAleatoria(mat5);
mostrarMatriz(mat5);

	for (int i = 0; i < mat5.length; i++) {
		for (int j = 0; j < mat5[0].length; j++) {
			suma5 = suma5 + mat5[i][j];
		}
	}
	System.out.println("suma: " + suma5);
}

//metodos
public static void	matrizAleatoria(int[][] mat){
	for (int i = 0; i < mat.length; i++) {
		for (int j = 0; j < mat[0].length; j++) {
			mat[i][j] = (int)(Math.random()*(9-0+1)+0);
		}
	}
}

public static void	mostrarMatriz(int[][] mat){
	for (int i = 0; i < mat.length; i++) {
		for (int j = 0; j < mat[0].length; j++) {
			System.out.print("["+mat[i][j]+"]");
		}
		System.out.println("");
	}
}


}
