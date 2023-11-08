package stream;

import java.util.Objects;

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

	@Override
	public String toString() {
		return "Aluno [nome=" + nome + ", nota=" + nota + ", bomCoportamento=" + bomCoportamento + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(bomCoportamento, nome, nota);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Aluno other = (Aluno) obj;
		return bomCoportamento == other.bomCoportamento && Objects.equals(nome, other.nome)
				&& Double.doubleToLongBits(nota) == Double.doubleToLongBits(other.nota);
	}
	
	
}
