package rabelobank;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Cliente {

	private String nome;
	private Long CPF;
	private String nascimento;
	List<Conta> contas = new ArrayList<>();
	Banco banco;
	
//	Construtores 
//	-------------------------------------------------
	
	public Cliente(Cliente cliente, Conta conta, Banco banco) {
		this.nome = cliente.nome;
		this.CPF = cliente.CPF;
		this.nascimento = cliente.nascimento;
		adicionandoCliente(this, banco, conta);
	}
	
	public Cliente(String nome, Long cPF, String nascimento) {
		this.nome = nome;
		this.CPF = cPF;
		this.nascimento = nascimento;		
	}		
	
	public Cliente(String nome, Long cPF, String nascimento, Banco banco, Conta conta) {
		this.nome = nome;
		this.CPF = cPF;
		this.nascimento = nascimento;
		adicionandoCliente(this, banco, conta);
	}
	
//	-------------------------------------------------
//	-------------------------------------------------------------------	

//	Adicionando a cliente ao banco 
//	-------------------------------------------------
	
	public boolean adicionandoCliente(Cliente cliente, Banco banco, Conta conta) {
		if (banco.clientes.contains(cliente) || banco.contas.contains(conta)) {
			return false;
		}
		contas.add(conta);
		banco.clientes.add(cliente);
		banco.contas.add(conta);
		return true;
	}

//	-------------------------------------------------
//	-------------------------------------------------------------------	
	
//	Nome
//	-------------------------------------------------
	
//	-------------------------------------------------
//	-------------------------------------------------------------------	
	
//	Nome 
//	-------------------------------------------------
	
//	-------------------------------------------------
//	-------------------------------------------------------------------	
	
//	Nome 
//	-------------------------------------------------
	
//	-------------------------------------------------
//	-------------------------------------------------------------------	
	
//	Metodos Padroes ToString, Getters, Setters, hashcode, equals e etc 
//	-------------------------------------------------
	

	@Override
	public String toString() {
		return "Cliente" + "\nNome: " + nome + "\nCPF: " + CPF + "\nNascimento: " + nascimento + "\nContas:\n" + contas;
	}

	@Override
	public int hashCode() {
		return Objects.hash(CPF);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cliente other = (Cliente) obj;
		return Objects.equals(CPF, other.CPF);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Long getCPF() {
		return CPF;
	}

	public void setCPF(Long cPF) {
		CPF = cPF;
	}

	public String getNascimento() {
		return nascimento;
	}

	public void setNascimento(String nascimento) {
		this.nascimento = nascimento;
	}

	public List<Conta> getContas() {
		return contas;
	}
	
//	-------------------------------------------------
//	-------------------------------------------------------------------	
}
