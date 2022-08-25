package fundamentos;

public class Temperatura {
	
	public static void main(String[] args) {
		
		// (f - 32) * 5/9 = c
		
		double F = 83;
		
		double c = (F - 32) * 5/9.0;
		
		System.out.println("Resultado: " + c);
	}
}
