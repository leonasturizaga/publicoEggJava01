
package estancias.servicios;

import estancias.entidades.Cliente;
import estancias.persistencia.ClienteDaoExt;
import java.util.ArrayList;
import java.util.Collection;


public class ClienteServicio {
private ClienteDaoExt dao;

	public ClienteServicio() {
		this.dao=new ClienteDaoExt();
	}
	
//e) Listar los datos de todos los clientes que en algún momento realizaron una estancia y la descripción de la casa donde la realizaron.	
public void mostrarClienteConEstanciaCasas() throws Exception{
	Collection<Object> objetos=new ArrayList();
	objetos = dao.buscarClientesConEstanciaCasas();
	for (Object objeto : objetos) {
		System.out.println(objeto.toString());
	}
}	

}
