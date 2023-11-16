package rabelobank_V1_0;

import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		Banco banco = new Banco();
		System.out.println("Bem Vindo ao RabeloBank");

		new Cliente("Rafael Rabelo", 11111111100L, "29/03/1990", banco,
				new ContaCorrente(10001, banco));
		new Cliente("Roger Rabelo", 11111111101L, "29/03/1991", banco,
				new ContaCorrente(10002, banco));
		new Cliente("Oscar Rabelo", 11111111102L, "29/03/1992", banco,
				new ContaCorrente(10003, banco));
		new Cliente("Violeta Rabelo", 11111111103L, "29/03/1993", banco,
				new ContaCorrente(10004, banco));
		new Cliente("Raiane Rabelo", 11111111104L, "29/03/1994", banco,
				new ContaCorrente(10005, banco));
		new Cliente("Jair Rabelo", 11111111105L, "29/03/1995", banco,
				new ContaCorrente(10006, banco));
		new Cliente("Maria Rabelo", 11111111106L, "29/03/1996", banco,
				new ContaCorrente(10007, banco));
		new Cliente("Filhote Rabelo", 11111111107L, "29/03/1997", banco,
				new ContaCorrente(10008, banco));

		banco.retornaClienteObj(11111111100L).adicionandoConta(
				banco, new ContaPoupanca(10001, banco));
		banco.retornaClienteObj(11111111102L).adicionandoConta(
				banco, new ContaPoupanca(10002, banco));
		banco.retornaClienteObj(11111111103L).adicionandoConta(
				banco, new ContaPoupanca(10003, banco));
		banco.retornaClienteObj(11111111104L).adicionandoConta(
				banco, new ContaPoupanca(10004, banco));
		banco.retornaClienteObj(11111111105L).adicionandoConta(
				banco, new ContaPoupanca(10005, banco));
		banco.retornaClienteObj(11111111106L).adicionandoConta(
				banco, new ContaPoupanca(10006, banco));
		banco.retornaClienteObj(11111111107L).adicionandoConta(
				banco, new ContaPoupanca(10007, banco));
		banco.retornaClienteObj(11111111107L).adicionandoConta(
				banco, new ContaPoupanca(10008, banco));



	
		/**
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
		*/
		entrada.close();
	}
}
