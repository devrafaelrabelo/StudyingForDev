package pessoas;

public class PessoaTeste {
	
	public static void main(String[] args) {
		
		Pessoa p1 = new Pessoa("Rafael Rabelo", -28);
		
		p1.setIdade(30);
		
		p1.setIdade(-110);
		
		System.out.println(p1);
		
	}
}
