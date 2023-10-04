package exercicios;

import java.util.Scanner;

public class Exec_7 {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		int total = 0, valor = 0;
		/**
		while(valor >= 0) {			
			total += valor;	
			System.out.println("Valor Total: " + total);
			System.out.print("Digite negativo para sair\n"
					+ "Digite positivo para somar: ");
			valor = entrada.nextInt();	
		}		
		System.out.println("Valor Total: " + total);
		*/
		/**
		do {
			total += valor;	
			System.out.println("Valor Total: " + total);
			System.out.print("Digite o valor: ");
			valor = entrada.nextInt();			
		} while (valor >= 0);
		*/
		
		do {			
			System.out.print("Digite o valor: ");
			valor = entrada.nextInt();
			if (valor < 0) {
				System.out.println("Valor Total: " + total);
				break;
			}
			total += valor;	
			System.out.println("Valor Total: " + total);
		} while (valor >= 0);		
		
		entrada.close();				
	}
}
