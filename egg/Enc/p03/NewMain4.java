
package p03;
import java.util.Scanner;

public class NewMain4 {

public static void main(String[] args) {
	Scanner leerNum = new Scanner(System.in);
	Scanner leerText = new Scanner(System.in);	
	
int n4;
	do {
		System.out.println("ingrese un numero primo, '0' para salir");
		n4 = leerNum.nextInt();
		boolean w=numPrimo(n4);
		System.out.println("w:"+w);
	} while (n4!=0);
	
}

//METODO
public static boolean numPrimo(int num){
	boolean primo;
	double resto;
	int cont;
	cont=0;
	primo=false;
	for (int i = 2; i <= num; i++) {
		resto = num%i;
		if (resto == 0) {
			cont++;
			System.out.print("["+i+"]");
		} 
	}
	System.out.println("");
	if (cont==1) {
		primo=true;
	}
	//System.out.println("cont(" +cont+ ") " +primo);

	return primo;
}


}
