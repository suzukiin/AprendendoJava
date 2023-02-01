package arrays;

import java.util.Scanner;
public class DesafioArray {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		double soma = 0;
		System.out.println("Digite a quantidade de notas:");
		int x = entrada.nextInt();
		double[] notas = new double [x];
		
		for(int i = 0; i < notas.length; i++) {
			System.out.println("Digite uma nota:");
			notas[i] = entrada.nextDouble();
		}
		
		for(double nota: notas) {
			soma += nota;
		}
		System.out.println("Média das notas: " + soma/notas.length);
		entrada.close();
	}
}
