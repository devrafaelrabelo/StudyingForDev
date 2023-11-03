package rabelobank;

import java.util.ArrayList;
import java.util.List;

public class Banco {

	final private String nome = "RabeloBank";
	List<Conta> contas = new ArrayList<Conta>();
	List<Cliente> clientes = new ArrayList<Cliente>();

	public void imprimirContas() {
		System.out.println("CONTAS:");
		retornaClientes();
	}

	public void retornaContas() {
		for (Cliente cliente : clientes) {
			System.out.println(cliente.getNome());
		}

	}

	public void imprimirClientes() {
		System.out.println("CORRENTISTAS:");
		retornaClientes();
	}

	public void imprimirContasCorrente() {
		System.out.println("CONTAS CORRENTE:");
		retornaContasCorrente();
	}

	public void imprimirContasPoupanca() {
		System.out.println("CONTAS POUPANÇA:");
		retornaContasPoupanca();
	}

	public void imprimirContasContas() {
		System.out.println("CONTAS:");
		retornaContasContas();
	}

	public void retornaClientes() {
		for (Cliente cliente : clientes) {
			System.out.println(cliente.getNome());
		}

	}

	public void retornaContasCorrente() {
		for (Conta conta : contas) {
			if (conta.getDigito() == 1) {
				System.out.println(conta);
			}
		}
	}

	public void retornaContasPoupanca() {
		for (Conta conta : contas) {
			if (conta.getDigito() == 2) {
				System.out.println(conta);
			}
		}
	}

	public void retornaContasContas() {
		for (Conta conta : contas) {
			if (conta.getDigito() == 0) {
				System.out.println(conta);
			}
		}
	}

	public String getNome() {
		return nome;
	}

}
