package desafio;

import java.util.ArrayList;
import java.util.List;

public class Compra {
	
	List<Item> itens = new ArrayList<Item>();
	
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
	
	
}
