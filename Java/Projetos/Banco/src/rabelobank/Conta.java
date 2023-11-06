package rabelobank;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public abstract class Conta {

	final private int IDCONTA;
	private int digito;
	double saldo = 0;
	Banco banco;
	List<Cliente> clientes = new ArrayList<Cliente>();
	List<CompTransferenciaEfetuada> CompTransferenciaEfetuada = new ArrayList<CompTransferenciaEfetuada>();
	List<CompTransferenciaRecebida> CompTransferenciaRecebida = new ArrayList<CompTransferenciaRecebida>();	
	List<CompDeposito> extratoDeposito = new ArrayList<CompDeposito>();
	List<CompSaque> extratoSaque = new ArrayList<CompSaque>();
	List<Comp> extratoCompleto = new ArrayList<Comp>();

	public Conta(int IDCONTA, int digito, Banco banco) {
		this.IDCONTA = IDCONTA;
		this.digito = digito;		
	}	
	
	public void imprimirExtratoCompleto() {
		System.out.println("Cliente " + this.clientes.get(0).getNome()
				+ "\nExtrato Completo");
		if( extratoCompleto.size() != 0) {
			System.out.println(extratoCompleto);
		} else {
			System.out.println("Não existe historico");
		}
	}

	boolean depositoBancario(double deposito) {
		if (deposito != 0) {
			this.saldo += deposito;
			this.extratoDeposito.add(new CompDeposito(deposito));
			this.extratoCompleto.add(new Comp("R$ +" + deposito + "\n"));
			return true;
		}
		return false;	
		
	}

	boolean saqueBancario(double deposito) {
		if (deposito > 0 && (this.saldo - deposito) >= 0) {
			this.saldo -= deposito;
			this.extratoSaque.add(new CompSaque(deposito));
			this.extratoCompleto.add(new Comp("R$ -" + deposito + "\n"));
			return true;
		}		
		return false;	
	}

	boolean transferBancario(double deposito, Conta conta) {
		if (conta != null) {
			if (deposito > 0 && (this.saldo - deposito) >= 0) {
				this.saldo -= deposito;
				conta.saldo += deposito;
				conta.extratoDeposito.add(new CompDeposito(deposito));
				this.CompTransferenciaEfetuada.add(new CompTransferenciaEfetuada(conta, deposito));
				this.extratoCompleto
						.add(new Comp("Destino = " + conta.getCodigo() + " | R$ +" + deposito + "\n"));
				conta.CompTransferenciaRecebida.add(new CompTransferenciaRecebida(this, deposito));
				conta.extratoCompleto
						.add(new Comp("Origem = " + this.getCodigo() + " | R$ +" + deposito + "\n"));
				return true;
			}
		} else {
			return false;
		}
		return false;
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
