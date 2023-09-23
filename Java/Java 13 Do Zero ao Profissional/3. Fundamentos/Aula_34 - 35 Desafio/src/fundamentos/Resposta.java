package fundamentos;

public class Resposta {

	public static void main(String[] args) {
			
			boolean trabalho1 = false;
			boolean trabalho2 = true;
			
			boolean comprouTV50 = trabalho1 && trabalho2;
			System.out.println("Comprou TV 50p: " + comprouTV50);
			
			boolean	comprouTV32 = trabalho1 ^ trabalho2;
			System.out.println("Comprou TV 32p: " + comprouTV32);
			
			boolean	tomouSorvete = trabalho1 || trabalho2;
			System.out.println("Comprou Sorvete: " + tomouSorvete);
	}
}
