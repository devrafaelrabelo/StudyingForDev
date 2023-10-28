package desafio;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ShoppingMain {
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
//		--------------------------------------------------------------------------------------------------------
		//Entrada de dados Clientes:		
		
		List<Cliente> clientes = new ArrayList<Cliente>();
		/**
		System.out.print("Digite o nome do Cliente: ");		
		String nome = entrada.nextLine();		
		 */
		System.out.println();
		clientes.add(new Cliente("Rafael Rabelo", (clientes.size() + 1)));
		clientes.add(new Cliente("Roger Rabelo", clientes.size() + 1));
		clientes.add(new Cliente("Violeta Rabelo", clientes.size() + 1));
		clientes.add(new Cliente("Oscar Rabelo", clientes.size() + 1));
		
		System.out.println("Lista Clientes");
		for (Cliente listaCliente : clientes) {
			System.out.println(listaCliente);
		}
		
		System.out.println("---------------------------------------------\n");
//		--------------------------------------------------------------------------------------------------------
		//Entrada de dados Produtos:
		
		List<Produto> produtos = new ArrayList<Produto>();
		/**
		System.out.print("Digite o nome do Produto: ");		
		nome = entrada.nextLine();	
		System.out.print(nome + " valor: ");		
		double preco = entrada.nextDouble();				
		*/
		produtos.add(new Produto("Caderno", produtos.size() + 1, 7.5));
		produtos.add(new Produto("Caneta", produtos.size() + 1, 2));
		produtos.add(new Produto("Borracha", produtos.size() + 1, 1.5));
		produtos.add(new Produto("Lapis Escrita", produtos.size() + 1, 3));
		produtos.add(new Produto("Lapis Colorido", produtos.size() + 1, 1));
		
		System.out.println();
		System.out.println("Lista Produtos");
		for (Produto listaProduto : produtos) {
			System.out.println(listaProduto);
		}
		
		System.out.println("---------------------------------------------\n");
//		--------------------------------------------------------------------------------------------------------
		//Entrada de dados Item:
		
		Item itens1 = new Item(5, produtos.get(0));
		Item itens2 = new Item(4, produtos.get(1));
		Item itens3 = new Item(3, produtos.get(2));
		Item itens4 = new Item(2, produtos.get(3));
		Item itens5 = new Item(2, produtos.get(4));	
		/**
		System.out.println(itens1);
		System.out.println(itens2);
		System.out.println(itens3);
		System.out.println(itens4);
		System.out.println(itens5);
		*/
		System.out.println("---------------------------------------------\n");
//		--------------------------------------------------------------------------------------------------------
		//Entrada de dados Compra:
		
		System.out.println("Carrinho 1");
		Compra compra1 = new Compra();		
		compra1.adicionarItens(itens1);
		compra1.adicionarItens(itens2);
		compra1.adicionarItens(itens3);
		compra1.adicionarItens(itens4);
		compra1.adicionarItens(itens5);
		
		compra1.imprimirListaItens();
		
		System.out.println("---------------------------------------------\n");
		
		System.out.println("Carrinho 2");
		Compra compra2 = new Compra();
		compra2.adicionarItens(itens2);
		compra2.adicionarItens(itens3);
		compra2.adicionarItens(itens4);
		compra2.adicionarItens(itens5);
		
		compra2.imprimirListaItens();
		
		System.out.println("---------------------------------------------\n");
		
		System.out.println("Carrinho 3");
		Compra compra3 = new Compra();
		compra3.adicionarItens(itens3);
		compra3.adicionarItens(itens4);
		compra3.adicionarItens(itens5);
		
		compra3.imprimirListaItens();
		
		System.out.println("---------------------------------------------\n");
		
		System.out.println("Carrinho 4");
		Compra compra4 = new Compra();
		compra4.adicionarItens(itens4);
		compra4.adicionarItens(itens5);
		
		compra4.imprimirListaItens();
		
		System.out.println("---------------------------------------------\n");
		
		System.out.println("Carrinho 5");
		Compra compra5 = new Compra();
		compra5.adicionarItens(itens5);

		
		compra5.imprimirListaItens();
		
		System.out.println("---------------------------------------------\n");
//		--------------------------------------------------------------------------------------------------------
		//Entrada de dados Compra ao Cliente:
		System.out.println("Antes da Compra");
		clientes.get(0).calculadoValorCompra();	
		
		System.out.println("\nEfetuando Compras");
		clientes.get(0).adicionandoCompra(compra1);	// 58
		//clientes.get(0).calculadoValorCompra();	
		clientes.get(0).adicionandoCompra(compra2);	// 20,5
		//clientes.get(0).calculadoValorCompra();	
		clientes.get(0).adicionandoCompra(compra3);	// 12,5
		//clientes.get(0).calculadoValorCompra();	
		clientes.get(0).adicionandoCompra(compra4);	// 8
		//clientes.get(0).calculadoValorCompra();	
		clientes.get(0).adicionandoCompra(compra5);	// 2
		//clientes.get(0).calculadoValorCompra();	
		
		System.out.println("\nDepois da Compra");		
		clientes.get(0).calculadoValorCompra();
		System.out.println("---------------------------------------------\n");
		
		System.out.println();
		System.out.println();
		System.out.println("Fim!!!!!");
		entrada.close();
	}
	
}
