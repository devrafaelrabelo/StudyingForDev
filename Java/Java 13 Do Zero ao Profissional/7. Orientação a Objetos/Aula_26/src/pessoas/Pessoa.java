package pessoas;

public class Pessoa {

	private int idade;
	String nome;
	String CPF;

	public Pessoa(String nome, int idade) {
		setNome(nome);
		setIdade(idade);
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		idade = Math.abs(idade);
		if (idade >= 0) {
			this.idade = idade;
		}
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCPF() {
		return CPF;
	}

	public void setCPF(String CPF) {
		this.CPF = CPF;
	}

	@Override
	public String toString() {
		return "Nome:" + nome + "\nIdade: " + idade + "\nCPF: " + CPF;
	}

}
