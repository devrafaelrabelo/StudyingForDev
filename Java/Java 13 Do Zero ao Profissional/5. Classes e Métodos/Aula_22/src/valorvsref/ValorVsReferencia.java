package valorvsref;

public class ValorVsReferencia {
	public static void main(String[] args) {
		 
		double a = 2;
		double b = a;
		
		a++;
		b--;
		
		System.out.println(a + " " + b);
				
		Data d1 = new Data(1,1,2020);
		Data d2 = new Data(1,1,2022);
		System.out.println(d1.obtendoData());
		System.out.println(d2.obtendoData());
		
		d2 = d1;
		d1.dia = 2;	
		
		System.out.println(d1.obtendoData());
		System.out.println(d2.obtendoData());
		
		d2.mes = 12;	
		
		System.out.println(d1.obtendoData());
		System.out.println(d2.obtendoData());
		
		voltarDataPadrao(d1);
		
		System.out.println(d1.obtendoData());
		System.out.println(d2.obtendoData());
		
		int c = 5;
		alterarPrimitivo(c);
		System.out.println(c);
	}
	
	static void voltarDataPadrao(Data d) {
		d.ano = 1970;
		d.mes = 1;
		d.dia = 1;
	}
	
	static void alterarPrimitivo(int a) {
		a++;
	}
}
