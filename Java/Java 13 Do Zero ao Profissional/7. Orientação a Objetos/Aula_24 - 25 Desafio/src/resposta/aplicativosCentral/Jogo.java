package resposta.aplicativosCentral;

import resposta.personagens.*;

public class Jogo {
	
	public static void main(String[] args) {
		
		Jogador monstro_1 = new Monstro();
		monstro_1.setX(10);
		monstro_1.setY(10);
		

		Jogador heroi_1 = new Heroi();
		heroi_1.setX(10);;
		heroi_1.setY(11);;
		
		System.out.println("Monstro 1: " + monstro_1.getVida());
		System.out.println("Heroi 2: " + heroi_1.getVida());
		
		monstro_1.atacar(heroi_1);
		heroi_1.atacar(monstro_1);		
		
		System.out.println("Monstro 1: " + monstro_1.getVida());
		System.out.println("Heroi 2: " + heroi_1.getVida());
				
	}
}
