package colecoes;

import java.util.ArrayList;

public class Lista {

	public static void main(String[] args) {
		  
		ArrayList<Usuario> lista = new ArrayList<>();
		
		Usuario u1 = new Usuario("Ana");
		
		lista.add(u1);
		lista.add(new Usuario("Carlos"));
		lista.add(new Usuario("João"));
		lista.add(new Usuario("Nelso"));
		
		System.out.println(lista.get(3).nome);
		for(Usuario u: lista) {
			System.out.println(u);
		}
		
		
	}
}
