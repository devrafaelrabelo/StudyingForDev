package fundamentos;

public class Relacionais {
	
	public static void main(String[] args) {
		
		int a = 97;
		int b = 'b';
		
		System.out.println("Valor de A: " + a);
		System.out.println("Valor de B: " + b);
		
		System.out.println("A e B são iguais: " + (a == b));
		System.out.println("A e B são diferente: " + (a != b));
		System.out.println("A é maior que B: " + (a > b));
		System.out.println("A é maior/igual que B: " + (a >= b));
		System.out.println("A é menor que B: " + (a < b));
		System.out.println("A é menor/igual que B: " + (a <= b));
		
		double nota = 9.9;
		boolean bomComportamento = true;
		boolean passouPorMedia = nota >= 7;
		boolean temDesconto = bomComportamento && passouPorMedia;
		System.out.println("Tem desconto: " + temDesconto);
		
	}
	
}
