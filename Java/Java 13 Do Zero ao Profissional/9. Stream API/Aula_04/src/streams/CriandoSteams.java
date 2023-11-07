package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class CriandoSteams {
	
	public static void main(String[] args) {
				
	
		Consumer<Object> mostrar = System.out::print;
		Consumer<Object> mostrarln = System.out::println;
		
		Stream<String>  langs = Stream.of("Java ", "Lua ", "JS\n");
		
		langs.forEach(mostrar);
		
		String [] maisLangs = { "Python ", "Lisp ", "Perl ", "Go\n"};
		
		Stream.of(maisLangs).forEach(mostrar);
		Arrays.stream(maisLangs).forEach(mostrar);
		
		System.out.println();
		
		Arrays.stream(maisLangs, 0,4).forEach(mostrar);		
		Arrays.stream(maisLangs, 1,4).forEach(mostrar);		
		Arrays.stream(maisLangs, 2,4).forEach(mostrar);		
		Arrays.stream(maisLangs, 3,4).forEach(mostrar);

		System.out.println();
		
		List<String> outrasLangs = Arrays.asList("C ", "PHP ", "Kotlin\n");
		outrasLangs.stream().forEach(mostrar);
		outrasLangs.parallelStream().forEach(mostrar);
		
		// Gerar dados Infinitos  Stream.generate(() -> "a").forEach(mostrar);
		// Gerar dados Infinitos  Stream.iterate(0, n -> n + 1).forEach(mostrarln);
		
		
	}
}
