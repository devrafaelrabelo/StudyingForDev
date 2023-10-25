package matriz;

import java.util.Scanner;

public class Aula07 {	
		public static void main(String[] args) {
			
			Scanner entrada = new Scanner(System.in);
			
			System.out.print("Quantidade de Alunos: ");
			int contAluno = entrada.nextInt();	
			String[] alunos = new String[contAluno];			
			
			System.out.print("Quantidade de Notas: ");
			int contNotas = entrada.nextInt();
			double[] notas = new double[contNotas];		
			double notaTotal = 0;
			
			for (int i = 0; i < alunos.length; i++) {
				System.out.print("Digite o nome " + (i + 1) + "º Aluno: ");	
				alunos[i] = entrada.next();
				notaTotal = 0;
				for (int j = 0; j < notas.length; j++) {
					System.out.print("Digite a nota " + (j + 1) + ":");
					notas[j] = entrada.nextDouble();
					notaTotal+= notas[j];
				}
				System.out.println("Aluno: " + alunos[i]);
				System.out.println("Nota Total: " + notaTotal);
				System.out.println("Media: " + (notaTotal / contNotas));				
			}	
			
			System.out.println("Fim!!");

			entrada.close();
	}
}
