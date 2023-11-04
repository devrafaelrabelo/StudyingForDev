package desafio;

public class Feijao extends Comida {

	public Feijao(double peso) {
		super(peso);
	}

	public double getFeijao() {
		return super.getPeso();
	}

	public void setFeijao(double peso) {
		if (peso >= 0) {
			super.setPeso(peso);
		}
	}
}
