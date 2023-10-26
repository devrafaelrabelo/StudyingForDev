package colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class QueueFilas {
	
	public static void main(String[] args) {
		
		Queue<String> filaBanco = new LinkedList<>();
		
		
		// Offer e Add -> Adicionam elementos na fila
		// Diferença é o comportamento quando a fila está cheia!		
		System.out.println("Adicionando ADD: " + filaBanco.add("Roger")); // Retorna false
		System.out.println("Adicionando offer: " + filaBanco.offer("Rafael")); // lança uma exceção
		filaBanco.add("Oscar");
		filaBanco.offer("Ana");
		filaBanco.add("Anna");
		filaBanco.offer("Santo");
		System.out.println();
		
		for (String string : filaBanco) {
			System.out.println(string);
		}
		System.out.println();
		
		// Peek e Element -> Retorna o primeiro elementos na fila sem remover
		// Diferença é o comportamento quando a fila está vazia!	
		System.out.println("Primeiro Elemento da fila: " + filaBanco.peek()); // Retorna Null
		System.out.println("Primeiro Elemento da fila: " + filaBanco.element()); // lança uma exceção
		System.out.println();
		
		// Poll e remove -> Retorna o primeiro elementos na fila sem remover
		// Diferença é o comportamento quando a fila está vazia!	
		System.out.println("Removendo Poll: " + filaBanco.poll()); // retorna false
		System.out.println("Removendo Remover: " + filaBanco.remove()); // retorna uma exceção					
		System.out.println();
		
		for (String string : filaBanco) {
			System.out.println(string);
		}
		System.out.println();

		System.out.println("Tamanho fila: " + filaBanco.size()); //  Retorna tamanha
		System.out.println("A fila esta vazia: " + filaBanco.isEmpty()); // Pergunta se esta vazia
		filaBanco.clear(); // limpa a fila 
		System.out.println("A fila esta vazia: " + filaBanco.isEmpty()); // Pergunta se esta vazia
		//filaBanco.contains(....)
		
	}
	
}
