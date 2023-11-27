package br.com.rabelo.cm.modelo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import br.com.rabelo.cm.excecao.ExplosaoException;

public class CampoTeste {
	
	private Campo campo;	
	
	@BeforeEach
	void inicialCampo () {
		campo = new Campo(3, 3);	
	}
	
	@Test
	void testeVizinhoRealDistancia_1_Esquerda () {
		
		Campo vizinho = new Campo(3,2);
		
		boolean resultado = campo.adicionarVizinho(vizinho);
		
		assertTrue(resultado);
	}
	
	@Test
	void testeVizinhoRealDistancia_1_Direita () {
		
		Campo vizinho = new Campo(3,4);
		
		boolean resultado = campo.adicionarVizinho(vizinho);
		
		assertTrue(resultado);
	}
	
	@Test
	void testeVizinhoRealDistancia_1_Baixo () {
		
		Campo vizinho = new Campo(2,3);
		
		boolean resultado = campo.adicionarVizinho(vizinho);
		
		assertTrue(resultado);
	}
	
	@Test
	void testeVizinhoRealDistancia_2_EsqCima () {
		
		Campo vizinho = new Campo(2,2);
		
		boolean resultado = campo.adicionarVizinho(vizinho);
		
		assertTrue(resultado);
	}
	
	@Test
	void testeVizinhoRealDistancia_2_DirCima () {
		
		Campo vizinho = new Campo(4,2);
		
		boolean resultado = campo.adicionarVizinho(vizinho);
		
		assertTrue(resultado);
	}
	
	@Test
	void testeVizinhoRealDistancia_2_EsqBaixo () {
		
		Campo vizinho = new Campo(2,4);
		
		boolean resultado = campo.adicionarVizinho(vizinho);
		
		assertTrue(resultado);
	}
	
	@Test
	void testeVizinhoRealDistancia_2_Dirbaixo () {
		
		Campo vizinho = new Campo(4,4);
		
		boolean resultado = campo.adicionarVizinho(vizinho);
		
		assertTrue(resultado);
	}
	
	@Test
	void testeVizinhoRealDistanciaErrada () {
		
		Campo vizinho = new Campo(5,5);
	
		boolean resultado = campo.adicionarVizinho(vizinho);
		
		assertFalse(resultado);
	}
	
	@Test
	void testeNaoVizinho() {
		Campo vizinho = new Campo(1, 1);
		boolean resultado = campo.adicionarVizinho(vizinho);
		assertFalse(resultado);
	}
	
	@Test
	void testeValorPadraoAtributoMarcado() {
		assertFalse(campo.isMarcado());
	}
	
	@Test
	void testeAlternarMarcacao() {
		campo.alternarMarcado();
		assertTrue(campo.isMarcado());
	}
	
	@Test
	void testeAlternarMarcacaoDuasChamadas() {
		campo.alternarMarcado();
		campo.alternarMarcado();
		assertFalse(campo.isMarcado());
	}
	
	@Test
	void testeAbrirNaoMinadoNaoMarcado() {		
		assertTrue(campo.abrir());
	}
	
	@Test
	void testeAbrirNaoMinadoSimMarcado() {		
		campo.alternarMarcado();
		assertFalse(campo.abrir());
	}
	
	@Test
	void testeAbrirSimMinadoSimMarcado() {	
		campo.alternarMarcado();
		campo.minar();		
		assertFalse(campo.abrir());
	}
	
	@Test
	void testeAbrirSimMinadoNaoMarcado() {		
		campo.minar();		
		assertThrows(ExplosaoException.class, () -> {
			campo.abrir();		
		});	
	}
	
	@Test
	void testeAbrirComVizinhos() {		
		Campo campo11 = new Campo(1, 1);
		Campo campo22 = new Campo(2, 2);		
		campo22.adicionarVizinho(campo11);
		
		campo.adicionarVizinho(campo22);
		campo.abrir();
		
		assertTrue(campo22.isAberto() && campo11.isAberto());		
	}
	
	@Test
	void testeAbrirComVizinhos2() {		
		Campo campo11 = new Campo(1, 1);
		Campo campo12 = new Campo(1, 1);
		campo12.minar();
		
		Campo campo22 = new Campo(2, 2);		
		campo22.adicionarVizinho(campo11);
		campo22.adicionarVizinho(campo12);
		
		campo.adicionarVizinho(campo22);
		campo.abrir();
		
		assertTrue(campo22.isAberto() && campo11.isFechado());		
		
	}
	
}


