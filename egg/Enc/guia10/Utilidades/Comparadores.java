
package Utilidades;

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
	
		
}
