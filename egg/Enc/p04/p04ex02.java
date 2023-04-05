
package p04;


public class p04ex02 {


public static void main(String[] args) {
//2. Escriba un programa que averigüe si dos vectores de N enteros son iguales (la comparación deberá detenerse en cuanto se detecte alguna
//diferencia entre los elementos).

int n=5;
int cont=0;

int[] vec1 = vectorN(n);
int[] vec2 = vectorN(n);   

	for (int i = 0; i < n; i++) {
		if (vec1[i]==vec2[i]) {
			cont++;
			System.out.println(cont);
			
		} else {
			cont--;
			System.out.println(cont);
			break;
		}
	}

}

//metodo generar vector
public static int[] vectorN(int n){
	int x=9; //maximo
	int y=0; //minimo
	int[] vec = new int[n];
	for (int i = 0; i < n; i++) {
		vec[i] = (int)(Math.random()*(x-y+1)-y);
	}
	return vec;
}

}
