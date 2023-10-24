package desafio;

public class Produto {
	
	String nome;
	double preco;
	static double desconto = 0.25;
	double descontoGerente = 0;
	
	Produto(){
		
	}
	
	Produto(String nome){
		this.nome = nome;
	}
	
	
	Produto(String nome, double preco){
		this.nome = nome;
		this.preco = preco;	
	}
	
	
	Produto(String nome, double preco,double descontoGerente){
		this.nome = nome;
		this.preco = preco;
		this.descontoGerente = descontoGerente;
	}
	
	double precoComDesconto() {		
		return preco - ( preco * desconto);
	}
	
	double precoComDescontoG() {
		return preco - ( preco * descontoGerente);
	}

	@Override
	public String toString() {
		return "Produto"
				+ "\nNome: " + nome + ""
				+ "\nPreco: " + preco + ""
				+ "\nDesconto Padrao: " + desconto * preco
				+ "\nDesconto Gerente: " + descontoGerente * preco
				+ "\nPreço Final: " + precoFinal();
	}
	
	double precoFinal() {
		return (preco - ((desconto + descontoGerente) * preco));
	}
	
	
}
