package sobre_interfaces;

public class Ferrari extends Carro implements Esportivo, Luxo {
	
	private boolean ligarTurbo;
	private boolean ligarAr;
	
	public Ferrari() {
		this(400);
	}
	
	public Ferrari(int velocidadeMaxima) {
		super(velocidadeMaxima);
		this.setAceleracao(20);
	}
	
	public void acelerar() {
		super.acelerar();		
	}
	
	@Override
	public void ligarTurbo() {
		ligarTurbo = true;			
	}
	
	@Override
	public void desligarTurbo() {
		ligarTurbo = false;			
	}
	
	@Override
	public void ligarAr() {
		ligarAr	= true;
	}
	
	@Override
	public void desligarAr() {
		ligarAr = false;
	}
	
	@Override
	public int getAceleracao() {
		if (ligarTurbo && !ligarAr) {
			return super.getAceleracao() + 10;
		} else if (ligarTurbo && ligarAr) {
			return super.getAceleracao() + 5;
		} else if (!ligarTurbo && !ligarAr) {
			return super.getAceleracao();
		} else {
			return super.getAceleracao() - 5;
		}
	}	
	
}
