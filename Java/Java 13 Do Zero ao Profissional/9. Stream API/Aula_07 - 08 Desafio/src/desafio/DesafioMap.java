package desafio;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.UnaryOperator;


public class DesafioMap {

	public static void main(String[] args) {
		
		Consumer<Object> print = System.out::println;

		List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
		
		Function<Integer, String> toStringBinario = m -> Integer.toBinaryString(m);
		
		UnaryOperator<String> toStringReverse = m -> new StringBuilder(m).reverse().toString();
		
		Function<String, Integer> stringToInteger = m -> Integer.parseInt(m, 2);		
		
		nums.stream()
			.map(toStringBinario)
			.map(toStringReverse)
			.map(stringToInteger)
		.forEach(print);

	}
}
