package controle;

import java.util.Scanner;

public class ClassIf {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Informa a media: ");
		double media = entrada.nextDouble();
		
		if(media >= 7.0) {
			System.out.println("Aprovado");
			System.out.println("Parabens");
		} 
		
		if(media > 6.0 && media < 7.0) {
			System.out.println("Recuperação");
		}
		
		boolean criterioReprovacao = media <= 6.0;
		
		if(criterioReprovacao) {
			System.out.println("Reprovado");
		}
		
		
		entrada.close();
	}
	
	
}
