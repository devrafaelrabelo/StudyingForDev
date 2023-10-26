package colections;

import java.util.HashSet;

public class HashcodeNaPratica {
	
	public static void main(String[] args) {
		
		HashSet<Usuario> usuarios = new HashSet<Usuario>();
		
		usuarios.add(new Usuario("Rafael Rabelo"));
		usuarios.add(new Usuario("Roger Rabelo"));
		usuarios.add(new Usuario("Violeta Rabelo"));
		usuarios.add(new Usuario("Oscar Rabelo"));
		
		System.out.println(usuarios.contains(new Usuario("Rafael Rabelo")));
		
		for (Usuario usuario : usuarios) {
			System.out.println(usuario);
		}
	}	
}
