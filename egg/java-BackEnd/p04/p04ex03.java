
package p04;


public class p04ex03 {


public static void main(String[] args) {
//3. Crear una función rellene un vector con números aleatorios, pasándole un arreglo por parámetro. Después haremos otra función o
//procedimiento que imprima el vector.

int n = 5;
int[] vec3 = new int[n];

leerVector(vec3);
vectorN(vec3,n);
leerVector(vec3);
}

public static int[] vectorN(int[] vec,int n){
	int x=9; //maximo
	int y=0; //minimo

	for (int i = 0; i < n; i++) {
		vec[i] = (int)(Math.random()*(x-y+1)-y);
	}
	return vec;
}

public static void leerVector(int[] vec){
	for (int i = 0; i < vec.length; i++) {
		if (i==0 || i==vec.length-1) {
			if (i==0) {
				System.out.print("{"+vec[i]+",");
			}
			if (i==vec.length-1) {
				System.out.print(vec[i]+"}");
			}
		} else {
			System.out.print(vec[i]+",");
		}
	}
	System.out.println("");
}

}
