
package libreria.persistencia;

import java.util.Collection;
import libreria.entidades.Cliente;



public final class ClienteDAO extends DAO<Cliente> {

@Override
public void guardar(Cliente cliente){
	super.guardar(cliente);
}

public void eliminar(Integer id){
	Cliente cliente = buscarPorId(id);
	super.eliminar(cliente);
}

public Cliente buscarPorId(Integer id){
	super.conectar();
	Cliente cliente = super.em.find(Cliente.class, id);
	super.desconectar();
	return cliente;
}

public Cliente buscarClientePorDocumento(Long documento){
	conectar();
	String qlString = "SELECT a FROM Cliente a WHERE a.documento = :documento";
	Cliente cliente = (Cliente) em.createQuery(qlString).setParameter("documento", documento).getSingleResult();
	desconectar();
		return cliente;	
}
	
public Collection<Cliente> buscarClientesPorApellido(String apellido){
	conectar();
	String qlString = "SELECT a FROM Cliente a WHERE a.apellido = :apellido";
	Collection<Cliente> clientes = em.createQuery(qlString).setParameter("apellido", apellido).getResultList();
	//Collection<Cliente> clientes = em.createQuery(qlString).getResultList();
	desconectar();
	return clientes;
}

public Collection<Cliente> mostrarClientes(){
	String qlString = "SELECT a FROM Cliente a";
	conectar();
	Collection<Cliente> clientes = em.createQuery(qlString).getResultList();
	desconectar();
	return clientes;
}

//crear Cliente mediante un objeto, persist
public void crearCliente(Cliente cliente){
        conectar();
        em.getTransaction().begin();
        em.persist(cliente);
        em.getTransaction().commit();
        desconectar();	
}

//modificar Cliente mediante un objeto, merge
public void modificarCliente(Cliente cliente){
        conectar();
        em.getTransaction().begin();
        em.merge(cliente);
        em.getTransaction().commit();
        desconectar();		
}

//Eliminar Cliente mediante objeto, remove
public void eliminarCliente(Cliente cliente) {
	conectar();
	if (!em.contains(cliente)) {
		cliente = em.merge(cliente);
	}
	em.getTransaction().begin();
	em.remove(cliente);
	em.getTransaction().commit();
	desconectar();
}

}
