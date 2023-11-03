package rabelobank;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Conta {

	final private int IDCONTA;
	private int digito;
	double saldo = 0;
	Banco banco;
	List<Cliente> clientes = new ArrayList<Cliente>();

	public Conta(int IDCONTA, int digito, Banco banco) {
		this.IDCONTA = IDCONTA;
		this.digito = digito;
		adicionandoConta(this, banco);
	}

	public boolean adicionandoConta(Conta conta, Banco banco) {
		if (banco.contas.contains(conta)) {
			return false;
		}
		banco.contas.add(conta);
		return true;
	}

	void depositoBancario(double deposito) {
		this.saldo += deposito;
	}

	void saqueBancario(double deposito) {
		this.saldo -= deposito;
	}

	void transferBancario(double deposito, Conta conta) {
		this.saldo -= deposito;
		conta.depositoBancario(deposito);
	}

	@Override
	public String toString() {
		return "IDCONTA: " + IDCONTA + "-" + digito + " Saldo: " + saldo + "\n";
	}

	public void imprimirClientes() {
		System.out.println("IDCONTA: " + getCodigo() + " Saldo: " + saldo + "\nCORRENTISTAS:");
		retornaClientes();
	}

	public void retornaClientes() {
		for (Cliente cliente : clientes) {
			System.out.println(cliente.getNome());
		}

	}

	@Override
	public int hashCode() {
		return Objects.hash(IDCONTA);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Conta other = (Conta) obj;
		return IDCONTA == other.IDCONTA;
	}

	public String getCodigo() {
		return IDCONTA + "-" + digito;
	}

	public int getDigito() {
		return digito;
	}

	public void setDigito(int digito) {
		this.digito = digito;
	}

	public int getNumero() {
		return IDCONTA;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

}
