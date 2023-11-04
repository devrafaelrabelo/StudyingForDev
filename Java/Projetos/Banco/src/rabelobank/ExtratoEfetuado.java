package rabelobank;

public class ExtratoEfetuado {

	Conta conta;
	double valor;

	public ExtratoEfetuado(Conta destino, double valor) {
		this.conta = destino;
		this.valor = valor;
	}

	@Override
	public String toString() {
		return "Extrato [destino=" + conta + ", valor=" + valor + "]";
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
