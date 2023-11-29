package generics;

public class ParesTestes {
	
	public static void main(String[] args) {
		
		Pares<Integer, String> resultadoConcurso = new Pares<>();
		
		resultadoConcurso.adicionar(1, "Rafael Rabelo");
		resultadoConcurso.adicionar(2, "Roger Rabelo");
		resultadoConcurso.adicionar(1, "Violeta Rabelo");
		resultadoConcurso.adicionar(5, "Oscar Rabelo");
		resultadoConcurso.adicionar(4, "Raiane Rabelo");
		resultadoConcurso.adicionar(3, "Jose Rabelo");
		resultadoConcurso.adicionar(2, "Mama Rabelo");
		resultadoConcurso.adicionar(1, "Mimi Rabelo");
		
		System.out.println(resultadoConcurso.getValor(1));
		System.out.println(resultadoConcurso.getValor(2));
		System.out.println(resultadoConcurso.getValor(3));
		System.out.println(resultadoConcurso.getValor(4));
		System.out.println(resultadoConcurso.getValor(5));		
	}
}
