package desafio;

public class Carro {
	
	int velocidadeAtual = 0;
	int aceleracao = 5;
	int freagem = 5;
	
	void acelerar() {
		this.velocidadeAtual += + aceleracao; 		
	}
	
	void frear() {
		if (velocidadeAtual >= 5) {
			this.velocidadeAtual += - freagem; 
		} else {
			this.velocidadeAtual = 0;
		}		
	}
}
