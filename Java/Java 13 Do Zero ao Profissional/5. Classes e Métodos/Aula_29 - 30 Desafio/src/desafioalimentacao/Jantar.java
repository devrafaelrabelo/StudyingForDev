package desafioalimentacao;

public class Jantar {
	public static void main(String[] args) {
		
		Pessoa p1 = new Pessoa("Rafael Rabelo", 65);
		/**
		Pessoa p2 = new Pessoa("Roger Rabelo", 80);
		Pessoa p3 = new Pessoa("Violeta Rabelo", 68);
		
		System.out.println(p1.toString());
		System.out.println(p2.toString());
		System.out.println(p3.toString());
		*/
		Comida c1 = new Comida("Arroz", 0.250);
		Comida c2 = new Comida("Feijão", 0.100);
		Comida c3 = new Comida("Carne", 0.200);
		/**
		System.out.println(c1.toString());
		System.out.println(c2.toString());
		System.out.println(c3.toString());
		*/
		
		p1.Comer(c1);
		p1.Comer(c2);
		p1.Comer(c3);
	}	
}
