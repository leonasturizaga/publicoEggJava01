
package estancias.persistencia;

import estancias.entidades.Familia;
import java.util.ArrayList;
import java.util.Collection;


public final class FamiliaDaoExt extends DAO {

public Familia buscarFamiliaPorId(int id) throws Exception{     
	try {
		String sql = "SELECT * FROM familias " 
			+ "WHERE id_familia = '" + id + "';";

		consultarBase(sql);
		Familia familia = null;
		while (resultado.next()) {
			familia = new Familia();
			familia.setId_familia(resultado.getInt(1));
			familia.setNombre(resultado.getString(2));
			familia.setEdad_minima(resultado.getInt(3));
			familia.setEdad_maxima(resultado.getInt(4));
			familia.setNum_hijos(resultado.getInt(5));
			familia.setEmail(resultado.getString(6));
			familia.setId_casa_familia(resultado.getInt(7));
			System.out.println(familia.toString());
		}
		desconectarBase();
		return familia;
	} catch (Exception e) {
		desconectarBase();
		throw e;
	}
}

public Collection<Familia> mostrarFamilias() throws Exception{     
	try {
		String sql = "SELECT * FROM familias order by nombre;";
		consultarBase(sql);
	
		Familia familia = null;
		Collection<Familia> familias = new ArrayList();
		while (resultado.next()) {
			familia = new Familia();
			familia.setId_familia(resultado.getInt(1));
			familia.setNombre(resultado.getString(2));
			familia.setEdad_minima(resultado.getInt(3));
			familia.setEdad_maxima(resultado.getInt(4));
			familia.setNum_hijos(resultado.getInt(5));
			familia.setEmail(resultado.getString(6));
			familia.setId_casa_familia(resultado.getInt(7));

			familias.add(familia);
		}
		desconectarBase();
		return familias;
	} catch (Exception e) {
		e.printStackTrace();
		desconectarBase();
		throw new Exception("Error de sistema en (mostrarFamilias())");
	}
}

public Collection<Familia> mostrarFamiliasHijosEdad(int hijosMin, int edadMax) throws Exception{     
	try {
		String sql = "SELECT nombre, num_hijos, edad_maxima FROM familias "
			+ "WHERE num_hijos >= '" + hijosMin + "' AND edad_maxima < '" + edadMax + "';";
		consultarBase(sql);
	
		Familia familia = null;
		Collection<Familia> familias = new ArrayList();
		while (resultado.next()) {
			familia = new Familia();
//			familia.setId_familia(resultado.getInt(1));
			familia.setNombre(resultado.getString(1));
//			familia.setEdad_minima(resultado.getInt(3));
			familia.setEdad_maxima(resultado.getInt(2));
			familia.setNum_hijos(resultado.getInt(3));
//			familia.setEmail(resultado.getString(6));
//			familia.setId_casa_familia(resultado.getInt(7));

			familias.add(familia);
		}
		desconectarBase();
		return familias;
	} catch (Exception e) {
		e.printStackTrace();
		desconectarBase();
		throw new Exception("Error de sistema en (mostrarFamiliasHijosEdad())");
	}
}

public Collection<Familia> mostrarFamiliasEmail(String email) throws Exception{     
	try {
		String sql = "SELECT nombre, email FROM familias "
			+ "WHERE email like '%@" + email + "%';";
		consultarBase(sql);
	
		Familia familia = null;
		Collection<Familia> familias = new ArrayList();
		while (resultado.next()) {
			familia = new Familia();
//			familia.setId_familia(resultado.getInt(1));
			familia.setNombre(resultado.getString(1));
//			familia.setEdad_minima(resultado.getInt(3));
//			familia.setEdad_maxima(resultado.getInt(2));
//			familia.setNum_hijos(resultado.getInt(3));
			familia.setEmail(resultado.getString(2));
//			familia.setId_casa_familia(resultado.getInt(7));

			familias.add(familia);
		}
		desconectarBase();
		return familias;
	} catch (Exception e) {
		e.printStackTrace();
		desconectarBase();
		throw new Exception("Error de sistema en (mostrarFamiliasEmail())");
	}
}

}
