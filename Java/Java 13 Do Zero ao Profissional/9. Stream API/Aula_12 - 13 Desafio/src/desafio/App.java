package desafio;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class App {
	public static void main(String[] args) {
		
		
		Produto p1 = new Produto("Notebook G11", 8000.0, 60 , 50);
		Produto p2 = new Produto("Notebook G12", 7000.0, 20 , 0);
		Produto p3 = new Produto("Notebook G13", 6000.0, 35 , 50);
		Produto p4 = new Produto("Notebook G14", 5000.0, 31 , 0);
		Produto p5 = new Produto("Notebook G15", 6000.0, 40 , 50);
		Produto p6 = new Produto("Notebook G16", 7000.0, 90 , 0);
		Produto p7 = new Produto("Notebook G17", 8000.0, 12 , 50);
		Produto p8 = new Produto("Notebook G18", 8500.0, 5 , 0);
		Produto p9 = new Produto("Notebook G19", 9500.0, 45 , 50);
		Produto p10 = new Produto("Notebook G20", 9000.0, 70 , 0);
		
		List<Produto> estoque = Arrays.asList(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10);
		
		Predicate<Produto> desconto = d -> d.desconto >= 30;
		
		Predicate<Produto> fretegratis = f -> f.frete == 0;
		
		Function<Produto, String> saudacao = 
				m -> m.nome + " R$ " + (m.valor - (m.valor * (m.desconto / 100)) + "\n");

		
		estoque.stream()
			.filter(desconto)
			.filter(fretegratis)
			.map(saudacao)
			.forEach(System.out::println);
		
		
	}
}
