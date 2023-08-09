
package Entidades;


public class EquipoDeAjedrez {
//2) En este ejercicio vamos a mostrar la tabla de posiciones final de un torneo del deporte que deseen. Para ello deberán
// crear una clase llamada "EquipoDe…" que represente a un equipo del deporte seleccionado. La clase debe tener los
// siguientes atributos: nombre del equipo, ciudad, cantidad de partidos jugados, ganados, perdidos y empatados, y puntos
// totales.
private String nombre;
private String ciudad;
private Integer jugados;
private Integer ganados;
private Integer perdidos;
private Integer empatados;
private Double puntosTotales;

	public EquipoDeAjedrez(String nombre, String ciudad, Integer jugados, Integer ganados, Integer perdidos, Integer empatados, Double puntosTotales) {
		this.nombre = nombre;
		this.ciudad = ciudad;
		this.jugados = jugados;
		this.ganados = ganados;
		this.perdidos = perdidos;
		this.empatados = empatados;
		this.puntosTotales = puntosTotales;
	}

	public void setPuntosTotales(Double puntosTotales) {
		this.puntosTotales = puntosTotales;
	}

	public void setJugados(Integer jugados) {
		this.jugados = jugados;
	}

	public void setGanados(Integer ganados) {
		this.ganados = ganados;
	}

	public void setPerdidos(Integer perdidos) {
		this.perdidos = perdidos;
	}

	public void setEmpatados(Integer empatados) {
		this.empatados = empatados;
	}

	public String getNombre() {
		return nombre;
	}

	public String getCiudad() {
		return ciudad;
	}
	
	public Integer getJugados() {
		return jugados;
	}

	public Integer getGanados() {
		return ganados;
	}

	public Integer getPerdidos() {
		return perdidos;
	}

	public Integer getEmpatados() {
		return empatados;
	}

	public Double getPuntosTotales() {
		return puntosTotales;
	}

	@Override
	public String toString() {
		return "EquipoDeAjedrez{" + "nombre=" + nombre + ", ciudad=" + ciudad + ", jugados=" + jugados + ", ganados=" + ganados + ", perdidos=" + perdidos + ", empatados=" + empatados + ", puntosTotales=" + puntosTotales + '}';
	}



}
