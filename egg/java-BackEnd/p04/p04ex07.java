
package p04;


public class p04ex07 {

public static void main(String[] args) {
//7. Realizar un programa que complete un vector con los N primeros números de la sucesión de Fibonacci. Recordar que la sucesión de
//Fibonacci es la sucesión de los siguientes números: 1, 1, 2, 3, 5, 8, 13, 21, 34, ...
//Donde cada uno de los números se calcula sumando los dos anteriores a él. Por ejemplo:
//La sucesión del número 2 se calcula sumando (1+1) Análogamente, la sucesión del número 3 es (1+2), Y la del 5 es (2+3), Y así sucesivamente…
//La sucesión de Fibonacci se puede formalizar de acuerdo a la siguiente fórmula:
//Fibonaccin = Fibonaccin-1 + Fibonaccin-2 para todo n>1
//Fibonaccin = 1 para todo n<=1
//Por lo tanto, si queremos calcular el término “n” debemos escribir una función que reciba como parámetro el valor de “n” y que calcule la
//serie hasta llegar a ese valor.
//Para conocer más acerca de la serie de Fibonacci consultar el siguiente link: https://quantdare.com/numeros-de-fibonacci/

int n;
long f0,f1;
n=15;
long[] f =new long[n];

	for (int i = 0; i < n; i++) {
		if (i==0) {
			f[i]=1;
		}
		if (i==1) {
			f[i]=1;
		}
		if (i>1) {
			f[i]=f[i-1]+f[i-2];
		}
	}

	System.out.println("");
	mostrarVec(f);
	System.out.println("termino (n="+n+") " + f[n-1]);
}
//metodo
public static void mostrarVec(long [] f){
	for (int i = 0; i < f.length; i++) {
		if (i==0) {
			System.out.print("{"+f[i]+",");
		}
		if (i>0 && i<f.length-1) {
			System.out.print(f[i]+",");
		} 
		if (i==f.length-1) {
			System.out.print(f[i]+"}");	
		}
	}
	System.out.println("");
}

}
