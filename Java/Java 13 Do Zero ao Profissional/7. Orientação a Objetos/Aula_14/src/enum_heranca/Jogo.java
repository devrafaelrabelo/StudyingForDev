package enum_heranca;

public class Jogo {
	
	public static void main(String[] args) {
		
		Jogador j1 = new Jogador();
		j1.x = 10;
		j1.y = 10;
		
		j1.andar(Direcao.NORTE);
		j1.andar(Direcao.NORTE);
		j1.andar(Direcao.NORTE);
		j1.andar(Direcao.NORTE);
		
		j1.andar(Direcao.SUL);
		j1.andar(Direcao.SUL);
		j1.andar(Direcao.SUL);
		j1.andar(Direcao.SUL);
		j1.andar(Direcao.SUL);
		
		j1.andar(Direcao.LESTE);
		j1.andar(Direcao.LESTE);
		j1.andar(Direcao.LESTE);
		j1.andar(Direcao.LESTE);
		
		j1.andar(Direcao.OESTE);
		j1.andar(Direcao.OESTE);
		j1.andar(Direcao.OESTE);
		j1.andar(Direcao.OESTE);
		j1.andar(Direcao.OESTE);
;

		
		System.out.println(j1.y + " - " + j1.x);
		
	}
}
