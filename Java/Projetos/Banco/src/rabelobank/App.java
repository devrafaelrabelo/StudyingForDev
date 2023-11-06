package rabelobank;

import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		Banco banco = new Banco();
		System.out.println("Bem Vindo ao RabeloBank");

		Conta cc1 = new ContaCorrente(10001, banco);
		Conta cc2 = new ContaPoupanca(10002, banco);
		Conta cc3 = new ContaCorrente(10003, banco);
		Conta cc4 = new ContaPoupanca(10004, banco);
		Conta cc5 = new ContaCorrente(10005, banco);
		Conta cc6 = new ContaPoupanca(10006, banco);
		Conta cc7 = new ContaCorrente(10007, banco);
		Conta cc8 = new ContaPoupanca(10008, banco);

		new Cliente("Rafael Rabelo", 11111111100L, "29/03/1990", banco, cc1);
		new Cliente("Roger Rabelo", 11111111101L, "29/03/1991", banco, cc2);
		new Cliente("Oscar Rabelo", 11111111102L, "29/03/1992", banco, cc3);
		new Cliente("Violeta Rabelo", 11111111103L, "29/03/1993", banco, cc4);
		new Cliente("Raiane Rabelo", 11111111104L, "29/03/1994", banco, cc5);
		new Cliente("Jair Rabelo", 11111111105L, "29/03/1995", banco, cc6);
		new Cliente("Maria Rabelo", 11111111106L, "29/03/1996", banco, cc7);
		new Cliente("Filhote Rabelo", 11111111107L, "29/03/1997", banco, cc8);

		System.out.println(banco);
		
	

		banco.retornaContasObj("10001-1").depositoBancario(50000);
		banco.retornaContasObj("10001-1").transferBancario(2000, banco.retornaContasObj("10003-1"));
		banco.retornaContasObj("10001-1").depositoBancario(40000);
		banco.retornaContasObj("10001-1").saqueBancario(8000);
		banco.retornaContasObj("10001-1").depositoBancario(10000);
		banco.retornaContasObj("10001-1").transferBancario(38000, banco.retornaContasObj("10003-1"));
		banco.retornaContasObj("10001-1").saqueBancario(52000);

		banco.retornaContasObj("10003-1").depositoBancario(2000);
		banco.retornaContasObj("10003-1").saqueBancario(900000);
		banco.retornaContasObj("10003-1").depositoBancario(2000);
		banco.retornaContasObj("10003-1").saqueBancario(8000);
		banco.retornaContasObj("10003-1").depositoBancario(2000);
		banco.retornaContasObj("10003-1").saqueBancario(8000);
		banco.retornaContasObj("10003-1").depositoBancario(2000);
		banco.retornaContasObj("10003-1").saqueBancario(8000);
		banco.retornaContasObj("10003-1").depositoBancario(2000);
		banco.retornaContasObj("10003-1").saqueBancario(26000);

		System.out.println(banco.retornaContasObj("10001-1"));
		System.out.println(banco.retornaContasObj("10003-1"));

		banco.retornaContasObj("10001-1").imprimirExtratoCompleto();

		System.out.println();
		System.out.println();

		banco.retornaContasObj("10003-1").imprimirExtratoCompleto();

		System.out.println();
		System.out.println();

		System.out.println(banco.retornaContasObj("10001-1"));
		System.out.println(banco.retornaContasObj("10003-1"));

		entrada.close();
	}
}
