package tienda.servicios;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;
import tienda.entidades.Producto;
import tienda.persistencia.FabricanteDaoExt;
import tienda.persistencia.ProductoDaoExt;

public class ProductoService {
//Paquete servicios:
//En este paquete se almacenarán aquellas clases que llevarán adelante lógica del negocio. En
//general se crea un servicio para administrar cada una de las entidades y algunos servicios
//para manejar operaciones muy específicas como las estadísticas.
//Realizar un menú en Java a través del cual se permita elegir qué consulta se desea realizar.
//Las consultas a realizar sobre la BD son las siguientes:
//a) Lista el nombre de todos los productos que hay en la tabla producto.
//b) Lista los nombres y los precios de todos los productos de la tabla producto.
//c) Listar aquellos productos que su precio esté entre 120 y 202.
//d) Buscar y listar todos los Portátiles de la tabla producto.
//e) Listar el nombre y el precio del producto más barato.
//f) Ingresar un producto a la base de datos.
//g) Ingresar un fabricante a la base de datos
//h) Editar un producto con datos a elección.

//atributo objeto para clase productoDAO
private ProductoDaoExt dao;

// constructor ProductoService   hay que modificar para que no tenga parametros y cree un nuevo objeto dao de tipo claseDaoExt
public ProductoService() {
	this.dao = new ProductoDaoExt();
}

//metodos necesarios de la clase productoService
public void crearProducto(String nombre, double precio, int codigoFabricante) throws Exception {
	try {
		//Validamos
		if (nombre == null || nombre.trim().isEmpty()) {
			throw new Exception("Debe indicar el nombre");
		}
		if (precio == 0 || precio < 0) {
			throw new Exception("Debe indicar el precio");
		}
		if (codigoFabricante <= 0) {
			throw new Exception("El codigo del fabricante debe ser un entero positivo");
		}
		if (dao.buscarFabricantePorId(codigoFabricante) == null) {
			throw new Exception("No existe un fabricante con el codigo indicado " + codigoFabricante);
		}

		//Creamos el objeto producto
		Producto producto = new Producto();
		producto.setNombre(nombre);
		producto.setPrecio(precio);
		producto.setCodigoFabricante(codigoFabricante);

		dao.insertarProducto(producto);
	} catch (Exception e) {
		throw e;
	}
}

public Producto buscarProductoPorId(Integer id) throws Exception {

	try {

		//Validamos
		if (id == null) {
			throw new Exception("Debe indicar el id");
		}

		Producto producto = dao.buscarProductoPorId(id);

		return producto;
	} catch (Exception e) {
		throw e;
	}
}

//Las consultas a realizar sobre la BD son las siguientes:
//a) Lista el nombre de todos los productos que hay en la tabla producto.
public void listaProductosNombre() throws Exception {
	Collection<Producto> listaProductos = new ArrayList();
	listaProductos = dao.mostrarProductos();
	for (Producto listaProducto : listaProductos) {
		System.out.println(listaProducto.getNombre());
	}
}

//b) Lista los nombres y los precios de todos los productos de la tabla producto.
public void listaProductosNombrePrecio() throws Exception {
	Collection<Producto> listaProductos = new ArrayList();  // se puede inicializar o no la lista
	listaProductos = dao.mostrarProductos();
	for (Producto listaProducto : listaProductos) {
		System.out.println(listaProducto.getNombre() + ", " + listaProducto.getPrecio());
	}
}

//c) Listar aquellos productos que su precio esté entre 120 y 202.
public void buscarProductosEntrePrecios(double precio1, double precio2) throws Exception {
	Collection<Producto> listaProductos;
	listaProductos = dao.buscarProductosEntrePrecios(precio1, precio2);
	for (Producto listaProducto : listaProductos) {
		System.out.println(listaProducto.getNombre() + ", " + listaProducto.getPrecio());
	}
}

//d) Buscar y listar todos los Portátiles de la tabla producto.
public void buscarProductosPorNombre() throws Exception {
	Scanner leer = new Scanner(System.in).useDelimiter("\n");
	System.out.println("Ingrese nombre del producto");
	String nombre = leer.nextLine();
	Collection<Producto> listaProductos;
	listaProductos = dao.buscarProductosPorNombre(nombre);
	for (Producto listaProducto : listaProductos) {
		System.out.println(listaProducto.getNombre() + ", " + listaProducto.getPrecio());
	}
}
//e) Listar el nombre y el precio del producto más barato.

public void buscarProductoMinPrecio() throws Exception {
	Collection<Producto> listaProductos;
	listaProductos = dao.mostrarProductosMinPrecio();
	for (Producto listaProducto : listaProductos) {
		System.out.println(listaProducto.getNombre() + ", " + listaProducto.getPrecio());
	}
}

//f) Ingresar un producto a la base de datos.
public void ingresarProducto() throws Exception {
	Scanner leerText = new Scanner(System.in).useDelimiter("\n");
	Scanner leerNum = new Scanner(System.in).useDelimiter("\n");
	System.out.print("Ingrese nombre del producto: ");
	String nombre = leerText.nextLine();
	System.out.print("Ingrese precio del producto: ");
	double precio = leerNum.nextDouble();
	System.out.print("Ingrese codigo del fabricante: ");
	int codigoFabricante = leerNum.nextInt();

	try {
		//Validamos
		if (nombre == null || nombre.trim().isEmpty()) {
			throw new Exception("Debe indicar el nombre");
		}
		if (precio == 0 || precio < 0) {
			throw new Exception("Debe indicar el precio");
		}
		if (codigoFabricante <= 0) {
			throw new Exception("El codigo del fabricante debe ser un entero positivo");
		}
		if (dao.buscarFabricantePorId(codigoFabricante) == null) {
			throw new Exception("No existe un fabricante con el codigo indicado " + codigoFabricante);
		}

		//Creamos el usuario
		Producto producto = new Producto();
		producto.setNombre(nombre);
		producto.setPrecio(precio);
		producto.setCodigoFabricante(codigoFabricante);

		dao.insertarProducto(producto);
	} catch (Exception e) {
		throw e;
	}
}

//g) Ingresar un fabricante a la base de datos
	// metodo en fabricanteService

//h) Editar un producto con datos a elección.
public void modificarProductoDatos() throws Exception {
	Scanner leerText = new Scanner(System.in).useDelimiter("\n");
	Scanner leerNum = new Scanner(System.in).useDelimiter("\n");
	Producto producto = new Producto();
	int dato=0;
	int var;
	try {
		do {
		System.out.println("Ingrese codigo de producto o 0) para salir");
		var = leerNum.nextInt();
			if (dao.buscarProductoPorId(var) != null || var == 0) {
			producto = dao.buscarProductoPorId(var);				
				dato = 1;
			}
		} while (dato != 1);
		
		if (var !=0) {
		do {
			System.out.println("Ingrese que dato quiere modificar:\n 1) nombre \n 2) precio \n 3) codigo de fabricante \n 0) para salir");
			dato = leerNum.nextInt();
			switch (dato) {
				case 1:
					System.out.print("Ingrese el nuevo nombre del producto: ");
					String nombre = leerText.nextLine();
					if (nombre == null || nombre.trim().isEmpty()) {
						throw new Exception("Debe indicar el nombre");
					} else {
						producto.setNombre(nombre);
						dao.modificarProductoNombre(producto);
					}
					break;
				case 2:
					System.out.print("Ingrese nuevo precio del producto: ");
					double precio = leerNum.nextDouble();
					if (precio == 0 || precio < 0) {
						throw new Exception("Debe indicar un nuevo precio");
					} else {
						producto.setPrecio(precio);
						dao.modificarProductoPrecio(producto);
					}
					break;
				case 3:
					System.out.print("Ingrese nuevo codigo del fabricante: ");
					int codigoFabricante = leerNum.nextInt();
					if (codigoFabricante <= 0) {
						throw new Exception("El codigo del fabricante debe ser un entero positivo");
					}
					if (dao.buscarFabricantePorId(codigoFabricante) == null) {
						throw new Exception("No existe un fabricante con el codigo indicado " + codigoFabricante);
					} else {
						producto.setCodigoFabricante(codigoFabricante);
						dao.modificarProductoCodigoFabricante(producto);
					}
					break;
				case 0:
					System.out.println(producto.toString());
					break;

				default:
					System.out.println("Ingrese una opcion valida");
			}
		} while (dato != 0);
		} else {
			System.out.println("no hubo modificaciones");
		}
		
	} catch (Exception e) {
		throw e;
	}

}
}
