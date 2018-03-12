package controller;

import model.Arbitro;
import model.Clube;
import model.Estadio;
import model.Gol;
import model.Jogador;
import persistence.ArbitroDAO;
import persistence.ClubeDAO;
import persistence.DaoGenerico;
import persistence.EstadioDAO;
import persistence.GolDao;
import persistence.JogadorDAO;

public class Executar {
    
    public static void main(String[] args) {
        Clube c1 = new Clube( "Barcelona", "1889" );
        Clube c2 = new Clube( "Real Madrid", "1901" );
        
        Gol g1 = new Gol( 15, "Barcelona");
        Gol g2 = new Gol( 30, "Barcelona");
        
        Estadio e1 = new Estadio( "Camp Nou", "Barcelona, Espanha");
        Estadio e2 = new Estadio( "Novo, Camp Nou", "Barcelona, Espanha");
        
        Jogador j1 = new Jogador( "Leo Messi", "Ponta" );
        Jogador j2 = new Jogador( "Cristiano Ronaldo", "Atacante" );
        
        Arbitro a = new Arbitro( "Felix Brich", "Alemanha");
        
        c1.getListaJogadores().add( j1 );
        c2.getListaJogadores().add( j2 );
        
        j1.getListaGols().add( g1 );
        j1.getListaGols().add( g2 );
        
        e1.setClube( c1 );
        e2.setClube( c1 );
        
        DaoGenerico.salvar( g1 );
        DaoGenerico.salvar( g2 );
        
        DaoGenerico.salvar( j1 );
        DaoGenerico.salvar( j2 );
        
        DaoGenerico.salvar( c1 );
        DaoGenerico.salvar( c2 );
        
        DaoGenerico.salvar( e1 );
        DaoGenerico.salvar( e2 );        
        
        DaoGenerico.salvar( a );

        for( Gol g : GolDao.listar() ){
            System.out.println( g.toString() );
        }
        
        for( Arbitro ar : ArbitroDAO.listar() ){
            System.out.println( ar.toString() );
        }
        
        for( Jogador j : JogadorDAO.listar() ){
            System.out.println( j.toString() );
        }
        
        for( Estadio es : EstadioDAO.listar() ){
            System.out.println( es.toString() );
        }
        
        for( Clube c : ClubeDAO.listar() ){
            System.out.println( c.toString() );
        }
    }
}
