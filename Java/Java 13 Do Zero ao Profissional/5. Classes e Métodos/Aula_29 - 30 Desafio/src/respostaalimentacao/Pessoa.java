package respostaalimentacao;

public class Pessoa {
	
	String nome;
	double peso;
	double pesoInicial;
	
	Pessoa(String nome, double peso){
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
	
	void Comer(Comida comida) {		
		if(comida.nome != null) {
			this.pesoInicial = peso;
			this.peso = peso + comida.peso;		
			System.out.println("Pessoa"
					+ "\nNome: " + nome 
					+ "\nPeso Antes: " + this.pesoInicial
					+ "\nFez uma refeição de " + comida.nome + " c/ " + comida.peso + "g"	
					+ "\nPeso Final: " + peso				
					+ "\n");
		}		
	}
	
}
