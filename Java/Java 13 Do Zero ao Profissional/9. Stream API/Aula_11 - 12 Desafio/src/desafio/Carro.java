package desafio;

public class Carro {
	
	final String modelo;
	final int portas;
	final int anoFab;
	final String tecnologiaCombustivel;
	final String cambio;
	
	public Carro(String modelo, int portas, int anoFab, String tecnologiaCombustivel,String cambio) {
		this.modelo = modelo;
		this.portas = portas;
		this.anoFab = anoFab;
		this.tecnologiaCombustivel = tecnologiaCombustivel;
		this.cambio = cambio;
	}

	@Override
	public String toString() {
		return "Modelo: " + modelo + "\nPortas: " + portas + "\nFabricado: " + anoFab + "\nCombustivel: "
				+ tecnologiaCombustivel + "\nCambio: " + cambio + "\n";
	}	
	
	
	
}
