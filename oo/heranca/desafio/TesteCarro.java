package oo.heranca.desafio;

public class TesteCarro {

	public static void main(String[] args) {
		
		Carro carroGenerico = new Carro(212);
		Ferrari ferrari = new Ferrari();
		
		System.out.println("Velocidade do carro genérico => " + carroGenerico.velocidadeAtual);
		System.out.println("Velocidade da Ferrari => " + ferrari.velocidadeAtual);
		
		ferrari.acelerar();
		ferrari.acelerar();
		ferrari.acelerar();
		ferrari.acelerar();
		ferrari.acelerar();
		carroGenerico.acelerar();
		carroGenerico.acelerar();
		carroGenerico.acelerar();
		carroGenerico.acelerar();
		carroGenerico.acelerar();
		
		System.out.println("Velocidade do carro genérico => " + carroGenerico.velocidadeAtual);
		System.out.println("Velocidade da Ferrari => " + ferrari.velocidadeAtual);
	}
}
