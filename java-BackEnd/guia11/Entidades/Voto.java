
package Entidades;

import java.util.ArrayList;


public class Voto {
//• Una vez hecho esto debemos generar una clase Voto, esta clase tendrá como atributos,un objeto Alumno que será el alumno que
// vota y una lista de los alumnos a los que votó.
private Alumno alumno;
private ArrayList<Voto> listaVotos = new ArrayList();
private ArrayList<Alumno> tresVotos = new ArrayList();





	public Voto(Alumno alumno, ArrayList<Alumno> tresVotos) {
		this.alumno = alumno;
		this.tresVotos = tresVotos;
	}
	

	public Voto() {
	}
//setters & getters
	public Alumno getAlumno() {
		return alumno;
	}
	public void setAlumno(Alumno alumno) {
		this.alumno = alumno;
	}
	public ArrayList<Voto> getListaVotos() {
		return listaVotos;
	}
	public void setListaVotos(ArrayList<Voto> listaVotos) {
		this.listaVotos = listaVotos;
	}
	public ArrayList<Alumno> getTresVotos() {
		return tresVotos;
	}
	public void setVotos(ArrayList<Alumno> tresVotos) {
		this.tresVotos = tresVotos;
	}

	@Override
	public String toString() {
		return "Voto{" + "alumno=" + alumno.getDni() + " v: " + alumno.getVotos()+ ", listaVotos=" + listaVotos + ", voto a =" + tresVotos.get(0).getDni() + ", "+ tresVotos.get(1).getDni()+ ", " +tresVotos.get(2).getDni() + '}';
	}



	
	




}
