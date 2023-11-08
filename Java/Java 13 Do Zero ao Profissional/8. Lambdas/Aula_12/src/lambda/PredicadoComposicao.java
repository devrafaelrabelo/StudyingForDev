package lambda;

import java.util.function.Predicate;

public class PredicadoComposicao {
	
	public static void main(String[] args) {
		
		Predicate<Integer> isPar = num -> num % 2 == 0;
		Predicate<Integer> isTresDigitos = num -> num >= 100 && num <= 999;
		
		//System.out.println(isPar.test(23));
		
		//System.out.println(isTresDigitos.test(999));
		
		System.out.println(isPar.and(isTresDigitos).test(121));
		System.out.println(isPar.negate().and(isTresDigitos).test(121));
		System.out.println(isPar.and(isTresDigitos).negate().test(121));
		System.out.println(isPar.or(isTresDigitos).test(121));
	}
}
