package heranca3;

public class Monstro extends Jogador {

	public Monstro(int x, int y) {
		super(x ,y);
		this.vida = 450;
		this.power = 15;
	}

	boolean atacar(Jogador oponente) {
		boolean ataque1 = super.atacar(oponente);
		boolean ataque2 = super.atacar(oponente);
		boolean ataque3 = super.atacar(oponente);
		return ataque1 || ataque2 || ataque3;
	}
}
