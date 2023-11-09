package excessao;

public class App {
	
	public static void main(String[] args) {
		Aluno aluno = new Aluno("", -5);	
		
		try {
			aluno = null;
			Validar.aluno(aluno);
		} catch (Throwable e) {			
			System.out.println(e.getMessage());
		}
		
		System.out.println("FIM!!");
	}
}
