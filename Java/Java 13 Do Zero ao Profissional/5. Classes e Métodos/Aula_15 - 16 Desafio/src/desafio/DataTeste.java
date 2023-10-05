package desafio;

public class DataTeste {
	
	public static void main(String[] args) {
		
		Data d1 = new Data();
		System.out.println(d1.obtendoData());
		
		Data d2 = new Data(29, 03, 1995);
		d2.imprimirDataFormatada();
		
	}
}
