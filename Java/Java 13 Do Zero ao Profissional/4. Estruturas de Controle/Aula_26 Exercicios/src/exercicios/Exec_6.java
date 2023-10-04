package exercicios;

import java.util.Random;
import java.util.Scanner;

public class Exec_6 {
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		Random gerador = new Random();

		int num1, valor = gerador.nextInt(5);
		System.out.println("Numero gerado: " + valor);

		for (int i = 10; i <= 10; i--) {
			System.out.print("Digite o numero: ");
			num1 = entrada.nextInt();
			if (num1 == valor) {
				System.out.println("Acertou");
				break;
			}
			if (num1 > valor) {
				System.out.println("Numero digitado é maior");
			} else if (num1 < valor) {
				System.out.println("Numero digitado é menor");
			}

			System.out.println("Tentativas restantes: " + (i - 1));
		}

		entrada.close();
	}
}
