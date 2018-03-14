package persistence;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;
import model.Clube;
import model.Gol;
import static persistence.DaoGenerico.nomePU;

public class ClubeDAO {
    
    public static List<Clube> listar(){
        EntityManagerFactory emf =
            javax.persistence.Persistence.createEntityManagerFactory( nomePU );
        EntityManager em = emf.createEntityManager();
        Query q = em.createQuery("SELECT c FROM Clube c ORDER BY c.nome");
        return q.getResultList();
    }
    
    public List<Clube> buscarClubePeloNome(String nome) {
        EntityManagerFactory emf =
            javax.persistence.Persistence.createEntityManagerFactory( nomePU );
        EntityManager em = emf.createEntityManager();
        Query q = em.createQuery("SELECT c FROM Clube c WHERE c.nome = " + nome );
        return q.getResultList();
    }
}
