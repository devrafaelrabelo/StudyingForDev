package controle;

public class For {
	public static void main(String[] args) {
		
		for (int i = 0; i <= 20; i+=2) {
			System.out.println("Numero é: " + i);
		}
		
		
		int x = 0;
		for (;x <= 20;) {
			System.out.println("Numero é: " + x);
			x++;
		}
		
		//Laço infinito
		for(; ;) {
			System.out.println("infinito");
		}
	}
}
