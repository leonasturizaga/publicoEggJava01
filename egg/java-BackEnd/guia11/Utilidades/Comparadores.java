
package Utilidades;

import Entidades.Alumno;
import Entidades.Simulador;
import java.util.Comparator;


public class Comparadores {
	//ordenar por duracion con Compare y override
	public static Comparator<Alumno> ordenDni= new Comparator<Alumno>(){
		@Override
		public int compare(Alumno t1, Alumno t2) {
			//return t2.getVotos().compareTo(t1.getVotos());
			return t2.getDni().compareTo(t1.getDni());
			//return t2.getNombreCompleto().compareTo(t1.getNombreCompleto());
		}
	};

	public static Comparator<Alumno> ordenVotos = new Comparator<Alumno>(){
		@Override
		public int compare(Alumno t, Alumno t1) {
			return t.getVotos().compareTo(t1.getVotos());
		}
	};
	
}
