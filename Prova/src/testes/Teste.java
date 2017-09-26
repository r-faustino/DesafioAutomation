package testes;

import org.junit.Test;
import static org.junit.Assert.*;

public class Teste extends Open {
	
	
	@Test
	public void script() {
		
		driver.get("https://www.walmart.com.br/");
		
		PaginaInicial paginaInicial = new PaginaInicial(driver);
		
		paginaInicial.enterPesquisa("TV");
		
		paginaInicial.clickPesquisa();
		
		PaginaPesquisa paginaPesquisa = new PaginaPesquisa(driver);
		
		String textoRetornado = paginaPesquisa.checkElemento();
		assertEquals("Resultados de busca para \"TV\"", textoRetornado);
		
		paginaPesquisa.clickElemento();
		
		
		
	}

}
