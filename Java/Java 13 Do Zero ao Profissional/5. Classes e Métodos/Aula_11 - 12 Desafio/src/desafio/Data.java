package desafio;

public class Data {

	int dia;
	int mes;
	int ano;
	
	String obterDataFormatada(){
		
		String dataCompleta = dia + "/" + mes + "/" + ano;
		
		return dataCompleta;
	}
}
