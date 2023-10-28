package desafio;

public class Produto {
	
	String nome;
	int id;
	double preco;
	
	Produto(String nome, int id, double preco) {
		this.nome = nome;
		this.id = id;
		this.preco = preco;
	}

	@Override
	public String toString() {
		return "ID: " + id + " | Nome: " + nome + " | Preço: " + preco;
	}
	
	
}
