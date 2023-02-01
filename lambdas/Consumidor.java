package lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Consumidor {

	public static void main(String[] args) {
		
		Consumer<Produto> imprimir = p -> System.out.println(p.nome + "!!!!");
		
		Produto p1 = new Produto("Caneta", 12.90, 0.09);
		Produto p2 = new Produto("Notebook", 1290, 0.15);
		Produto p3 = new Produto("Livro", 14.90, 0.20);
		Produto p4 = new Produto("Caderno", 24.90, 0.10);
		
		imprimir.accept(p1);
		
		List<Produto> produtos = Arrays.asList(p1, p2, p3, p4);
		
		produtos.forEach(imprimir);
		produtos.forEach(p -> System.out.println(p.nome));
	}
}
