
package Entidades;


public class ClaseA {
//6. Dado el método metodoA de la clase A, indique:
//a) ¿Qué sentencias y en qué orden se ejecutan si se produce la excepción MioException?
//b) ¿Qué sentencias y en qué orden se ejecutan si no se produce la excepción MioException?
//class A {

public void metodoA() {
	System.out.println("sentencia_a1");
	System.out.println("sentencia_a2");
	try {
		System.out.println("sentencia_a3");
		System.out.println("sentencia_a4");
	} catch (Exception e) {       //MioException e
		System.out.println("sentencia_a6");
	}
	System.out.println("sentencia_a5");
}

}
