package resposta;

public class DataTeste {
	
	public static void main(String[] args) {
		
		Data niverRafael = new Data();
		niverRafael.dia = 29;
		niverRafael.mes = 03;
		niverRafael.ano = 1995;		
		System.out.println(niverRafael.obterDataFormatada());		
		niverRafael.imprimirDataFormatada();
		
		Data niverRoger = new Data();
		niverRoger.dia = 17;
		niverRoger.mes = 11;
		niverRoger.ano = 1991;
		String dataFormatada = niverRoger.obterDataFormatada();
		
		System.out.println(dataFormatada);
		
		
		
		
	}
	
	
}
