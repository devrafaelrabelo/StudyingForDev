package excecao;

public class Aluno {

	public String nome;
	public double nota;
	public boolean bomCoportamento;

	public Aluno(String nome, double nota) {
		this(nome, nota, true);
	}

	public Aluno(String nome, double nota, boolean bomCoportamento) {
		this.nome = nome;
		this.nota = nota;
		this.bomCoportamento = bomCoportamento;
	}
}
