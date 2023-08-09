
package Utilidades;

import Entidades.EquipoDeAjedrez;
import Entidades.Pelicula;
import java.util.Comparator;

public class Comparadores {


	//ordenar por duracion con Compare y override
	public static Comparator<Pelicula> ordenDuracion = new Comparator<Pelicula>(){
		@Override
		public int compare(Pelicula t1, Pelicula t2) {
			return t2.getDuracion().compareTo( t1.getDuracion());
		}
	};

	public static Comparator<Pelicula> ordenDirector = new Comparator<Pelicula>(){
		@Override
		public int compare(Pelicula t1, Pelicula t2) {
			return t2.getDirector().compareTo( t1.getDirector());
		}
	};

	public static Comparator<Pelicula> titulo = new Comparator<Pelicula>(){
			@Override
			public int compare(Pelicula c1, Pelicula c2){
					return c2.getTitulo().compareTo( c1.getTitulo() );
			}
	};

// EXTRAS ejercicio 2
public static Comparator<EquipoDeAjedrez> ordenPuntosTotales = new Comparator<EquipoDeAjedrez>(){
		@Override
		public int compare(EquipoDeAjedrez t, EquipoDeAjedrez t1) {
			return t1.getPuntosTotales().compareTo(t.getPuntosTotales());
		}
};
public static Comparator<EquipoDeAjedrez> ordenAlfaNombre = new Comparator<EquipoDeAjedrez>(){
		@Override
		public int compare(EquipoDeAjedrez t, EquipoDeAjedrez t1) {
			return t1.getNombre().compareTo(t.getNombre());
		}
};
	
		
}
