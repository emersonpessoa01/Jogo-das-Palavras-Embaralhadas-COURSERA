package org.coursera.jogos_das_palavras_embaralhadas;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;

import java.util.HashSet;
import java.util.Set;

import org.junit.Test;

public class EmbaralhadorAleatorioTest {

	@Test
	public void testEmbaralhar() {
		Embaralhador embaralhador = new EmbaralhadorAleatorio();
		String palavra = "java";
		String embaralhada = embaralhador.embaralhar(palavra);

		// Verifica se a palavra embaralhada não é igual à original
		assertNotEquals(palavra, embaralhada);

		// Verifica se a palavra embaralhada tem o mesmo comprimento que a original
		assertEquals(palavra.length(), embaralhada.length());

		// Verifica se a palavra embaralhada contém os mesmos caracteres que a original
		assertTrue(contemMesmosCaracteres(palavra, embaralhada));
	}

	@Test
	public void testEmbaralharEmptyString() {
		Embaralhador embaralhador = new EmbaralhadorAleatorio();

		// Testando com string vazia
		assertEquals("", embaralhador.embaralhar(""));
	}

	@Test
	public void testEmbaralharSingleCharacter() {
		Embaralhador embaralhador = new EmbaralhadorAleatorio();

		// Testando com um único caractere
		assertEquals("a", embaralhador.embaralhar("a"));
	}

	private boolean contemMesmosCaracteres(String original, String embaralhada) {
		Set<Character> originalSet = new HashSet<>();
		for (char c : original.toCharArray()) {
			originalSet.add(c);
		}

		Set<Character> embaralhadaSet = new HashSet<>();
		for (char c : embaralhada.toCharArray()) {
			embaralhadaSet.add(c);
		}

		return originalSet.equals(embaralhadaSet);
	}
}
