package rabelobank_V1_0;

public class CompSaque {
	
	
	double valor;

	public CompSaque(double valor) {
		this.valor = valor;
	}

	@Override
	public String toString() {
		return "R$ -" + valor + "\n";
	}

	
}
