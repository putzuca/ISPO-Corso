package designpatterns.adapter;

import static org.junit.Assert.*;

import org.junit.Test;

public class TermometroAdapterTest {

	/** Verifica che interfacciandosi unicamente col Target (e non con l'Adaptee)
	 *  si arriva al risultato in Celsius attraverso la traduzione da Kelvin a Celsius
	 *  operata dall'adattatore
	 */
	@Test
	public void testLeggiCelsius() {
		TermometroKelvin adaptee = new TermometroKelvin(300.0);
		TermometroCelsius target = new TermometroAdapter(adaptee);
		
		assertEquals(26.85, target.leggiCelsius(), 1e-9);
	}

}
