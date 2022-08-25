package fundamentos;

public class ConversaoTipoPrimitivoNumerico {

	public static void main(String[] args) {
		
		double a = 1; //implicita
		System.out.println(a);
		
		float b =(float) 1.12345; //explicita
		System.out.println(b); 
		
		int c = 11;
		byte d = (byte)c; //explicita
		System.out.println(d); 
		
		double e = 1;
		int f = (int) e; //explicita
		
		System.out.println(f);
	}
}
