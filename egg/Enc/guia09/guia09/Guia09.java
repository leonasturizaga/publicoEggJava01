
package guia09;

import Entidades.Cadena;
import Entidades.ParDeNumeros;
import Servicios.ArregloService;
import Servicios.CadenaServicio;
import Servicios.ParDeNumerosService;
import java.util.Scanner;


public class Guia09 {

public static void main(String[] args) {
//1. Realizar una clase llamada Cadena, en el paquete de entidades, que tenga como atributos una frase (String) y su
// longitud. Agregar constructor vacío y con atributo frase solamente. Agregar getters y setters. El constructor con 
// frase como atributo debe setear la longitud de la frase de manera automática. Crear una clase CadenaServicio en el
//paquete servicios que implemente los siguientes métodos:
//a) Método mostrarVocales(), deberá contabilizar la cantidad de vocales que tiene la frase ingresada.
//b) Método invertirFrase(), deberá invertir la frase ingresada y mostrarla por pantalla. Por ejemplo: Entrada: "casa  blanca",
//Salida: "acnalbasac".
//c) Método vecesRepetido(String letra), recibirá un carácter ingresad por el usuario y contabilizar cuántas veces se  
//repite el carácter en la frase, por ejemplo:
//d) Entrada: frase = "casa blanca". Salida: El carácter 'a' se repite 4 veces.
//e) Método compararLongitud(String frase), deberá comparar la longitud de la frase que compone la clase con otra nueva
//frase ingresada por el usuario.
//f) Método unirFrases(String frase), deberá unir la frase contenida en la clase Cadena con una nueva frase ingresada por el
//usuario y mostrar la frase resultante.
//g) Método reemplazar(String letra), deberá reemplazar todas las letras “a” que se encuentren en la frase, por algún otro
//carácter seleccionado por el usuario y mostrar la frase resultante.
//h) Método contiene(String letra), deberá comprobar si la frase contieneuna letra que ingresa el usuario y devuelve 
// verdadero si la contiene y falso si no.

//Scanner leerText = new Scanner(System.in);
//	CadenaServicio cas = new CadenaServicio();
//	Cadena ca;
//	ca = new Cadena("Alguna frase tres");
//	System.out.println("cuantas vocales? " + cas.mostrarVocales(ca) );
//	
//	System.out.println("frase invertida: " + cas.invertirFrase(ca));
//	System.out.println("Ingrese letra");
//	cas.vecesRepetido(ca,leerText.next());
//	
//	System.out.println("ingrese una frase para comparar");
//	cas.compararLongitud(ca, leerText.next());
//	
//	System.out.println("ingrese una frase para unir");
//	cas.unirFrases(ca, leerText.nextLine());
//	
//	System.out.println("ingrese un caracter para reemplazar 'a'");
//	cas.reemplazar(ca, leerText.next());
//	
//	System.out.println("Ingrese una letra para ver la frase la contiene");
//	System.out.println("la contiene? " + cas.contiene(ca, leerText.next()) );


//Método Static y Clase Math
//2. Realizar una clase llamada ParDeNumeros que tenga como atributos dos números reales con los cuales se realizarán diferentes
//operaciones matemáticas. La clase debe tener un constructor vacío, getters y setters.
//En el constructor vacío se usará el Math.random para generar los dos números. Crear una clase ParDeNumerosService, en el paquete
//Servicios, que deberá además implementar los siguientes métodos:
//a) Método mostrarValores que muestra cuáles son los dos números guardados.
//b) Método devolverMayor para retornar cuál de los dos atributos tiene el mayor valor
//c) Método calcularPotencia para calcular la potencia del mayor valor de la clase elevado al menor número. Previamente se 
//deben redondear ambos valores.
//d) Método calculaRaiz, para calcular la raíz cuadrada del menor de los dos valores. Antes de calcular la raíz cuadrada se 
//debe obtener el valor absoluto del número.

ParDeNumerosService pns = new ParDeNumerosService();
ParDeNumeros pn = new ParDeNumeros();

	pns.mostrarValores(pn);
	System.out.println("Mayor es: " + pns.devolverMayor(pn));
	System.out.println("potencia: " +pns.calcularPotencia(pn));
	System.out.println("Raiz: " +pns.calculaRaiz(pn));
	
//Clase Arrays
//3. Crear en el Main dos arreglos. El arreglo A de 50 números reales y el arreglo B de 20 números reales. 
//Crear la clase  ArregloService, en el paquete servicio, con los siguientes métodos:
//1) Método inicializarA recibe un arreglo por parámetro y lo inicializa con números aleatorios.
//2) Método mostrar recibe un arreglo por parámetro y lo muestra por pantalla.
//3) Método ordenar recibe un arreglo por parámetro y lo ordena de mayor a menor.
//4) Método inicializarB copia los primeros 10 números del arreglo A en el arreglo B. Luego llenar las últimas 10 posiciones 
//del arreglo B con 0.5.
//En el Main nuevamente: inicializar A, mostrar A, ordenar A, inicializar B, mostrar A y B.
double[] A = new double[50];
double[] B = new double[20];

ArregloService ars = new ArregloService();
ars.inicializarA(A);
ars.mostrar(A);
ars.ordenar(A);
ars.inicializarB(A, B);
ars.mostrar(B);

	
	}

}
