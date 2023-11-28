package generics;

import java.util.Arrays;
import java.util.List;

public class ListaUtilTeste {
	public static void main(String[] args) {
		
		List<String> langs = Arrays.asList("JS", "PHP", "JAVA", "C++" );
		List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6);
		
		String ultimaLinguagem = (String) ListaUtil.getUltimo1(langs);
		System.out.println(ultimaLinguagem);
		
		Integer ultimoNumero = (Integer) ListaUtil.getUltimo1(nums);
		System.out.println(ultimoNumero);
		
		String ultimaLinguagem1 = ListaUtil.getUltimo2(langs);
		System.out.println(ultimaLinguagem1);
		
		Integer ultimoNumero1 = ListaUtil.getUltimo2(nums);
		System.out.println(ultimoNumero1);
	
		
	}
}
