package reduce;

public class Aluno {
		
	final String nome;
	final double nota;
	final boolean bomCoportamento;
	
	public Aluno(String nome, double nota) {
		this(nome, nota, true);
	}
	
	public Aluno(String nome, double nota, boolean bomCoportamento) {
		this.nome = nome;
		this.nota = nota;
		this.bomCoportamento = bomCoportamento;
	}
	
	
}
