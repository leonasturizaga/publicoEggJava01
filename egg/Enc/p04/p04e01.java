
package p04;


public class p04e01 {


public static void main(String[] args) {
//1. Realizar un algoritmo que llene un vector con los 100 primeros números
//enteros y los muestre por pantalla en orden descendente.
int n;
n=100;
int[] vec1=devolverVector(n);

llenarVec100(vec1, n);

leerVectorDesc(vec1,n);
}
//metodos
public static void llenarVec100(int[] vec, int n){
	for (int i = 0; i < n; i++) {
		vec[i]=i+1;
	}
}
public static int[] devolverVector(int n){
	int[] vec = new int[n];
	return vec;
}
public static void leerVectorDesc(int[] vec,int n){
	for (int i=(n-1); i >= 0; i--) {
		System.out.print(vec[i] +",");
	}
	System.out.println("");
}

}
