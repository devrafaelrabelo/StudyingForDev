package resposta.personagens;

public class Jogador {
	
	protected int vida = 100;
	int x;
	int y;
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

	public int getVida() {
		return vida;
	}

	public void setVida(int vida) {
		this.vida = vida;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	
	
	
	
	
}
