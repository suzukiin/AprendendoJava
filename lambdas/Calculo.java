package lambdas;

@FunctionalInterface

public interface Calculo {
	// só pode ter um método na interface funcional
	double executar(double a, double b);
	
	default String lega() {
		return "Legal";
	}
	
	static String muitoLegal() {
		return "Muito legal";
	}
}
