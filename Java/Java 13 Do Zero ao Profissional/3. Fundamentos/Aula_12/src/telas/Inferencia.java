package telas;

public class Inferencia {
	public static void main(String[] args) {
		
		double a = 4.5;
		System.out.println(a + " " + ((Object)a).getClass().getSimpleName());
		
		/*
		 * VAR - Declara uma varial sem tipo, deixando para ser tipada no 
		 * momento de inserir os dados mas nao pode ser alterado o tipo da
		 * varial apos inicializar 
		 */
		var b = 4.5;
		System.out.println(b + " " + ((Object)b).getClass().getSimpleName());
		
		var c = "4.5";
		System.out.println(c + " " + ((Object)c).getClass().getSimpleName());
		
		/*	NÃO PODE SER DECLARADA DESSE JEITO
		 * 	var c	
		 * 	c = 145.00 ;	
		 * 	System.out.println(c + " " + ((Object)c).getClass().getSimpleName());
		 * 
		 */
	}
}
