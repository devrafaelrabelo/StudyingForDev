package rabelobank_V1_0;

public class CompTransferenciaRecebida {

	Conta conta;
	double valor;

	public CompTransferenciaRecebida(Conta origem, double valor) {
		this.conta = origem;
		this.valor = valor;
	}

	@Override
	public String toString() {
		return "Origem = " + conta.getCodigo() + " | R$ +" + valor + "\n";
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
