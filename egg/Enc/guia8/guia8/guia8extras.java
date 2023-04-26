
package guia8;

import Entidades.NIF;
import Entidades.Raices;
import Servicios.NIFService;
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

//RaicesServicio ras = new RaicesServicio();
//
//	System.out.println("------objeto 1 -------");
//Raices ra;
//ra = new Raices(1, -2, 1);
//	System.out.println("disc: " + ras.getDiscriminante(ra));
//	System.out.println("raices: " + ras.tieneRaices(ra));
//	System.out.println("unica? " + ras.tieneRaiz(ra));
//ras.obtenerRaices(ra);
//ras.obtenerRaiz(ra);
//System.out.println("metodo calcular");
//ras.calcular(ra);
//
//	System.out.println("-----objeto 2 -----");
//Raices ra2 = new Raices(2,-3,-4);
//	System.out.println("disc2: " + ras.getDiscriminante2(ra2.a, ra2.b, ra2.getC()) );
//	System.out.println("raices: " + ras.tieneRaices2(ras.getDiscriminante(ra2) ) );
//	System.out.println("unica? " + ras.tieneRaiz(ra2));
//ras.obtenerRaices(ra2);
//ras.obtenerRaiz(ra2);
//	System.out.println("metodo calcular");
//ras.calcular(ra2);

//2. Dígito Verificador. Crear una clase NIF que se usará para mantener DNIs con su correspondiente letra (NIF). Los 
//atributos serán el número de DNI (entero largo) y la letra (String o char) que le corresponde. En NIFService
//se dispondrá de los siguientes métodos:
//a) Métodos getters y setters para el número de DNI y la letra.
//b) Método crearNif(): le pide al usuario el DNI y con ese DNI calcula la letra que le corresponderá. Una vez 
//calculado, le asigna la letra que le corresponde según
//c) Método mostrar(): que nos permita mostrar el NIF (ocho dígitos, un guion y la letra en mayúscula; por ejemplo: 
//00395469-F).
//La letra correspondiente al dígito verificador se calculará a traves de un método que funciona de la siguiente 
//manera: Para calcular la letra se toma el resto de dividir el número de DNI por 23 (el resultado debe ser
//un número entre 0 y 22Յ. El método debe buscar en un array (vector) de caracteres la posición que corresponda al
//resto de la división para obtener la letra correspondiente. La tabla de caracteres es la siguiente:
//POSICIÓN    0 1  2 3  4 5  6 7 8 9 10 11 12 13 14 15 16 17 18 19 20 21 22
//LETRA          T R W A G M Y F P D X  B  N   J  Z  S  Q  V   H  L  C   K   E

NIFService nifs = new NIFService();

nifs.crearNif();
	System.out.println("aux: " + nifs.getLetra());
nifs.mostrar();

nifs.crearNif();
	System.out.println("aux: " + nifs.getLetra());
nifs.mostrar();

	}
}
