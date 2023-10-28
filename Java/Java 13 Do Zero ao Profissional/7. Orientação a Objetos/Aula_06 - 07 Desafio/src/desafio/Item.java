package desafio;

public class Item {
	
	int quantidade;	
	Produto produto;
	
	Item(int quantidade, Produto produto){
		this.quantidade = quantidade;
		this.produto = produto;		
	}

	@Override
	public String toString() {
		return produto + "\nQuantidade: " + quantidade + " - R$ " + calculandoValorTotalItem();
	}
	
	double calculandoValorTotalItem() {
		return quantidade * this.produto.preco;
	}
	
	
	
}
