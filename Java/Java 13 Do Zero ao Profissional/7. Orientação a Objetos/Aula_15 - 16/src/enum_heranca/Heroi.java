package enum_heranca;

public class Heroi extends Jogador {	
	
	public Heroi() {
		this.vida = 400;
		this.power = 20;
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

}
