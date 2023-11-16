package rabelobank_V1_0;

public class CompTransferenciaRecebida {

	Conta conta;
	double valor;
	String dataAtualFormatada;

	public CompTransferenciaRecebida(Conta origem, double valor, String dataAtualFormatada) {
		this.conta = origem;
		this.valor = valor;
		this.dataAtualFormatada = dataAtualFormatada;
	}

	@Override
	public String toString() {
		return dataAtualFormatada + " | " +"Origem = " + conta.getCodigo() + " | R$ +" + valor + "\n";
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
