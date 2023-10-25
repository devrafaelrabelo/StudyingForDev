package respostaalimentacao;

public class Comida {
	
	String nome;
	double peso;
	
	Comida(String nome, double peso) {
		this.nome = nome;
		this.peso = peso;
	}
	
	Comida() {
		
	}
	
	@Override
	public String toString() {
		return "Pessoa"
				+ "\nNome: " + nome 
				+ "\nPeso: " + peso
				+"\n";
	}
	
}
