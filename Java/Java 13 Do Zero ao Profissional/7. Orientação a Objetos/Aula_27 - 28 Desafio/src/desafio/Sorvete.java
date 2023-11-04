package desafio;

public class Sorvete extends Comida {

	public Sorvete(double peso) {
		super(peso);
	}

	public double getSorvete() {
		return super.getPeso();
	}

	public void setSorvete(double peso) {
		if (peso >= 0) {
			super.setPeso(peso);
		}
	}
}
