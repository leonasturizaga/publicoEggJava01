
package guia09;

import Entidades.Cadena;
import Entidades.Curso;
import Entidades.MesSecreto;
import Entidades.ParDeNumeros;
import Entidades.Persona;
import Entidades.Ahorcado;
import Servicios.ArregloService;
import Servicios.CadenaServicio;
import Servicios.CursoService;
import Servicios.FechaService;
import Servicios.ParDeNumerosService;
import Servicios.PersonaService;
import Servicios.AhorcadoService;
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

Scanner leerNum = new Scanner(System.in).useDelimiter("\n");
Scanner leerText = new Scanner(System.in).useDelimiter("\n");


//	CadenaServicio cas = new CadenaServicio();
//	Cadena ca;
//	ca = new Cadena("Alguna frase tres");
//	System.out.println("cuantas vocales? " + cas.mostrarVocales(ca) );
//	
//	System.out.println("frase invertida: " + cas.invertirFrase(ca));
//	System.out.println("Ingrese letra");
//	cas.vecesRepetido(ca,leerText.nextLine());
//	
//	System.out.println("ingrese una frase para comparar");
//	cas.compararLongitud(ca, leerText.nextLine());
//	
//	System.out.println("ingrese una frase para unir");
//	cas.unirFrases(ca, leerText.nextLine());
//	
//	System.out.println("ingrese un caracter para reemplazar 'a'");
//	cas.reemplazar(ca, leerText.nextLine());
//	
//	System.out.println("Ingrese una letra para ver la frase la contiene");
//	System.out.println("la contiene? " + cas.contiene(ca, leerText.nextLine()) );


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

//ParDeNumerosService pns = new ParDeNumerosService();
//ParDeNumeros pn = new ParDeNumeros();
//
//	pns.mostrarValores(pn);
//	System.out.println("Mayor es: " + pns.devolverMayor(pn));
//	System.out.println("potencia: " +pns.calcularPotencia(pn));
//	System.out.println("Raiz: " +pns.calculaRaiz(pn));
	
//Clase Arrays
//3. Crear en el Main dos arreglos. El arreglo A de 50 números reales y el arreglo B de 20 números reales. 
//Crear la clase  ArregloService, en el paquete servicio, con los siguientes métodos:
//1) Método inicializarA recibe un arreglo por parámetro y lo inicializa con números aleatorios.
//2) Método mostrar recibe un arreglo por parámetro y lo muestra por pantalla.
//3) Método ordenar recibe un arreglo por parámetro y lo ordena de mayor a menor.
//4) Método inicializarB copia los primeros 10 números del arreglo A en el arreglo B. Luego llenar las últimas 10 posiciones 
//del arreglo B con 0.5.
//En el Main nuevamente: inicializar A, mostrar A, ordenar A, inicializar B, mostrar A y B.

//double[] A = new double[50];
//double[] B = new double[20];
//
//ArregloService ars = new ArregloService();
//ars.inicializarA(A);
//ars.mostrar(A);
//ars.ordenar(A);
//ars.inicializarB(A, B);
//ars.mostrar(B);

//Clase Date
//4. Vamos a usar la clase Date que ya existe en Java. Crearemos la clase FechaService, en paquete Servicios, que tenga los
//siguientes métodos:
//a) Método fechaNacimiento que pregunte al usuario día, mes y año de su nacimiento. Luego los pase por parámetro a un 
//nuevo objeto Date.
//El método debe retornar el objeto Date. Ejemplo fecha: Date fecha = new Date(anio, mes, dia);
//b) Método fechaActual que cree un objeto fecha con el día actual. Para esto usaremos el constructor vacío de la clase Date.
//Ejemplo: Date fechaActual = new Date();
//El método debe retornar el objeto Date.
//c) Método diferencia que reciba las dos fechas por parámetro y retorna la diferencia de años entre una y otra (edad del usuario).
//Si necesiten acá tienen más información en clase Date: Documentacion Oracle

//FechaService fs = new FechaService();
//
////	System.out.println("date: " + fs.fechaNacimiento());
////	System.out.println("fecha actual: " + fs.fechaActual());
//	System.out.println("Edad: " + fs.diferencia(fs.fechaActual(),fs.fechaNacimiento()) );

//5. Implemente la clase Persona en el paquete entidades. Una persona tiene un nombre y una fecha de nacimiento (Tipo Date), 
//constructor vacío, constructor parametrizado, get y set. Crear una clase PersonaService, en el paquete servicio, con los siguientes 
//métodos:
//a) Método crearPersona que pida al usuario Nombre y fecha de nacimiento de la persona a crear. Retornar el objeto Persona creado.
//b) Método calcularEdad que calcule la edad del usuario utilizando el atributo de fecha de nacimiento y la fecha actual.
//c) Método menorQue recibe como parámetro una Persona y una edad. Retorna true si la persona es menor que la edad consultada
//o false en caso contrario.
//d) Método mostrarPersona que muestra la información de la persona deseada.

//	PersonaService pes = new PersonaService();
//
//	Persona pe;
//
//	pe = pes.crearPersona();
//	System.out.println("edad: " + pes.calcularEdad(pe));
//	System.out.println("es menor de los años indicados? " + pes.menorQue(pe, 21));
//	pes.mostrarPersona(pe);

//Uso de vectores como atributos de clase
//6. Un profesor particular está dando cursos para grupos de cinco alumnos y necesita un programa para organizar la información 
//de cada curso. Para ello, crearemos una clase entidad llamada Curso, cuyos atributos serán: nombreCurso, cantidadHorasPorDia,
//cantidadDiasPorSemana, turno (mañana o tarde), precioPorHora y alumnos. Donde alumnos es un arreglo de tipo String de 
//dimensión 5 (cinco), donde se alojarán los nombres de cada alumno. A continuación, se implementarán los siguientes métodos:
//a) Un constructor por defecto.
//b) Un constructor con todos los atributos como parámetro.
//c) Métodos getters y setters de cada atributo.
//d) Método cargarAlumnos(): este método le permitirá al usuario ingresar los alumnos que asisten a las clases. Nosotros nos 
//encargaremos de almacenar esta información en un arreglo e iterar con un bucle, solicitando en cada repetición que se ingrese
//el nombre de cada alumno.
//e) Método crearCurso(): el método crear curso, le pide los valores de los atributos al usuario y después se le asignan a sus 
//respectivos atributos para llenar el objeto Curso. En este método invocamos al método cargarAlumnos() para asignarle valor 
//al atributo alumnos
//f) Método calcularGananciaSemanal(): este método se encarga de calcular la ganancia en una semana por curso. Para ello, 
//se deben multiplicar la cantidad de horas por día, el precio por hora, la cantidad de alumnos y la cantidad de días a la semana
//que se repite el encuentro.

//	CursoService cus = new CursoService();
//	Curso cu = new Curso();
//	cu = cus.crearCurso(cu);
//	System.out.println("ganancia semanal: " + cus.calcularGananciaSemanal(cu));
//
////sin clase de servicio para Curso.
////cu1 = cu1.crearCurso();
////	System.out.println("ganancia semanal: " + cu1.calcularGananciaSemanal(cu1));
//	System.out.println(cu.toString());

	
//EJERCICIOS EXTRA

//1. Crea una clase en Java donde declares una variable de tipo array de Strings que contenga los doce meses del año,
//en minúsculas. A continuación, declara una variable mesSecreto de tipo String, y hazla igual a un elemento del array
//(por ejemplo, mesSecreto = mes[9]. El programa debe pedir al usuario que adivine el mes secreto. Si el usuario
//acierta mostrar un mensaje, y si no lo hace, pedir que vuelva a intentar adivinar el mes secreto. Un ejemplo de ejecución
//del programa podría ser este: Adivine el mes secreto. Introduzca el nombre del mes en minúsculas: febrero No ha acertado. 
//Intente adivinarlo  introduciendo otro mes: agosto ¡Ha acertado!

//MesSecreto ms = new MesSecreto();
//ms.adivinarMes();

//2. Juego Ahorcado: Crear una clase Ahorcado (como el juego), la cual deberá contener como atributos, un vector con la  
//palabra a buscar, la cantidad de letras encontradas y la cantidad jugadas máximas que puede realizar el usuario. Definir 
//os siguientes métodos en AhorcadoService:
//● Metodo crearJuego(): le pide la palabra al usuario y cantidad de jugadas máxima. Con la palabra del usuario, pone la
//longitud de la palabra, como la longitud del vector. Después ingresa la palabra en el vector, letra por letra, quedando
// cada letra de la palabra en un índice del vector. Y también, guarda la cantidad de jugadas máximas y el valor que
// ingresó el usuario.
//● Método longitud(): muestra la longitud de la palabra que se debe encontrar. Nota: buscar como se usa el vector.length.
//● Método buscar(letra): este método recibe una letra dada por el usuario y busca si la letra ingresada es parte de la
// palabra o no. También informará si la letra estaba o no.
//● Método encontradas(letra): que reciba una letra ingresada por el usuario y muestre cuantas letras han sido 
//encontradas y cuántas le faltan. Este método además deberá devolver true si la letra estaba y false si la letra no
// estaba, ya que, cada vez que se busque una letra que no esté, se le restará uno a sus oportunidades.
//● Método intentos(): para mostrar cuántas oportunidades le queda al jugador.
//● Método juego(): el método juego se encargará de llamar todos los métodos previamente mencionados e informará cuando
// el usuario descubra toda la palabra o se quede sin intentos. Este método se llamará en el main.

AhorcadoService ahs = new AhorcadoService();
ahs.juego();
	


	
	
//Un ejemplo de salida puede ser así:
//Ingrese una letra:
//a
//Longitud de la palabra: 6
//Mensaje: La letra pertenece a la palabra
//Número de letras (encontradas, faltantes): (3,4)
//Número de oportunidades restantes: 4
//----------------------------------------------
//Ingrese una letra:
//z
//Longitud de la palabra: 6
//Mensaje: La letra no pertenece a la palabra
//Número de letras (encontradas, faltantes): (3,4)
//Número de oportunidades restantes: 3
//---------------------------------------------
//Ingrese una letra:
//b
//Longitud de la palabra: 6
//Mensaje: La letra no pertenece a la palabra
//Número de letras (encontradas, faltantes): (4,3)
//Número de oportunidades restantes: 2
//----------------------------------------------
//Ingrese una letra:
//u
//Longitud de la palabra: 6
//Mensaje: La letra no pertenece a la palabra
//Número de letras (encontradas, faltantes): (4,3)
//Número de oportunidades restantes: 1
//----------------------------------------------
//Ingrese una letra:
//q
//Longitud de la palabra: 6
//Mensaje: La letra no pertenece a la palabra
//Mensaje: Lo sentimos, no hay más oportunidades




	
	}

}
