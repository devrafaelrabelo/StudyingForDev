package rabelobank_V1_0;

public class CompDeposito {
	
	double valor;
	String dataAtualFormatada;

	public CompDeposito(double valor,String dataAtualFormatada) {
		this.dataAtualFormatada = dataAtualFormatada;
		this.valor = valor;
	}

	@Override
	public String toString() {
		return dataAtualFormatada + " | R$ +" + valor + "\n";
	}
	
}
