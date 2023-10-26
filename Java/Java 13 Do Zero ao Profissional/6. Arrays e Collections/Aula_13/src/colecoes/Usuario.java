package colecoes;

import java.util.Objects;

public class Usuario {
	
	String nome;	
	
	 @Override
	public String toString() {
		return "Usuario [nome=" + nome + "]";
	}

	Usuario(String nome) {
		this.nome = nome;
	}

	@Override
	public int hashCode() {
		return Objects.hash(nome);
	}
	
	/**
	public boolean equals(Object obj) {
		Usuario outroUsuario = (Usuario) obj;
		return this.nome.equals(outroUsuario.nome);
	}
	*/
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Usuario other = (Usuario) obj;
		return Objects.equals(nome, other.nome);
	}		
}
