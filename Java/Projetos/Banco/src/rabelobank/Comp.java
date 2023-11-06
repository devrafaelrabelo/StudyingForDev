package rabelobank;

public class Comp {
	
	String transacao;	

	public Comp(String transacao) {
		this.transacao = transacao;
	}
	
	@Override
	public String toString() {
		return transacao;
	}	
}
