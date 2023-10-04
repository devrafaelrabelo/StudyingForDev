package exercicios;

import java.util.Scanner;

public class Exec_3 {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite a primeira nota: ");
		double nota1 = entrada.nextDouble();

		System.out.print("Digite a primeira nota: ");
		double nota2 = entrada.nextDouble();
		
		double resul = (nota1 + nota2 / 2);
		
		if (resul >= 7) {
			System.out.println("Aprovado");
		} else if (resul >= 4) {
			System.out.println("Recuperação");
		} else {
			System.out.println("Reprovado");
		}				
		
		entrada.close();
		
	}
}
