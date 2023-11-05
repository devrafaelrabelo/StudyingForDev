package rabelobank;

public class CompTransferenciaRecebida {

	Conta conta;
	double valor;

	public CompTransferenciaRecebida(Conta destino, double valor) {
		this.conta = destino;
		this.valor = valor;
	}

	@Override
	public String toString() {
		return "Origem = " + conta.getCodigo() + " - valor = " + valor + "\n";
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
