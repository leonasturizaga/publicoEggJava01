
package libreria.persistencia;

import java.util.Collection;
import libreria.entidades.Prestamo;


public final class PrestamoDAO extends DAO<Prestamo>{

@Override
public void guardar(Prestamo prestamo){
	super.guardar(prestamo);
}

public void eliminar(Integer id){
	Prestamo prestamo = buscarPorId(id);
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

}
