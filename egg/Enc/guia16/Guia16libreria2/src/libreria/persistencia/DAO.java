
package libreria.persistencia;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public abstract class DAO<T> {
	
    protected final EntityManagerFactory emf = Persistence.createEntityManagerFactory("Guia16libreria2PU");
    protected EntityManager em = emf.createEntityManager();

//conectar a base de datos	 
    protected void conectar() {
        if (!em.isOpen()) {
            em = emf.createEntityManager();
        }
    }		
//desconectar de base de datos
    protected void desconectar() {
        if (em.isOpen()) {
            em.close();
        }
    }

    protected void guardar(T objeto){
        conectar();
        em.getTransaction().begin();
        em.persist(objeto);
        em.getTransaction().commit();
        desconectar();
    }
    
    protected void editar(T objeto){
        conectar();
        em.getTransaction().begin();
        em.merge(objeto);
        em.getTransaction().commit();
        desconectar();
    }
    
    protected void eliminar(T objeto){
        conectar();
        em.getTransaction().begin();
        em.remove(objeto);
        em.getTransaction().commit();
        desconectar();
    }
}
