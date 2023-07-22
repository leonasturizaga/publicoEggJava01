
package libreria;

import java.util.Collection;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import libreria.entidades.Autor;
import libreria.entidades.Libro;


public class Menu {

public void ejecutar(){
	try {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("Guia16libreriaPU");
		EntityManager em = emf.createEntityManager();
		
		////////////////// INSERT ////////////////
//		try {
//			//crear Autor
//			Autor autor1 = new Autor();
//			autor1.setId(1);
//			autor1.setNombre("Primer autor");
//			autor1.setAlta(true);
//			
//			em.getTransaction().begin();
//			em.persist(autor1);      //comando persist(objeto) para guardar el objeto
//			em.getTransaction().commit();
//			
//			Autor autor2 = new Autor();
//			autor2.setId(2);
//			autor2.setNombre("Segundo autor");
//			autor2.setAlta(true);	
//
//			em.getTransaction().begin();
//			em.persist(autor2);
//			em.getTransaction().commit();
//			
//			//crear Editorial
//			Editorial editorial1 = new Editorial();
//			editorial1.setId(1);
//			editorial1.setNombre("Primera editorial");
//			editorial1.setAlta(true);
//			
//			em.getTransaction().begin();
//			em.persist(editorial1);   
//			em.getTransaction().commit();
//			
//			Editorial editorial2 = new Editorial();
//			editorial2.setId(2);
//			editorial2.setNombre("Segunda editorial");
//			editorial2.setAlta(true);	
//
//			em.getTransaction().begin();
//			em.persist(editorial2);
//			em.getTransaction().commit();	
//
//			//crear Libro con relaciones
//			Libro libro1 = new Libro();
//			libro1.setTitulo("titulo 01");
//			libro1.setAnio(2001);
//			libro1.setEjemplares(10);
//			libro1.setEjemplaresPrestados(1);
//			libro1.setEjemplaresRestantes(9);
//			libro1.setAlta(true);
//			libro1.setAutor(autor2);
//			libro1.setEditorial(editorial1);
//				
//			em.getTransaction().begin();
//			em.persist(libro1);      
//			em.getTransaction().commit();		
//			
//			Libro libro2 = new Libro();
//			libro2.setTitulo("titulo 01");
//			libro2.setAnio(2001);
//			libro2.setEjemplares(10);
//			libro2.setEjemplaresPrestados(1);
//			libro2.setEjemplaresRestantes(9);
//			libro2.setAlta(true);
//			libro2.setAutor(autor1);
//			libro2.setEditorial(editorial2);
//				
//			em.getTransaction().begin();
//			em.persist(libro2);      
//			em.getTransaction().commit();				
//		
//		} catch (Exception e) {
//			System.out.println("Error de sistema");
//		}
		
		////////////////// CONSULTAS /////////////////
		
		// Buscar Autor por criterio
		int id = 2;
		Autor autor3 = (Autor) em.createQuery("SELECT a FROM Autor a WHERE a.id = :id").setParameter("id", id).getSingleResult();
		
		//buscar Autor por id
		Autor autor4 = em.find(Autor.class, autor3.getId());
		System.out.println("id: "+ autor4.getId() + ", " + autor4.getNombre());
		
		//Lista de Autores
		Collection<Autor> autores = em.createQuery("SELECT a FROM Autor a ").getResultList();
		
		//Recorrer e imprimir los autores
		for (Autor autore : autores) {
			System.out.println(autore.getId() + ", " + autore.getNombre());
		}

		//buscar un Libro
		int isbn = 1;
		Libro libro3 = (Libro) em.createQuery("SELECT l FROM Libro l WHERE l.isbn = :isbn").setParameter("isbn", 2).getSingleResult();

		System.out.println(libro3.toString());

		//buscar un libro con codigo inexistente
		try {
			Libro libro4 = (Libro) em.createQuery("SELECT l FROM Libro l WHERE l.isbn = :isbn").setParameter("isbn", 20).getSingleResult();

			System.out.println(libro4.toString());

		} catch (Exception e) {
			System.out.println("No se encontro libro con el parametro indicado");
		}
		
		//////////// MODIFICAR  ///////////
		try {
			//buscar autor por criterio
			int param=1;
			String qlString = "SELECT a FROM Autor a WHERE a.id = :param";
			Autor autor5 = (Autor) em.createQuery(qlString).setParameter("param", param).getSingleResult();
			
			//modificar nombre  se usa em.merge(objeto)
			autor5.setNombre("nuevo nombre5");
			
			em.getTransaction().begin();
			em.merge(autor5);
			em.getTransaction().commit();
			
			System.out.println(autor5.toString());
			
		} catch (Exception e) {
			System.out.println("error en la modificacion");
		}
		
		////////// ELIMINAR /////////////
		
			//crear Autor para elmimarlo
			Autor autor6 = new Autor();
			autor6.setId(100);
			autor6.setNombre("autor 100 ");
			autor6.setAlta(true);	
			
			em.getTransaction().begin();
			em.persist(autor6);      
			em.getTransaction().commit();
			
			System.out.println(autor6.toString());
			
		try {
			//buscar autor
			int param=100;
			String qlString = "SELECT a FROM Autor a WHERE a.id = :param";
			Autor autor7 = (Autor) em.createQuery(qlString).setParameter("param", param).getSingleResult();
			
			em.getTransaction().begin();
			em.remove(autor7);
			em.getTransaction().commit();
			System.out.println("Autor " + param + "eliminado");
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("error en eliminar por parametro");
		}
		
		
	} catch (Exception e) {
		e.printStackTrace();
		System.out.println("error de sistema");
	}	
}
	
}
