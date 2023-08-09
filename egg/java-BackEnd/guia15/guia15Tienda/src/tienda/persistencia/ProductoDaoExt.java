
package tienda.persistencia;

import java.util.ArrayList;
import java.util.Collection;
import tienda.entidades.Fabricante;
import tienda.entidades.Producto;


public final class ProductoDaoExt extends DAO {  //clase hereda metodos de DAO

public void insertarProducto(Producto producto) throws Exception {
	try {
		if (producto == null) {
			throw new Exception("Debe indicar un pruducto");
		}
		String sql = "INSERT INTO producto (nombre, precio, codigo_fabricante)"
			+ "VALUES ('" +producto.getNombre() +  "' , '"  +producto.getPrecio()+  "' , '"  +producto.getCodigoFabricante()+ "' );";
		insertarModificarEliminar(sql);
	} catch (Exception e) {
		throw e;
	}
}

public Producto buscarProductoPorId(int id) throws Exception{     
	try {
		String sql = "SELECT * FROM producto " 
			+ "WHERE codigo = '" + id + "';";
// String sql = "SELECT * FROM usuario WHERE id = 1;";
		consultarBase(sql);
		Producto producto = null;
		while (resultado.next()) {
			producto = new Producto();
			producto.setCodigo(resultado.getInt(1));
			producto.setNombre(resultado.getString(2));
			producto.setPrecio(resultado.getDouble(3));
			producto.setCodigoFabricante(resultado.getInt(4));
			System.out.println(producto.toString());
		}
		desconectarBase();
		return producto;
	} catch (Exception e) {
		desconectarBase();
		throw e;
	}
}

public Fabricante buscarFabricantePorId(int id) throws Exception{     
	try {
		String sql = "SELECT * FROM fabricante " 
			+ "WHERE codigo = '" + id + "';";

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

public Collection<Producto> mostrarProductos() throws Exception{     
	try {
		String sql = "SELECT * FROM producto order by nombre;";
// String sql = "SELECT * FROM usuario WHERE id = 1;";
		consultarBase(sql);
		Producto producto = null;
		Collection<Producto> productos = new ArrayList();
		while (resultado.next()) {
			producto = new Producto();
			producto.setCodigo(resultado.getInt(1));
			producto.setNombre(resultado.getString(2));
			producto.setPrecio(resultado.getDouble(3));
			producto.setCodigoFabricante(resultado.getInt(4));

			productos.add(producto);
		}
		desconectarBase();
		return productos;
	} catch (Exception e) {
		e.printStackTrace();
		desconectarBase();
		throw new Exception("Error de sistema en (mostrarProductos())");
	}
}

public Collection<Producto> buscarProductosEntrePrecios(double precio1, double precio2) throws Exception{     
	try {
		double p1=precio1;
		double p2=precio2;
		if (precio1>precio2) {
			p1=precio2;
			p2=precio1;
		}
		String sql = "SELECT * FROM producto " 
			+ "WHERE precio >= " + p1 + " and precio <= " + p2 + ";";
		consultarBase(sql);
		Producto producto = null;
		Collection<Producto> productos = new ArrayList();
		while (resultado.next()) {
			producto = new Producto();
			producto.setCodigo(resultado.getInt(1));
			producto.setNombre(resultado.getString(2));
			producto.setPrecio(resultado.getDouble(3));
			producto.setCodigoFabricante(resultado.getInt(4));

			productos.add(producto);
		}
		desconectarBase();
		return productos;
	} catch (Exception e) {
		e.printStackTrace();
		desconectarBase();
		throw new Exception("Error de sistema en (buscarProductosEntrePrecios())");
	}
}

public Collection<Producto> buscarProductosPorNombre(String nombre) throws Exception{
	try	{
		String sql = "SELECT * FROM producto " 
			+ "WHERE nombre like '%" + nombre + "%'" + ";";
		consultarBase(sql);
		Producto producto = null;
		Collection<Producto> productos = new ArrayList();
		while (resultado.next()) {
			producto = new Producto();
			producto.setCodigo(resultado.getInt(1));
			producto.setNombre(resultado.getString(2));
			producto.setPrecio(resultado.getDouble(3));
			producto.setCodigoFabricante(resultado.getInt(4));

			productos.add(producto);
		}
		desconectarBase();
		return productos;
	} catch (Exception e) {
		e.printStackTrace();
		desconectarBase();
		throw new Exception("Error de sistema en (buscarProductosPorNombre())");
	}
}

public Collection<Producto> mostrarProductosMinPrecio() throws Exception{     
	try {
		String sql = "SELECT * FROM producto order by precio asc LIMIT 1;";
		consultarBase(sql);
		Producto producto = null;
		Collection<Producto> productos = new ArrayList();
		while (resultado.next()) {
			producto = new Producto();
			producto.setCodigo(resultado.getInt(1));
			producto.setNombre(resultado.getString(2));
			producto.setPrecio(resultado.getDouble(3));
			producto.setCodigoFabricante(resultado.getInt(4));

			productos.add(producto);
		}
		desconectarBase();
		return productos;
	} catch (Exception e) {
		e.printStackTrace();
		desconectarBase();
		throw new Exception("Error de sistema en (mostrarProductosMinPrecio())");
	}
}

public void modificarProducto(Producto producto) throws Exception {  //no anda el script es muy largo
	try {
		if (producto == null) {
			throw new Exception("Debe indicar el producto que desea modificar");
		}
		String sql = "UPDATE tienda.producto SET nombre  = '" + producto.getNombre() + "' WHERE codigo = " + producto.getCodigo() + ";";
//			+ "UPDATE tienda.producto SET precio  = " + producto.getPrecio() + " WHERE codigo = " + producto.getCodigo() + ";\n "
//		+ "UPDATE tienda.producto SET codigo_fabricante  = " + producto.getCodigoFabricante()
//			+ " WHERE codigo = " + producto.getCodigo() + ";";
		insertarModificarEliminar(sql);
	} catch (Exception e) {
		throw e;
	}
}

public void modificarProductoNombre(Producto producto) throws Exception {
	try {
		if (producto == null) {
			throw new Exception("Debe indicar el producto que desea modificar");
		}
		String sql = "UPDATE tienda.producto SET nombre  = '" + producto.getNombre() + "' WHERE codigo = " + producto.getCodigo() + ";";
		insertarModificarEliminar(sql);
	} catch (Exception e) {
		throw e;
	}
}
public void modificarProductoPrecio(Producto producto) throws Exception {
	try {
		if (producto == null) {
			throw new Exception("Debe indicar el producto que desea modificar");
		}
		String sql = "UPDATE tienda.producto SET precio  = " + producto.getPrecio() 
			+ " WHERE codigo = " + producto.getCodigo() + ";";
		insertarModificarEliminar(sql);
	} catch (Exception e) {
		throw e;
	}
}
public void modificarProductoCodigoFabricante(Producto producto) throws Exception {
	try {
		if (producto == null) {
			throw new Exception("Debe indicar el producto que desea modificar");
		}
		String sql = "UPDATE tienda.producto SET codigo_fabricante  = " + producto.getCodigoFabricante()
			+ " WHERE codigo = " + producto.getCodigo() + ";";

		insertarModificarEliminar(sql);
	} catch (Exception e) {
		throw e;
	}
}
public void eliminarProducto(int codigo) throws Exception {
	try {
		String sql = "DELETE FROM  producto WHERE codigo = '"   + codigo + "' );";
		insertarModificarEliminar(sql);
	} catch (Exception e) {
		throw e;
	}
}

}

