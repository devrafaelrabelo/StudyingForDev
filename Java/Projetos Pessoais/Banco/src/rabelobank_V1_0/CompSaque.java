package rabelobank_V1_0;

public class CompSaque {
	
	
	double valor;
	String dataAtualFormatada;

	public CompSaque(double valor, String dataAtualFormatada) {
		this.dataAtualFormatada = dataAtualFormatada;
		this.valor = valor;
	}

	@Override
	public String toString() {
		return dataAtualFormatada + " | R$ -" + valor + "\n";
	}

	
}
