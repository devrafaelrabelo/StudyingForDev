package desafioArrays;

import java.util.Scanner;

public class MediaNotas {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite quantas notas: ");
		int cont = entrada.nextInt();
		
		int[] notas = new int[cont];
		
		System.out.println("Numeros de notas: " + notas.length);
		
		for (int i = 0; i < notas.length; i++) {
			System.out.print("Digite a nota " + (i + 1) + ":");
			notas[i] = entrada.nextInt();
		}
		
		double notaTotal = 0;
		
		for (int nota : notas) {
			notaTotal+= nota;
		}
		
		System.out.println("Nota Total: " + notaTotal);
		System.out.print("Media: " + (notaTotal / notas.length));
		entrada.close();
	}
}
