
package libreria.persistencia;

import java.util.ArrayList;
import java.util.Collection;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import libreria.entidades.Autor;


public class AutorDAO {

    private final EntityManagerFactory emf = Persistence.createEntityManagerFactory("Guia16libreriaPU");
    private EntityManager em = emf.createEntityManager();

//conectar a base de datos	 
public void conectar() {
	if (!em.isOpen()) {
		em = emf.createEntityManager();
	}
}
//desconectar de base de datos
public void desconectar() {
	if (em.isOpen()) {
		em.close();
	}
}

//buscar Autor por id
public Autor buscarPorId(int id) throws Exception {
	conectar();
	Autor autor = em.find(Autor.class, id);
	desconectar();
	return autor;
}

public Autor buscarPorId2(int dato) {
	conectar();
	Autor autor = (Autor) em.createQuery("SELECT a FROM Autor a WHERE a.id = :dato").setParameter("dato", dato).getSingleResult();
	desconectar();
	return autor;
}

// Buscar Autor por criterio, Ejm criterio=nombre
public Autor buscarPorNombre(String nombre) throws Exception {
	conectar();
	Autor autor = (Autor) em.createQuery("SELECT a FROM Autor a WHERE a.nombre = :nombre").setParameter("nombre", nombre).getSingleResult();
	desconectar();
	return autor;
}

//buscar lista de Autores

public Collection<Autor> mostrarContenido() {
	conectar();
	String qlString = "SELECT t1 FROM Autor t1";
	Collection<Autor> autores = em.createQuery(qlString).getResultList();
	desconectar();
	return autores;
}

//crear Autor mediante un objeto, persist
public void crearAutor(Autor autor){
        conectar();
        em.getTransaction().begin();
        em.persist(autor);
        em.getTransaction().commit();
        desconectar();	
}

//modificar Autor mediante un objeto, merge
public void modificarAutor(Autor autor){
        conectar();
        em.getTransaction().begin();
        em.merge(autor);
        em.getTransaction().commit();
        desconectar();		
}

//Eliminar Autor mediante objeto, remove
public void eliminarAutor(Autor autor) {
	conectar();
	if (!em.contains(autor)) {
		autor = em.merge(autor);
	}
	em.getTransaction().begin();
	em.remove(autor);
	em.getTransaction().commit();
	desconectar();
}
public void eliminarAutor2(Autor autor) {
	conectar();
	String qlString = "SELECT a FROM Autor a WHERE a.id = :param";
	autor = (Autor) em.createQuery(qlString).setParameter("param", autor.getId()).getSingleResult();
	em.getTransaction().begin();
	em.remove(autor);
	em.getTransaction().commit();
	desconectar();
}

//buscar ID maximo
public int autorIdMax(){
	conectar();
	int idMax=0;
	String qlString = "SELECT a FROM Autor a ORDER BY a.id DESC";
	Collection<Autor> autores = em.createQuery(qlString).getResultList();
	for (Autor autore : autores) {
		if (autore.getId()>idMax) {
			idMax= autore.getId();
		}
	}
	desconectar();
	return idMax;
}

}
