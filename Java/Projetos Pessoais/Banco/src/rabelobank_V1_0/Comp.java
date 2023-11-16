package rabelobank_V1_0;

public class Comp {

	String transacao;
	String dataAtualFormatada;

	public Comp(double valor, String dataAtualFormatada, int typeTransacao) {
		if (typeTransacao == 1) { // Deposito
			this.dataAtualFormatada = dataAtualFormatada;
			this.transacao = this.dataAtualFormatada + " | R$ +" + valor + "\n";
		} else if (typeTransacao == 2) { //Saque
			this.dataAtualFormatada = dataAtualFormatada;
			this.transacao = this.dataAtualFormatada + " | R$ -" + valor + "\n";
		} else if (typeTransacao == 3) { //Transf Recebida
			this.dataAtualFormatada = dataAtualFormatada;
			this.transacao = this.dataAtualFormatada + " | R$ +" + valor + "\n";
		} else if (typeTransacao == 4) { // Transf Efetuada
			this.dataAtualFormatada = dataAtualFormatada;
			this.transacao = this.dataAtualFormatada + " | R$ -" + valor + "\n";
		}

	}
	
	@Override
	public String toString() {
		return transacao;
	}	
}
