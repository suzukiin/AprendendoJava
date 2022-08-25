package fundamentos;

import java.util.Scanner;

public class DesafioConversao {
	
	public static void main(String[] args) {
		
		Scanner read = new Scanner(System.in);
		
		//salario 1
		System.out.println("Digite o salario: ");
		String salario1 = read.next();
		salario1 = salario1.replace(",", ".");
		double sal_1 = Double.parseDouble(salario1);
		
		
		
		//salario 2
		System.out.println("Digite o salario: ");
		String salario2 = read.next();
		salario2 = salario2.replace(",", ".");
		double sal_2 = Double.parseDouble(salario2);
		
		
		
		//salario 3
		System.out.println("Digite o salario: ");
		String salario3 = read.next();
		salario3 = salario3.replace(",", ".");
		double sal_3 = Double.parseDouble(salario3);
		
		
		
		double media = ((sal_1 + sal_2 + sal_3) / 3);
		
		System.out.println("A media dos 3 salarios eh igual a: " + media);
		
		
		read.close();
	}
}
