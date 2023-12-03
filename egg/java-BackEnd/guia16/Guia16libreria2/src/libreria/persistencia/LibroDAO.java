
package libreria.persistencia;

import java.util.Collection;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import libreria.entidades.Autor;
import libreria.entidades.Editorial;
import libreria.entidades.Libro;



public final class LibroDAO extends DAO<Libro> {

//    private final EntityManagerFactory emf = Persistence.createEntityManagerFactory("Guia16libreria2PU");
//    private EntityManager em = emf.createEntityManager();
//
////conectar a base de datos	 
//    public void conectar() {
//        if (!em.isOpen()) {
//            em = emf.createEntityManager();
//        }
//    }		
////desconectar de base de datos
//    public void desconectar() {
//        if (em.isOpen()) {
//            em.close();
//        }
//    }

//buscar Libro por id
    public Libro buscarPorId(long id) throws Exception {
        conectar();
        Libro libro = em.find(Libro.class, id);
        desconectar();
        return libro;
    }	 
	 
// Buscar Libro por criterio, Ejm criterio=titulo
public Libro buscarPorTitulo(String titulo) throws Exception {
	conectar();
	Libro libro = (Libro) em.createQuery("SELECT a FROM Libro a WHERE a.titulo = :titulo").setParameter("titulo", titulo).getSingleResult();
	desconectar();
	return libro;
}
public Collection<Libro> buscarLibrosPorTitulo(String titulo) throws Exception {
	conectar();
	Collection<Libro> libros = em.createQuery("SELECT a FROM Libro a WHERE a.titulo = :titulo").setParameter("titulo", titulo).getResultList();
	desconectar();
	return libros;
}

//buscar lista de Libros
public Collection<Libro> mostrarContenido() {
	conectar();
	String qlString = "SELECT t1 FROM Libro t1";
	Collection<Libro> libros = em.createQuery(qlString).getResultList();
	desconectar();
	return libros;
}

//crear Libro mediante un objeto, persist
public void crearLibro(Libro libro){
        conectar();
	if (!em.contains(libro)) {
		libro = em.merge(libro);
	}
        em.getTransaction().begin();
        em.persist(libro);
        em.getTransaction().commit();
        desconectar();	
}

//modificar Libro mediante un objeto, merge
public void modificarLibro(Libro libro){
        conectar();
        em.getTransaction().begin();
        em.merge(libro);
        em.getTransaction().commit();
        desconectar();		
}

//Eliminar Libro mediante objeto, remove
public void eliminarLibro(Libro libro) {
	conectar();
	if (!em.contains(libro)) {
		libro = em.merge(libro);
	}
	em.getTransaction().begin();
	em.remove(libro);
	em.getTransaction().commit();
	desconectar();
}
	 
public Autor buscarAutorPorNombre(String nombre) throws Exception {
	conectar();
	Autor autor = (Autor) em.createQuery("SELECT a FROM Autor a WHERE a.nombre = :nombre").setParameter("nombre", nombre).getSingleResult();
	desconectar();
	return autor;
}

public void altaNuevoAutor(String nombre){
	AutorDAO obj = new AutorDAO();
	int idAutor = obj.autorIdMax()+1;
	Autor autor = new Autor();
	autor.setId(idAutor);
	autor.setNombre(nombre);
	obj.crearAutor(autor);
}
public Editorial buscarEditorialPorNombre(String nombre) throws Exception {
	conectar();
	Editorial editorial = (Editorial) em.createQuery("SELECT a FROM Editorial a WHERE a.nombre = :nombre").setParameter("nombre", nombre).getSingleResult();
	desconectar();
	return editorial;
}
public void altaNuevaEditorial(String nombre){
	EditorialDAO obj = new EditorialDAO();
	int idEditorial = obj.editorialIdMax()+1;
	Editorial editorial = new Editorial();
	editorial.setId(idEditorial);
	editorial.setNombre(nombre);
	obj.crearEditorial(editorial);
}

}
