package arrays;

import java.util.Arrays;

public class Exercicio {

	public static void main(String[] args) {
		
		double[] notasAlunoA  = new double[3];
		notasAlunoA[0] = 7.9;
		notasAlunoA[1] = 8.9;
		notasAlunoA[2] = 9.0;
		
		String teste = Arrays.toString(notasAlunoA);
		System.out.println(teste);
		
		double total = 0;
		for(int i = 0; i < notasAlunoA.length; i++) {
			total += notasAlunoA[i];
		}
		System.out.println(total/3);
	}
}
