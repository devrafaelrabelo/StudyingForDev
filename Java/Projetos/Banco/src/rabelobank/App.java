package rabelobank;

import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		Banco banco = new Banco();
		System.out.println("Bem Vindo ao RabeloBank");
		//System.out.println(banco);

		Conta cc1 = new ContaCorrente(10001, banco);
		Conta cc2 = new ContaPoupanca(10002, banco);
		Conta cc3 = new ContaCorrente(10003, banco);
		Conta cc4 = new ContaPoupanca(10004, banco);
		Conta cc5 = new ContaCorrente(10005, banco);
		Conta cc6 = new ContaPoupanca(10006, banco);
		Conta cc7 = new ContaCorrente(10007, banco);
		Conta cc8 = new ContaPoupanca(10008, banco);		

		Cliente c1 = new Cliente("Rafael Rabelo", 11111111100L, "29/03/1990");
		Cliente c2 = new Cliente("Roger Rabelo", 11111111101L, "29/03/1991");
		Cliente c3 = new Cliente("Oscar Rabelo", 11111111102L, "29/03/1992");
		Cliente c4 = new Cliente("Violeta Rabelo", 11111111103L, "29/03/1993");
		Cliente c5 = new Cliente("Raiane Rabelo", 11111111104L, "29/03/1994");
		Cliente c6 = new Cliente("Jair Rabelo", 11111111105L, "29/03/1995");
		Cliente c7 = new Cliente("Maria Rabelo", 11111111106L, "29/03/1996");
		Cliente c8 = new Cliente("Filhote Rabelo", 11111111107L, "29/03/1997");
		
		new Cliente(c1,cc1 ,banco);
		new Cliente(c2,cc2 ,banco);
		new Cliente(c3,cc3 ,banco);
		new Cliente(c4,cc4 ,banco);
		new Cliente(c5,cc5 ,banco);
		new Cliente(c6,cc6 ,banco);
		new Cliente(c7,cc7 ,banco);
		new Cliente(c8,cc8 ,banco);
		
		System.out.println(banco.retornaContasObj("10001-1"));
		System.out.println(banco.retornaContasObj("10003-1"));
		
		banco.retornaContasObj("10001-1").depositoBancario(50000);
		banco.retornaContasObj("10003-1").depositoBancario(500);
		
		System.out.println(banco.retornaContasObj("10001-1"));
		System.out.println(banco.retornaContasObj("10003-1"));
		
		banco.retornaContasObj("10001-1").transferBancario(20, banco.retornaContasObj("10003-1"));
		banco.retornaContasObj("10001-1").transferBancario(456, banco.retornaContasObj("10003-1"));
		banco.retornaContasObj("10001-1").transferBancario(123, banco.retornaContasObj("10003-1"));
		banco.retornaContasObj("10001-1").transferBancario(951, banco.retornaContasObj("10003-1"));
		banco.retornaContasObj("10001-1").transferBancario(1, banco.retornaContasObj("10003-1"));
		banco.retornaContasObj("10001-1").transferBancario(90, banco.retornaContasObj("10003-1"));
		banco.retornaContasObj("10001-1").transferBancario(1, banco.retornaContasObj("10003-1"));
		banco.retornaContasObj("10001-1").transferBancario(60, banco.retornaContasObj("10003-1"));
		banco.retornaContasObj("10001-1").transferBancario(80, banco.retornaContasObj("10003-1"));	
		banco.retornaContasObj("10001-1").transferBancario(1000, banco.retornaContasObj("10003-1"));	
		
		banco.retornaContasObj("10001-1").imprimirCompTransferenciaEfetuada();
		banco.retornaContasObj("10003-1").imprimirCompTransferenciaRecebida();
		System.out.println("");
		
		System.out.println(banco.retornaContasObj("10001-1"));
		System.out.println(banco.retornaContasObj("10003-1"));
		
		//System.out.println();
		//System.out.println(banco);
		
		entrada.close();
	}
}
