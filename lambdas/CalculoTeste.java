package lambdas;

public class CalculoTeste {

	public static void main(String[] args) {
		
		Calculo calculo = new Soma();
		System.out.println(calculo.executar(1,3));
		
		calculo = new Multiplicar();
		System.out.println(calculo.executar(1,3));
		
		
	}
}
