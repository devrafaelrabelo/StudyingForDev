package controle;

import javax.swing.JOptionPane;

public class ifelse {
	public static void main(String[] args) {
		
		String valor = JOptionPane.showInputDialog("Informa o número:");
		
		int numero = Integer.parseInt(valor);
		
/**
		if (numero % 2 == 0) {
			System.out.println("Numero par!");
		}
		
		if (numero % 2 == 1) {
			System.out.println("Numero ímpar!");
		}
*/
		
		if (numero % 2 == 0) {
			JOptionPane.showMessageDialog(null, "Numero par!");
			System.out.println("Numero par!");
		} else {
			JOptionPane.showMessageDialog(null, "Numero ímpar!");
			System.out.println("Numero ímpar!");
		}
	}
}
