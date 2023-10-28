package muitosPmuitos;

import java.util.Scanner;

public class CursoTeste {

	public static void main(String[] args) {	
				
		System.out.println("Criando Faculdade, Aluno e Cursos");
		
		Faculdade faculdade1 = new Faculdade("Cruzeiro do Sul");
		
		Curso curso1 = new Curso("Engenharia de Software", 10001);
		Curso curso2 = new Curso("Banco de Dados", 10002);
		Curso curso3 = new Curso("Ciencia da Computação", 10003);
		Curso curso4 = new Curso("Engenharia da Computação", 10004);
		Curso curso5 = new Curso("Segurança da Informação", 10005);
		

		Aluno aluno1 = new Aluno("Rafael Rabelo", 20001);
		Aluno aluno2 = new Aluno("Roger Rabelo", 20002);
		Aluno aluno3 = new Aluno("Violeta Rabelo", 20003);
		Aluno aluno4 = new Aluno("Oscar Rabelo", 20004);
		Aluno aluno5 = new Aluno("Raiane Rabelo", 20005);
		System.out.println("--------------------------------------");		

		System.out.println("Cadastrando Faculdade, Alunos e Cursos");		
		
		curso1.adicionandoNaFaculdade(faculdade1);
		curso2.adicionandoNaFaculdade(faculdade1);
		curso3.adicionandoNaFaculdade(faculdade1);
		curso4.adicionandoNaFaculdade(faculdade1);
		curso5.adicionandoNaFaculdade(faculdade1);
		
		aluno1.adicionandoNaFaculdade(faculdade1);
		aluno2.adicionandoNaFaculdade(faculdade1);
		aluno3.adicionandoNaFaculdade(faculdade1);
		aluno4.adicionandoNaFaculdade(faculdade1);
		aluno5.adicionandoNaFaculdade(faculdade1);
		
		curso1.adicionarAluno(aluno1);
		curso1.adicionarAluno(aluno2);
		curso1.adicionarAluno(aluno3);
		curso1.adicionarAluno(aluno4);
		curso1.adicionarAluno(aluno5);

		curso2.adicionarAluno(aluno1);
		curso2.adicionarAluno(aluno2);
		curso2.adicionarAluno(aluno3);

		curso3.adicionarAluno(aluno1);
		curso3.adicionarAluno(aluno4);
		curso3.adicionarAluno(aluno5);

		curso4.adicionarAluno(aluno1);
		curso4.adicionarAluno(aluno3);
		curso4.adicionarAluno(aluno5);

		curso5.adicionarAluno(aluno1);
		curso5.adicionarAluno(aluno3);
		curso5.adicionarAluno(aluno4);
		System.out.println("--------------------------------------");

		System.out.println(faculdade1.toString());
		
		System.out.println();
		faculdade1.imprimirAlunosMatriculados();
		
		System.out.println();
		faculdade1.imprimirCursosMatriculados();
//		
//		System.out.println();		
//		System.out.println(aluno1.obterCursoPorNome("Engenharia de Software"));
//		
//		System.out.println(aluno1.obterCursoPorNome("banco de dados"));
//		
//		System.out.println(aluno1.obterCursoPorNome("Ciencia da computação"));
//		
//		System.out.println(aluno1.obterCursoPorNome("engenharia da computação"));
//		
//		System.out.println(aluno1.obterCursoPorNome("Engenharia de Software"));
//		
//		
//		System.out.println(curso1.obterAlunoPorNome("Rafael Rabelo"));
//		
//		System.out.println(curso1.obterAlunoPorNome("Roger Rabelo"));
//		
//		System.out.println(curso1.obterAlunoPorNome("Violeta Rabelo"));
//		
//		System.out.println(curso1.obterAlunoPorNome("Oscar Rabelo"));
//		
//		System.out.println(curso1.obterAlunoPorNome("Raiane Rabelo"));
//		
		System.out.println();
		Scanner entrada = new Scanner(System.in);
		
		String nomeCursoBusca = "";
		
		faculdade1.imprimirCursosMatriculados();
		System.out.print("Digite o nome do Curso que deseja a lista de Alunos");
		for (int i = 0; i < 5; i++) {
			System.out.print("\nDigite o nome do aluno: ");
			nomeCursoBusca = entrada.nextLine();
			Curso cursoEncontrado = faculdade1.obterCursoPorNome(nomeCursoBusca);
			
			if (cursoEncontrado != null) {			
				cursoEncontrado.imprimirAlunosMatriculados();
			} else {
				System.out.println("Curso não Encontrado");
			}
		}
		
//		String nomeCursoBusca = "";
//		
//		for (int i = 0; i < 0; i++) {
//			System.out.print("Digite o nome do curso: ");
//			nomeCursoBusca = entrada.nextLine();
//			Curso cursoEncontrado = aluno1.obterCursoPorNome(nomeCursoBusca);
//			
//			if (cursoEncontrado != null) {			
//				cursoEncontrado.imprimirAlunosMatriculados();
//			} else {
//				System.out.println("Curso não Encontrado");
//			}
//		}
//		
//		String nomeAlunoBusca = "";
//		
//		for (int i = 0; i < 0; i++) {
//			System.out.print("Digite o nome do aluno: ");
//			nomeAlunoBusca = entrada.nextLine();
//			Aluno alunoEncontrado = curso1.obterAlunoPorNome(nomeAlunoBusca);
//			
//			if (alunoEncontrado != null) {			
//				alunoEncontrado.imprimirCursosMatriculados();
//			} else {
//				System.out.println("Curso não Encontrado");
//			}
//		}
//		
//		System.out.println(curso1.equals(curso5));
//		
//		
//		System.out.println();
//		System.out.println("ALUNOS por CURSOS");
//		System.out.print("Matriculados no Curso 1");
//		/**
//		for (Aluno string : curso1.alunos) {
//			System.out.println(string.getNome());
//		}
//		*/
//		curso1.imprimirAlunosMatriculados();
//		
//		curso1.removerAluno(aluno1);
//		curso1.removerAluno(aluno2);
//		curso1.removerAluno(aluno3);
//		curso1.removerAluno(aluno4);
//		curso1.removerAluno(aluno5);
//		
//		curso1.imprimirAlunosMatriculados();
//		
//		System.out.println();
//		System.out.print("Matriculados no Curso 2");
//		/**
//		for (Aluno string : curso2.alunos) {
//			System.out.println(string.getNome());
//		}
//		*/
//		curso2.imprimirAlunosMatriculados();
//		
//		System.out.println();
//		System.out.print("Matriculados no Curso 3");
//		/**
//		for (Aluno string : curso3.alunos) {
//			System.out.println(string.getNome());
//		}
//		*/
//		curso3.imprimirAlunosMatriculados();
//		
//		System.out.println();
//		System.out.print("Matriculados no Curso 4");
//		/**
//		for (Aluno string : curso4.alunos) {
//			System.out.println(string.getNome());
//		}
//		*/
//		curso4.imprimirAlunosMatriculados();
//		
//		System.out.println();
//		System.out.print("Matriculados no Curso 5");
//		/**
//		for (Aluno string : curso5.alunos) {
//			System.out.println(string.getNome());
//		}
//		*/
//		curso5.imprimirAlunosMatriculados();
//		
//		System.out.println();
//		System.out.println("CURSOS por ALUNOS");
//		System.out.print("Curso Matriculado | Aluno 1");
//		/**
//		for (Curso string : aluno1.cursos) {
//			System.out.println(string.getNome());
//		}
//		*/
//		aluno1.imprimirCursosMatriculados();
//		
//		System.out.println();
//		System.out.print("Curso Matriculado | Aluno 2");
//		/**
//		for (Curso string : aluno2.cursos) {
//			System.out.println(string.getNome());
//		}
//		*/
//		aluno2.imprimirCursosMatriculados();
//		
//		System.out.println();
//		System.out.print("Curso Matriculado | Aluno 3");
//		/**
//		for (Curso string : aluno3.cursos) {
//			System.out.println(string.getNome());
//		}
//		*/
//		aluno3.imprimirCursosMatriculados();
//		
//		System.out.println();
//		System.out.print("Curso Matriculado | Aluno 4");
//		/**
//		for (Curso string : aluno4.cursos) {
//			System.out.println(string.getNome());
//		}
//		*/
//		aluno4.imprimirCursosMatriculados();
//		
//		System.out.println();
//		System.out.print("Curso Matriculado | Aluno 5");
//		/**
//		for (Curso string : aluno5.cursos) {
//			System.out.println(string.getNome());
//		}
//		*/		
//		aluno5.imprimirCursosMatriculados();	
		entrada.close();
	}
}
