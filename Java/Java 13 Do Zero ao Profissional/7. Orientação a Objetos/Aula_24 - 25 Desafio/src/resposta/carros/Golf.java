package resposta.carros;

public class Golf extends Carro{	
	
	public Golf() {
		this(220);
	}
	
	public Golf(int velocidadeMaxima) {
		super(velocidadeMaxima);
		this.aceleracao = 10;
	}
	
	public void acelerar() {
		super.acelerar();		
	}
}
