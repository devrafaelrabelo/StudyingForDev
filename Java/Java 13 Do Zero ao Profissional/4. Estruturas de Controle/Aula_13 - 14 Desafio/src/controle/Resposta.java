package controle;

import java.util.Scanner;

public class Resposta {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);

		int quantidaDeNotas = 0;
		double nota = 0;
		double total = 0;
		
		while (nota != -1) {
			System.out.print("informe a nota: ");
			nota = entrada.nextDouble();
			
			if(nota <= 10 && nota >=0 ) {
				total += nota;
				quantidaDeNotas++;
			} else if (nota != -1){
				System.out.println("nota inválida");
			}
			
		}
		
			double media = total / quantidaDeNotas;
			System.out.println("Media = " + media);	

		entrada.close();
	}
}
