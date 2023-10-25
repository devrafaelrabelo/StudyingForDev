package desafio;

public class ProdutoTeste {
	public static void main(String[] args) {
		
		Produto p1 = new Produto("Notebook Nitro");		
		p1.preco = 10000;
		p1.descontoGerente = 0.1;
		System.out.println(p1.toString());		
		System.out.println("--------------------------------------------------------------------");			
		
		var p2 = new Produto("SAMSUNG S22 Ultra", 6000);	
		p2.descontoGerente = 0.2;
		System.out.println(p2.toString());
		System.out.println("--------------------------------------------------------------------");
		
		Produto p3 = new Produto("Monitor BENQ", 5000, 0.2);
		System.out.println(p3.toString());
		System.out.println("--------------------------------------------------------------------");		
			
		Produto p4 = new Produto();		
		p4.nome = "MOUSE E TECLADO";
		p4.preco = 1000;
		p4.descontoGerente = 0.15;
		System.out.println(p4.toString());
		System.out.println("--------------------------------------------------------------------");	
		
		double precoFinal = (p1.precoFinal() + p2.precoFinal() + p3.precoFinal() + p4.precoFinal());
		double precoMedio = precoFinal / 4;		
		System.out.println("Preço Final: " + precoFinal);
		System.out.println("Preço Medio: " + precoMedio);
				
	}
}
