package rabelobank;

public class ExtratoCompleto {
	
	String transacao;	

	public ExtratoCompleto(String transacao) {
		this.transacao = transacao;
	}
	
	@Override
	public String toString() {
		return transacao;
	}	
}
