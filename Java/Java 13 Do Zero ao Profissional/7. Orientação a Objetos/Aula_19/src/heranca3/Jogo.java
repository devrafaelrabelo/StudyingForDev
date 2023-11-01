package heranca3;

public class Jogo {
	
	public static void main(String[] args) {
		
		Jogador monstro_1 = new Monstro(10, 10);		

		Jogador heroi_1 = new Heroi(10, 11);

		
		System.out.println("Monstro 1: " + monstro_1.vida);
		System.out.println("Heroi 2: " + heroi_1.vida);
		
		monstro_1.atacar(heroi_1);
		heroi_1.atacar(monstro_1);		
		
		System.out.println("Monstro 1: " + monstro_1.vida);
		System.out.println("Heroi 2: " + heroi_1.vida);
				
	}
}
