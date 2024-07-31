package org.coursera.jogos_das_palavras_embaralhadas;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class EmbaralhadorInverterTest {

	@Test
	public void testEmbaralhar() {
		Embaralhador embaralhador = new EmbaralhadorInverter();

		// Testando com diferentes palavras
		assertEquals("avaj", embaralhador.embaralhar("java"));
		assertEquals("odarugeS", embaralhador.embaralhar("Segurado"));
		assertEquals("dcba", embaralhador.embaralhar("abcd"));
	}

	@Test
	public void testEmbaralharEmptyString() {
		Embaralhador embaralhador = new EmbaralhadorInverter();

		// Testando com string vazia
		assertEquals("", embaralhador.embaralhar(""));
	}

	@Test
	public void testEmbaralharSingleCharacter() {
		Embaralhador embaralhador = new EmbaralhadorInverter();

		// Testando com um único caractere
		assertEquals("a", embaralhador.embaralhar("a"));
	}
}
