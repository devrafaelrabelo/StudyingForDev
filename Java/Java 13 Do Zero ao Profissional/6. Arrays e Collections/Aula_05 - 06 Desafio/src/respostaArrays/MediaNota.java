package respostaArrays;

import java.util.Iterator;
import java.util.Scanner;

public class MediaNota {
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.print("Digite quantas notas: ");
		int cont = entrada.nextInt();

		double[] notas = new double[cont];

		System.out.println("Numeros de notas: " + notas.length);

		for (int i = 0; i < notas.length; i++) {
			System.out.print("Digite a nota " + (i + 1) + ":");
			notas[i] = entrada.nextDouble();
		}				
		
		
		double notaTotal = 0;

		for (double nota : notas) {
			notaTotal += nota;
		}
		
		double notaMedia = notaTotal / notas.length;
		System.out.print("Media: " + notaMedia);
		entrada.close();		
	}
}
