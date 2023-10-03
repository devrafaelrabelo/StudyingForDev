package fundamentos;

public class Atribuicao {
	
	public static void main(String[] args) {
		
		int a = 3;
		int b = a;
		int c = 100;
		
		c += b;	//c = c + b	
		c -= a;	//c = c - b
		c *= a;	//c = c * b
		c /= a;	//c = c / b		
		c++;
		System.out.println(c);
		
		c %= 2; //c = c % 2; 0 (PAR) ou 1 (IMPAR)
		System.out.println(c);
	}
}
