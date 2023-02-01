package Streams;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class ImprimindoObjetos {

	public static void main(String[] args) {
		
		List<String> aprovados = Arrays.asList("Lu", "Gui", "Lucas", "Ana");
		
		/*USANDO FOR COMUM
		for(int i =0; i < aprovados.size(); i++) {
			System.out.println(aprovados.get(i));
		}
		*/
		
		
		/*USANDO FOREACH
		for(String nome: aprovados) {
			System.out.println(nome);
		}
		*/
		
		/*USANDO ITERATOR
		Iterator<String> it = aprovados.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		*/
		
		
		Stream<String> stream = aprovados.stream();
		stream.forEach(System.out::println);
		
	}
}
