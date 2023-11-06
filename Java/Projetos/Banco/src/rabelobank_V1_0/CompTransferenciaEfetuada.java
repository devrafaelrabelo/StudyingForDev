package rabelobank_V1_0;

public class CompTransferenciaEfetuada {

	Conta conta;
	double valor;

	public CompTransferenciaEfetuada(Conta destino, double valor) {
		this.conta = destino;
		this.valor = valor;
	}
	
	@Override
	public String toString() {		
		return "Destino = " + conta.getCodigo() + " | R$ -" + valor + "\n";
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
