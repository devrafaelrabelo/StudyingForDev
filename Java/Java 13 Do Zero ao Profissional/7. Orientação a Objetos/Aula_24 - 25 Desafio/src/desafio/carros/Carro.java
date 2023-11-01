package desafio.carros;

public class Carro {
	
	
	final int VELOCIDADE_MAXIMA;
	public int velocidadeAtual = 0;
	public int aceleracao = 5;
	public int freagem = 5;
	
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
	
}
