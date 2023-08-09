
package estancias;

import estancias.persistencia.FamiliaDaoExt;
import estancias.servicios.CasaServicio;
import estancias.servicios.ClienteServicio;
import estancias.servicios.FamiliaServicio;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Estancias {


public static void main(String[] args) {

//test conection
FamiliaDaoExt obj = new FamiliaDaoExt();
FamiliaServicio fs = new FamiliaServicio();
CasaServicio cs = new CasaServicio();
ClienteServicio clis = new ClienteServicio();
	try {
		obj.buscarFamiliaPorId(1);
		fs.listaFamiliasNombre();
		fs.listaFamiliasNombreEdadMinHijosMax();
		cs.mostrarCasas();
		cs.mostrarCasasEntreFechas();
		fs.listaFamiliasEmail();
		cs.mostrarCasaDispoFechaDias();
		clis.mostrarClienteConEstanciaCasas();
		
	} catch (Exception ex) {
		Logger.getLogger(Estancias.class.getName()).log(Level.SEVERE, null, ex);
	}

	
	
}

}
