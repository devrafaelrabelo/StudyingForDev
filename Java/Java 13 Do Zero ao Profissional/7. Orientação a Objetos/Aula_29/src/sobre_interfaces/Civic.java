package sobre_interfaces;

public class Civic extends Carro {
	
	public Civic() {
		this(260);
	}
	
	public Civic(int velocidadeMaxima) {
		super(velocidadeMaxima);
		this.setAceleracao(15);
	}
	
	public void acelerar() {
		super.acelerar();		
	}
}
