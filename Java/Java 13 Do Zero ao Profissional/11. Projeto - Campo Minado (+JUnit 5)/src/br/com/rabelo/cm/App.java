package br.com.rabelo.cm;

import br.com.rabelo.cm.modelo.Tabuleiro;
import br.com.rabelo.cm.visao.TabuleiroConsole;

public class App {
	public static void main(String[] args) {
		
		Tabuleiro tabuleiro = new Tabuleiro(6, 6, 3);
		
		new TabuleiroConsole(tabuleiro);
		
	}
}
