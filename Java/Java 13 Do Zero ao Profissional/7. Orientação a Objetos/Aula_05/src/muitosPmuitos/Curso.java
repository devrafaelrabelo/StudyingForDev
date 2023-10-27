package muitosPmuitos;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Curso {
	
	final String nome;
	final int codigo;
	
	final List<Aluno> alunos = new ArrayList<Aluno>();
	final List<Faculdade> faculdades = new ArrayList<>();
	
	Curso(String nome, int codigo) {
		this.nome = nome;
		this.codigo = codigo;		
	}
	
	void adicionandoNaFaculdade(Faculdade faculdade) {
		faculdade.cursos.add(this);
	}
	
	void adicionarAluno(Aluno aluno) {
		this.alunos.add(aluno);
		aluno.cursos.add(this);	
	}
	
	void removerAluno(Aluno aluno) {
		this.alunos.remove(aluno);
		aluno.cursos.remove(this);		
	}
	
	void formarAlunos(Aluno aluno) {
		this.alunos.isEmpty();
		aluno.cursos.isEmpty();		
	}
	
	Aluno obterAlunoPorNome(String nome) {
		for (Aluno aluno : this.alunos) {
			if (aluno.nome.equalsIgnoreCase(nome)) {
				return aluno;
			}			
		}
		return null;
	}

	@Override
	public String toString() {
		return "\nNome: " + nome + " | Codigo: " + codigo 
				+ "\nMatriculados: " + alunos.size();
	}

	public String getNome() {
		return nome;
	}
	
	void imprimirAlunosMatriculados() {
		System.out.println(toString());
		System.out.println("Lista de Chamada");
		int i = 1;
		for (Aluno aluno : alunos) {
			System.out.println(i + "º " + aluno.getNome());
			i++;
		}
	}

	@Override
	public int hashCode() {
		return Objects.hash(codigo);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Curso other = (Curso) obj;
		return codigo == other.codigo;
	}
	
	
	
}
