package resposta;

public class App {
	
	public static void main(String[] args) {
		
		System.out.println("Carro Basico");
		Carro c1 = new Carro();
		
		c1.acelerar();
		System.out.println(c1);
		
		c1.acelerar();
		System.out.println(c1);
		
		c1.frear();
		System.out.println(c1);
		
		System.out.println("Carro Ferrari");
		Carro f1 = new Ferrari();
		
		f1.acelerar();
		f1.frear();
		System.out.println(f1);
		
		f1.acelerar();
		f1.frear();
		System.out.println(f1);
		
		f1.frear();
		System.out.println(f1);
	}
}
