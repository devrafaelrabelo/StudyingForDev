package fundamentos;

public class OperadoresLogicos {
	
	public static void main(String[] args) {
		
		boolean condicao1 = true;
		boolean condicao2 = 3 > 7;
		
		System.out.println("Operador E (&&): " + (condicao1 && condicao2));
		System.out.println("Operador OU (||): " + (condicao1 || condicao2));
		System.out.println("Operador OU EXCLUSIVO (^): " + (condicao1 ^ condicao2));
		System.out.println("Operador NEGATIVO (!): " + !!condicao1);
		System.out.println("Operador NEGATIVO (!): " + !condicao2);
		
		System.out.println("\nTabela verdade E (AND)");
		System.out.println(true && true);
		System.out.println(true && false);
		//System.out.println(false && true);
		//System.out.println(false && false);
		
		System.out.println("\nTabela verdade OU (OR)");
		//System.out.println(true || true);
		//System.out.println(true || false);
		System.out.println(false || true);
		System.out.println(false || false);
		
		System.out.println("\nTabela verdade OU EXCLUSIVO (XOR)");
		System.out.println(true ^ true);
		System.out.println(true ^ false);
		System.out.println(false ^ true);
		System.out.println(false ^ false);
		
		System.out.println("\nTabela verdade NOT");
		System.out.println(!true);
		System.out.println(!false);
		
	}
}
