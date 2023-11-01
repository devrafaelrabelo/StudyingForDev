package desafio;

public class App {
	
	public static void main(String[] args) {
		
		System.out.println("Carro Basico");
		Carro basico1 = new Carro();
		System.out.println("Velocidade do Carro: " + basico1.velocidadeAtual);
		basico1.acelerar();
		basico1.acelerar();
		System.out.println("Velocidade do Carro: " + basico1.velocidadeAtual);
		basico1.frear();
		basico1.frear();
		basico1.frear();
		System.out.println("Velocidade do Carro: " + basico1.velocidadeAtual);
		
		
		System.out.println("\nCarro Ferrari");
		Carro ferrari1 = new Ferrari();
		System.out.println("Velocidade do Carro: " + ferrari1.velocidadeAtual);
		ferrari1.acelerar();
		ferrari1.acelerar();
		ferrari1.acelerar();
		ferrari1.acelerar();
		System.out.println("Velocidade do Carro: " + ferrari1.velocidadeAtual);
		ferrari1.frear();
		System.out.println("Velocidade do Carro: " + ferrari1.velocidadeAtual);
		
		System.out.println("\nCarro Civic");
		Carro civic1 = new Civic();
		System.out.println("Velocidade do Carro: " + civic1.velocidadeAtual);
		civic1.acelerar();
		civic1.acelerar();
		civic1.acelerar();
		civic1.acelerar();
		System.out.println("Velocidade do Carro: " + civic1.velocidadeAtual);
		civic1.frear();
		System.out.println("Velocidade do Carro: " + civic1.velocidadeAtual);
		
		System.out.println("\nCarro Civic");
		Carro golf1 = new Golf();
		System.out.println("Velocidade do Carro: " + golf1.velocidadeAtual);
		golf1.acelerar();
		golf1.acelerar();
		golf1.acelerar();
		golf1.acelerar();
		System.out.println("Velocidade do Carro: " + golf1.velocidadeAtual);
		golf1.frear();
		System.out.println("Velocidade do Carro: " + golf1.velocidadeAtual);
		
		
		
		
		
				
		
	}
}
