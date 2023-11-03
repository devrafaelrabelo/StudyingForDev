package rabelobank;

import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		Banco banco = new Banco();

		System.out.println("Bem Vindo ao RabeloBank");
		
		Conta cp1 = new ContaCorrente(10001, banco);
		Conta cp2 = new ContaCorrente(10002, banco);
		
		Cliente c1 = new Cliente("Rafael Rabelo", 11111111100L, "29/03/1990", banco, cp1);
		Cliente c2 = new Cliente("Roger Rabelo", 11111111101L, "29/03/1991", banco, cp2);
		
		System.out.println();
		
		System.out.println(c1);
		System.out.println();
		c1.contas.get(0).depositoBancario(10000);
		c1.contas.get(0).saqueBancario(5.50);
		c1.contas.get(0).transferBancario(500, cp2);
		
		
		System.out.println(c1);
		
		System.out.println();		
		
		System.out.println(c2);

		
		
		
		
		
		
		
		
		
		
		entrada.close();
	}
}
