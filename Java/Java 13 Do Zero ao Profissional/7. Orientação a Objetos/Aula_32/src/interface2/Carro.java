package interface2;

public class Carro {
	
	
	final private int VELOCIDADE_MAXIMA;
	private int velocidadeAtual = 0;
	private int aceleracao = 5;
	private int freagem = 5;
	
	public Carro(){
		this(180);
	}
	
	public Carro(int velocidadeMaxima) {
		VELOCIDADE_MAXIMA = velocidadeMaxima;
	}
	
	public void acelerar() {
		if(velocidadeAtual + getAceleracao() > VELOCIDADE_MAXIMA) {
			velocidadeAtual = VELOCIDADE_MAXIMA;
		} else {
			this.velocidadeAtual += + getAceleracao(); 		
		}		
	}
	
	public void frear() {
		if (velocidadeAtual >= 5) {
			this.velocidadeAtual += - freagem; 
		} else {
			this.velocidadeAtual = 0;
		}		
	}

	public int getVelocidadeAtual() {
		return velocidadeAtual;
	}

	public void setVelocidadeAtual(int velocidadeAtual) {
		this.velocidadeAtual = velocidadeAtual;
	}

	public int getAceleracao() {
		return aceleracao;
	}

	public void setAceleracao(int aceleracao) {
		this.aceleracao = aceleracao;
	}

	public int getFreagem() {
		return freagem;
	}

	public void setFreagem(int freagem) {
		this.freagem = freagem;
	}

	public int getVELOCIDADE_MAXIMA() {
		return VELOCIDADE_MAXIMA;
	}
	
	
}
