package construtor;

public class Produto {
	
	String nome;
	double preco;
	double desconto;
	
	Produto(){
		
	}
	
	
	Produto(String nome){
		this.nome = nome;
	}
	
	
	Produto(String nome, double preco){
		this.nome = nome;
		this.preco = preco;	
	}
	
	
	Produto(String nome, double preco,double desconto){
		this.nome = nome;
		this.preco = preco;
		this.desconto = desconto;
	}
	
	double precoComDesconto() {
		return preco - ( preco * desconto);
	}
	
	double precoComDesconto(double descontoGerente) {
		return precoComDesconto() - ( precoComDesconto() * descontoGerente);
	}
}
