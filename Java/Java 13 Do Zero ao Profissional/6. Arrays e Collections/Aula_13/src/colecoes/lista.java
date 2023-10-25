package colecoes;

import java.util.ArrayList;

public class lista {
	public static void main(String[] args) {
		
		ArrayList<Usuario> lista = new ArrayList<Usuario>();
		
		Usuario p1 = new Usuario("Rafael");
		lista.add(p1);
		lista.add(new Usuario("Roger"));
		lista.add(new Usuario("Oscar"));
		lista.add(new Usuario("Violeta"));
		lista.add(new Usuario("Rafael Rabelo"));
		
		System.out.println(lista.get(2).nome);
		
		System.out.println("Estou Removevendo: " + lista.remove(0));
		System.out.println("Tem Oscar? " + lista.remove(new Usuario("Oscar")));
		System.out.println("Estou Removevendo: " + lista.remove(new Usuario("Oscar")));
		System.out.println("Tem Oscar? " + lista.contains(new Usuario("Oscar")));

		//lista.remove(0);
		
		
		for (Usuario usuario : lista) {
			System.out.println(usuario.toString());
		}	
	}
}
