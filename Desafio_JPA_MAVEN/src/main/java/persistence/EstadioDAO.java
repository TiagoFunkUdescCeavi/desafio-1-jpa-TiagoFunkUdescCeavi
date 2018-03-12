package persistence;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;
import model.Estadio;
import static persistence.DaoGenerico.nomePU;

public class EstadioDAO {
    
    public static List<Estadio> listar(){
        EntityManagerFactory emf =
            javax.persistence.Persistence.createEntityManagerFactory( nomePU );
        EntityManager em = emf.createEntityManager();
        Query q = em.createQuery("SELECT e FROM Estadio e ORDER BY e.nome");
        return q.getResultList();
    }
    
    public List<Estadio> buscarDebitoByTipo(String time) {
        EntityManagerFactory emf =
            javax.persistence.Persistence.createEntityManagerFactory( nomePU );
        EntityManager em = emf.createEntityManager();
        Query q = em.createQuery("SELECT e FROM Estadio e WHERE e.nome = " + time );
        return q.getResultList();
    }
}
