package controle;

import java.util.Scanner;

public class IfelseIf {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite a nota: ");
		
		double nota = entrada.nextDouble();
		
		if (nota > 10 || nota < 0) {
			System.out.print("Nota Inválida");
		} else if (nota > 8.1) {
			System.out.print("Conceito A");
		} else if (nota > 6.1) {
			System.out.print("Conceito B");
		} else if (nota > 4.1) {
			System.out.print("Conceito C");
		} else if (nota > 2.1) {
			System.out.print("Conceito D");
		} else if (nota > 0.0) {
			System.out.print("Conceito E");
		} else {
			System.out.print("Conceito F");

		}
		
		entrada.close();
	}
	
}
