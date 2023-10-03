package controle;

public class Desafio {
	public static void main(String[] args) {	
		
		String valor = "#";
		for (; !valor.equals("######") ;) { 
			System.out.println(valor);
			valor += "#";
		}
		
		valor = "#";
		for (; valor.length() < 6;) { 
			System.out.println(valor);
			valor += "#";
		}
	}
}
