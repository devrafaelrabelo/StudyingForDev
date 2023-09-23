package fundamentos;

public class Desafio {
	
	public static void main(String[] args) {
		
		boolean trabalho1 = false;
		boolean trabalho2 = true;
		
		if (trabalho1 && trabalho2) {
			System.out.println("Comprou TV 50p e Tomar Sorvete");
		} else if (trabalho1 || trabalho2) {
			System.out.println("Comprou TV 32p e Tomar Sorvete");			
		} else System.out.println("Não fez nada ");	
		
	}
}
