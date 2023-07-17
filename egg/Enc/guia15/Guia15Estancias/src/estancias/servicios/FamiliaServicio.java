
package estancias.servicios;

import estancias.entidades.Familia;
import estancias.persistencia.FamiliaDaoExt;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;


public class FamiliaServicio {
private Scanner leerN = new Scanner(System.in).useDelimiter("\n");
private Scanner leerT = new Scanner(System.in).useDelimiter("\n");
private FamiliaDaoExt dao;

	public FamiliaServicio() {
		this.dao = new FamiliaDaoExt();
	}

// método para listar todas las familias que ofrecen alguna habitación para realizar estancias.
public void listaFamiliasNombre() throws Exception {
	Collection<Familia> listaFamilias = new ArrayList();
	listaFamilias = dao.mostrarFamilias();
	for (Familia listaFamilia : listaFamilias) {
		System.out.println(listaFamilia.getNombre());
	}
}	
	
//a) Listar aquellas familias que tienen al menos 3 hijos, y con edad máxima inferior a 10 años.
public void listaFamiliasNombreEdadMinHijosMax() throws Exception {
	int hijosMin=3;
	int edadMax=10;
	Collection<Familia> listaFamilias = new ArrayList();
	listaFamilias = dao.mostrarFamiliasHijosEdad(hijosMin, edadMax);
	for (Familia listaFamilia : listaFamilias) {
		System.out.println(", Familia: " + listaFamilia.getNombre() + ", Num hijos: " + listaFamilia.getEdad_maxima() + ", Edad Maxima: " + listaFamilia.getNum_hijos());
	}
}

//b) Buscar y listar las casas disponibles para el periodo comprendido entre el 1 de agosto de 2020 y el 31 de agosto de 2020 en Reino Unido.
	//metodo en CasaService

//c) Encuentra todas aquellas familias cuya dirección de mail sea de Hotmail.
public void listaFamiliasEmail() throws Exception {
	String email = "hotmail";
	Collection<Familia> listaFamilias = new ArrayList();
	listaFamilias = dao.mostrarFamiliasEmail(email);
	for (Familia listaFamilia : listaFamilias) {
		System.out.println("Familia: " + listaFamilia.getNombre() + ", email: " + listaFamilia.getEmail());
	}
}

//d) Consulta la BD para que te devuelva aquellas casas disponibles a partir de una fecha dada y un número de días específico.
	//metodo en CasaService

//e) Listar los datos de todos los clientes que en algún momento realizaron una estancia y la descripción de la casa donde la realizaron.	
	//metodo en ClienteService

//f) Listar todas las estancias que han sido reservadas por un cliente, mostrar el nombre, país y 
//ciudad del cliente y además la información de la casa que reservó. La que reemplazaría a la anterior
//g) Debido a la devaluación de la libra esterlina con respecto al euro se desea incrementar el
//precio por día en un 5% de todas las casas del Reino Unido. Mostar los precios actualizados.
//h) Obtener el número de casas que existen para cada uno de los países diferentes.
//i) Busca y listar aquellas casas del Reino Unido de las que se ha dicho de ellas (comentarios) que están ‘limpias’.
//j) Insertar nuevos datos en la tabla estancias verificando la disponibilidad de las fechas.


}
