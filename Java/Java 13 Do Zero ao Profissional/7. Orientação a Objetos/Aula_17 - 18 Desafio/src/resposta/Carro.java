package resposta;

public class Carro {
	
	int velocidadeAtual = 0;	
	
	void acelerar() {
		velocidadeAtual += + 5; 		
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
