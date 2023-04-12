
package eggguiapoo;

import java.util.Scanner;


public class GuiaPOOextraMain {


public static void main(String[] args) {

//1. Desarrollar una clase Cancion con los siguientes atributos: título y autor.
//Se deberá definir además dos constructores: uno vacío que inicializa eltítulo y el autor a cadenas vacías y otro que reciba
//como parámetros el título y el autor de la canción. Se deberán además definir los métodos getters y setters correspondientes.

//Cancion ca =new Cancion();
//	System.out.println("titulo: " + ca.getTitulo());
//System.out.println("autor: " + ca.getAutor());
//	System.out.println("-----");
//	
//Cancion ca2 = new Cancion("titulo2", "autor2");
//	System.out.println("titulo: " + ca2.getTitulo());
//	System.out.println("autor: " + ca2.getAutor());
	
	
//2. Definir una clase llamada Puntos que contendrá las coordenadas de dos puntos, sus atributos serán, x1, y1, x2, y2, 
//siendo cada x e y un punto. Generar un objeto puntos usando un método crearPuntos() que le pide alusuario los dos 
//números y los  ingresa en los atributos del objeto. Después, a través de otro método calcular y devolver la distancia
//que existe entre los dos puntos que existen en la clase Puntos. Para conocer como calcular la distancia entre dos 
// puntos consulte el siguiente link:http://www.matematicatuya.com/GRAFICAecuaciones/S1a.html

//Puntos pu = new Puntos();
//pu.crearPuntos();
//
//System.out.println( "Distancia entre P1(x1 , y1) y P2(x2 , y2) es: " + pu.distanciaPuntos(pu.x1, pu.y1, pu.x2, pu.y2) );


//3. Crea una clase "Juego" que tenga un método "iniciar_juego" que permitaa dos jugadores jugar un juego de adivinanza
//de números. El primerjugador elige un número y el segundo jugador intenta adivinarlo. Elsegundo jugador tiene un
//número limitado de intentos y recibe una pista de "más alto" o "más bajo" después de cada intento. El juego
//termina cuando el segundo jugador adivina el número o se queda sin intentos.
//Registra el número de intentos necesarios para adivinar el número y el número de veces que cada jugador ha ganado.

//Scanner leerText = new Scanner(System.in);
//Scanner leerNum = new Scanner(System.in);
//String seguir;
//
//Juego ju = new Juego();
//
//	System.out.println("ingrese numero de intentos permitidos");
//	ju.limite = leerNum.nextInt();
//
//	do {
//		ju.iniciar_juego();
//		System.out.println("Seguir jugando? Si/No");
//		seguir = leerText.nextLine();
//	} while (seguir.equalsIgnoreCase("SI"));


//4. Crea una clase "Cuenta" que tenga atributos como "saldo" y "titular". Luego, crea un método "retirar_dinero" que
//permita retirar una cantidadde dinero del saldo de la cuenta. Asegúrate de que el saldo nunca sea negativo después
//de realizar una transacción de retiro.

//Cuenta cu = new Cuenta(1000, "Jose Perez");
//
//cu.retirar_dinero();
//System.out.println("saldo actual: " + cu.getSaldo());
//
//cu.retirar_dinero();
//System.out.println("saldo actual: " + cu.getSaldo());
//
//cu.retirar_dinero();
//System.out.println("saldo actual: " + cu.getSaldo());

//5. Crea una clase "Empleado" que tenga atributos como "nombre", "edad" y"salario". Luego, crea un método 
//"calcular_aumento" que calcule elaumento salarial de un empleado en función de su edad y salario actual.
//El aumento salarial debe ser del 10% si el empleado tiene más de 30años o del 5% si tiene menos de 30 años.

//	Empleado em1 = new Empleado("juan perez", 29, 100000);
//	Empleado em2 = new Empleado("jose perez", 30, 200000);
//	Empleado em3 = new Empleado("julia perez", 31, 300000);
//
//	System.out.println("aumento para " + em1.getNombre() + " es: " + em1.calcular_aumento());
//	System.out.println("aumento para " + em2.getNombre() + " es: " + em2.calcular_aumento());
//	System.out.println("aumento para " + em3.getNombre() + " es: " + em3.calcular_aumento());



//6. Crea una clase "Rectángulo" que tenga atributos "lado1" y "lado2" y unmétodo "calcular_area" que calcule y devuelva
//el área del rectángulo.
//Luego crea un objeto "rectangulo1" de la clase "Rectángulo" con lados de 4 y 6 y imprime el área del rectángulo.

RectanguloEx rex = new RectanguloEx(10, 20);
	System.out.println("area: " + rex.calcular_area() );
	System.out.println("");

RectanguloEx rectangulo1 = new RectanguloEx(4,6);
	System.out.println("area: " + rectangulo1.calcular_area() );
	System.out.println("");

}

}
