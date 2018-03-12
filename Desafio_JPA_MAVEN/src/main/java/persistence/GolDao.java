package persistence;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;
import model.Gol;

public class GolDao extends DaoGenerico{
    
    public static List<Gol> listar(){
        EntityManagerFactory emf =
            javax.persistence.Persistence.createEntityManagerFactory( nomePU );
        EntityManager em = emf.createEntityManager();
        Query q = em.createQuery("SELECT g FROM Gol g ORDER BY g.time");
        return q.getResultList();
    }
    
    public List<Gol> buscarDebitoByTipo(String time) {
        EntityManagerFactory emf =
            javax.persistence.Persistence.createEntityManagerFactory( nomePU );
        EntityManager em = emf.createEntityManager();
        Query q = em.createQuery("SELECT g FROM Gol g WHERE g.time = " + time );
        return q.getResultList();
    }
    
}
