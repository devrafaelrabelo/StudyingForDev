package fundamentos;

public class TipoString {
	
	public static void main(String[] args) {
		System.out.println("Olá Pessoal".charAt(2));
		
		String s = "Boa Tarde";
		System.out.println(s);
		
		s = s.toUpperCase();
		System.out.println(s);
		
		s = "Bom Dia";
		System.out.println(s);
		
		s = "Bom Dia";
		System.out.println(s.concat("!!!"));
		System.out.println(s);
		System.out.println();
		
		System.out.println(s.concat("!!!"));
		System.out.println(s + "!!!");
		System.out.println(s.startsWith("Bo"));
		System.out.println(s.toLowerCase().startsWith("bo"));
		System.out.println(s.toUpperCase().startsWith("DIA"));
		System.out.println(s.length());
		System.out.println(s.equals("bom Dia"));
		System.out.println(s.equalsIgnoreCase("BOM DIA"));
		
		var nome = "Rafael";
		var sobrenome = "Rabelo";
		var idade = 28;
		var salario = 12345.987;
		
		System.out.println("\nNome: " + nome
				+ "\nSobrenome: " + sobrenome
				+ "\nIdade: " + idade
				+ "\nSalario: " + salario);
		
		System.out.printf("\nNome: %s %s tem %d e ganha R$%.2f", nome, sobrenome,idade,salario);
		
		String frase = String.format("\nNome: %s %s tem %d e ganha R$%.2f", nome, sobrenome,idade,salario);
		
		System.out.println(frase);
		
		
	}
}
