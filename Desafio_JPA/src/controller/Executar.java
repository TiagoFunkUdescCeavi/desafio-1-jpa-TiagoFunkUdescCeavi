package controller;

import model.Arbitro;
import model.Clube;
import model.Estadio;
import model.Gol;
import model.Jogador;
import persistence.DaoGenerico;

public class Executar {
    
    public static void main(String[] args) {
        Clube c = new Clube( 10L, "Barcelona", "1889" );
        Gol g1 = new Gol( 20L, 15, "Barcelona");
        Gol g2 = new Gol( 21L, 30, "Real Madrid");
        Estadio e = new Estadio( 30L , "Camp Nou", "Barcelona, Espanha");
        Jogador j = new Jogador( 40L , "Leo Messi", "Ponta" );
        Arbitro a = new Arbitro( 50L, "Felix Brich", "Alemanha");
        
        j.getListaGols().add( g1 );
        j.getListaGols().add( g2 );
        
        DaoGenerico.salvar( g1 );
        DaoGenerico.salvar( g2 );
        
        DaoGenerico.salvar( j );
        
        DaoGenerico.salvar( c );
        DaoGenerico.salvar( e );
        DaoGenerico.salvar( a );
    }
}
