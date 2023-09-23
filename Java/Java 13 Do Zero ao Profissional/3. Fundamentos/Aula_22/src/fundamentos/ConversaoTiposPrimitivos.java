package fundamentos;

public class ConversaoTiposPrimitivos {
	public static void main(String[] args) {
		
		double a = 1; //Implícita
		System.out.println(a);
		
		float b = (float)1.987654321; //Explícita (CAST)
		System.out.println(b);
		
		int c = 130;
		System.out.println(c);
		byte d = (byte) c; //Explícita (CAST)
		System.out.println(d);
		
		double e = 1.99999;
		int f = (int) e;  //Explícita (CAST)
		System.out.println(f);
		
		
	}
}
