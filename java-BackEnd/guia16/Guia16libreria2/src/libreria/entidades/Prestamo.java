
package libreria.entidades;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;


@Entity
public class Prestamo implements Serializable {

private static final long serialVersionUID = 1L;
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
private Integer id;
@Temporal(javax.persistence.TemporalType.DATE)
private Date fechaPrestamo;
@Temporal(javax.persistence.TemporalType.DATE)
private Date fechaDevolucion;
@OneToOne
private Libro libro;
@OneToOne
private Cliente cliente;

	public Prestamo() {
	}

	public Prestamo(Date fechaPrestamo, Date fechaDevolucion, Libro libro, Cliente cliente) {
		this.fechaPrestamo = fechaPrestamo;
		this.fechaDevolucion = fechaDevolucion;
		this.libro = libro;
		this.cliente = cliente;
	}

public Integer getId() {
	return id;
}
public void setId(Integer id) {
	this.id = id;
}
public Date getFechaPrestamo() {
	return fechaPrestamo;
}
public void setFechaPrestamo(Date fechaPrestamo) {
	this.fechaPrestamo = fechaPrestamo;
}
public Date getFechaDevolucion() {
	return fechaDevolucion;
}
public void setFechaDevolucion(Date fechaDevolucion) {
	this.fechaDevolucion = fechaDevolucion;
}
public Libro getLibro() {
	return libro;
}
public void setLibro(Libro libro) {
	this.libro = libro;
}
public Cliente getCliente() {
	return cliente;
}
public void setCliente(Cliente cliente) {
	this.cliente = cliente;
}

@Override
public int hashCode() {
	int hash = 0;
	hash += (id != null ? id.hashCode() : 0);
	return hash;
}

@Override
public boolean equals(Object object) {
	// TODO: Warning - this method won't work in the case the id fields are not set
	if (!(object instanceof Prestamo)) {
		return false;
	}
	Prestamo other = (Prestamo) object;
	if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
		return false;
	}
	return true;
}


	@Override
	public String toString() {
		return "Prestamo{" + "id=" + id + ", fechaPrestamo=" + fechaPrestamo + ", fechaDevolucion=" + fechaDevolucion + ", libro=" + libro + ", cliente=" + cliente + '}';
	}


	
}
