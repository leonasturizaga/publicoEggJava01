
package libreria.servicios;

import java.util.Collection;
import java.util.Scanner;
import libreria.entidades.Cliente;
import libreria.persistencia.ClienteDAO;

public class ClienteServicio {
private Scanner leerT = new Scanner(System.in).useDelimiter("\n");
private Scanner leerN = new Scanner(System.in).useDelimiter("\n");
private Scanner leerL = new Scanner(System.in).useDelimiter("\n");
private final ClienteDAO dao;

public ClienteServicio() {
	this.dao = new ClienteDAO();
}

public void mostrarClientePorId() throws Exception {
	System.out.println("Ingrese ID");
	int dato = leerN.nextInt();
	try {
	Cliente cliente = dao.buscarPorId(dato);
	System.out.println(cliente.getId());		
	} catch (Exception e) {
		//e.printStackTrace();
		System.out.println("error en buscar cliente por ID");
	}
}

public void mostrarClientePorDocumento() throws Exception {
	System.out.println("Ingrese Documento");
	long documento = leerL.nextInt();
	try {
	Cliente cliente = dao.buscarClientePorDocumento(documento);
	System.out.println(cliente.getId());		
	} catch (Exception e) {
		//e.printStackTrace();
		System.out.println("error en buscar cliente por documento");		
	}

}

public void mostrarClientesPorApellido() throws Exception {
	System.out.println("Ingrese apellido del cliente");
	String apellido = leerT.nextLine();
	Collection<Cliente> clientes = dao.buscarClientesPorApellido(apellido);
	for (Cliente cliente : clientes) {
		System.out.println(cliente.toString());
	}
}

public void mostrarClientes() throws Exception {
	Collection<Cliente> clientes = dao.mostrarClientes();
	for (Cliente cliente : clientes) {
		System.out.println(cliente.toString());
	}
}

public void crearCliente() {
	try {
		Cliente cliente = new Cliente();
		System.out.print("Ingrese Documento del cliente: ");
		cliente.setDocumento(leerL.nextLong());
		System.out.print("Ingrese Nombre del cliente: ");
		cliente.setNombre(leerT.nextLine());
		System.out.print("Ingrese Apellido del cliente: ");
		cliente.setApellido(leerT.nextLine());
		System.out.print("Ingrese Telefono del cliente: ");
		cliente.setTelefono(leerT.nextLine());
		System.out.println("");
		Cliente aux = new Cliente();
		try {
			aux = dao.buscarClientePorDocumento(cliente.getDocumento());
		} catch (Exception e) {
			//e.printStackTrace();
			System.out.println("verificacion de duplicidad de documento 'OK'");
		}

		if (aux.getId() == null) {
			dao.crearCliente(cliente);
			aux = dao.buscarClientePorDocumento(cliente.getDocumento());
			System.out.println("Cliente creado: " + aux.toString());			
		} else {
			System.out.println("Ya existe un cliente con ese documento");

		}

	} catch (Exception e) {
		System.out.println("Error en la creacion del cliente");
		e.printStackTrace();
	}
}

public void modificarCliente() throws Exception {
	System.out.println("Modificar por:  1) id, 2) documento");
	int var = leerN.nextInt();
	Cliente cliente = new Cliente();
	try {
		switch (var) {
			case 1:
				System.out.println("Ingrese Id");				
				int dato = leerN.nextInt();
				cliente = dao.buscarPorId(dato);
				break;
			case 2:
				System.out.println("Ingrese Documento");				
				long documento = leerT.nextLong();
				cliente = dao.buscarClientePorDocumento(documento);
				break;			
			default:
				System.out.println("ingrese una opcion valida");
		}
		if (cliente.getId() != null) {
		System.out.println("Datos actuales: ");
			System.out.println(cliente.toString());

		System.out.print("Ingrese nuevo Documento del cliente: ");
		cliente.setDocumento(leerL.nextLong());
		System.out.print("Ingrese nuevo Nombre del cliente: ");
		cliente.setNombre(leerT.nextLine());
		System.out.print("Ingrese nuevo Apellido del cliente: ");
		cliente.setApellido(leerT.nextLine());
		System.out.print("Ingrese nuevo Telefono del cliente: ");
		cliente.setTelefono(leerT.nextLine());
		System.out.println("");	
		
		dao.modificarCliente(cliente);			
		} else {
			System.out.println("no se encontro cliente con el valor ingresado");
		}
		
	} catch (Exception e) {
		e.printStackTrace();
		System.out.println("Error en la modificacion");
	}
}

public void eliminarCliente() throws Exception {
	System.out.println("Eliminar por:  1) id, 2) nombre");
	int var = leerN.nextInt();
	Cliente cliente = new Cliente();
	
	try {
		switch (var) {
			case 1:
				System.out.println("Ingrese Id");				
				int dato = leerN.nextInt();
				cliente = dao.buscarPorId(dato);
				System.out.println(cliente.toString());
				break;
			case 2:
				System.out.println("Ingrese Documento");				
				long documento = leerT.nextLong();
				cliente = dao.buscarClientePorDocumento(documento);
				System.out.println(cliente.toString());
				break;			
			default:
				System.out.println("ingrese una opcion valida");
		}
		System.out.print("");
		System.out.println("Confirma eliminar SI/NO");
		String salir = leerT.nextLine();			
		if (salir.equalsIgnoreCase("SI")) {
			dao.eliminarCliente(cliente);
		} else {
			System.out.println("no se realizaron cambios");
		}
		
	} catch (Exception e) {
		//e.printStackTrace();
		System.out.println("Error al eliminar la cliente");
	}
}

}
