package colecoes;

import java.util.ArrayDeque;
import java.util.Deque;

public class Pilha {
	
	public static void main(String[] args) {
		
		 Deque<String> pilhaLivros = new ArrayDeque<String>();
		 
		 // ADD e push- para adicionar
		 pilhaLivros.add("O Pequeno Príncipe"); // Retorna false ou true
		 pilhaLivros.push("O Pequeno Soldado"); // Retorna excessao
		 pilhaLivros.push("O Pequeno Noia");
		 
		 for (String string : pilhaLivros) {
			System.out.println(string);
		}
		 
		 System.out.println("Retirando o livro: " + pilhaLivros.peek());
		 System.out.println("Retirando o livro: " + pilhaLivros.element());
		 
		 System.out.println("Retirando o livro: " + pilhaLivros.poll()); // Retorna false ou true
		 System.out.println("Retirando o livro: " + pilhaLivros.remove()); // Retorna excessao
		 System.out.println("Retirando o livro: " + pilhaLivros.pop()); // Retorna excessao
		 
		 //pilhaLivros.size();
		 //pilhaLivros.clear();
		 //pilhaLivros.isEmpty();
		 //pilhaLivros.contains(pilhaLivros);		 		 
				
	}	
}
