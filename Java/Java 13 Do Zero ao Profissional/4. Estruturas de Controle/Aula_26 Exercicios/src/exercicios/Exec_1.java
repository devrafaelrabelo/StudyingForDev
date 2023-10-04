package exercicios;

import java.util.Scanner;

public class Exec_1 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.print("Digite o valor: ");
		int valor = entrada.nextInt();
		
		if (valor >= 0 && valor <= 10) {
			System.out.println("O numero ESTA entre 0 e 10");
		} else {
			System.out.println("O numero NÃO ESTA entre 0 e 10");
		}

		entrada.close();
	}
}
