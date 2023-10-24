package variavellocais;

public class Data {
	
	int dia;
	int mes;
	int ano;
	
	Data(){
		//this.dia = 01;
		//this.mes = 01;
		//this.ano = 1970;
		this(1, 1, 1970); //Apenas Construtor
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
