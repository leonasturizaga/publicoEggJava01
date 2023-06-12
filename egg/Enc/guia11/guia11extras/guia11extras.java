
package guia11extras;

import Entidades.Alumno;
import Entidades.Cine;
import Entidades.Espectador;
import Entidades.Pelicula;
import Entidades.PerroX;
import Entidades.PersonaX;
import Entidades.Simulador;
import Entidades.Voto;
import Utilidades.Comparadores;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;


public class guia11extras {


public static void main(String[] args) {
//1. Ahora se debe realizar unas mejoras al ejercicio de Perro y Persona. Nuestro programa va atener que contar con muchas
// personas y muchos perros. El programa deberá preguntarle acada persona, que perro según su nombre, quiere adoptar. Dos
// personas no pueden adoptaral mismo perro, si la persona eligió un perro que ya estaba adoptado, se le debe informar a 
// lapersona.
//Una vez que la Persona elige el Perro se le asigna, al final deberemos mostrar todas laspersonas con sus respectivos perros.

//PersonaX pe = new PersonaX();
//PerroX p = new PerroX();
//
//pe.crearPersona();
//	for (PersonaX arg : pe.getPersonas()) {
//		System.out.println(arg.toString());
//	}
//p.crearPerros();
//	for (PerroX arg : p.getPerros()) {
//		System.out.println(arg.toString());
//	}
//pe.asignarPerro(p.getPerros());
//	for (PersonaX arg : pe.getPersonas()) {
//		System.out.println(arg.toString());
//	}
	
//2. Nos piden hacer un programa sobre un Cine, que tiene una sala con un conjunto de asientos(8 filas por 6 columnas). De Cine
// nos interesa conocer la película que se está reproduciendo, la sala con los espectadores y el precio de la entrada. Luego, de 
// las películas nos interesa saber el título, duración, edad mínima y director. Por último, del espectador, nos interesa saber
// sunombre, edad y el dinero que tiene disponible. 
//Para representar la sala con los espectadores vamos a utilizar una matriz. Los asientos son etiquetados por una letra y un 
//número la fila A1 empieza al final del mapa como se muestra enla tabla. También  deberemos saber si el asiento está 
//ocupado por un espectador o no, si esta ocupado se muestra una X, sino un espacio vacío.
//8 A X | 8 B X | 8 C X | 8 D | 8 E X | 8 F X
//7 A X | 7 B X | 7 C X | 7 D X | 7 E | 7 F X
//6 A X | 6 B X | 6 C | 6 D X | 6 E X | 6 F
//5 A X | 5 B X | 5 C X | 5 D X | 5 E X | 5 F X
//4 A X | 4 B X | 4 C X | 4 D X | 4 E X | 4 F X
//3 A X | 3 B X | 3 C X | 3 D | 3 E X | 3 F X
//2 A X | 2 B | 2 C X | 2 D X | 2 E X | 2 F
//1 A X | 1 B X | 1 C X | 1 D X | 1 E X | 1 F X
//Se debe realizar una pequeña simulación, en la que se generen muchos espectadores y se los ubique en los asientos aleatoriamente
// (no se puede ubicar un espectador donde ya esteocupado el asiento). Los espectadores serán ubicados de uno en uno y para
// ubicarlos tener en cuenta que sólo sepodrá sentar a un espectador si tiene el dinero suficiente para pagar la entrada, si hay
// espacio libre en la sala y si tiene la edad requerida para ver la película. En caso de que el asiento este ocupado se le debe
// buscar uno libre. Al final del programa deberemos mostrar la tabla, podemos mostrarla con la letra y numero de cada asiento o 
// solo las X y espacios vacíos.

Espectador es = new Espectador();
es.crearEspectador();
	System.out.println(es.toString());
Pelicula pe = new Pelicula();
pe.crearPelicula();
pe.mostrarPelis();
	Cine ci = new Cine();
ci.crearSala(ci.getSala());
ci.mostrarSala(ci.getSala());
	System.out.println("asignar espectadores");
ci.ubicarEspectador(ci.getSala(), es.getEspectadores(), pe.getPelis());
ci.mostrarSala(ci.getSala());


//3. Ha llegado el momento de poner de prueba tus conocimientos. Para te vamos a contar que te ha contratado “La Tercera Seguros”,
// una empresa aseguradora que brinda a sus clientes coberturas integrales para vehículos. Luego de un pequeño relevamiento, te 
// vamos a pasar en limpio los requerimientos del sistema que quiere realizar la empresa.
//a. Gestión Integral de clientes. En este módulo vamos a registrar la información personal de cada cliente que posea pólizas en 
//nuestra empresa. Nombre y apellido, documento, mail,domicilio, teléfono.
//b. Gestión de vehículos. Se registra la información de cada vehículo asegurado. Marca,modelo, año, número de motor, chasis, 
//color, tipo (camioneta, sedán, etc.).
//c. Gestión de Pólizas: Se registrará una póliza, donde se guardará los datos tanto de unvehículo, como los datos de un solo 
//cliente. Los datos incluidos en ella son: número depóliza, fecha de inicio y fin de la póliza, cantidad de cuotas, forma de 
//pago, monto totalasegurado, incluye granizo, monto máximo granizo, tipo de cobertura (total, contraterceros, etc.). 
//Nota: prestar atención al principio de este enunciado y pensar en las relaciones entre clases. Recuerden que pueden ser de 
//uno a uno, de uno a muchos, demuchos a uno o de muchos a muchos.
//d. Gestión de cuotas: Se registrarán y podrán consultar las cuotas generadas en cada póliza.Esas cuotas van a contener la
// siguiente información: número de cuota, monto total de lacuota, si está o no pagada, fecha de vencimiento, forma de pago 
// (efectivo, transferencia,etc.).
//Debemos realizar el diagrama de clases completo, teniendo en cuenta todos los requerimientos arriba descriptos. Modelando clases
// con atributos y sus correspondientes relaciones.

//ejercicio 3 en proyecto guia11ExtraEj3, solo dibuja diagrama de clases.


//4. Desarrollar un simulador del sistema de votación de facilitadores en Egg-El sistema de votación de Egg tiene una clase
// llamada Alumno con los siguientes atributos: nombre completo, DNI y cantidad de votos. Además, crearemos una clase Simulador
// que va atener los métodos para manejar los alumnos y sus votaciones. Estos métodos serán llamados desde el main.
//• La clase Simulador debe tener un método que genere un listado de alumnos manera -aleatoria y lo retorne. Las combinaciones de 
//nombre y apellido deben ser generadas demanera aleatoria. Nota: usar listas de tipo String para generar los nombres y los 
//apellidos.
//• Ahora hacer un generador de combinaciones de DNI posibles, deben estar dentro de unrango real de números de documentos. Y 
//agregar a los alumnos su DNI. Este métododebe retornar la lista de dnis.
//• Ahora tendremos un método que, usando las dos listas generadas, cree una cantidad deobjetos Alumno, elegidos por el usuario,
// y le asigne los nombres y los dnis de las doslistas a cada objeto Alumno. No puede haber dos alumnos con el mismo dni, pero si
// con elmismo nombre.
//• Se debe imprimir por pantalla el listado de alumnos.
//• Una vez hecho esto debemos generar una clase Voto, esta clase tendrá como atributos,un objeto Alumno que será el alumno que
// vota y una lista de los alumnos a los que votó.
//• Crearemos un método votación en la clase Simulador que, recibe el listado de alumnos y para cada alumno genera tres votos de
// manera aleatoria. En este método debemos guardar a el alumno que vota, a los alumnos a los que votó y sumarle uno a la cantidad
// devotos a cada alumno que reciba un voto, que es un atributo de la clase Alumno.Tener en cuenta que un alumno no puede votarse
// a sí mismo o votar más de una vez almismo alumno. Utilizar un hashset para resolver esto.
//• Se debe crear un método que muestre a cada Alumno con su cantidad de votos y cuales fueron sus 3 votos.
//• Se debe crear un método que haga el recuento de votos, este recibe la lista de Alumnos y comienza a hacer el recuento de votos.
//• Se deben crear 5 facilitadores con los 5 primeros alumnos votados y se deben crear 5 facilitadores suplentes con los 5 
//segundos alumnos más votados. A continuación, mostrarlos 5 facilitadores y los 5 facilitadores suplentes.

//Simulador si = new Simulador();
//ArrayList<String> nombres = new ArrayList();
//nombres = si.generarNombre();
//	for (String nombre : nombres) {
//		System.out.println("n:" + nombre);
//	}
//HashSet<Integer> dnis = new HashSet();
//dnis=si.generarDni();
//	for (Integer dni : dnis) {
//		System.out.println("d: " + dni);
//	}
//
//si.crearListaAlumnos(nombres, dnis);
//si.mostrarListaAlumnos();
//	System.out.println("votacion");
//Voto vo = new Voto();	
//si.votacion(si.getAlumnos(),vo.getListaVotos());
//	System.out.println("votos alumnos");
//si.alumnoVotos(si.getAlumnos(),vo.getListaVotos());
//	System.out.println("recuento de votos, total: " + si.recuentoVotos(si.getAlumnos()));
//	System.out.println("crear Facilitadores");
//si.crearFacilitadores(si.getAlumnos());








}

}
