package umPum;

public class Carro {
	
	Motor motor = new Motor();
	
	void acelerar() {
		if (motor.fatorInjecao < 5.6) {
			motor.fatorInjecao+= 0.4;
		} 		
	}
	
	void frear() {
		if (motor.fatorInjecao > 0.5) {
			motor.fatorInjecao-= 0.4;
		} 		
	}
	
	void ligar() {
		motor.ligado = true;
	}
	
	void desligar() {
		motor.ligado = false;
	}
	
	boolean estaligado() {
		return motor.ligado;
	}
}
