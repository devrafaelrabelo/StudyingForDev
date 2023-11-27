package rabelobank_V1_0;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public abstract class Conta {

	final private int IDCONTA;
	private int digito;
	double saldo = 0;
	Banco banco;
	List<Cliente> clientes = new ArrayList<>();
	List<CompTransferenciaEfetuada> CompTransferenciaEfetuada = new ArrayList<>();
	List<CompTransferenciaRecebida> CompTransferenciaRecebida = new ArrayList<>();
	List<CompDeposito> extratoDeposito = new ArrayList<>();
	List<CompSaque> extratoSaque = new ArrayList<>();
	List<Comp> extratoCompleto = new ArrayList<>();

	public Conta(int IDCONTA, int digito, Banco banco) {
		this.IDCONTA = IDCONTA;
		this.digito = digito;
		this.banco = banco;
	}	
	
	public void imprimirExtratoCompleto() {
		System.out.println("Cliente " + this.clientes.get(0).getNome()
				+ "\nExtrato Completo");
		if(!extratoCompleto.isEmpty()) {
			System.out.println(extratoCompleto);
		} else {
			System.out.println("Não existe historico");
		}
	}

	boolean depositoBancario(double valor) {
		if (valor != 0) {
			String data = dataEHora;
			this.saldo += valor;
			this.extratoDeposito.add(new CompDeposito(valor, data));
			this.extratoCompleto.add(new Comp(valor,data, 1));
			return true;
		}
		return false;	
		
	}

	boolean saqueBancario(double valor) {
		if (valor > 0 && (this.saldo - valor) >= 0) {
			String data = dataEHora;
			this.saldo -= valor;
			this.extratoSaque.add(new CompSaque(valor, data));
			this.extratoCompleto.add(new Comp(valor,data , 2));
			return true;
		}		
		return false;	
	}

	boolean transferBancario(double valor, Conta conta) {
		String data = dataEHora;
		if (conta != null) {
			if (valor > 0 && (this.saldo - valor) >= 0) {
				this.saldo -= valor;
				conta.saldo += valor;
				this.CompTransferenciaEfetuada.add(new CompTransferenciaEfetuada(conta, valor, data));
				this.extratoCompleto
						.add(new Comp(valor, data, 4));
				conta.CompTransferenciaRecebida.add(new CompTransferenciaRecebida(this, valor, data));
				conta.extratoCompleto
						.add(new Comp(valor, data, 3));
				return true;
			}
		} else {
			return false;
		}
		return false;
	}
	
	public void imprimirCompTransferenciaEfetuada() {
		System.out.println("Extrato Transferencia Efetuada");
		if(!CompTransferenciaEfetuada.isEmpty()) {
			System.out.println(CompTransferenciaEfetuada);
		} else {
			System.out.println("Não existe historico");
		}
	}
	
	public void imprimirCompTransferenciaRecebida() {
		System.out.println("Extrato Transferencia Recebida");
		if(!CompTransferenciaRecebida.isEmpty()) {
			System.out.println(CompTransferenciaRecebida);
		} else {
			System.out.println("Não existe historico");
		}
	}
	
	public void imprimirCompDeposito() {
		System.out.println("Extrato Deposito");
		if(!extratoDeposito.isEmpty()) {
			System.out.println(extratoDeposito);
		} else {
			System.out.println("Não existe historico");
		}
	}
	
	public void imprimirCompSaque() {
		System.out.println("Extrato Saque");
		if(!extratoSaque.isEmpty()) {
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

	public int getNumero() {
		return IDCONTA;
	}

	public double getSaldo() {
		return saldo;
	}

//	public String dataEHora() {
//		return new SimpleDateFormat("dd/MM/yyyy HH:mm:ss")
//				.format(System.currentTimeMillis());
//	}
	String dataEHora = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss").format(System.currentTimeMillis());
}