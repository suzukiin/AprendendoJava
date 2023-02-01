package desafioModulo;

public class Jantar {
	
	public static void main(String[] args) {
		Pessoa pessoa1 = new Pessoa("Lucas", 62.0);
		Comida comida1 = new Comida("Lasanha", 0.1);
		
		System.out.println(pessoa1.apresentar());
		pessoa1.comer(comida1);
		System.out.println(pessoa1.apresentar());
	}
}
