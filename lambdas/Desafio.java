package lambdas;

import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class Desafio {

	public static void main(String[] args) {
		
		Produto p = new Produto("iPad", 3235.89, 0.13);
		
		/*
		 1. A partir do produto calcular o preco real (com desconto)
		 2. Imposto Municipal: >= 2500 (8,5%)/ < 2500 (isento)
		 3. Frete: >= 3000 (100)/ < 3000(50)
		 4. Arredondar : Deixar duas casas decimais
		 5. Formatar : R$1234,56
		 */
		
		Function<Produto, Double> precoComDesconto = produto ->{
			
			return produto.preco * (1 - produto.desconto);
		};
		
		UnaryOperator<Double> impostoMunicipal = preco ->{
			
			if(preco >= 2500) {
				return preco + (preco * 0.085);
			}else {
				return preco;
			}
		};
		
		UnaryOperator<Double> frete = preco ->{
			
			if(preco >= 3000) {
				return preco + 100;
			}else {
				return preco + 50;
			}
		};
		
		UnaryOperator<Double> arredondar = preco ->{
			
			return Double.parseDouble(String.format("%.2f", preco));
		};
		
		Function<Double, String> formatar = preco ->{
			
			return ("R$" + preco).replace(".", ",");
		};
		
		String preco = precoComDesconto.andThen(impostoMunicipal).andThen(frete).andThen(arredondar).andThen(formatar).apply(p);
	}
}
