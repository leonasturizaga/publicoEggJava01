
package estancias.persistencia;

import estancias.entidades.Comentario;


public final class ComentarioDaoExt extends DAO {

public Comentario buscarProductoPorId(int id) throws Exception{     
	try {
		String sql = "SELECT * FROM comentarios " 
			+ "WHERE id_comentario = '" + id + "';";

		consultarBase(sql);
		Comentario comentario = null;
		while (resultado.next()) {
			comentario = new Comentario();
			comentario.setId_comentario(resultado.getInt(1));
			comentario.setId_casa(resultado.getInt(2));
			comentario.setComentario(resultado.getString(3));
			System.out.println(comentario.toString());
		}
		desconectarBase();
		return comentario;
	} catch (Exception e) {
		desconectarBase();
		throw e;
	}
}


}
