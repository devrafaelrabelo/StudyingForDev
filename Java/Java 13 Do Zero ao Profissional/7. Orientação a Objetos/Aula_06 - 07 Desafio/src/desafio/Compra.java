package desafio;

import java.util.ArrayList;
import java.util.List;

public class Compra {
	
	List<Item> itens = new ArrayList<Item>();
	List<Cliente> clientes = new ArrayList<Cliente>();
	
	Compra(){
		
	}
	
	void adicionarItens(Item itens) {
		this.itens.add(itens);
	}
	
	void imprimirListaItens() {
		System.out.println("Lista de Itens");
		for (Item item : itens) {
			System.out.println(item.toString());
		}
	}
	
	void imprimirComprados( ) {
		System.out.println("Lista de Compradores");
		for (Cliente cliente : clientes) {
			System.out.println(cliente.toString());
		}
	}
	
	
}
