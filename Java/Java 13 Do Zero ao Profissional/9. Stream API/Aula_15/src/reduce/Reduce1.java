package reduce;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

public class Reduce1 {
	
	public static void main(String[] args) {
		
		List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
		
		BinaryOperator<Integer> soma = (ac, n) -> ac + n;
		
		System.out.println(nums.stream().reduce(soma).get());
		
		int total = nums.stream().reduce(soma).get();
		
		System.out.println(total);
		
		System.out.println(nums.parallelStream().reduce(100, soma));
		
		Integer total_2 = nums.parallelStream().reduce(100, soma);
		System.out.println(total_2);
		
		Integer total_3 = nums.stream().reduce(100, soma);
		System.out.println(total_3);
		
		//Resultado foi um Opcional<Integer>
		nums.stream()
			.filter(n -> n >5)
			.reduce(soma)
			.ifPresent(System.out::println);
	}	
}
