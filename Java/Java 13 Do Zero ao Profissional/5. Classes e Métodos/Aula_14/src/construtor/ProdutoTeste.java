package construtor;

public class ProdutoTeste {
	public static void main(String[] args) {
		
		Produto p1 = new Produto("Notebook");		
		p1.preco = 6000;
		p1.desconto = 0.1;
		System.out.println(p1.nome);
		System.out.println(p1.precoComDesconto());
		System.out.println(p1.precoComDesconto(0.5));
		System.out.println();
		
		var p2 = new Produto("Celular", 6000);
		p2.desconto = 0.1;
		System.out.println(p2.nome);
		System.out.println(p2.precoComDesconto());
		System.out.println(p2.precoComDesconto(0.5));
		System.out.println();

		Produto p3 = new Produto("Desktop", 6000, 0.1);
		System.out.println(p3.nome);
		System.out.println(p3.precoComDesconto());
		System.out.println(p3.precoComDesconto(0.5));	
		System.out.println();
		
		Produto p4 = new Produto();		
		p4.nome = "Desktop";
		p4.preco = 6000;
		p4.desconto = 0.1;
		System.out.println(p4.nome);
		System.out.println(p4.precoComDesconto());
		System.out.println(p4.precoComDesconto(0.5));
		System.out.println();

		
		double precoFinal = (p1.precoComDesconto() + p2.precoComDesconto() + p3.precoComDesconto() + p4.precoComDesconto());
		double precoMedio = precoFinal / 4;		
		System.out.println("Media Carrinho é: " + precoMedio);
		
		
		
		
		
	}
}
