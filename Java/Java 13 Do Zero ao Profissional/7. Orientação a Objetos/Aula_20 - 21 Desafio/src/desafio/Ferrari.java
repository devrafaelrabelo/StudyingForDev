package desafio;

public class Ferrari extends Carro {
	
	public Ferrari() {
		this(400);
	}
	
	public Ferrari(int velocidadeMaxima) {
		super(velocidadeMaxima);
		this.aceleracao = 20;
	}
	
	void acelerar() {
		super.acelerar();		
	}
	
	
}
