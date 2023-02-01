package oo.heranca.desafio;

public interface Esportivo {

	void ligarTurbo();
	void desligarTurbo();
	
	default int velocidadeAr() {
		return 1;
	}
}
