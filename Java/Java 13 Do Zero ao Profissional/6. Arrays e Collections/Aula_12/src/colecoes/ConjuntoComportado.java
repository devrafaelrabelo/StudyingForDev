package colecoes;

import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class ConjuntoComportado {

	public static void main(String[] args) {

		// Não aceita outros tipos de dados senão aqueles declarados
		System.out.println("HashSet -> Não Organiza a Lista e não aceita valor duplicado");
		Set<String> listaString = new HashSet<>();
		listaString.add("Texto 1");
		listaString.add("Texto 1");
		listaString.add("Texto 3");
		listaString.add("Texto 4");
		listaString.add("Texto 0");
		System.out.println(listaString);
		for (String nomes : listaString) {
			System.out.println(nomes);
		}
		
		System.out.println("\nTreeSet -> Organiza a Lista e não aceita valor duplicado\"");
		SortedSet<Integer> listaInteger = new TreeSet<>();
		listaInteger.add(2);
		listaInteger.add(2);
		listaInteger.add(0);
		listaInteger.add(5);
		listaInteger.add(1);
		System.out.println(listaInteger);
		for (Integer numerosInt : listaInteger) {
			System.out.println(numerosInt);
		}
		
		Set<Double> listaDouble = new HashSet<>();
		listaDouble.add(2.0);
		listaDouble.add(2.0);
		listaDouble.add(5.0);
		listaDouble.add(3.5);
		listaDouble.add(3.0);
		System.out.println(listaDouble);
		
		System.out.println();
		Set<Character> listaCharacter = new HashSet<>();
		listaCharacter.add('T');
		listaCharacter.add('t');
		listaCharacter.add('a');
		listaCharacter.add('B');
		listaCharacter.add('d');
		System.out.println(listaCharacter);

		System.out.println();
	}

}
