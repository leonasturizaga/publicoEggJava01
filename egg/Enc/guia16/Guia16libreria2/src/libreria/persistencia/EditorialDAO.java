
package libreria.persistencia;

import java.util.Collection;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import libreria.entidades.Editorial;


public class EditorialDAO {


    private final EntityManagerFactory emf = Persistence.createEntityManagerFactory("Guia16libreria2PU");
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

//buscar Editorial por id
    public Editorial buscarPorId(int id) throws Exception {
        conectar();
        Editorial editorial = em.find(Editorial.class, id);
        desconectar();
        return editorial;
    }	 

// Buscar Editorial por criterio, Ejm criterio=nombre
public Editorial buscarPorNombre(String nombre) throws Exception {
	conectar();
	Editorial editorial = (Editorial) em.createQuery("SELECT a FROM Editorial a WHERE a.nombre = :nombre").setParameter("nombre", nombre).getSingleResult();
	desconectar();
	return editorial;
}

//buscar lista de Editoriales

public Collection<Editorial> mostrarContenido() {
	conectar();
	String qlString = "SELECT t1 FROM Editorial t1";
	Collection<Editorial> editoriales = em.createQuery(qlString).getResultList();
	desconectar();
	return editoriales;
}

//crear Editorial mediante un objeto, persist
public void crearEditorial(Editorial editorial){
        conectar();
        em.getTransaction().begin();
        em.persist(editorial);
        em.getTransaction().commit();
        desconectar();	
}

//modificar Editorial mediante un objeto, merge
public void modificarEditorial(Editorial editorial){
        conectar();
        em.getTransaction().begin();
        em.merge(editorial);
        em.getTransaction().commit();
        desconectar();		
}

//Eliminar Editorial mediante objeto, remove
public void eliminarEditorial(Editorial editorial) {
	conectar();
	if (!em.contains(editorial)) {
		editorial = em.merge(editorial);
	}
	em.getTransaction().begin();
	em.remove(editorial);
	em.getTransaction().commit();
	desconectar();
}	 
//buscar ID maximo
public int editorialIdMax(){
	conectar();
	int idMax=0;
	String qlString = "SELECT a FROM Editorial a ORDER BY a.id DESC";
	Collection<Editorial> editoriales = em.createQuery(qlString).getResultList();
	for (Editorial editoriale : editoriales) {
		if (editoriale.getId()>idMax) {
			idMax= editoriale.getId();
		}
	}
	desconectar();
	return idMax;
}


}
