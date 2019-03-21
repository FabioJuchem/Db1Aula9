package br.com.db1.db1start.aula2;

import org.junit.Assert;
import org.junit.Test;

public class ComparadorDeNumerosTeste {
	@Test
	public void deveRetornarNumero1MenorQueNumero2() {
		ComparadorDeNumeros comparador = new ComparadorDeNumeros();
		double resultado = comparador.menor(1,2);
		Assert.assertEquals(1,resultado,0);
	}
}
