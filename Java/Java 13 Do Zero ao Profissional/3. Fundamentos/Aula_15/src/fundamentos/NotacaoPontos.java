package fundamentos;

public class NotacaoPontos {
	
	public static void main(String[] args) {
		
		String s = "Bom dia X";
		System.out.println(s);
		
		s.toUpperCase();
		System.out.println(s);
		
		s = s.toUpperCase();
		System.out.println(s);
		
		s.replace("X", "Rafael Rabelo");
		System.out.println(s);
		
		s = s.replace("X", "Rafael Rabelo"); 	
		System.out.println(s);
		
		s = s.replace("X", "Rafael Rabelo")
				.toLowerCase()
				.concat("!!!!")
				.replace("a", "A")
				.toUpperCase()
				.replace("R", "r")
				.replace(" ", "");
		System.out.println(s);
		
		//Tipos primitivos não tem operador .(PONTO)
		
				
	}
}
