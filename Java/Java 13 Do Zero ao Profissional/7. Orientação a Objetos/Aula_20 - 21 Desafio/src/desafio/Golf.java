package desafio;

public class Golf extends Carro{
	
	
	public Golf() {
		this(220);
	}
	
	Golf(int velocidadeMaxima) {
		super(velocidadeMaxima);
		this.aceleracao = 10;
	}
	
	void acelerar() {
		super.acelerar();		
	}
}
