package desafioalimentacao;

public class Comida {
	
	String nome;
	double peso;
	
	Comida(String nome, double peso) {
		this.nome = nome;
		this.peso = peso;
	}
	
	@Override
	public String toString() {
		return "Pessoa"
				+ "\nNome: " + nome 
				+ "\nPeso: " + peso
				+"\n";
	}
	
}
