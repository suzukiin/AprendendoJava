package lambdas;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;

public class OperadorBinario {

	public static void main(String[] args) {
		
		BinaryOperator<Double> media = ( n1,  n2) -> {
			
			return (n1 + n2) / 2;
		};
		
		System.out.println(media.apply(9.8, 5.7));
		
		BiFunction<Double, Double, String> resultado = (n1, n2) -> {
			double notaFinal = (n1 + n2) / 2;
			
			return notaFinal >= 7 ? "Aprovado" : "Reprovado";
		};
		
		System.out.println(resultado.apply(5.8, 7.8));
		
		Function<Double, String> conceito = m -> {
			
			return m >= 7 ? "Aprovado" : "Reprovado";
		};
		
		System.out.println(media.andThen(conceito).apply(5.9, 9.5));
	}
}