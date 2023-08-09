package Entidades;

public abstract class Jarvis {

    protected float generador;
    protected int resistencia;
    protected int nivelSalud;

	public Jarvis(int generador, int resistencia, int nivelSalud) {
		this.generador = generador;
		this.resistencia = resistencia;
		this.nivelSalud = nivelSalud;
	}

	public Jarvis() {
	}
	 
	 
}
