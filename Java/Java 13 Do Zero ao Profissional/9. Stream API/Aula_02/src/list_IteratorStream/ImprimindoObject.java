package list_IteratorStream;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class ImprimindoObject {
	
	public static void main(String[] args) {
		
		List<String> aprovados = Arrays.asList("Lu", "Gui", "Luca", "Ana");
		
		
		System.out.println("Usando FOR i++");
		for (int i = 0; i < aprovados.size(); i++) {
			System.out.println(aprovados.get(i));
		}
		
		System.out.println("\nUsando FOREACH");
		for (String nome : aprovados) {
			System.out.println(nome);
		}
		
		System.out.println("\nUsando WHILE ITERATOR");
		Iterator<String> it = aprovados.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());			
		}
		
		System.out.println("\nUsando STREAM");
		Stream<String> st = aprovados.stream();
		st.forEach(System.out::println); //Laço Interno
		
	}
}
