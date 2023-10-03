package controle;

import java.util.Scanner;

public class While {
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		String palavra = "";
		
		while (!palavra.equalsIgnoreCase("sair")) {
			System.out.print("Voce diz: ");
			palavra = entrada.nextLine();
		}
		
		
		// Meu Código
		
/**		
		do {
			System.out.print("Digite a palavra\n" + "Sair -> Sair: ");
			palavra = entrada.nextLine();

		} while (!palavra.equalsIgnoreCase("sair"));
*/
		entrada.close();
	}
}
