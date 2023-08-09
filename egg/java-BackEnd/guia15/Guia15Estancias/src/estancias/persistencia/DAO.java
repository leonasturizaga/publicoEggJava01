
package estancias.persistencia;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public abstract class DAO {
//atributos para DAO
protected Connection conexion = null;
protected ResultSet resultado = null;
protected Statement sentencia = null;

// datos de conexion
private final String USER = "root";
private final String PASSWORD = "";
private final String DATABASE = "estancias_exterior";
private final String DRIVER = "com.mysql.jdbc.Driver";

//metodo de conexion
protected void conectarBase() throws SQLException, ClassNotFoundException{
	try {
		Class.forName(DRIVER);
		String urlBaseDeDatos = "jdbc:mysql://localhost:3306/" + DATABASE + "?useSSL=false";
		conexion = DriverManager.getConnection (urlBaseDeDatos, USER, PASSWORD);
		System.out.println("dbc");  //test conexion
	} catch (ClassNotFoundException | SQLException ex) {
		throw ex;
	}
}

//metodo de desconexion
protected void desconectarBase() throws Exception{
	try {
		if (resultado != null) {
			resultado.close();
		}
		if (sentencia != null) {
			sentencia.close();
		}
		if (conexion != null) {
			conexion.close();
		}
			System.out.println("dbd");	//test desconexion
	} catch (Exception e) {
		throw e;
	}
}

//metodos CRUD=(create, read, update, delete) 
protected void insertarModificarEliminar(String sql) throws Exception{
	try {
		conectarBase();
		sentencia = conexion.createStatement();
		System.out.println(sql);
		sentencia.executeUpdate(sql);
	} catch (SQLException | ClassNotFoundException ex) {
		// conexion.rollback();   // mas adelante se creara el rollback, SET autocommit = 1; COMMIT;
		
		throw ex;
	} finally {
		desconectarBase();
	}
}

protected void consultarBase(String sql) throws Exception{
	try {
		conectarBase();
		sentencia = conexion.createStatement();
		resultado = sentencia.executeQuery(sql);
	} catch (ClassNotFoundException | SQLException ex) {
		throw ex;
	}
}


}
