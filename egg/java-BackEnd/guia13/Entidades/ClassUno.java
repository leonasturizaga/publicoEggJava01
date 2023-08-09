
package Entidades;


public class ClassUno {
//8. Indique que se mostrará por pantalla cuando se ejecute cada una de estas clases:

public static int metodo1() {
	int valor = 0;
	try {
		valor = valor + 1;
		valor = valor + Integer.parseInt("42");
		valor = valor + 1;
		System.out.println("Valor final del try:" + valor);       //44
	} catch (NumberFormatException e) {
		valor = valor + Integer.parseInt("42");
		System.out.println("Valor final del catch:" + valor);  //1
	} finally {
		valor = valor + 1;
		System.out.println("Valor final del finally: " + valor);  //2
	}

	valor = valor + 1;      //3
	System.out.println("Valor antes del return: " + valor);  //3
	return valor;
}

private static int metodo() {
	int valor = 0;
	try {
		valor = valor + 1;
		valor = valor + Integer.parseInt("42");
		valor = valor + 1;
		System.out.println("Valor final del try:" + valor);
	} catch (NumberFormatException e) {
		valor = valor + Integer.parseInt("42");
		System.out.println("Valor final del catch:" + valor);
	} finally {
		valor = valor + 1;
		System.out.println("Valor final del finally: " + valor);
	}
	valor = valor + 1;
	System.out.println("Valor antes del return: " + valor);
	return valor;
}

public static void main(String[] args) {
	try {
		System.out.println(metodo());
	} catch (Exception e) {
		System.err.println("Excepcion en metodo() ");
		e.printStackTrace();
	}

}

}
