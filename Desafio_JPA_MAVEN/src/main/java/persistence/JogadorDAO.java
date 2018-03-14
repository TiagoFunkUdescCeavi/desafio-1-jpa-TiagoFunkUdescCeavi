package persistence;

import java.util.List;
import javax.management.Query;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;
import model.Jogador;
import static persistence.DaoGenerico.nomePU;

public class JogadorDAO {
    
    public static List<Jogador> listar(){
        EntityManagerFactory emf =
            javax.persistence.Persistence.createEntityManagerFactory( nomePU );
        EntityManager em = emf.createEntityManager();
        Query q = em.createQuery("SELECT j FROM Jogador j ORDER BY j.nome");
        return q.getResultList();
    }
    
    public List<Jogador> buscarJogadorPeloNome(String nome) {
        EntityManagerFactory emf =
            javax.persistence.Persistence.createEntityManagerFactory( nomePU );
        EntityManager em = emf.createEntityManager();
        Query q = em.createQuery("SELECT j FROM Jogador j WHERE j.nome = " + nome );
        return q.getResultList();
    }
    
}
