package resposta;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class RespostaMap {
	
	public static void main(String[] args) {
		
		List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
		
		UnaryOperator<String> toStringReverse = t -> new StringBuilder(t).reverse().toString();

		Function<String, Integer> stringToInteger = n -> Integer.parseInt(n, 2);	
		
		nums.stream()
			.map(Integer::toBinaryString)
			.map(toStringReverse)
			.map(stringToInteger)
		 	.forEach(System.out::println);
		
	}
}
