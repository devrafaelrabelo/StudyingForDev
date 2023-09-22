package telas;

public class TelaPrincipal {
	public static void main(String[] args) {
		
		/**
		 * @author Rafael Rabelo
		 * Meu Código
		 */
		final int CONSTAUX = 32;
		final double CONSTAUXUM = 5/9.0;
		
		double FahGraus = 150;
		double CGraus = (FahGraus - CONSTAUX)* CONSTAUXUM;		
		System.out.println(CGraus + "ºC");
		
		/**
		 * @author Professor
		 * "Correção"
		 */
		
		final double AJUSTE = 32;
		final double FATOR = 5/9.0;
		
		FahGraus = 86;
		CGraus = (FahGraus - AJUSTE)* FATOR;		
		System.out.println(CGraus + "ºC");
	}
}
