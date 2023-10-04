package controle;

import java.util.Scanner;

public class DoWhile {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		String palavra = "";
				
		do {
			System.out.print("Você precisa falar" 
						+ "as palavras magicas...");
			System.out.print("Você quer sair? ");
			palavra = entrada.nextLine();

		} while (!palavra.equalsIgnoreCase("por favor"));		
		
		System.out.println("Obrigado!!!");
		
		entrada.close();
	}
}
