package fundamentos;

import java.util.Scanner;

public class TipoString {

	public static void main(String[] args) {
		
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Escreva algo");
		String nome = entrada.nextLine();
		System.out.println("Nome = " + nome);
	}
	
}
