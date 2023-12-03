
package tienda.persistencia;

import tienda.entidades.Fabricante;


public final class FabricanteDaoExt extends DAO {

public void insertarFabricante(Fabricante fabricante) throws Exception {
	try {
		if (fabricante == null) {
			throw new Exception("Debe indicar un fabricante");
		}
		String sql = "INSERT INTO fabricante (nombre)"
			+ "VALUES ('" +fabricante.getNombre() +  "' );";
		insertarModificarEliminar(sql);
	} catch (Exception e) {
		throw e;
	}
}

public Fabricante buscarFabricantePorNombre(String nombre) throws Exception{     
	try {
		String sql = "SELECT * FROM fabricante " 
			+ "WHERE nombre = '" + nombre + "';";

		consultarBase(sql);
		Fabricante fabricante = null;
		while (resultado.next()) {
			fabricante = new Fabricante();
			fabricante.setCodigo(resultado.getInt(1));
			fabricante.setNombre(resultado.getString(2));
			System.out.println(fabricante.toString());
		}
		desconectarBase();
		return fabricante;
	} catch (Exception e) {
		desconectarBase();
		throw e;
	}
}

}
