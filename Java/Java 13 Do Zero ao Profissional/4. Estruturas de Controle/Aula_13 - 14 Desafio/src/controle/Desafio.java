package controle;

import java.util.Scanner;

public class Desafio {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
			 
		double nota = 0, notaTotal = 0;
		int cont = 0;

		do{
			System.out.println("Digite uma nota entre 0 - 10\n"
					+ "Digite -1 p/ Sair");
			nota = entrada.nextDouble();	
			
			if(nota >= 0 && nota <= 10) {
				System.out.println("Nota certa");
				notaTotal = notaTotal + nota;
				cont++;
			} else if (nota != -1) { 
				System.out.println("Digite uma nota valida!!!");
			}
			
		} while(nota != -1);		
		
		System.out.println("Programa Finalizado");
		System.out.println("Nota total: " + notaTotal);
		System.out.println("Numero de notas Validas: " + cont);
		System.out.println("Media de Nota: " + (notaTotal / cont));
		entrada.close();
	}
}
