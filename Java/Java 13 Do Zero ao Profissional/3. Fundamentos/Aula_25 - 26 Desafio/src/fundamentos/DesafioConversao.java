package fundamentos;

import java.util.Scanner;

public class DesafioConversao {
	public static void main(String[] args) {			
		Scanner s = new Scanner(System.in);
		
		System.out.print("Digite 1º salario: ");
		String valor1 = s.next().replace(",", ".");
		double valorNum1 = Double.parseDouble(valor1);
		
		System.out.print("Digite 2º salario: ");
		String valor2 = s.next().replace(",", ".");
		double valorNum2 = Double.parseDouble(valor2);
		
		System.out.print("Digite 3º salario: ");
		String valor3 = s.next().replace(",", ".");
		double valorNum3 = Double.parseDouble(valor3);			
		
		System.out.println("Media Salarial: " + (valorNum1 + valorNum2 + valorNum3 / 3));
		
		s.close();
	}

}
