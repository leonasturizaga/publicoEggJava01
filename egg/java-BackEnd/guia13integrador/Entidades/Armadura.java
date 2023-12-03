package Entidades;


public class Armadura extends Jarvis {

private int bateria;
private String[] dispositivo; // = {"exoesqueleto", "consola", "sintetizador", "botaDer", "botaIzq", "guanteDer", "guanteIzq"};
public int[] dispConsumo; // = {100, 20, 10, 40, 40, 30, 30};
private int[] dispEstado; //  = {1, 1, 1, 1, 1, 1, 1};
private int[] reporDispEstado; //  = {1, 1, 1, 1, 1, 1, 1};
private int[] dispDestruido; //   = {1, 1, 1, 1, 1, 1, 1};
private final int pDanUso=30;

public Armadura() {
}


	public Armadura(int bateria, int generador, int resistencia, int nivelSalud) {
		super(generador, resistencia, nivelSalud);
		this.bateria = bateria;
	}
	
	//setters
	

	public void setBateria(int bateria) {
		this.bateria = bateria;
	}
	public void setDispositivo(String[] dispositivo) {
		this.dispositivo = dispositivo;
	}	
	public void setDispConsumo(int[] dispConsumo) {
		this.dispConsumo = dispConsumo;
	}
	public void setDispEstado(int[] dispEstado) {
		this.dispEstado = dispEstado;
	}
	public void setReporDispEstado(int[] reporDispEstado) {
		this.reporDispEstado = reporDispEstado;
	}
	public void setDispDestruido(int[] dispDestruido) {
		this.dispDestruido = dispDestruido;
	}
//getters
	public int getBateria() {
		return bateria;
	}
	public String[] getDispositivo() {
		return dispositivo;
	}
	public int[] getDispConsumo() {
		return dispConsumo;
	}
	public int[] getDispEstado() {
		return dispEstado;
	}
	public int[] getReporDispEstado() {
		return reporDispEstado;
	}
	public int[] getDispDestruido() {
		return dispDestruido;
	}
	public int getpDanUso() {
		return pDanUso;
	}
	



}
