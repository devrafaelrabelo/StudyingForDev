package fundamentos;

public class Ternario {
	
	public static void main(String[] args) {
		
		double media = 7.1;
		String resultadoRec = media >= 5.0 ? "Recuperação" : "Reprovado";
		String resultado = media >= 7.0 ? "Aprovado" : resultadoRec;
		System.out.println("Aluno foi: " + resultado);
		
		
	}
}
