
package p04;

public class p04e05 {

public static void main(String[] args) {
//5. Realice un programa que compruebe si una matriz dada es antisimétrica. Se dice que una matriz A es antisimétrica
//cuando ésta es igual a su propia traspuesta, pero cambiada de signo. Es decir, A es antisimétrica si A = -AT. 
//La matriz traspuesta de una matriz A se denota por AT y se obtiene cambiando sus filas por columnas (o viceversa).
//En este caso la matriz es antisimétrica.

int n=2,m=2;
// int[][] mat5 = new int[n][m];
//	for (int i = 0; i < n; i++) {
//		for (int j = 0; j < m; j++) {
//			mat5[i][j] = (int)(Math.random()*(9-(-9)+1)-9);
//		}
//	}

int[][] mat5={{0,1},{-1,0}};

mostrarMatriz(mat5,n,m);
	System.out.println("");

int[][] at5=matrizTrasp(mat5,n,m);
mostrarMatriz(at5,m,n);
	System.out.println("");
	
int[][] kat5 = matrizXk(at5,n,m,-1);
mostrarMatriz(kat5,m,n);

	for (int i = 0; i < n; i++) {
		for (int j = 0; j < m; j++) {
			if (mat5[i][j] !=kat5[i][j]) {
				System.out.print("no es ");
				break;					
			}
		}
	}
		System.out.println("antisimetrica");
}


//metodos
public static void mostrarMatriz(int[][] mat,int n, int m){
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				if (mat[i][j]<0) {
					System.out.print("["+mat[i][j]+"]" );
				} else {
					System.out.print("[ "+mat[i][j]+"]" );
				}
			}
			System.out.println("");
	}
}
//trasponer matriz
public static void mostrarMatrizTrasp(int[][] mat,int n, int m){
	for (int i = 0; i < m; i++) {
		for (int j = 0; j < n; j++) {
				if (mat[j][i]<0) {
					System.out.print("["+mat[j][i]+"]" );
				} else {
					System.out.print("[ "+mat[j][i]+"]" );
				}
		}
		System.out.println("");
	}
}

public static int[][] matrizTrasp(int[][] mat,int n, int m){
	int[][] at = new int[m][n];
	for (int i = 0; i < m; i++) {
		for (int j = 0; j < n; j++) {
			at[i][j]=mat[j][i];
		}
	}
	return at;
}
//multiplicar matriz por constante k
public static int[][] matrizXk(int[][] mat,int n,int m,int k){
		int[][] kat = new int[n][m];
	for (int i = 0; i < n; i++) {
		for (int j = 0; j < m; j++) {
			kat[i][j]=mat[i][j]*k;
		}
	}
	return kat;
}
}
