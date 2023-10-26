package colecoes;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class Mapa {
	
	public static void main(String[] args) {
		
		Map<Long, String> usuario = new HashMap<>();
		
		usuario.put(1L, "Rafael Rabelo");
		usuario.put(2L, "Roger Rabelo");
		usuario.put(3L, "Rafaela Rabelo");
		usuario.put(4L, "Roger Rabelo");
		
		System.out.println(usuario.size());
		System.out.println(usuario.isEmpty());
		System.out.println(usuario.keySet());
		System.out.println(usuario.values());
		System.out.println(usuario.entrySet());
		
		System.out.println(usuario.containsKey(2L));
		System.out.println(usuario.containsValue("Rafaela Rabelo"));
		
		System.out.println(usuario.get(3L));
		System.out.println(usuario.remove(1L));
		System.out.println(usuario.remove(6L));
		System.out.println(usuario.remove(1L, "Rafael Rabelo"));

		System.out.println();
		
		/**
		for (Map.Entry<Long, String> entry : usuario.entrySet()) {
			System.out.println(entry.getKey() + " " + entry.getValue());
		}
		*/
		
		System.out.println();		
		for (Long chave: usuario.keySet()) {
			System.out.println(chave + " " + usuario.get(chave));
		}
		
		System.out.println();		
		for (String chave: usuario.values()) {
			System.out.println(chave);
		}
		
		System.out.println();		
		for(Entry<Long, String> registro: usuario.entrySet()) {
			System.out.println(registro.getKey() + " " + registro.getValue());
		}
		
		
	}
}
