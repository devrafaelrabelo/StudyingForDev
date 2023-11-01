package desafio.personagens;

public class Jogador {
	
	public int vida = 100;
	public int x;
	public int y;
	double power = 10;
	
	public boolean atacar(Jogador oponente) {
		
		int deltaX = Math.abs(x - oponente.x);
		int deltaY = Math.abs(y - oponente.y);
		
		if (deltaX == 0 && deltaY == 1) {
			oponente.vida -= power;
			return true;
		} else if (deltaX == 1 && deltaY == 0) {
			oponente.vida -= power;	
			return true;
		} else {
			return false;
		}
	}
	
	public boolean andar(Direcao direcao) {
		if(direcao == Direcao.NORTE) {
			y--;
		} else if(direcao == Direcao.SUL) {
			y++;
		} else if(direcao == Direcao.OESTE) {
			x++;
		} else if(direcao == Direcao.LESTE) {
			x--;
		}
		
		return true;
	}
	
}
