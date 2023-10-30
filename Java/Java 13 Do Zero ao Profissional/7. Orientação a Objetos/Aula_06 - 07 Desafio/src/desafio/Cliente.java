package desafio;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
	
	String nome;
	int id;
	List<Compra> compras = new ArrayList<Compra>();
	
	Cliente(String nome, int id) {
		this.nome = nome;
		this.id = id;		
	}	
	
	@Override
	public String toString() {
		return "ID: " + id + "| Nome: " + nome;
	}
	
	void adicionandoCompra(Compra compra) {
		this.compras.add(compra);
		compra.clientes.add(this);
	}
		
	
	double calculadoValorCompra() {		
		double valorTotal = 0;
		for (Compra compra : compras) {
			for (int i = 0; i < compra.itens.size(); i++) {
				valorTotal+= compra.itens.get(i).calculandoValorTotalItem();
			}
			
		}
		return valorTotal;
	}
	
	
	
	
	
}
