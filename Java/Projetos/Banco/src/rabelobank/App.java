package rabelobank;

import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		Banco banco = new Banco();

		System.out.println("Bem Vindo ao RabeloBank");

		Cliente c1 = new Cliente("Rafael Rabelo", 11111111100L, "29/03/1990", banco,new ContaCorrente(10001, banco));
		new Cliente("Rafael Rabelo", 11111111101L, "29/03/1991", banco,new ContaCorrente(10002, banco));
		new Cliente("Roger Rabelo", 11111111102L, "17/11/1992", banco, new ContaCorrente(10003, banco));
		new Cliente("Violeta Rabelo", 11111111103L, "17/11/1993", banco, new ContaPoupanca(10004, banco));
		new Cliente("Oscar Rabelo", 11111111104L, "17/11/1994", banco,new ContaPoupanca(10005, banco));
		new Cliente("Raiane Rabelo", 11111111105L, "17/11/1995", banco, new ContaCorrente(10006, banco));
		new Cliente("Raiane Rabelo", 11111111106L, "17/11/1995", banco, new ContaCorrente(10007, banco));
	
		
		System.out.println("--------------------------------");
		banco.imprimirContasContas();

		System.out.println("--------------------------------");
		banco.imprimirContasCorrente();

		System.out.println("--------------------------------");
		banco.imprimirContasPoupanca();

		System.out.println("--------------------------------");
		banco.imprimirClientes();
		
		System.out.println("--------------------------------");

		System.out.println(c1.contas.get(0));
		
		c1.contas.get(0).depositoBancario(20000);
		
		System.out.println(c1.contas.get(0));
		
		entrada.close();
	}
}
