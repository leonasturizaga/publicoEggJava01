
package tienda.servicios;

import tienda.entidades.Fabricante;
import tienda.persistencia.FabricanteDaoExt;


public class FabricanteService {
//atributo DAO para fabricanteDAOext
private FabricanteDaoExt dao;

//constructor
	public FabricanteService() {
		this.dao = new FabricanteDaoExt();
	}

//metodos de la clae FabricanteService
	
//g) Ingresar un fabricante a la base de datos
public void crearFabricante(String nombre) throws Exception {
	try {
		//Validamos
		if (nombre == null || nombre.trim().isEmpty()) {
			throw new Exception("Debe indicar el nombre");
		}
		if (nombre.equalsIgnoreCase(dao.buscarFabricantePorNombre(nombre).getNombre())) {
			throw new Exception("El nombre del fabricante ya existe");
		}
		//Creamos el objeto fabricante
		Fabricante fabricante = new Fabricante();
		fabricante.setNombre(nombre);

		dao.insertarFabricante(fabricante);
	} catch (Exception e) {
		throw e;
	}
}	
	
	
}
