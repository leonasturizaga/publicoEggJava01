
package libreria.servicios;

import java.util.Collection;
import java.util.Date;
import java.util.Scanner;
import libreria.entidades.Cliente;
import libreria.entidades.Libro;
import libreria.entidades.Prestamo;
import libreria.persistencia.ClienteDAO;
import libreria.persistencia.LibroDAO;
import libreria.persistencia.PrestamoDAO;


public class PrestamoServicio {

private Scanner leerT = new Scanner(System.in).useDelimiter("\n");
private Scanner leerN = new Scanner(System.in).useDelimiter("\n");
private Scanner leerL = new Scanner(System.in).useDelimiter("\n");
private final PrestamoDAO dao;

public PrestamoServicio() {
	this.dao = new PrestamoDAO();
}

public void mostrarPrestamoPorId() throws Exception {
	System.out.println("Ingrese ID");
	int dato = leerN.nextInt();
	try {
	Prestamo prestamo = dao.buscarPorId(dato);
	System.out.println(prestamo.toString());		
	} catch (Exception e) {
		//e.printStackTrace();
		System.out.println("error en buscar prestamo por ID");
	}
}

public void mostrarPrestamosPorDocumento() throws Exception {
	System.out.println("Ingrese Documento");
	long documento = leerL.nextLong();
	try {
	Collection<Prestamo> prestamos = dao.mostrarPrestamos();
		for (Prestamo prestamo : prestamos) {
			if (prestamo.getCliente().getDocumento() == documento) {
				System.out.println(prestamo.toString());	
			}
		}
	} catch (Exception e) {
		//e.printStackTrace();
		System.out.println("error en buscar prestamo por documento");		
	}

}

public void mostrarPrestamos() throws Exception {
	Collection<Prestamo> prestamos = dao.mostrarPrestamos();
	for (Prestamo prestamo : prestamos) {
		System.out.println(prestamo.toString());
	}
}

public Date fecha(){
	//LocalDate date;
	int anio, mes, dia;
	System.out.print("Año: ");
	anio = leerN.nextInt();
		System.out.print("Mes: ");
	mes = leerN.nextInt();
		System.out.print("Dia: ");
	dia = leerN.nextInt();
	//date = LocalDate.of(anio,mes,dia);
	Date fecha = new Date(anio-1900, mes-1, dia);
	return fecha;
}

public void crearPrestamo() {
	try {
		int n=0;
		System.out.println("Ingrese Fecha del prestamo: ");		
		Date fechaPrestamo = fecha();
		//prestamo.setFechaPrestamo(fechaPrestamo);
		System.out.println("Ingrese fecha de devolucion del prestamo: ");
		Date fechaDevolucion = fecha();		
		
		Libro libro = new Libro();
		while (n < 3) {
			System.out.print("Ingrese Titulo del Libro: ");
			String titulo = leerT.nextLine();
			
			try {
				LibroDAO lib = new LibroDAO();
				libro = lib.buscarPorTitulo(titulo);
				n=3;
			} catch (Exception e) {
				n++;
				System.out.println("Titulo del libro no encontrado");
			}
		}

		System.out.print("Ingrese documento del cliente: ");
		Long documento = leerL.nextLong();
		Cliente cliente=new Cliente();
		try {
		ClienteDAO cli= new ClienteDAO();
		cliente = cli.buscarClientePorDocumento(documento);			
		} catch (Exception e) {
			System.out.println("Documento del cliente no encontrado");
		}
		System.out.println("");
		Prestamo prestamo = new Prestamo(fechaPrestamo, fechaDevolucion, libro, cliente);
		dao.guardar(prestamo);
		
		Prestamo aux = dao.buscarPorId(dao.prestamoIdMax());		
		if (aux.getId() != null) {
			System.out.println("Prestamo creado: " + aux.toString());			
		} else {
			System.out.println("error en la creacion");

		}

	} catch (Exception e) {
		System.out.println("Error en la creacion del prestamo");
		e.printStackTrace();
	}
}

public void modificarPrestamo() throws Exception {
	Prestamo prestamo = new Prestamo();
	try {
		System.out.println("Ingrese Id");
		int dato = leerN.nextInt();
		prestamo = dao.buscarPorId(dato);

		if (prestamo.getId() != null) {
			System.out.println("Datos actuales: ");
			System.out.println(prestamo.toString());
			System.out.println("Ingrese nueva fecha del prestamo: ");
			Date fechaPrestamo = fecha();
			//prestamo.setFechaPrestamo(fechaPrestamo);
			System.out.println("Ingrese nueva fecha de devolucion del prestamo: ");
			Date fechaDevolucion = fecha();

			System.out.print("Ingrese nuevo titulo del Libro: ");
			String titulo = leerT.nextLine();
			Libro libro = new Libro();
			try {
				LibroDAO lib = new LibroDAO();
				libro = lib.buscarPorTitulo(titulo);
			} catch (Exception e) {
				System.out.println("Titulo del libro no encontrado");
			}
			System.out.println();
			System.out.print("Ingrese nuevo documento del cliente: ");
			Long documento = leerL.nextLong();
			Cliente cliente = new Cliente();
			try {
				ClienteDAO cli = new ClienteDAO();
				cliente = cli.buscarClientePorDocumento(documento);
			} catch (Exception e) {
				System.out.println("Documento del cliente no encontrado");
			}
			System.out.println("");

			dao.editarPrestamo(prestamo);
			
		} else {
			System.out.println("no se encontro prestamo con el id ingresado");
		}

	} catch (Exception e) {
		e.printStackTrace();
		System.out.println("Error en la modificacion");
	}
}

public void eliminarPrestamo() throws Exception {
	try {

		System.out.println("Ingrese Id");
		int dato = leerN.nextInt();
		String salir;
		Prestamo prestamo = new Prestamo();
		try {
			prestamo = dao.buscarPorId(dato);
			if (prestamo.getId() != null) {
				System.out.println(prestamo.toString());
				System.out.println("Confirma eliminar SI/NO");
				salir = leerT.nextLine();
				if (salir.equalsIgnoreCase("SI")) {
					dao.eliminarPrestamo(prestamo);
				} else {
					System.out.println("no se realizaron cambios");
				}
			}
		} catch (Exception e) {
			System.out.println("Prestamo no encontrado");
		}
	} catch (Exception e) {
		//e.printStackTrace();
		System.out.println("Error al eliminar la prestamo");
	}
}


}
