package fundamentos;

import javax.swing.JOptionPane;

public class ConversaoStringNumero {
	public static void main(String[] args) {
		
		String valor1 = JOptionPane.showInputDialog("Digite o Primeiro VALOR: ");	
		String valor2 = JOptionPane.showInputDialog("Digite o Segundo VALOR: ");
		
		JOptionPane.showMessageDialog(null,Double.parseDouble(valor1) + Double.parseDouble(valor2));
		double soma = Double.parseDouble(valor1) + Double.parseDouble(valor2);
		JOptionPane.showMessageDialog(null, soma);		
		
		JOptionPane.showMessageDialog(null,Double.parseDouble(valor1) + Double.parseDouble(valor2));	
		double numero1 = Double.parseDouble(valor1);
		double numero2 = Double.parseDouble(valor2);
		double soma2 = numero1 + numero2;
		JOptionPane.showMessageDialog(null, soma2);
				
		
	}
}
