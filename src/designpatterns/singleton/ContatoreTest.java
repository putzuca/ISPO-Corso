package designpatterns.singleton;

import static org.junit.Assert.*;

import org.junit.Test;

public class ContatoreTest {
	


	/** Verifica che getInstance() restituisca sempre la stessa istanza */
	@Test
	public void testGetInstance() {

		Contatore c1 = Contatore.getInstance();
		Contatore c2 = Contatore.getInstance();
		
		assertSame(c1, c2);
	}
	
	/** Verifica che una modifica dello stato dell'istanza restituisca sempre
	 *  la stessa istanza a prescindere dalla variabile in cui è memorizzata */
	@Test
	public void testIncrementa() {
		
		Contatore c1 = Contatore.getInstance();
		Contatore c2 = Contatore.getInstance();
		
		int prima = c1.getValore();
		c1.incrementa();
		
		assertEquals(prima + 1, c1.getValore());
		assertEquals(prima + 1, c2.getValore());
	}

}
