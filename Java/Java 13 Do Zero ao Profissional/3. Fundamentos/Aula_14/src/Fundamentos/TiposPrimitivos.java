package Fundamentos;

public class TiposPrimitivos {

	public static void main(String[] args) {
		/*
		 * Tipos Primitivos
		 */
		// Informações do Funcionarios
		// Tipos numericos Inteiros
		byte anosDeEmpresa = 23;
		short numeroDeVoos = 532;
		int id = 56768;
		long pontosAcumulados = 3134845223L; // Colocar o "L" no final do numero para poder mostrar que é tipo LONG

		// Tipos numericos Reais
		float salario = 11_358.85F; // Colocar o "F" no final do numero para poder mostrar que é tipo FLOAT
		double vendasAcumulados = 2_991_797_103.01;

		// Tipo Boolean
		boolean estaDeFerias = false; // FALSE ou TRUE

		// Tipo de Caractere
		char status = 'A'; // Ativo

		// Ficha Pessoal do Funcionarios
		System.out.println("ID: " + id);
		System.out.println("STATUS: " + status);
		System.out.println("Salario: " + salario);
		System.out.println("Ferias: " + estaDeFerias);

		// Dias de Empresa
		System.out.println("Tempo de Empresa: " + anosDeEmpresa * 365 + " Dias");

		// Números de Viagens
		System.out.println("Quantidade de Viagens: " + numeroDeVoos / 2);

		// Pontos Reais
		System.out.println("Quantidade de Pontos Reais Acumulados: " + pontosAcumulados / vendasAcumulados);

	}
}
