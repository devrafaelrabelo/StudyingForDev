package stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;

public class Match {
	
	public static void main(String[] args) {
		
		Aluno a1 = new Aluno("Ana", 7.1);
		Aluno a2 = new Aluno("Luna", 6.1);
		Aluno a3 = new Aluno("Gui", 8.1);
		Aluno a4 = new Aluno("Gabi", 10);
		
		List<Aluno> alunos = Arrays.asList(a2, a1, a3, a4);
		
		Comparator<Aluno> melhorNota = (aluno1, aluno2) -> {
			if (aluno1.nota > aluno2.nota) return 1;
			if (aluno2.nota > aluno1.nota) return -1;
			return 0;			
		};
		
		Comparator<Aluno> piorNota = (aluno1, aluno2) -> {
			if (aluno1.nota > aluno2.nota) return -1;
			if (aluno2.nota > aluno1.nota) return 1;
			return 0;			
		};
		
		System.out.println(alunos.stream().max(melhorNota).get());
		
		System.out.println(alunos.stream().min(melhorNota).get());
		
		System.out.println(alunos.stream().max(piorNota).get());
		
		System.out.println(alunos.stream().min(piorNota).get());
		
	}
}
