
package Entidades;

import Utilidades.Comparadores;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;


public class Simulador {
//Además, crearemos una clase Simulador
// que va a tener los métodos para manejar los alumnos y sus votaciones. Estos métodos serán llamados desde el main.
//• La clase Simulador debe tener un método que genere un listado de alumnos manera -aleatoria y lo retorne. Las combinaciones de 
//nombre y apellido deben ser generadas de manera aleatoria. Nota: usar listas de tipo String para generar los nombres y los 
//apellidos.
//• Ahora hacer un generador de combinaciones de DNI posibles, deben estar dentro de un rango real de números de documentos. Y 
//agregar a los alumnos su DNI. Este método debe retornar la lista de dnis.
//• Ahora tendremos un método que, usando las dos listas generadas, cree una cantidad de objetos Alumno, elegidos por el usuario,
// y le asigne los nombres y los dnis de las dos listas a cada objeto Alumno. No puede haber dos alumnos con el mismo dni, pero si
// con elmismo nombre.
//• Se debe imprimir por pantalla el listado de alumnos.
//****** ADEMAS ******
//• Crearemos un método votación en la clase Simulador que, recibe el listado de alumnos y para cada alumno genera tres votos de
// manera aleatoria. En este método debemos guardar a el alumno que vota, a los alumnos a los que votó y sumarle uno a la cantidad
// de votos a cada alumno que reciba un voto, que es un atributo de la clase Alumno.Tener en cuenta que un alumno no puede votarse
// a sí mismo o votar más de una vez al mismo alumno. Utilizar un hashset para resolver esto.
//• Se debe crear un método que muestre a cada Alumno con su cantidad de votos y cuales fueron sus 3 votos.
//• Se debe crear un método que haga el recuento de votos, este recibe la lista de Alumnos y comienza a hacer el recuento de votos.
//• Se deben crear 5 facilitadores con los 5 primeros alumnos votados y se deben crear 5 facilitadores suplentes con los 5 
//segundos alumnos más votados. A continuación, mostrarlos 5 facilitadores y los 5 facilitadores suplentes.
private ArrayList<Alumno> alumnos = new ArrayList();

	public ArrayList<Alumno> getAlumnos() {
		return alumnos;
	}

//metodos
public ArrayList<String> generarNombre() {
	Scanner leerN = new Scanner(System.in).useDelimiter("\n");
	System.out.println("cuantos nombres quiere generar");
	int n = leerN.nextInt();
	String nombre;
	String apellido;
	int cont = 0;
	ArrayList<String> nombreCompleto = new ArrayList();
	do {
		nombre = "n"+(int)(Math.random()*99);
		apellido = "ap"+(int)(Math.random()*99);
		String aux = nombre +" "+ apellido;
		
		nombreCompleto.add(aux);
		cont++;
	} while (cont < n);

	return nombreCompleto;
}

public HashSet<Integer> generarDni(){
	Scanner leerN = new Scanner(System.in).useDelimiter("\n");
	System.out.println("cuantos dni quiere generar");
	int n = leerN.nextInt();
	int cont=0;
	Integer dni;
	HashSet<Integer> dnis = new HashSet();
	do {
		dni = (int)( Math.random()*(39999999 - 10000000 + 1) + 10000000);
		dnis.add(dni);
		cont++;
	} while (cont < n);
	
	return dnis;	
}

public void crearListaAlumnos(ArrayList<String> nombres, HashSet<Integer> dnis) {
	Scanner leerN = new Scanner(System.in).useDelimiter("\n");
	System.out.println("ingrese cantidad de alumnos");
	int n = leerN.nextInt();
	int cont = 0;
	ArrayList<Integer> aux = new ArrayList(dnis);
	
	do {
		String nombreCompleto = nombres.get((int) (Math.random() * ((nombres.size() - 1) - 0 + 1) - 0));  //Math.random()*(X-Y+1)+Y);
		Integer dni = aux.get((int) (Math.random() * aux.size()));
		Iterator iter = aux.iterator();
		while (iter.hasNext()) {
			if (iter.next() == dni) {
				iter.remove();
			}
		}
		Alumno al = new Alumno(nombreCompleto, dni, 0);
		alumnos.add(al);
		cont++;
	} while (cont < n && aux.size() >0);

}

public void mostrarListaAlumnos(){
	for (Alumno alumno : alumnos) {
		System.out.println(alumno.toString());
	}
}

public void votacion(ArrayList<Alumno> listaAlumnos, ArrayList<Voto> listaVotos) {
	for (int i = 0; i < listaAlumnos.size(); i++) {

		ArrayList<Alumno> aux = listaAlumnos;
		ArrayList<Alumno> votos = new ArrayList();
		
		int n = 0;
		do {
			int x = (int) (Math.random() * aux.size());
			Alumno voto = aux.get(x);
			if (!listaAlumnos.get(i).getDni().equals(voto.getDni())) {
				if (!votos.contains(voto)) {
					votos.add(voto);

					for (Alumno listaAlumno : listaAlumnos) {
						if (listaAlumno.getDni().equals(voto.getDni())) {
							listaAlumno.setVotos(listaAlumno.getVotos() + 1);
						}
					}
					n++;
				}
			}
			//System.out.println("n:" + n + " i:" + i + " x:" + x);
		} while (n < 3);
		Voto vo = new Voto(listaAlumnos.get(i), votos);
		listaVotos.add(vo);

	}

}

public void alumnoVotos(ArrayList<Alumno> listaAlumnos, ArrayList<Voto> obj){
	for (Voto listaVoto : obj) {
		System.out.println(listaVoto.toString());
	}
}

public Integer recuentoVotos(ArrayList<Alumno> listaAlumnos){
	ArrayList<Alumno> aux = listaAlumnos;
	int cont=0;
	for (Alumno alumno : aux) {
		cont = cont + alumno.getVotos();
	}
	return cont;

}
	@Override
	public String toString() {
		return "Simulador{" + "alumnos=" + alumnos + '}';
	}

public void crearFacilitadores(ArrayList<Alumno> listaAlumnos){
	Collections.sort(listaAlumnos, Comparadores.ordenVotos);
	int n = 5;
	for (int i = listaAlumnos.size()-1; i >=0; i--) {
		if (i<=listaAlumnos.size()-1 && i>listaAlumnos.size()-1-n) {
			System.out.println("facilitador "+(listaAlumnos.size()-i) +" "+listaAlumnos.get(i).toString());
		}			
		if (i<=listaAlumnos.size()-1-n && i>listaAlumnos.size()-1-2*n) {
			System.out.println("facilitador suplente "+(listaAlumnos.size()-i) +" "+listaAlumnos.get(i).toString());			
		} 
	}
}


}
