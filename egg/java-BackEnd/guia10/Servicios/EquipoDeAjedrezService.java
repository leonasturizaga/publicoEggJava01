
package Servicios;

import Entidades.EquipoDeAjedrez;
import Utilidades.Comparadores;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;


public class EquipoDeAjedrezService {



public void jugarEquipos(ArrayList<EquipoDeAjedrez> listaEquipos){
	int n, p=0, g=0, e=0, t=0;
	for (int i = 0; i < 10; i++) {
		Double gana=3.0;
		Double empata=1.0;
		Double pierde=0.0;
		n=0;

		for (int j = i; j < 10; j++) {
			listaEquipos.get(i).setJugados(n+i);
			n++;	
			if (i!=j) {
				t++;

				int x = (int)( Math.random()*(1-(-2) +1) +(-2) );

				switch (x) {

					case 1:
						listaEquipos.get(i).setGanados(listaEquipos.get(i).getGanados()+1);
						listaEquipos.get(j).setPerdidos(listaEquipos.get(j).getPerdidos()+1);
						g++;
						p++;
						break;
					case 0:
						listaEquipos.get(i).setEmpatados(listaEquipos.get(i).getEmpatados()+1);
						listaEquipos.get(j).setEmpatados(listaEquipos.get(j).getEmpatados()+1);
						e=e+2;
						break;						
					case -1:
						listaEquipos.get(i).setPerdidos(listaEquipos.get(i).getPerdidos()+1);
						listaEquipos.get(j).setGanados(listaEquipos.get(j).getGanados()+1);
						g++;
						p++;						
						break;						
					default:
						throw new AssertionError();
				}
				//System.out.println("(i,j):("+ i+","+j +"), x: " + x + ", t:" + t+ ", g:" + g+ ", p:" + p+ ", e:" + e + ", n:" + n);
			}
			listaEquipos.get(i).setPuntosTotales(listaEquipos.get(i).getGanados()*gana+listaEquipos.get(i).getEmpatados()*empata);
		}
	}

}

public String equipoMax(ArrayList<EquipoDeAjedrez> listaEquipos){
	Double var = 0.0;
	String nom="";
	for (EquipoDeAjedrez equipo : listaEquipos) {
		if (equipo.getPuntosTotales()>=var) {
			var = equipo.getPuntosTotales();
			nom = equipo.getNombre();
		} 
	}
	return nom;
}

public String equipoMin(ArrayList<EquipoDeAjedrez> listaEquipos){
	Double var=listaEquipos.get(0).getPuntosTotales();
	String nom="";
	for (EquipoDeAjedrez equipo : listaEquipos) {
		if (equipo.getPuntosTotales()<=var) {
			var = equipo.getPuntosTotales();
			nom = equipo.getNombre();
		} 
	}
	return nom;
}

public void equipoEliminado(ArrayList<EquipoDeAjedrez> listaEquipos){
	String var = equipoMin(listaEquipos);
	Iterator<EquipoDeAjedrez> iter = listaEquipos.iterator();   //considerar eliminar con for comun si hay mas de 1, Iterator para cuando llega a iter.remove()
	while (iter.hasNext()) {		//EVITAR colocar sout dentro del Iterador causa errores de inextistencia.			
		if (iter.next().getNombre().equalsIgnoreCase(var)) {
			iter.remove();
		}
	}
}

public void mostrarListaPuntos(ArrayList<EquipoDeAjedrez> listaEquipos){
	Collections.sort(listaEquipos, Comparadores.ordenPuntosTotales);
	for (EquipoDeAjedrez var : listaEquipos) {
		System.out.println(var.toString());
	}
}
public void mostrarListaAlfaNombre(ArrayList<EquipoDeAjedrez> listaEquipos){
	Collections.sort(listaEquipos, Comparadores.ordenAlfaNombre);
	for (EquipoDeAjedrez var : listaEquipos) {
		System.out.println(var.toString());
	}
}


}
