package lambda;

import java.util.function.Function;

public class Funcao {

	public static void main(String[] args) {

		Function<Integer, String> parOuImpar = numero -> numero % 2 == 0 ? "Par" : "Impar";

		System.out.println(parOuImpar.apply(32));

		Function<String, String> oResultadoE = valor -> "o resultado é: " + valor;		
		Function<String, String> empolgado = valor -> valor + "!!!";
		
		String resultadoFinal = parOuImpar
				.andThen(oResultadoE)
				.andThen(empolgado)
				.apply(32);
		System.out.println(resultadoFinal);
		
		Function<String, String> duvida = valor -> valor + "???";
		String resultadoFinal_1 = parOuImpar
				.andThen(oResultadoE)
				.andThen(duvida)
				.apply(32);
		
		
		System.out.println(resultadoFinal_1);
	}
}
