package rabelobank;

public class CompSaque {
	
	Conta conta;
	double valor;

	public CompSaque(double valor) {
		this.valor = valor;
	}

	@Override
	public String toString() {
		return "R$ -" + valor + "\n";
	}

	public Conta getDestino() {
		return conta;
	}

	public void setDestino(Conta destino) {
		this.conta = destino;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}
}
