/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jogo_mortal_kombat;

/**
 *
 * @author Thiago mota
 */
public class Jogo_Mortal_Kombat {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
                          MortalKombat lutador = new MortalKombat("Raiden", "Chapel", 90);
	     MortalKombat lutadorAdversario = new MortalKombat ("Sub-Zero", "Gelo", 15);

	    Round round1 = new Round();
	    
	    System.out.println("Seu Lutador:");
	    lutador.imprimiLutador();
	    System.out.println("Lutador Adversário");
	    lutadorAdversario.imprimiLutador();
	    
	    round1.lutador(lutador.getNome(),lutador.getgolpe());
	    round1.lutadorAdversario(lutadorAdversario.getNome(),lutadorAdversario.getgolpe());
	    
	    round1.startBattle();
	    
	    
	    
	
	}

}

    
    

