package colecoes;

import java.util.HashSet;

public class Hash {

	public static void main(String[] args) {
		
		HashSet<Usuario> usuarios = new HashSet<>();
		
		usuarios.add(new Usuario("Lucas"));
		usuarios.add(new Usuario("Joao"));
		usuarios.add(new Usuario("Pedro"));
		
		boolean resultado = usuarios.contains(new Usuario("Lucas"));
		System.out.println(resultado);
		
	}
}
