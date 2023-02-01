package colecoes;



import java.util.SortedSet;
import java.util.TreeSet;

public class ConjuntoComportado {

	public static void main(String[] args) {
		
		//Set<String> lista = new HashSet<>();
		SortedSet<String> lista = new TreeSet<>();
		lista.add("Lucas");
		lista.add("João");
		lista.add("Ana");
		lista.add("Maria");
		
		for(String candidato: lista) {
			System.out.println(candidato);
		}
	}
}
