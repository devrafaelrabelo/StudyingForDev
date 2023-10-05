package classesEmetodos;

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
		System.out.println(p1.preco - ( p1.preco * p1.desconto));
		
		var p2 = new Produto();
		p2.nome = "Celular";
		p2.preco = 500 ;
		p2.desconto = 0.1;
		System.out.println(p2.nome);
		System.out.println(p2.preco - ( p2.preco * p2.desconto));
		
		
		double precoFinal = (p1.preco - ( p1.preco * p1.desconto)) + (p2.preco - ( p2.preco * p2.desconto));
		double precoMedio = precoFinal / 2;
		
		System.out.println("Media Carrinho é: " + precoMedio);
		
		
		
	}
}
