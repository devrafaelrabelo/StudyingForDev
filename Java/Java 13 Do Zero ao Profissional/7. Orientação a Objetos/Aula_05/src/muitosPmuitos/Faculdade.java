package muitosPmuitos;

import java.util.ArrayList;
import java.util.List;

public class Faculdade {
	
	final String nome;	
	final List<Curso> cursos = new ArrayList<Curso>();
	final List<Aluno> alunos = new ArrayList<>();
	
	Faculdade(String nome) {
		this.nome = nome;
	}

	@Override
	public String toString() {
		return "\nNome: " + nome
				+ "\nCursos: " + cursos.size() + " | Alunos: " + alunos.size();
	}
	
	public String getNome() {
		return nome;
	}
	
	Curso obterCursoPorNome(String nome) {
		for (Curso curso : this.cursos) {
			if (curso.nome.equalsIgnoreCase(nome)) {
				return curso;
			}			
		}
		return null;
	}
	
	void imprimirCursosMatriculados() {
		System.out.println(getNome());
		System.out.println("Cursos Disponiveis");
		int i = 1;
		for (Curso curso : cursos) {
			System.out.println(i + "º " + curso.getNome());
			i++;
		}
	}
	
	void imprimirAlunosMatriculados() {
		System.out.println(getNome());
		System.out.println("Alunos Matriculados");
		int i = 1;
		for (Aluno aluno : alunos) {
			System.out.println(i + "º " + aluno.getNome());
			i++;
		}
	}
	
}
