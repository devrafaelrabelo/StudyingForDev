package resposta.carros;

public class Carro {
	
	
	final int VELOCIDADE_MAXIMA;
	protected int velocidadeAtual = 0;
	int aceleracao = 5;
	int freagem = 5;
	
	public Carro(){
		this(180);
	}
	
	public Carro(int velocidadeMaxima) {
		VELOCIDADE_MAXIMA = velocidadeMaxima;
	}
	
	public void acelerar() {
		if(velocidadeAtual + aceleracao > VELOCIDADE_MAXIMA) {
			velocidadeAtual = VELOCIDADE_MAXIMA;
		} else {
			this.velocidadeAtual += + aceleracao; 		
		}		
	}
	
	public void frear() {
		if (velocidadeAtual >= 5) {
			this.velocidadeAtual += - freagem; 
		} else {
			this.velocidadeAtual = 0;
		}		
	}	
	
	public String toString() {		
		return "Velocidade atual é " + velocidadeAtual + "Km/h"; 
	}
	
}
