
package jogo_mortal_kombat;


public class Jogo_Mortal_Kombat {


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

    
    

