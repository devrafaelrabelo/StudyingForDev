package colecoes;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoBaguncado {
	
	@SuppressWarnings({ "rawtypes", "unchecked", })
	public static void main(String[] args) {
		
		System.out.println("----------------------- HashSet conjunto = new HashSet();");
		
		HashSet conjunto = new HashSet();
		
		conjunto.add(1.2); // double -> Double
		conjunto.add(true); // boolean -> Boolean
		conjunto.add("Teste"); // String -> String		
		conjunto.add("teste"); // String -> String
		conjunto.add(1); // int -> Integer
		conjunto.add('x'); // char -> Character
		System.out.println(conjunto);
				
		System.out.println("tamanho é " + conjunto.size());
		conjunto.add("Teste"); // String -> String
		System.out.println(conjunto);
				
		System.out.println("Removendo Teste! " + conjunto.remove("Teste"));	
		System.out.println("tamanho é " + conjunto.size());
		System.out.println(conjunto);
		
		System.out.println("Contém Teste? " + conjunto.contains("teste"));
		System.out.println("tamanho é " + conjunto.size());
		System.out.println(conjunto);

		System.out.println("\n\n\n----------------------- Set nums = new HashSet();");
		
		Set nums = new HashSet();
		
		nums.add(1);
		nums.add(2);
		nums.add(3);
		
		System.out.println(nums);
		System.out.println("tamanho é " + nums.size());
		
		/**
		//Adicionando um conjunto no outro
		nums.addAll(conjunto);
		System.out.println(nums);
		*/
		
		/**
		//Deixando somente os numeros em comuns
		conjunto.retainAll(nums);
		System.out.println(conjunto);
		*/
		
		/**
		//Deixando o conjunto vazio
		conjunto.clear();
		System.out.println(conjunto);
		*/
	}
	
}
