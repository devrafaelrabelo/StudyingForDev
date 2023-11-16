package rabelobank_V1_0;

public class CompTransferenciaEfetuada {

	private final Conta conta;
	private final double valor;
	private final String dataAtualFormatada;

	public CompTransferenciaEfetuada(Conta destino, double valor, String dataAtualFormatada) {
		this.conta = destino;
		this.valor = valor;
		this.dataAtualFormatada = dataAtualFormatada;
	}
	
	@Override
	public String toString() {		
		return dataAtualFormatada + " | " + "Destino = " + conta.getCodigo() + " | R$ -" + valor + "\n";
	}
	/*
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
	*/
}
