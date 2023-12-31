package heranca3;

public class Jogador {
	
	int vida = 100;
	int x;
	int y;
	double power = 10;
	
	Jogador(){
		this(0, 0);
	}
	
	Jogador(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	boolean atacar(Jogador oponente) {
		
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
	
	boolean andar(Direcao direcao) {
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
