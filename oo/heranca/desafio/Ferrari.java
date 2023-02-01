package oo.heranca.desafio;

public class Ferrari extends Carro implements Esportivo {

	void acelerar () {
		velocidadeAtual += 15;
	}
	
	Ferrari(){
		super(315);
		
	}
	void frear() {
		velocidadeAtual -= 15;
	}
	
	public void ligarTurbo() {
		
	}
	
	public void desligarTurbo() {
		
	}
}
