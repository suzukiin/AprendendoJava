package arrays;

import java.util.Scanner;
public class Matriz {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Quantos alunos? ");
		int qtdeAlunos = entrada.nextInt();
		
		System.out.println("Quantas notas por aluno? ");
		int qtdeNotas = entrada.nextInt();
		
		double [][] notasDaTurma = new double [qtdeAlunos][qtdeNotas];
		double total = 0;
		for(int i = 0; i < notasDaTurma.length; i ++) {
			for(int n =0; n < notasDaTurma[n].length; n++) {
				System.out.printf("Informe a nota %d do aluno %d:", n, i);
				notasDaTurma[i] [n] = entrada.nextDouble();
				total+= notasDaTurma[i][n];
				
			}
		}
		double media = total/(qtdeAlunos * qtdeNotas);
		System.out.println("Média da turma é:" + media);
		entrada.close();
	}
}
