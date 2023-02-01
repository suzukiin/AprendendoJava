package desafioModulo;

public class Pessoa {

	String nome;
	double peso;
	
	Pessoa(String nome, double peso){
		this.nome = nome;
		this.peso = peso;
	}
	
	void comer(Comida comida) {
		this.peso += comida.peso;
	}
	
	String apresentar() {
		return "Ola sou " + nome + " e tenho " + peso + "kgs.";
	}
}
