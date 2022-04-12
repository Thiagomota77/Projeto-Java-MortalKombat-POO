
package jogo_mortal_kombat;


public class MortalKombat {
    
    private String Nome;
	private String tipo;
	private int nivel;
	private int golpe = 60;
	private int ataques;
	private int defesas;
	
	public  MortalKombat(String Nome, String tipo, int nivel) {
		this.Nome = Nome;
		this.tipo = tipo;
		this.nivel = nivel;
		
	calcularparametros();
                     calculagolpe();
                     
		
	}
	public String getNome(){
		return this.Nome;
		
	}
	
	public int getgolpe() {
		return this.golpe;
	}
	
	public int getataques() {
		return this.ataques;
	}
	
	public int getdefesas() {
		return this.defesas;
	}
	
	private void calcularparametros() {
		switch (tipo) {
		
		case "chapel":
			golpe = golpe - 10;
			ataques = 30;
            defesas = 5;
            
            break;
    
		case "Sub-Zero":
			golpe = - 50;
			ataques = 60;
			defesas = 40;
			
			break;
			
		case "Scopion":
			golpe =  + 20;
			ataques = 15;
			defesas = 0;
			
			break;
			
		case "Jade":
			golpe = - 50;
			ataques = 80;
			defesas = 100;
			
			break;
			
		}
	}
	
	private void calculagolpe() {
		
			golpe = golpe +(nivel / 2);
			ataques = ataques + (nivel / 2);
			defesas = defesas + (nivel / 2);
	}
	
	public void imprimiLutador() {
		
		System.out.println(
				"Nome:" + Nome + "|" +
		        "Tipo:" + tipo + "|" +
				"Nivel:" + nivel + "|" +
		        "Golpes:" + golpe + "|" +
				"Ataques:" + ataques + "|" +
		        "Defesas:" + defesas + "\n" );
		
	
 }
	
}

	


		        
				
						
						
			
			
			
				
			
		
			
	
		
	
	




