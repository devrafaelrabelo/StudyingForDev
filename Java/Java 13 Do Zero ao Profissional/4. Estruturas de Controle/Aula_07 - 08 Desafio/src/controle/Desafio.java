package controle;

import java.util.Scanner;

public class Desafio {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite o dia da Semana: ");
		String diadasemana = entrada.nextLine();
		
		if (diadasemana.equalsIgnoreCase("Domingo")) {
			System.out.println("Domingo -> 1");
		} else if (diadasemana.equalsIgnoreCase("Segunda")) {
			System.out.println("Segunda -> 2");
		} else if (diadasemana.equalsIgnoreCase("Terça")) {
			System.out.println("Terça -> 3");
		} else if (diadasemana.equalsIgnoreCase("Quarta")) {
			System.out.println("Quarta -> 4");
		} else if (diadasemana.equalsIgnoreCase("Quinta")) {
			System.out.println("Quinta -> 5");
		} else if (diadasemana.equalsIgnoreCase("Sexta")) {
			System.out.println("Sexta -> 6");
		} else if (diadasemana.equalsIgnoreCase("Sabado")) {
			System.out.println("Sabado -> 7");
		}
		
		entrada.close();
	}
}
