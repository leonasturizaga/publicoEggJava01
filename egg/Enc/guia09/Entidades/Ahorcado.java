
package Entidades;


public class Ahorcado {
//2. Juego Ahorcado: Crear una clase Ahorcado (como el juego), la cual deberá contener como atributos, un vector con la  
//palabra a buscar, la cantidad de letras encontradas y la cantidad jugadas máximas que puede realizar el usuario. 

private int cantJug;
private int cantEnc;
private int n;
private String[] vec = new String[n];

	public Ahorcado() {
	}

	public Ahorcado(int cantJug, int cantEnc, int n, String[] vec) {
		this.cantJug = cantJug;
		this.cantEnc = cantEnc;
		this.n = n;
		this.vec = vec;
	}

	public int getCantJug() {
		return cantJug;
	}
	public void setCantJug(int cantJug) {
		this.cantJug = cantJug;
	}
	public int getCantEnc() {
		return cantEnc;
	}
	public void setCantEnc(int cantEnc) {
		this.cantEnc = cantEnc;
	}
	public int getN() {
		return n;
	}
	public void setN(int n) {
		this.n = n;
	}
	public String[] getVec() {
		return vec;
	}
	public void setVec(String[] vec) {
		this.vec = vec;
	}




}
