package exercicios;

import java.util.Scanner;

public class Exec_8 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite a palavra desejada");
		String palavra = entrada.nextLine();
		
		for (int i = 0; i < palavra.length(); i++) {
			System.out.println(palavra.charAt(i)); 					
		}	

		entrada.close();
	}
}
