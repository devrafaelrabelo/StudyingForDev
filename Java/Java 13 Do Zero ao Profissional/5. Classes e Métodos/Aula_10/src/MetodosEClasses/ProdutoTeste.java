package MetodosEClasses;

import java.util.Scanner;

public class ProdutoTeste {
	public static void main(String[] args) {
		/**
		int a = 3;
		Scanner entrada = new Scanner(System.in);
		*/
		
		
		Produto p1 = new Produto();		
		p1.nome = "Notebook";
		p1.preco = 500;
		p1.desconto = 0.1;
		System.out.println(p1.nome);
		System.out.println(p1.precoComDesconto());
		System.out.println(p1.precoComDesconto(0.5));
		
		var p2 = new Produto();
		p2.nome = "Celular";
		p2.preco = 500 ;
		p2.desconto = 0.1;
		System.out.println(p2.nome);
		System.out.println(p2.precoComDesconto());
		System.out.println(p2.precoComDesconto(0.5));
		
		
		double precoFinal = (p1.precoComDesconto() + p2.precoComDesconto());
		double precoMedio = precoFinal / 2;
		
		System.out.println("Media Carrinho é: " + precoMedio);
		
		
		
	}
}
