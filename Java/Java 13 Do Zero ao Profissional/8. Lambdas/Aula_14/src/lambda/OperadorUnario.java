package lambda;

import java.util.function.UnaryOperator;

public class OperadorUnario {
	
	public static void main(String[] args) {
		
		UnaryOperator<Integer> maisDois = n -> n + 2;
		UnaryOperator<Integer> vezesDois = n -> n * 2;
		UnaryOperator<Integer> aoQuadrado = n -> n * n;
		
		int resultado_1 = maisDois
				.andThen(vezesDois)
				.andThen(aoQuadrado)
				.apply(0);
		
		System.out.println(resultado_1);
		
		int resultado_2 = aoQuadrado
				.compose(vezesDois)
				.compose(maisDois)
				.apply(0);
		
		System.out.println(resultado_2);

	}
}
