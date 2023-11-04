package resposta.aplicativosCentral;

import resposta.carros.*;

public class App {
	
	public static void main(String[] args) {
		
		System.out.println("Carro Basico");
		Carro basico1 = new Carro();
		System.out.println("Velocidade do Carro: " + basico1);
		basico1.acelerar();
		basico1.acelerar();
		basico1.acelerar();
		System.out.println("Velocidade do Carro: " + basico1);
		basico1.frear();
		basico1.frear();
		basico1.frear();
		System.out.println("Velocidade do Carro: " + basico1);
		
		
		System.out.println("\nCarro Ferrari");
		Carro ferrari1 = new Ferrari();
		System.out.println("Velocidade do Carro: " + ferrari1);
		ferrari1.acelerar();
		ferrari1.acelerar();
		ferrari1.acelerar();
		ferrari1.acelerar();
		System.out.println("Velocidade do Carro: " + ferrari1);
		ferrari1.frear();
		System.out.println("Velocidade do Carro: " + ferrari1);
		
		System.out.println("\nCarro Civic");
		Carro civic1 = new Civic();
		System.out.println("Velocidade do Carro: " + civic1);
		civic1.acelerar();
		civic1.acelerar();
		civic1.acelerar();
		civic1.acelerar();
		System.out.println("Velocidade do Carro: " + civic1);
		civic1.frear();
		System.out.println("Velocidade do Carro: " + civic1);
		
		System.out.println("\nCarro Civic");
		Carro golf1 = new Golf();
		System.out.println("Velocidade do Carro: " + golf1);
		golf1.acelerar();
		golf1.acelerar();
		golf1.acelerar();
		golf1.acelerar();
		System.out.println("Velocidade do Carro: " + golf1);
		golf1.frear();
		System.out.println("Velocidade do Carro: " + golf1);
		
		
		
		
		
				
		
	}
}
