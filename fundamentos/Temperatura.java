package fundamentos;

public class Temperatura {

	public static void main(String[] args) {
		
		double ajuste = 32;
		double fator = 5/9.0;
		double fahrenheint = 90;
		double celsius;
		
		celsius = (fahrenheint - ajuste)*fator;
		System.out.println(celsius);
	}
}
