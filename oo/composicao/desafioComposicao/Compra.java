package oo.composicao.desafioComposicao;

import java.util.ArrayList;
import java.util.List;

public class Compra {

	List<Item> itens = new ArrayList<>();
	
	void adicionarItem(Produto p, int qtde) {
		this.itens.add(new Item(p, qtde));
	}
	void adicionarItem(String nome, double preco, int qtde) {
		var produto = new Produto(nome, preco);
		this.itens.add(new Item(produto, qtde));
	}
	
	double valorTotal() {
		double total = 0;
		
		for(Item item : itens) {
			total += item.qtde * item.produto.preco;
			
		}
		return total;
	}
}
