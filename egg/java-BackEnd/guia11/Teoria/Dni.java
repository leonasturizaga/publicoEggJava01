
package Teoria;


public class Dni {
	
private String serie;
private int numero;

	public Dni(String serie, int numero) {
		this.serie = serie;
		this.numero = numero;
	}

	@Override
	public String toString() {
		return "Dni{" + "serie=" + serie + ", numero=" + numero + '}';
	}

	
	
}
