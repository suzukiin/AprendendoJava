package Polimorfismo;

public class Jantar {


	public static void main(String[] args) {
		
		Pessoa convidado = new Pessoa(62);
		
		Arroz ingrediente1 = new Arroz(0.250);
		Feijao ingrediente2 = new Feijao(0.180);
		Sorvete ingrediente3 = new Sorvete(0.400);
		
		Arroz ingrediente4 = new Arroz(0.3);
		
		System.out.println(convidado.getPeso());
		
		convidado.comer(ingrediente1);
		convidado.comer(ingrediente2);
		convidado.comer(ingrediente3);
		convidado.comer(ingrediente4);
		
		System.out.println(convidado.getPeso());
	}
}
