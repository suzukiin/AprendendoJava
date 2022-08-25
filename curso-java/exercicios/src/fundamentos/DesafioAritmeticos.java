package fundamentos;

public class DesafioAritmeticos {
	
	public static void main(String[] args) {
		
		int num1 = (6*(3+2));
		int num1p = (int) Math.pow(num1, 2) / (3*2);
		System.out.println(num1p);
		
		
		int num2 = ((1-5)*(2-7))/ 2;
		int num2p = (int) Math.pow(num2, 2);
		System.out.println(num2p);
		
		int res = (num1p - num2p);
		int resp = (int) (Math.pow(res, 3))/ (int)Math.pow(10, 3);
		System.out.println(resp);
	}
}
