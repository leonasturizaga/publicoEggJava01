
package eggguiapoo;

import java.util.Scanner;


public class Puntos {
//2. Definir una clase llamada Puntos que contendrá las coordenadas de dos puntos, sus atributos serán, x1, y1, x2, y2, 
//siendo cada x e y un punto. Generar un objeto puntos usando un método crearPuntos() que le pide alusuario los dos 
//números y los  ingresa en los atributos del objeto. Después, a través de otro método calcular y devolver la distancia
//que existe entre los dos puntos que existen en la clase Puntos. Para conocer como calcular la distancia entre dos 
// puntos consulte el siguiente link:http://www.matematicatuya.com/GRAFICAecuaciones/S1a.html

//atributos
public double x1;
public double y1;
public double x2;
public double y2;

//constructores



//metodos
public void crearPuntos() {
	Scanner leerNum = new Scanner(System.in);
	System.out.println("ingrese valor x punto 1");
	x1 = leerNum.nextDouble();
	System.out.println("ingrese valor y punto 1");
	y1 = leerNum.nextDouble();
	System.out.println("ingrese valor x punto 2");
	x2 = leerNum.nextDouble();
	System.out.println("ingrese valor y punto 2");
	y2 = leerNum.nextDouble();
}
/**
 * Para P1(x1 , y1) y P2(x2 , y2) se tiene que d(P1 , P2) = √ ( (x2−x1)^2 + (y2− y1)^2)
 * @param x1
 * @param y1
 * @param x2
 * @param y2
 * @return distancia 
 */
public double distanciaPuntos(double x1, double y1, double x2, double y2){
	double distancia;
	distancia = Math.sqrt( Math.pow((x2-x1),2) + Math.pow((y2-y1),2) );
	return distancia;
}


}
