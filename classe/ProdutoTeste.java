package classe;

public class ProdutoTeste {

	public static void main(String[] args) {
		
		Produto p1 = new Produto("Notebook");
		p1.preco = 2300.99;
		
		Produto p2 = new Produto("Celular");
		p2.preco = 1500;
		
		System.out.println(p1.precoComDesconto());
		System.out.println(p2.precoComDesconto());
	}
}
