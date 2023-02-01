package oo.composicao.desafioComposicao;

public class ClienteTesete {

	public static void main(String[] args) {
		
		Cliente cliente1 = new Cliente("Maria Julia");
		Compra compra1 = new Compra();
		
		compra1.adicionarItem(new Produto("Caneta", 9.67), 100);
		compra1.adicionarItem(new Produto("Notebook", 1897.88) ,2);
		
		System.out.println(cliente1.obterValorTotal());
	}
}
