
package estancias.persistencia;

import estancias.entidades.Estancia;


public final class EstanciaDaoExt extends DAO {

public Estancia buscarProductoPorId(int id) throws Exception{     
	try {
		String sql = "SELECT * FROM estancias " 
			+ "WHERE id_estancia = '" + id + "';";

		consultarBase(sql);
		Estancia estancia = null;
		while (resultado.next()) {
			estancia = new Estancia();
			estancia.setId_estancia(resultado.getInt(1));
			estancia.setId_cliente(resultado.getInt(2));
			estancia.setId_casa(resultado.getInt(3));
			estancia.setNombre_huesped(resultado.getString(4));
			estancia.setFecha_desde(resultado.getDate(5));
			estancia.setFecha_hasta(resultado.getDate(6));
			System.out.println(estancia.toString());
		}
		desconectarBase();
		return estancia;
	} catch (Exception e) {
		desconectarBase();
		throw e;
	}
}


}
