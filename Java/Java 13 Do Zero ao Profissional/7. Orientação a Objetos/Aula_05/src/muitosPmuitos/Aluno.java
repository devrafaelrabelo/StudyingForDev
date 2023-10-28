package muitosPmuitos;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Aluno {
	
	final String nome;
	final int id;
	final List<Curso> cursos = new ArrayList<Curso>();
	final List<Faculdade> faculdades = new ArrayList<>();
	
	
	Aluno(String nome, int id) {		
		this.nome = nome;
		this.id = id;			
	}
	
	void adicionandoNaFaculdade(Faculdade faculdade) {
		faculdade.alunos.add(this);
	}
	
	void adicionarCurso(Curso curso) {
		this.cursos.add(curso);
		curso.alunos.add(this);			
	}
	
	void removerCurso(Curso curso) {
		this.cursos.remove(curso);
		curso.alunos.remove(this);			
	}
	
	Curso obterCursoPorNome(String nome) {
		for (Curso curso : this.cursos) {
			if (curso.nome.equalsIgnoreCase(nome)) {
				return curso;
			}			
		}
		return null;
	}

	@Override
	public String toString() {
		return "\nNome: " + nome + " | ID: " + id 
				+ "\nMatriculado: " + cursos.size();
	}

	public String getNome() {
		return nome;
	}
	
	void imprimirCursosMatriculados() {
		System.out.println(toString());
		System.out.println("Lista de Cursos");
		int i = 1;
		for (Curso curso : cursos) {
			System.out.println(i + "º " + curso.getNome());
			i++;
		}
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
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
		return id == other.id;
	}
	
	
	
}
