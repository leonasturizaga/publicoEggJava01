
package egg.p02;
import static java.lang.Math.sqrt;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class p02e01 {
public static void main(String[] args) {
	Scanner leerNum = new Scanner(System.in);
	Scanner leerText = new Scanner(System.in);  //se crea dos scanners para evitar errores de lectura en el pasaje de numeros a texto.
//1. Crear un programa que dado un número determine si es par o impar.

//	int n1;
//	System.out.println("Ingrese un numero entero");
//	n1=leerNum.nextInt();
//
//	if (n1%2 == 0) {
//		System.out.println("es par");
//	} else {
//		System.out.println("es impar");
//	}

//2. Crear un programa que pida una frase y si esa frase es igual a “eureka” el
//programa pondrá un mensaje de Correcto, sino mostrará un mensaje de
//Incorrecto. Nota: investigar la función equals() en Java.

//	String t2;
//	System.out.println("Ingrese una frase");
//	t2=leerText.nextLine();
//	
//	if ( t2.equalsIgnoreCase("eureka") ) {
//		System.out.println("Correcto");
//	} else {
//		System.out.println("Incorrecto");
//	}
	
//3. Realizar un programa que solo permita introducir solo frases o palabras
//de 8 de largo. Si el usuario ingresa una frase o palabra de 8 de largo se
//deberá de imprimir un mensaje por pantalla que diga “CORRECTO”, en
//caso contrario, se deberá imprimir “INCORRECTO”. Nota: investigar la
//función Lenght() en Java.

//	String t3;
//	System.out.println("Ingrese una frase de 8 caracteres");
//	t3=leerText.nextLine();
//	
//	if (t3.length()==8) {
//		System.out.println("correcto");
//	} else {
//		System.out.println("Incorrecto");
//	}

//4. Escriba un programa que pida una frase o palabra y valide si la primera
//letra de esa frase es una ‘A’. Si la primera letra es una ‘A’, se deberá de
//imprimir un mensaje por pantalla que diga “CORRECTO”, en caso
//contrario, se deberá imprimir “INCORRECTO”. Nota: investigar la función
//Substring y equals() de Java.

//	String t4;
//	System.out.println("Ingrese una palabra o frase");
//	t4=leerText.nextLine();
//
//	if ( t4.substring(0,1).equalsIgnoreCase("A") ) {   //String.substring(int a, int b) con el limite superior con "<" no es hasta ese valor.
//		System.out.println("correcto");
//	} else {
//		System.out.println("incorrecto");
//	}
	
//Bucles y sentencias de salto break y continue
//5. Escriba un programa en el cual se ingrese un valor límite positivo, y a
//continuación solicite números al usuario hasta que la suma de los
//números introducidos supere el límite inicial.

//	int n5,n5lim,n5tot;
//	n5=0;
//	n5lim=0;
//	n5tot=0;
//
//	do {
//		if (n5lim==0) {
//			//n5lim = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero limite") );
//			System.out.println("Ingrese el numero limite");
//			n5lim = leerNum.nextInt();
//		} else {
//			//n5=Integer.parseInt( JOptionPane.showInputDialog("Ingrese numeros para sumar hasta el limite") );
//			System.out.println("Ingrese los numeros para sumar");
//			n5 = leerNum.nextInt();
//			n5tot=n5tot + n5;
//		}
//		
//	} while (n5tot < n5lim);
//
//	System.out.println("total: " + n5tot);

//6. Realizar un programa que pida dos números enteros positivos por
//teclado y muestre por pantalla el siguiente menú:
//1. Sumar
//2. Restar
//3. Multiplicar
//4. Dividir
//5. Salir
//Elija opcion:
//El usuario deberá elegir
//una opción y el programa deberá mostrar el resultado por pantalla y
//luego volver al menú. El programa deberá ejecutarse hasta que se elija la
//opción 5. Tener en cuenta que, si el usuario selecciona la opción 5, en
//vez de salir del programa directamente, se debe mostrar el siguiente
//mensaje de confirmación: ¿Está seguro que desea salir del programa
//ՄS/NՅ? Si el usuario selecciona el carácter ‘S’ se sale del programa, caso
//contrario se vuelve a mostrar el menú.

//	int n6a,n6b,var6;
//	String t6;
//	t6="";
//	System.out.println("Ingrese 2 numeros enteros positivos");
//	n6a = leerNum.nextInt();
//	n6b = leerNum.nextInt();
//
//	do {
//		System.out.println("1. Sumar");
//		System.out.println("2. Restar");
//		System.out.println("3. Multiplicar");
//		System.out.println("4. Dividir");
//		System.out.println("5. Salir");
//		System.out.print("Elija opcion:");
//		var6 = leerNum.nextInt();
//
//		switch (var6) {
//			case 1:
//				System.out.println("La suma es: " + (n6a + n6b) );
//				break;
//			case 2:
//				System.out.println("La resta es: " + (n6a - n6b) );
//				break;
//			case 3:
//				System.out.println("La multiplicacion es: " + (n6a * n6b) );
//				break;
//			case 4:
//				System.out.println("La division es: " + ( (double)n6a / n6b) );
//				break;
//			case 5:
//				System.out.println("¿Está seguro que desea salir del programa S/N ?");
//				t6 = leerText.next();
//				break;		
//			default:
//				t6="";
//			}	
//
//	} while ( !t6.equalsIgnoreCase("S") );
//
//	System.out.println("fin de programa");
	
//7. Realizar un programa que simule el funcionamiento de un dispositivo
//RS232, este tipo de dispositivo lee cadenas enviadas por el usuario. Las
//cadenas deben llegar con un formato fijo: tienen que ser de un máximo
//de 5 caracteres de largo, el primer carácter tiene que ser X y el último
//tiene que ser una O.
//Las secuencias leídas que respeten el formato se consideran correctas,
//la secuencia especial “&&&&&” marca el final de los envíos (llamémosla
//FDEՅ, y toda secuencia distinta de FDE, que no respete el formato se
//considera incorrecta.
//Al finalizar el proceso, se imprime un informe indicando la cantidad de
//lecturas correctas e incorrectas recibidas. Para resolver el ejercicio
//deberá investigar cómo se utilizan las siguientes funciones de Java
//Substring(), Length(), equals().

//	String t7,fde;
//	int n7c,n7i;
//	n7c=0;
//	n7i=0;
//	fde = "&&&&&";
//	do {
//		System.out.print("Ingrese nueva secuencia => ");
//		t7 = leerText.nextLine();
//		if (t7.equals(fde) ) {
//			System.out.println("lecturas correctas: " + n7c);
//			System.out.println("lecturas correctas: " + n7i);
//		} else {
//			if ( t7.length() == 5 && t7.substring(0,1).equalsIgnoreCase("X") && t7.substring(4,5).equalsIgnoreCase("O") ) {
//				n7c = n7c + 1;
//			} else {
//				n7i = n7i + 1;
//			}
//		}	
//	} while ( !t7.equals(fde) );


//8. Dibujar un cuadrado de N elementos por lado utilizando el carácter “*”.
//Por ejemplo, si el cuadrado tiene 4 elementos por lado se deberá dibujar
//lo siguiente:
//* * * *
//*       *
//*       *
//* * * *

	int n8;
	System.out.println("ingrese numero");
	n8 = leerNum.nextInt();
	
	for (int i = 0; i < n8; i++) {
		if ( i == 0 || i == (n8-1) ) {
			for (int j = 0; j < n8; j++) {
				System.out.print("*");
			}
			System.out.println("");
		} else {
			for (int j = 0; j < n8; j++) {
				if (j==0 || j==n8-1) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println("");
		}
	}
	
}

}