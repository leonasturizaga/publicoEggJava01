
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

public Collection<Cliente> mostrarClientes(){
	String qlString = "SELECT a FROM Cliente a";
	conectar();
	Collection<Cliente> clientes = em.createQuery(qlString).getResultList();
	desconectar();
	return clientes;
}

}
