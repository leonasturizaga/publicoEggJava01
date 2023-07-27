
package libreria.persistencia;

import java.util.Collection;
import libreria.entidades.Prestamo;


public final class PrestamoDAO extends DAO<Prestamo>{

@Override
public void guardar(Prestamo prestamo){
	super.guardar(prestamo);
}

public void editarPrestamo(Prestamo prestamo){
	super.editar(prestamo);
}	

public void eliminarPrestamo(Prestamo prestamo){
	super.eliminar(prestamo);
	
}
public Prestamo buscarPorId(Integer id){
	conectar();
	Prestamo prestamo = em.find(Prestamo.class, id);
	desconectar();
	return prestamo;
}

public Collection<Prestamo> mostrarPrestamos(){
	String qlString = "SELECT a FROM Prestamo a";
	conectar();
	Collection prestamos = em.createQuery(qlString).getResultList();
	desconectar();
	return prestamos;
}

//buscar ID maximo
public int prestamoIdMax(){
	conectar();
	int idMax=0;
	String qlString = "SELECT a FROM Prestamo a ORDER BY a.id DESC";
	Collection<Prestamo> prestamos = em.createQuery(qlString).getResultList();
	for (Prestamo prestamo : prestamos) {
		if (prestamo.getId()>idMax) {
			idMax= prestamo.getId();
		}
	}
	desconectar();
	return idMax;
}


}
