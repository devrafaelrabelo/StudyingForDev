package lambdas;

import java.util.function.BinaryOperator;

public class App_lambda {
	public static void main(String[] args) {

		Calculo calculo = (x, y) -> {
			return x + y;
		};

		System.out.println(calculo.executar(2, 3));

		calculo = (x, y) -> x + y;

		System.out.println(calculo.executar(2, 3));

		calculo = (x, y) -> x * y;

		System.out.println(calculo.executar(2, 3));

		calculo = (x, y) -> x / y;

		System.out.println(calculo.executar(2, 3));
		
		
		System.out.println("\n------------------------------------\n");
		

		BinaryOperator<Double> calc = (x, y) -> x + y;
		
		System.out.println(calc.apply(2.0, 3.0));

		calc = (x, y) -> x + y;

		System.out.println(calc.apply(2.0, 3.0));
		
		calc = (x, y) -> x * y;

		System.out.println(calc.apply(2.0, 3.0));
		
		calc = (x, y) -> x / y;

		System.out.println(calc.apply(2.0, 3.0));
		
		
		System.out.println("\n------------------------------------\n");
		
		
		BinaryOperator<Integer> calc1 = (x, y) -> x + y;

		System.out.println(calc1.apply(2, 3));

		calc = (x, y) -> x + y;

		System.out.println(calc1.apply(2, 3));
		
		calc = (x, y) -> x * y;

		System.out.println(calc1.apply(2, 3));
		
		calc = (x, y) -> x / y;

		System.out.println(calc1.apply(2, 3));


	}
}
