
package guia11teoria;

import Teoria.Dni;
import Teoria.Equipo;
import Teoria.JugadorT;
import Teoria.PersonaT;
import java.util.ArrayList;


public class guia11teoria {


public static void main(String[] args) {
	// EJERCICIOS DE TEORIA GUIA 11
//EJERCICIO PERSONA p4
//Realiza un programa en donde una clase PersonaT tenga como atributo nombre, apellido y un objeto de clase Dni. La clase
//Dni tendrá como atributos la serie (carácter) y número. Prueba acceder luego a los atributos del dni de la persona
//creando objetos y jugando desde el main.	
	
//PersonaT pe = new PersonaT();
//pe.setApellido("ape1");
//pe.setNombre("nom1");
//Dni dn1 = new Dni("A", 1223456);
//pe.setDni(dn1);
//	System.out.println(pe.toString());

//EJERCICIO JUGADOR teoria 
//Realiza un programa en donde exista una clase JugadorT que contenga nombre, apellido, posición
//y número. Luego otra clase Equipo que contenga una colección de jugadores. Una vez hecho
//esto, desde el main recorreremos el equipo mostrando la información de cada jugador.

Equipo eq = new Equipo();
ArrayList<JugadorT> aux = new ArrayList();  //para inicializacion del arrayList
eq.setJugadores(aux);				     //inicializacion del arrayList, sino da error de NullPointerException

JugadorT ju1 = new JugadorT("nom1", "ape1", "pos1", 1);
eq.adicionarJugador(ju1);
	System.out.println(eq.toString());
JugadorT ju2 = new JugadorT("nom2", "ape2", "pos2", 2);
eq.getJugadores().add(ju2);
	System.out.println(eq.toString());

}

}
