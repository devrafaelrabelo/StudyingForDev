package Desafio;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Desafio {
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);		
		System.out.println("Passo 1");		
		int num1 = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o 1º:"));
		int num2 = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o 2º:"));	
		String operacao = JOptionPane.showInputDialog(null, "Digite o operador\n" 
													+ " ( * ) Multiplicação\n"
													+ " ( / ) Divisão\n"
													+ " ( + ) Soma\n"
													+ " ( - ) Subtração");

		int resultado = "*".equals(operacao) ? num1 * num2 : 0;
		resultado = "/".equals(operacao) ? num1 / num2 : resultado;
		resultado = "+".equals(operacao) ? num1 + num2 : resultado;
		resultado = "-".equals(operacao) ? num1 - num2 : resultado;
		
		JOptionPane.showInputDialog(null, "O Resultado é: ", resultado);
		entrada.close();
		
		
		
	}
}	
