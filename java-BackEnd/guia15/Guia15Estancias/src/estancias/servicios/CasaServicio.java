
package estancias.servicios;

import estancias.entidades.Casa;
import estancias.persistencia.CasaDaoExt;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;




public class CasaServicio {
private CasaDaoExt dao;

	public CasaServicio() {
		this.dao = new CasaDaoExt();
	}

public void mostrarCasas() throws Exception{
	Collection<Casa> listaCasas = new ArrayList();
	listaCasas = dao.buscarCasas();
	for (Casa listaCasa : listaCasas) {
		System.out.println(listaCasa.toString());
	}
}	

//b) Buscar y listar las casas disponibles para el periodo comprendido entre el 1 de agosto de 2020 y el 31 de agosto de 2020 en Reino Unido.
public void mostrarCasasEntreFechas() throws Exception{
//	Date fecha1 = new Date(2020-1900, 8-1, 1);
//	Date fecha2 = new Date(2020-1900, 8-1, 31);
	LocalDate fecha1 = LocalDate.of(2020, 8, 1);   // mejor porque tiene formato 'aaaa-mm-dd'
	LocalDate fecha2 = LocalDate.of(2020, 8, 31);
Collection<Casa> listaCasas = new ArrayList();
	listaCasas = dao.buscarCasaDispoEntreFechas(fecha1,fecha2);
	for (Casa listaCasa : listaCasas) {
		System.out.println(listaCasa.toString());
	}
	
}

//d) Consulta la BD para que te devuelva aquellas casas disponibles a partir de una fecha dada y un número de días específico.
public void mostrarCasaDispoFechaDias() throws Exception{
	LocalDate fecha = LocalDate.of(2020, 8, 15);
	int dias = 20;
	Collection<Casa> casas = new ArrayList();
	casas = dao.buscarCasaDispoFechaDias(fecha, dias);
	for (Casa casa : casas) {
		System.out.println(casa.toString());
	}
	
}

}
