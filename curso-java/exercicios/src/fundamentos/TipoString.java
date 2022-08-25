package fundamentos;

public class TipoString {
	
	public static void main(String[] args) {
		
		System.out.println("Olá pessoal".charAt(4));
		
		String s = "Boa tarde";
		s = s.toUpperCase();
		s= "Bom dia";
		System.out.println(s.concat("!!!"));
		System.out.println((s +"!!!"));
		System.out.println(s.startsWith("Bom"));
		System.out.println(s.endsWith("dia"));
		System.out.println(s.length());
		System.out.println(s.equals("Boa tarde"));
		System.out.println(s.equalsIgnoreCase("BOM DIA"));
		
		var nome = "Pedro";
		var sobrenome = "Santos";
		var idade = 33;
		var salario = 12345.987;
		
		System.out.println("Nome: " + nome + "\nSobrenome: " + sobrenome + "\nIdade: " + idade + "\nSalario: " + salario + "\n\n");
		
		System.out.printf("O senhor %s %s tem %d anos e ganha R$%.2f \n\n", nome, sobrenome, idade, salario);
		
		System.out.println("Frase qualquer".contains("qual"));
		System.out.println("Frase qualquer".indexOf("qual"));
		System.out.println("Frase qualquer".substring(6));
	}
}
