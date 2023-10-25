package valornull;

public class Data {
	
	int dia;
	int mes;
	int ano;
	
	// Valor Padrão quando não é definido
	// byte, short, int, long -> 0
	// float, double -> 0.0
	// boolean -> false
	// char -> '\u0000'
	
	// Mas se for variavel local não é inicializada por padrao, variavel 
	
	// Objeto tem o valor NULL
	// String s = null
	// NULL mostra que o objeto nao tem espaço na memoria	
	
	Data(){
		//this.dia = 01;
		//this.mes = 01;
		//this.ano = 1970;
		this(1, 1, 1970); //Apenas Construtor
		
		int a = 0;
		
		System.out.println(a);
	}
	
	Data(int dia, int mes, int ano) {
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}
	
	String obtendoData() {
		final String formato = "DATA: %d/%d/%d ";
		return String.format(formato, this.dia, mes, ano);
	}
	
	void imprimirDataFormatada() {
		//System.out.println(obtendoData());
		System.out.println(this.obtendoData());

	}
}
