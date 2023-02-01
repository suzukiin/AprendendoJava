package encapsulamento;

public class Pessoa {

	private String nome;
	private int idade;
	
	public Pessoa(int idade, String nome ) {
		setIdade(idade);
		setNome(nome);
	}
	
	
	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	//Getter
	public int getIdade() {
		return idade;
	}
	
	
	//Setter
	public void setIdade(int novaIdade) {
		if(novaIdade >= 0 && novaIdade <= 120) {
			this.idade = novaIdade;
		}
	
	}
	
	public String toString() {
		return "Olá eu sou o " + getNome() + " e tenho " + getIdade() + " anos";
	}
}
