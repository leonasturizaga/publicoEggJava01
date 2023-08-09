
package estancias.persistencia;

import estancias.entidades.Casa;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;


public final class CasaDaoExt extends DAO {

public Casa buscarCasaPorId(int id) throws Exception{     
	try {
		String sql = "SELECT * FROM casas " 
			+ "WHERE id_casa = '" + id + "';";

		consultarBase(sql);
		Casa casa = null;
		while (resultado.next()) {
			casa = new Casa();
			casa.setId_casa(resultado.getInt(1));
			casa.setCalle(resultado.getString(2));
			casa.setNumero(resultado.getInt(3));
			casa.setCodigo_postal(resultado.getString(4));
			casa.setCiudad(resultado.getString(5));
			casa.setPais(resultado.getString(6));			
			casa.setFecha_desde(resultado.getDate(7));
			casa.setFecha_hasta(resultado.getDate(8));
			casa.setTiempo_minimo(resultado.getInt(9));
			casa.setTiempo_maximo(resultado.getInt(10));
			casa.setPrecio_habitacion(resultado.getDouble(11));
			casa.setTipo_vivienda(resultado.getString(12));			
			System.out.println(casa.toString());
		}
		desconectarBase();
		return casa;
	} catch (Exception e) {
		desconectarBase();
		throw e;
	}
}

/**
 * metodo para generar una Collection ArrayList con todos los datos
 * @return Collection casas
 * @throws Exception 
 */
public Collection<Casa> buscarCasas() throws Exception{     
	try {
		String sql = "SELECT * FROM casas;";
		consultarBase(sql);

		Casa casa = null;
		Collection<Casa> casas = new ArrayList();

		while (resultado.next()) {
			casa = new Casa();
			casa.setId_casa(resultado.getInt(1));
			casa.setCalle(resultado.getString(2));
			casa.setNumero(resultado.getInt(3));
			casa.setCodigo_postal(resultado.getString(4));
			casa.setCiudad(resultado.getString(5));
			casa.setPais(resultado.getString(6));			
			casa.setFecha_desde(resultado.getDate(7));
			casa.setFecha_hasta(resultado.getDate(8));
			casa.setTiempo_minimo(resultado.getInt(9));
			casa.setTiempo_maximo(resultado.getInt(10));
			casa.setPrecio_habitacion(resultado.getDouble(11));
			casa.setTipo_vivienda(resultado.getString(12));			
			
			casas.add(casa);
		}
		desconectarBase();
		return casas;
	} catch (Exception e) {
		desconectarBase();
		throw e;
	}
}

public Collection<Casa> buscarCasaDispoEntreFechas(LocalDate fecha1, LocalDate fecha2) throws Exception{     
	try {
		String sql = "SELECT * FROM casas " 
			+ "WHERE pais = 'Reino Unido' and fecha_desde >= '" + fecha1 + "' and fecha_hasta <= '" + fecha2 + "';";
		consultarBase(sql);
		System.out.println(sql);
		
		Casa casa = null;
		Collection<Casa> casas = new ArrayList();
		while (resultado.next()) {
			casa = new Casa();
			casa.setId_casa(resultado.getInt(1));
			casa.setCalle(resultado.getString(2));
			casa.setNumero(resultado.getInt(3));
			casa.setCodigo_postal(resultado.getString(4));
			casa.setCiudad(resultado.getString(5));
			casa.setPais(resultado.getString(6));			
			casa.setFecha_desde(resultado.getDate(7));
			casa.setFecha_hasta(resultado.getDate(8));
			casa.setTiempo_minimo(resultado.getInt(9));
			casa.setTiempo_maximo(resultado.getInt(10));
			casa.setPrecio_habitacion(resultado.getDouble(11));
			casa.setTipo_vivienda(resultado.getString(12));			
			
			casas.add(casa);
		}
		desconectarBase();
		return casas;
	} catch (Exception e) {
		desconectarBase();
		throw e;
	}
}

public Collection<Casa> buscarCasaDispoFechaDias(LocalDate fecha, int dias) throws Exception{  	try {
		String sql = "SELECT * FROM casas " 
			+ "WHERE tiempo_minimo <= '" + dias + "' AND tiempo_maximo >= '" + dias + "' AND DATEDIFF(fecha_hasta, '" + fecha + "') >= '" + dias + "' AND fecha_desde <= '" + fecha + "';";
		consultarBase(sql);
		System.out.println(sql);
		
		Casa casa = null;
		Collection<Casa> casas = new ArrayList();
		while (resultado.next()) {
			casa = new Casa();
			casa.setId_casa(resultado.getInt(1));
			casa.setCalle(resultado.getString(2));
			casa.setNumero(resultado.getInt(3));
			casa.setCodigo_postal(resultado.getString(4));
			casa.setCiudad(resultado.getString(5));
			casa.setPais(resultado.getString(6));			
			casa.setFecha_desde(resultado.getDate(7));
			casa.setFecha_hasta(resultado.getDate(8));
			casa.setTiempo_minimo(resultado.getInt(9));
			casa.setTiempo_maximo(resultado.getInt(10));
			casa.setPrecio_habitacion(resultado.getDouble(11));
			casa.setTipo_vivienda(resultado.getString(12));			
			
			casas.add(casa);
		}
		desconectarBase();
		return casas;
	} catch (Exception e) {
		desconectarBase();
		throw e;
	}
}


}
