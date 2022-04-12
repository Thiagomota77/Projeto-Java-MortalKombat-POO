

package jogo_mortal_kombat;


public class Round {
    
private int lutadorgolpe;
	private int lutadorAdversariogolpe;
	private String lutadorNome;
	private String lutadorAdversarioNome;
	
	public void lutador(String Nome, int golpe) {
		this.lutadorgolpe = golpe;
		this.lutadorNome = Nome;
		
	}
	
	public void lutadorAdversario(String Nome, int golpe) {
		this.lutadorAdversariogolpe = golpe;
		this.lutadorAdversarioNome = Nome;
		
	}
	
	public void startBattle() {
		
		System.out.println("fight.......");
		System.out.println("\n");
		System.out.println("\n");
		System.out.println("\n");
		
		if(lutadorgolpe > lutadorAdversariogolpe){
			
			System.out.println("  win " +  lutadorNome);
			
		}else {
			System.out.println(" Fatality: " + lutadorAdversarioNome );
		}
	}
	
			
	
		
		
		
		
		
		
	}
	


