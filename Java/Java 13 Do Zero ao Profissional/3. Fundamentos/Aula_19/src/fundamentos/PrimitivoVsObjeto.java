package fundamentos;

public class PrimitivoVsObjeto {
	
	public static void main(String[] args) {
		
		String s = new String("Texto");
		s = "Texto 2";
		s.toUpperCase();
		
		//Primitivo
		int a = 25;
		System.out.println(a);
		//System.out.println(a.getClass().getName()));
		
		//Wrappers	-> Versão Objeto dos primitivos
		Integer b = 65;
		System.out.println(b);
		System.out.println(b.getClass().getName());
		
		
		
		
		
	}
}
