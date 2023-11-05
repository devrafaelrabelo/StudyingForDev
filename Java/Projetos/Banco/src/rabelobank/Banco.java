package rabelobank;

import java.util.ArrayList;
import java.util.List;

public class Banco {

	final private String nome = "RabeloBank";
	List<Conta> contas = new ArrayList<Conta>();
	List<Cliente> clientes = new ArrayList<Cliente>();

//	Funçoes para buscar e imprimir as contas do Banco -----------------
//	-------------------------------------------------
	
	public void imprimirContas() {
		System.out.println("CONTAS:");
		retornaClientes();
	}

	public void retornaContas() {
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

	public void imprimirContasCorrente() {
		System.out.println("CONTAS CORRENTE:");
		retornaContasCorrente();
	}

	public void retornaContasPoupanca() {
		for (Conta conta : contas) {
			if (conta.getDigito() == 2) {
				System.out.println(conta);
			}
		}
	}

	public void imprimirContasPoupanca() {
		System.out.println("CONTAS POUPANÇA:");
		retornaContasPoupanca();
	}

	public void retornaContasSimple() {
		for (Conta conta : contas) {
			if (conta.getDigito() == 0) {
				System.out.println(conta);
			}
		}
	}

	public void imprimirContasSimples() {
		System.out.println("CONTAS:");
		retornaContasSimple();
	}

//	-------------------------------------------------
//	-------------------------------------------------------------------
	
//	Funçoes para validar se a conta e cliente desejado existe no banco 
//	-------------------------------------------------
	public Conta retornaContasObj(String codigo) {
		for (Conta conta : contas) {
			if (conta.getCodigo().equals(codigo)) {
				return conta;
			}
		}
		return null;
	}

	public Cliente retornaClienteObj(Long CPF) {
		for (Cliente cliente : clientes) {
			if (cliente.getCPF() == CPF) {
				return cliente;
			}
		}
		return null;
	}
	
//	-------------------------------------------------
//	-------------------------------------------------------------------
	
//	Funçoes para buscar e imprimir as Cliente do Banco ----------------
//	-------------------------------------------------
	public void imprimirClientes() {
		System.out.println("CORRENTISTAS:");
		retornaClientes();
	}

	public void retornaClientes() {
		for (Cliente cliente : clientes) {
			System.out.println(cliente.getNome());
		}

	}

//	-------------------------------------------------
//	-------------------------------------------------------------------
	
//	Metodos Padroes ToString, Getters, Setters, hashcode, equals e etc 
//	-------------------------------------------------
	
	public String getNome() {
		return nome;
	}

	@Override
	public String toString() {
		return "------------------------------------"
				+ "\nBanco\n"
				+ "Nome: " + nome 
				+ "\nContas: " + contas.size() 
				+ "\nClientes: " + clientes.size()
				+ "\n------------------------------------";
	}
	
//	-------------------------------------------------
//	-------------------------------------------------------------------


}
