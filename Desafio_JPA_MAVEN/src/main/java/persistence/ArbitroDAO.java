package persistence;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;
import model.Arbitro;
import static persistence.DaoGenerico.nomePU;

public class ArbitroDAO {
    
    public static List<Arbitro> listar(){
        EntityManagerFactory emf =
            javax.persistence.Persistence.createEntityManagerFactory( nomePU );
        EntityManager em = emf.createEntityManager();
        Query q = em.createQuery("SELECT a FROM Arbitro a ORDER BY a.nome");
        return q.getResultList();
    }
    
    public List<Arbitro> buscarDebitoByTipo(String nome) {
        EntityManagerFactory emf =
            javax.persistence.Persistence.createEntityManagerFactory( nomePU );
        EntityManager em = emf.createEntityManager();
        Query q = em.createQuery("SELECT a FROM Arbitro a WHERE a.nome = " + nome );
        return q.getResultList();
    }
}
