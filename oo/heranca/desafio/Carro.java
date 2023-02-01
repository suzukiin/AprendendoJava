package oo.heranca.desafio;

public class Carro {

	int velocidadeAtual;
	final int VELOCIDADE_MAXIMA;
	
	Carro(int velocidadeMaxima){
		VELOCIDADE_MAXIMA = velocidadeMaxima;
	}
	void acelerar() {
		if(velocidadeAtual + 5 > VELOCIDADE_MAXIMA) {
			velocidadeAtual = VELOCIDADE_MAXIMA;
		}else {
			velocidadeAtual += 5;
		}
		
	}
	
	void frear() {
		velocidadeAtual -= 5;
	}
}
