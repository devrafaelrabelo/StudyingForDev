package excecao;

public class App {
	
	public static void main(String[] args) {
		Aluno aluno = new Aluno("", -5);
		
		aluno = null;
		
		try {			
			Validar.aluno(aluno);
		} catch (Throwable e) {			
			System.out.println(e.getMessage());
		}		
		
		System.out.println("FIM!!");
	}
}
