package MetodosEClasses;

public class Produto {
	
	String nome;
	double preco;
	double desconto;
	
	double precoComDesconto() {
		return preco - ( preco * desconto);
	}
	
	double precoComDesconto(double descontoGerente) {
		return precoComDesconto() - ( precoComDesconto() * descontoGerente);
	}
}
