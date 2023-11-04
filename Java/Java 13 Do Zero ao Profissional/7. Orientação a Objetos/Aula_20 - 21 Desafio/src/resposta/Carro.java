package resposta;

public class Carro {
	
	final int VELOCIDADE_MAXIMA;
	int velocidadeAtual = 0;	
	int delta = 5;
	
	Carro(int velocidadeMaxima) {
		VELOCIDADE_MAXIMA = velocidadeMaxima;
	}
	
	void acelerar() {
		if(velocidadeAtual + delta > VELOCIDADE_MAXIMA) {
			velocidadeAtual = VELOCIDADE_MAXIMA;
		} else {
			this.velocidadeAtual += + delta; 		
		}		
	}
	
	void frear() {
		if (velocidadeAtual >= 5) {
			this.velocidadeAtual -= 5; 
		} else {
			velocidadeAtual = 0;
		}
	}
	
	public String toString() {
		return "Velocidade atual é " + velocidadeAtual + "km/h";
	}
}
