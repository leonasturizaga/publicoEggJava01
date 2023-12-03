
package p04;


public class p04e04 {


public static void main(String[] args) {
//4. Realizar un programa que rellene un matriz de 4 x 4 de valores aleatorios
//y muestre la traspuesta de la matriz. La matriz traspuesta de una matriz
//A se denota por B y se obtiene cambiando sus filas por columnas (o
//viceversa).
int n=4;
int m=4;
int[][] mat1 = new int[n][m];

	for (int i = 0; i < n; i++) {
		for (int j = 0; j < m; j++) {
			mat1[i][j]=(int)(Math.random()*(10)-1);
		}
	}
	
mostrarMatriz(mat1,n,m);
	System.out.println("");
trasponerMatriz(mat1,n,m);

}
//metodos
public static void mostrarMatriz(int[][] mat,int n, int m){
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				System.out.print("["+mat[i][j]+"]" );
			}
			System.out.println("");
	}
}
//trasponer matriz
public static void trasponerMatriz(int[][] mat,int n, int m){
		for (int j = 0; j < n; j++) {
			for (int i = 0; i < m; i++) {
				System.out.print("["+mat[i][j]+"]" );
			}
			System.out.println("");
	}
}
}
