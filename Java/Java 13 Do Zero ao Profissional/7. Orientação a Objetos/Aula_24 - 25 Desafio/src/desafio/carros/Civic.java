package desafio.carros;

public class Civic extends Carro {
	
	public Civic() {
		this(260);
	}
	
	public Civic(int velocidadeMaxima) {
		super(velocidadeMaxima);
		this.aceleracao = 15;
	}
	
	public void acelerar() {
		super.acelerar();		
	}
}
