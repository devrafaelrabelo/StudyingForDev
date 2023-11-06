package lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Consumidor {
	public static void main(String[] args) {

		Consumer<Produto> imprimir = p -> System.out.println(p.nome);
		
		Produto p1 = new Produto("Caneta", 12.0, 0.10);
		Produto p2 = new Produto("Notebook", 4000, 0.10);
		Produto p3 = new Produto("Caderno", 20.0, 0.10);
		Produto p4 = new Produto("Borrachaa", 5.0, 0.10);
		Produto p5 = new Produto("Lapis", 10.0, 0.10);
		
		imprimir.accept(p1);
		
		List<Produto> produtos = Arrays.asList(p1, p2, p3, p4, p5);
		
		produtos.forEach(imprimir);
		produtos.forEach(p -> System.out.println(p.preco));
		produtos.forEach(System.out::println);;
	}
}
