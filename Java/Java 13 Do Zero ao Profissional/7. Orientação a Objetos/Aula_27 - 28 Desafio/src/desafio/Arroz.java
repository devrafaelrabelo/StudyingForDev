package desafio;

public class Arroz extends Comida {

	public Arroz(double peso) {
		super(peso);
	}

	public double getArroz() {
		return super.getPeso();
	}

	public void setArroz(double peso) {
		if (peso >= 0) {
			super.setPeso(peso);
		}
	}
}
