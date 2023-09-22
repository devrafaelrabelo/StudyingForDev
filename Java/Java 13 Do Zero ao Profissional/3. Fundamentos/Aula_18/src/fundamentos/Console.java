package fundamentos;

import java.util.Scanner;

public class Console {
	
	public static void main(String[] args) {
		
		/*
		 * 	%n 	-> Quebra de linha
		 * 	%f 	-> Float
		 * 	%s 	-> String
		 * 	%d	-> Inteiro
		 * 
		 */
		
		System.out.print("Bom");
		System.out.print(" Dia!\n");
		
		System.out.println("Bom");
		System.out.println("Bom Dia!");
		
		System.out.printf("Numeros da MEGASENA: %d %d %d %d %d %d %n", 
				1, 2, 3, 4, 5, 6);
		
		System.out.printf("Salario: %.1f%n", 1850.6123);
		
		Scanner s = new Scanner(System.in);		
		
		System.out.print("Nome: ");		
		String nome = s.nextLine();
		
		System.out.print("Sobrenome: ");		
		String sobrenome = s.nextLine();
		
		System.out.print("Idade: ");		
		int idade = s.nextInt();
		s.close();
		
		System.out.printf("%s %s tem %d anos.", 
				nome, sobrenome, idade);
		
	}

}
