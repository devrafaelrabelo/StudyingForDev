package exercicios;

import java.util.Iterator;
import java.util.Scanner;

public class Exec_9 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int maior = 0, valor = 0;
		
		for (int i = 0; i < 10; i++) {
			System.out.print("Digite o valor: ");
			valor = entrada.nextInt();
			if (valor > maior) {
				maior = valor;
			}
		}
		System.out.println("Maior valor: " + maior);
		entrada.close();
	}
}
