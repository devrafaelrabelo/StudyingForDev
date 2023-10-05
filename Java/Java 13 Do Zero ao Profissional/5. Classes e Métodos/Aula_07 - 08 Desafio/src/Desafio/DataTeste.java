package Desafio;

public class DataTeste {
	
	public static void main(String[] args) {
		
		Data niverRafael = new Data();
		niverRafael.dia = 29;
		niverRafael.mes = 03;
		niverRafael.ano = 1995;
		System.out.println("Rafael Rabelo");
		System.out.printf("%d/%d/%d", niverRafael.dia, niverRafael.mes, niverRafael.ano);
	
		System.out.println();
		
		Data niverRoger = new Data();
		niverRoger.dia = 17;
		niverRoger.mes = 11;
		niverRoger.ano = 1991;
		System.out.println("Roger Rabelo");
		System.out.printf("%d/%d/%d", niverRoger.dia, niverRoger.mes, niverRoger.ano);
		
		
		
		
	}
	
	
}
