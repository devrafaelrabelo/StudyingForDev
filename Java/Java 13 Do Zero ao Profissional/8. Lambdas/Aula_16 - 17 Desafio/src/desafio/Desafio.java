package desafio;

import java.text.DecimalFormat;
import java.util.function.Function;

public class Desafio {
	
	public static void main(String[] args) {
		
		Produto p = new Produto("Ipad", 3235.89, 0.13);		
		
		Function<Produto, Double> desconto = desc -> desc.preco - (desc.preco * desc.desconto);
		
		Function<Double, Double> imposto = imp -> imp >= 2500 ? (imp + (imp * 0.085)) : imp ;		
		
		Function<Double, Double> frete = envio -> envio >= 3000 ? (envio + 100) :  (envio + 50);
		
		DecimalFormat df = new DecimalFormat("R$ ###.00");
		
		String numero = df.format(desconto.andThen(imposto).andThen(frete).apply(p));
		
		System.out.println(numero);
		
	}
}
