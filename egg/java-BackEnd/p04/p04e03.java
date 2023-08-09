
package p04;


public class p04e03 {


public static void main(String[] args) {
//3. Recorrer un vector de N enteros contabilizando cuántos números son de
//1 dígito, cuántos de 2 dígitos, etcétera (hasta 5 dígitos).

int n=20;
int[] vec3 = new int[n];
int d1=0,d2=0,d3=0,d4=0,d5=0;

	for (int i = 0; i < n; i++) {
		vec3[i]=(int)(Math.random()*(100000-1+1)+1);
	}
	for (int i = 0; i < n; i++) {
		System.out.println(vec3[i] + " ");
	}

	for (int i = 0; i < n; i++) {
		if (vec3[i]>0 && vec3[i]<10) {
			d1++;
		}
		if (vec3[i]>=10 && vec3[i]<100) {
			d2++;
		}
		if (vec3[i]>=100 && vec3[i]<1000) {
			d3++;
		}
		if (vec3[i]>=1000 && vec3[i]<10000) {
			d4++;
		}		
		if (vec3[i]>=10000 && vec3[i]<100000) {
			d5++;
		}
	}
	
	System.out.println("1 digito: " + d1 + "\n2 digitos: " + d2+ "\n3 digitos: " + d3+ "\n4 digitos: " + d4+ "\n5 digitos: " + d5);
	
}

}
