package matriz;

import java.util.Scanner;

public class RespostaAula07 {
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.print("Quantidade de Alunos: ");
		int contAluno = entrada.nextInt();

		System.out.print("Quantidade de Notas: ");
		int contNotas = entrada.nextInt();

		double[][] notasDaTurma = new double[contAluno][contNotas];
		double totalNotas = 0;
		
		for (int i = 0; i < notasDaTurma.length; i++) {
			System.out.println((i + 1) + "º Aluno");
			for (int j = 0; j < notasDaTurma[i].length; j++) {
				System.out.print((j + 1) + "º nota:"); 
				notasDaTurma[i][j] = entrada.nextDouble();
				totalNotas+= notasDaTurma[i][j];
			}
		}
		System.out.println("Total de nota: " + totalNotas);
		System.out.println("Media: " + totalNotas / (contAluno * contNotas));
		System.out.println("Fim!!");

		entrada.close();
	}
}
