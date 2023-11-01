package desafio;

public class Carro {
	
	
	final int VELOCIDADE_MAXIMA;
	int velocidadeAtual = 0;
	int aceleracao = 5;
	int freagem = 5;
	
	Carro(){
		this(180);
	}
	
	Carro(int velocidadeMaxima) {
		VELOCIDADE_MAXIMA = velocidadeMaxima;
	}
	
	void acelerar() {
		if(velocidadeAtual + aceleracao > VELOCIDADE_MAXIMA) {
			velocidadeAtual = VELOCIDADE_MAXIMA;
		} else {
			this.velocidadeAtual += + aceleracao; 		
		}		
	}
	
	void frear() {
		if (velocidadeAtual >= 5) {
			this.velocidadeAtual += - freagem; 
		} else {
			this.velocidadeAtual = 0;
		}		
	}
	
}
