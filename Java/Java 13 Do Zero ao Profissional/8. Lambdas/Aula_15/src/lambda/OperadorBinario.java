package lambda;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;

public class OperadorBinario {

	public static void main(String[] args) {
		
		BinaryOperator<Double> media = 
				(n1, n2) -> (n1 + n2) / 2;
		System.out.println(media.apply(9.8, 7.5));
		
		BiFunction<Double, Double, String> resultado = (n1, n2) -> 	{
				double notaFinal =  ((n1 + n2) / 2) ;
				return notaFinal >= 7 ? "Aprovado " + notaFinal : "Reprovado " + notaFinal;
		};
		
		System.out.println(resultado.apply(10.0, 5.0));
		System.out.println(resultado.apply(7.5, 6.0));
		
		Function<Double, String> conceito = 
				m -> m >= 7 ? "Aprovado - " + m : "Reprovado - " + m;
				
		System.out.println(media.andThen(conceito).apply(9.7, 4.0));
	}
}
