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
	List<CompTransferenciaEfetuada> CompTransferenciaEfetuada = new ArrayList<CompTransferenciaEfetuada>();
	List<CompTransferenciaRecebida> CompTransferenciaRecebida = new ArrayList<CompTransferenciaRecebida>();	
	List<CompDeposito> extratoDeposito = new ArrayList<CompDeposito>();
	List<CompSaque> extratoSaque = new ArrayList<CompSaque>();

	public Conta(int IDCONTA, int digito, Banco banco) {
		this.IDCONTA = IDCONTA;
		this.digito = digito;		
	}	

	void depositoBancario(double deposito) {
		if (deposito != 0) {
			this.saldo += deposito;
			this.extratoDeposito.add(new CompDeposito(deposito));
		}	
		
	}

	void saqueBancario(double deposito) {
		if (deposito != 0 && (this.saldo - deposito) >= 0) {
			this.saldo -= deposito;
			this.extratoSaque.add(new CompSaque(deposito));
		}		
	}

	boolean transferBancario(double deposito, Conta conta) {
		if (conta != null) {
			this.saldo -= deposito;
			conta.depositoBancario(deposito);
			this.CompTransferenciaEfetuada.add(new CompTransferenciaEfetuada(conta, deposito));
			conta.CompTransferenciaRecebida.add(new CompTransferenciaRecebida(this, deposito));
			return true;
		} else {
			return false;
		}
	}
	
	public void imprimirCompTransferenciaEfetuada() {
		System.out.println("Extrato Transferencia Efetuada");
		if( CompTransferenciaEfetuada.size() != 0) {
			System.out.println(CompTransferenciaEfetuada);
		} else {
			System.out.println("Não existe historico");
		}
	}
	
	public void imprimirCompTransferenciaRecebida() {
		System.out.println("Extrato Transferencia Recebida");
		if( CompTransferenciaRecebida.size() != 0) {
			System.out.println(CompTransferenciaRecebida);
		} else {
			System.out.println("Não existe historico");
		}
	}
	
	public void imprimirCompDeposito() {
		System.out.println("Extrato Deposito");
		if( extratoDeposito.size() != 0) {
			System.out.println(extratoDeposito);
		} else {
			System.out.println("Não existe historico");
		}
	}
	
	public void imprimirCompSaque() {
		System.out.println("Extrato Saque");
		if( extratoSaque.size() != 0) {
			System.out.println(extratoSaque);
		} else {
			System.out.println("Não existe historico");
		}
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
