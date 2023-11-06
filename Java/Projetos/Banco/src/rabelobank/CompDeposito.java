package rabelobank;

public class CompDeposito {
	
	double valor;

	public CompDeposito(double valor) {
		this.valor = valor;
		
	}

	@Override
	public String toString() {
		return "R$ +" + valor + "\n";
	}
	
}
