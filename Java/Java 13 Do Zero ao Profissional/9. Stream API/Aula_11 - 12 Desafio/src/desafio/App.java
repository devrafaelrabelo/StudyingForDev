package desafio;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class App {
	
	public static void main(String[] args) {
		
		Carro c1 = new Carro("Palio", 2, 2019, "GASOLINA", "Manual");
		Carro c2 = new Carro("Corsa", 4, 2018, "FLEX", "Manual");
		Carro c3 = new Carro("HB20", 2, 2017, "DIESEL", "Manual");
		Carro c4 = new Carro("UNO", 4, 2016, "FLEX", "Automatico");
		Carro c5 = new Carro("FIESTA", 2, 2015, "GASOLINA", "Manual");
		Carro c6 = new Carro("PEUGEOT 208", 4, 2014, "ALCOOL", "Automatico");
		Carro c7 = new Carro("SIENA", 2, 2013, "DIESEL", "Manual");
		Carro c8 = new Carro("I30", 4, 2012, "FLEX", "Automatico");
		Carro c9 = new Carro("GOL", 2, 2011, "GASOLINA", "Manual");
		
		List<Carro> estoque = Arrays.asList(c1, c2, c3, c4, c5, c6, c7, c8, c9);
		
		Predicate<Carro> portas = p -> p.portas == 4;		
		
		Predicate<Carro> anoFabricacao = f -> f.anoFab > 2015;
		
		Predicate<Carro> combustivel = c -> c.tecnologiaCombustivel.equalsIgnoreCase("flex");
		
		Predicate<Carro> cambio = c -> c.cambio.equalsIgnoreCase("manual");
		
		estoque.stream()
			.filter(portas)
			.filter(anoFabricacao)
			.filter(combustivel)
			.filter(cambio)
			.forEach(System.out::println);
		
	}	
}
