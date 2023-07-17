
package estancias.persistencia;

import estancias.entidades.Cliente;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;



public final class ClienteDaoExt extends DAO {

public Cliente buscarProductoPorId(int id) throws Exception{     
	try {
		String sql = "SELECT * FROM clientes " 
			+ "WHERE id_cliente = '" + id + "';";

		consultarBase(sql);
		Cliente cliente = null;
		while (resultado.next()) {
			cliente = new Cliente();
			cliente.setId_cliente(resultado.getInt(1));
			cliente.setNombre(resultado.getString(2));
			cliente.setCalle(resultado.getString(3));
			cliente.setNumero(resultado.getInt(4));
			cliente.setCodigo_postal(resultado.getString(5));
			cliente.setCiudad(resultado.getString(6));
			cliente.setPais(resultado.getString(7));			
			cliente.setEmail(resultado.getString(8));
			System.out.println(cliente.toString());
		}
		desconectarBase();
		return cliente;
	} catch (Exception e) {
		desconectarBase();
		throw e;
	}
}
/**
 * metodo para listar los clientes
 * @return Collection<Cliente> clientes
 * @throws Exception 
 */
public Collection<Cliente> buscarClientes() throws Exception{     
	try {
		String sql = "SELECT * FROM clientes;";

		consultarBase(sql);
		Cliente cliente = null;
		Collection<Cliente> clientes = new ArrayList();
		while (resultado.next()) {
			cliente = new Cliente();
			cliente.setId_cliente(resultado.getInt(1));
			cliente.setNombre(resultado.getString(2));
			cliente.setCalle(resultado.getString(3));
			cliente.setNumero(resultado.getInt(4));
			cliente.setCodigo_postal(resultado.getString(5));
			cliente.setCiudad(resultado.getString(6));
			cliente.setPais(resultado.getString(7));			
			cliente.setEmail(resultado.getString(8));
			clientes.add(cliente);
		}
		desconectarBase();
		return clientes;
	} catch (Exception e) {
		desconectarBase();
		throw e;
	}
}

public Collection<Object> buscarClientesConEstanciaCasas() throws Exception{     
	try {
		String sql = "SELECT t1.*, t3.* FROM estancias_exterior.clientes AS t1 INNER JOIN estancias_exterior.estancias AS t2 ON t1.id_cliente=t2.id_cliente INNER JOIN estancias_exterior.casas AS t3 ON t2.id_casa=t3.id_casa;";
//		String sql = "SELECT t1.id_cliente, t1.nombre, t3.id_casa, t3.calle FROM estancias_exterior.clientes AS t1 INNER JOIN estancias_exterior.estancias AS t2 ON t1.id_cliente=t2.id_cliente INNER JOIN estancias_exterior.casas AS t3 ON t2.id_casa=t3.id_casa;";
		consultarBase(sql);
		System.out.println(sql);
		ArrayList<Object> objeto = new ArrayList();
		Collection<Object> objetos = new ArrayList();
			int id_cliente;
			String nombre;
			String calle;
			int numero;
			String codigo_postal;
			String ciudad;
			String pais;
			String email;
			int id_casa;
			String calle2;
			int numero2;
			String codigo_postal2;
			String ciudad2;
			String pais2;
			Date fecha_desde;
			Date fecha_hasta;
			int tiempo_minimo;
			int tiempo_maximo;
			double precio_habitacion;
			String tipo_vivienda;				
		while (resultado.next()) {
			objeto = new ArrayList();	
			id_cliente = resultado.getInt(1);
			nombre = resultado.getString(2);
			calle =resultado.getString(3);
			numero = resultado.getInt(4);
			codigo_postal =resultado.getString(5);
			ciudad =resultado.getString(6);
			pais =resultado.getString(7);
			email =resultado.getString(8);

			id_casa= resultado.getInt(9);
			calle2 = resultado.getString(10);
			numero = resultado.getInt(11);
			codigo_postal = resultado.getString(12);
			ciudad = resultado.getString(13);
			pais = resultado.getString(14);;
			fecha_desde = resultado.getDate(15);
			fecha_hasta = resultado.getDate(16);
			tiempo_minimo = resultado.getInt(17);
			tiempo_maximo = resultado.getInt(18);
			precio_habitacion = resultado.getDouble(19);
			tipo_vivienda = resultado.getString(20);			
			
			objeto.add(id_cliente);
			objeto.add(nombre);
			objeto.add(calle);
			objeto.add(numero);
			objeto.add(codigo_postal);
			objeto.add(ciudad); 
			objeto.add(pais); 
			objeto.add(email);

			objeto.add(id_casa);
			objeto.add(calle2);			
			objeto.add(codigo_postal);
			objeto.add(ciudad);
			objeto.add(pais);
			objeto.add(fecha_desde);
			objeto.add(fecha_hasta);
			objeto.add(tiempo_minimo);
			objeto.add(tiempo_maximo);
			objeto.add(precio_habitacion);
			objeto.add(tipo_vivienda);			
			
		objetos.add(objeto);	
		}

		desconectarBase();
		return objetos;
	} catch (Exception e) {
		desconectarBase();
		throw e;
	}
}

}
