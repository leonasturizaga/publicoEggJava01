
package Entidades;

import Exepciones.AdivinarNumeroException;
import java.util.InputMismatchException;
import java.util.Scanner;


public class AdivinarNumero {
//5. Escribir un programa en Java que juegue con el usuario a adivinar un número. La computadora
//debe generar un número aleatorio entre 1 y 500, y el usuario tiene que intentar adivinarlo. Para
//ello, cada vez que el usuario introduce un valor, la computadora debe decirle al usuario si el
//número que tiene que adivinar es mayor o menor que el que ha introducido el usuario. Cuando
//consiga adivinarlo, debe indicárselo e imprimir en pantalla el número de veces que el usuario
//ha intentado adivinar el número. Si el usuario introduce algo que no es un número, se debe
//controlar esa excepción e indicarlo por pantalla. En este último caso también se debe contar el
//carácter fallido como un intento.

private Scanner leer = new Scanner(System.in);
private int numero;
private int intento;

private void inicializarJuego() {
	this.numero = (int) (Math.random() * (500 - 1 + 1)) + 1; // (int) (Math.random()*(X - Y+1) -1)
	this.intento = 0;
	System.out.println(this.numero);
}

public void juego() throws AdivinarNumeroException {
	inicializarJuego();
	String valor = null;
	int aux = 0;
	do {
		try {
			System.out.println("Ingrese un valor");
			valor = leer.nextLine();
			aux = Integer.parseInt(valor);

			if (valor.isEmpty()) {
				throw new AdivinarNumeroException("valor vacio");
			}
			if (aux > this.numero && aux <= 500) {
				throw new AdivinarNumeroException("intente un valor mas bajo");
			}
			if (aux < this.numero && aux > 0) {
				throw new AdivinarNumeroException("intente un valor mas alto");
			}
			if (aux > 500 || aux <= 0) {
				throw new AdivinarNumeroException("intente numeros dentro del rango [1 - 500]");
			}
			if (aux == this.numero) {
				System.out.println("Numero encontrado: " + this.numero);
			}

		} catch (InputMismatchException a) {
			System.out.println("InputMismatchException, ingreso por teclado");
		} catch (NullPointerException b) {
			System.out.println("NullPointerException, valor nulo");			
		} catch (NumberFormatException c) {
			System.out.println("NumberFormatExeption, ingreso de letras o simbolos, no aceptado");
		} catch (ArithmeticException d) {
			System.out.println("ArithmeticException, division por cero");
		} catch (AdivinarNumeroException e) {
			System.out.println(e.getMessage());

		} finally {
			this.intento++;
			System.out.println("Intento numero: " + this.intento);
		}

	} while (aux != this.numero);

}

}
