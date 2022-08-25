package fundamentos;

public class DesafioLogicos {
	
	public static void main(String[] args) {
		
		//trabalho na terca (v ou f)
		//trabalho na quinta (v ou f)
		//se apenas um trabalho = ir shopping e comprar tv de 32 polegadas
		//se os dois trabalhos = ir shopping e comprar tv de 50 polegadas
		//se os dois derem errado = vao ficar em casa
		
		 boolean trabalho1 = false;
		 boolean trabalho2 = false;
		 
		 if(trabalho1 == false && trabalho2 == false) {
			 System.out.println("Infelizmente voces ficaram em casa, com fome e sem TV nova");
		 }else {
			 
			 if(trabalho1 && trabalho2) {
				 System.out.println("Voces foram no shopping tomar sorvete e compraram a TV de 50 polegadas");
			 }else {
				 System.out.println("Voces foram no shopping tomar sorvete e compraram a TV de 32 polegadas");
			 }
		 }
		 
	}
}
