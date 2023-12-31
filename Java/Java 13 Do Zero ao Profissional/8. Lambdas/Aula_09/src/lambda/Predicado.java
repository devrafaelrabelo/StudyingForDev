package lambda;

import java.util.function.Predicate;

public class Predicado {

	public static void main(String[] args) {
		
		Predicate<Produto> isCaro = 
				prod -> (prod.preco * (1 - prod.desconto)) >= 2000; 

		Produto produto = new Produto("Notebook", 4000, 0.20);		
		System.out.println(isCaro.test(produto));
	}
}
