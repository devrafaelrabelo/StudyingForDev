package sobre_interfaces;

public class Golf extends Carro{
	
	
	public Golf() {
		this(220);
	}
	
	public Golf(int velocidadeMaxima) {
		super(velocidadeMaxima);
		this.setAceleracao(10);		
	}
	
	public void acelerar() {
		super.acelerar();		
	}
}
