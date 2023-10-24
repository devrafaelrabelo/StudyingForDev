package resposta;

public class ProdutoTeste {
	public static void main(String[] args) {
		
		Produto p1 = new Produto("Notebook", 5000);		
		System.out.println(p1.nome);
	
		
		var p2 = new Produto("Celular");
		p2.preco = 1000;		
		
		System.out.println(p1.nome + " " + p1.precoComDesconto());
		System.out.println(p2.nome + " " + p2.precoComDesconto(0.1));
		

		double precoFinal = (p1.precoComDesconto() + p2.precoComDesconto());
		double precoMedio = precoFinal / 2;		
		System.out.println("Media Carrinho é: " + precoMedio);
		
		
		
		
		
	}
}
