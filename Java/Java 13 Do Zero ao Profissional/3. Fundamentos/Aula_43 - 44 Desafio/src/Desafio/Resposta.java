package Desafio;

import java.util.Scanner;

public class Resposta {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informa o Número: ");
		double num1 = entrada.nextDouble();
		
		System.out.println("Informa o Número: ");
		double num2 = entrada.nextDouble();
		
		System.out.println("Informa o Operador: ");
		String op = entrada.next();
		
		//Logica
		double resultado = "+".equals(op) ? num1 + num2 : 0;
		resultado = "-".equals(op) ? num1 - num2 : resultado;
		resultado = "*".equals(op) ? num1 * num2 : resultado;
		resultado = "/".equals(op) ? num1 / num2 : resultado;
		
		System.out.printf("%.2f %s %.2f= ?", num1, op, num2);	
		entrada.close();
	}
}
