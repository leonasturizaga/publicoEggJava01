
package tienda;

import java.util.logging.Level;
import java.util.logging.Logger;
import tienda.servicios.FabricanteService;
import tienda.servicios.ProductoService;


public class tienda {


public static void main(String[] args) {

ProductoService ps = new ProductoService();   //llama al constructor modificado de ProductoService
FabricanteService fs = new FabricanteService();

	try {
//		ps.crearProducto("prod006", 183.5, 5);
//		ps.buscarProductoPorId(3);
//		ps.listaProductosNombre();
//		System.out.println("-------------");
//		ps.listaProductosNombrePrecio();
//		System.out.println("-------------");
//		ps.buscarProductosEntrePrecios(100,200);
//		ps.buscarProductosEntrePrecios(120,120);
				System.out.println("-------------");
//		ps.buscarProductosPorNombre();
//		ps.buscarProductoMinPrecio();
//		ps.ingresarProducto();
				System.out.println("-------------");
//		fs.crearFabricante("fabricante nuevo");
		ps.modificarProductoDatos();
	} catch (Exception ex) {
		Logger.getLogger(tienda.class.getName()).log(Level.SEVERE, null, ex);
	}
	
	
}

}
