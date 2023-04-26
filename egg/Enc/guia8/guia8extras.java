
package guia8;

import Entidades.Raices;
import Servicios.RaicesServicio;

public class guia8extras {


public static void main(String[] args) {
//1. Vamos a realizar una clase llamada Raices, donde representaremos los valores de una ecuación de 2º grado. Tendremos
//los 3 coeficientes como atributos, llamémosles a, b y c. Hay que insertar estos 3 valores para construir el objeto a
//través de un método constructor. Luego, en RaicesServicio las operaciones que se podrán realizar son las siguientes:
//a) Método getDiscriminante(): devuelve el valor del discriminante (double). El discriminante tiene la siguiente
// fórmula: (b^2)՞4*a*c
//b) Método tieneRaices(): devuelve un booleano indicando si tiene dos soluciones, para que esto ocurra, el discriminante
// debe ser mayor o igual que 0.
//c) Método tieneRaiz(): devuelve un booleano indicando si tiene una única solución, para que esto ocurra, el discriminante
//debe ser igual que 0.
//d) Método obtenerRaices(): llama a tieneRaíces() y si devolvió́ true, imprime las 2 posibles soluciones.
//e) Método obtenerRaiz(): llama a tieneRaiz() y si devolvió́ true imprime una única raíz. Es en el caso en que se tenga
//una única solución posible.
//f) Método calcular(): esté método llamará tieneRaices() y a tieneRaíz(), y mostrará por pantalla las posibles soluciones 
//que tiene nuestra ecuación con los métodos obtenerRaices() o obtenerRaiz(), según lo que devuelvan nuestros métodos 
//y en caso de no existir solución, se mostrará un mensaje.
//Nota: Fórmula ecuación 2o grado: (-b±√((b^2)՞Մ4*a*c)))/(2*a) Solo varía el signo delante de -b

RaicesServicio ras = new RaicesServicio();

Raices ra;
ra = new Raices(1, -2, 1);
	System.out.println("disc: " + ras.getDiscriminante(ra));
	System.out.println("raices: " + ras.tieneRaices(ra));
	System.out.println("unica? " + ras.tieneRaiz(ra));
Raices ra2 = new Raices(2,-3,-4);
	System.out.println("disc2: " + ras.getDiscriminante2(ra2.a, ra2.b, ra2.getC()) );
	System.out.println("raices: " + ras.tieneRaices2(ras.getDiscriminante(ra2) ) );
	System.out.println("unica? " + ras.tieneRaiz(ra2));

	
	
	}
}
