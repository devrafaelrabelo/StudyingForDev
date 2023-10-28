package umPum;

public class CarroTeste {

	public static void main(String[] args) {
		
		Carro c1 = new Carro();
		
		System.out.println("Carro ligado? " + c1.estaligado());
		
		System.out.println("Ligando carro:");
		c1.ligar();
		System.out.println("Carro ligado? " + c1.estaligado());
		
		System.out.println("Rotação do carro: " + c1.motor.giros());
		
		System.out.println("Acelerando o carro:");
		c1.acelerar();
		c1.acelerar();
		c1.acelerar();	
		c1.acelerar();	
		c1.acelerar();
		c1.acelerar();
		c1.acelerar();	
		c1.acelerar();	
		c1.acelerar();
		c1.acelerar();
		c1.acelerar();	
		c1.acelerar();			
		
		System.out.println("Rotação do carro: " + c1.motor.giros());		
		
		System.out.println("Freando o carro:");
		c1.frear();
		c1.frear();		
		c1.frear();	
		c1.frear();
		c1.frear();	
		c1.frear();
		c1.frear();
		c1.frear();
		c1.frear();
		c1.frear();
		c1.frear();
		c1.frear();
		c1.frear();
		c1.frear();
		
		System.out.println("Rotação do carro: " + c1.motor.giros());	
		System.out.println("Carro ligado? " + c1.estaligado());	
		
	}
}
