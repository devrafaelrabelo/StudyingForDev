package map;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.UnaryOperator;

public class Maps {
	
	public static void main(String[] args) {
		
		Consumer<String> print = System.out::print;
		
		List<String> marcas = Arrays.asList("BMW ", "Audi ", "honda\n");
		marcas.stream().map(m -> m.toUpperCase()).forEach(print);
		
		UnaryOperator<String> maiscula = n -> n.toUpperCase();
		UnaryOperator<String> primeiraLetra = n -> n.charAt(0) + "";
		UnaryOperator<String> grito = n -> n + "!!!! ";
		
		System.out.println(maiscula.andThen(primeiraLetra).andThen(grito).apply("BMW"));
		
		marcas.stream()
			.map(Utilitarios.maiscula)
			.map(Utilitarios.primeiraLetra)
			.map(Utilitarios::grito)
			.forEach(print);
	}
}
