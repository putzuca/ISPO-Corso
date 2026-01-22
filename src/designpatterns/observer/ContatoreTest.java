package designpatterns.observer;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class ContatoreTest {
	private Contatore subject;
	OsservatoreMemoria o1, o2;
	
	@Before
	public void setUp() {
		subject = new Contatore();
		o1 = new OsservatoreMemoria();
		o2 = new OsservatoreMemoria();
		
		subject.attach(o1);
		subject.attach(o2);
	}
	
	/** Verifica che al cambiamento dello stato del Subject i vari Observer
	 * registrati vengano notificati e si aggiornino di conseguenza
	 */
	@Test
	public void testSetValore() {
		
		subject.setValore(7);
		
		assertEquals(7, o1.getUltimoValore());
		assertEquals(7, o2.getUltimoValore());
		
		assertEquals(1, o1.getNumeroNotifiche());
		assertEquals(1, o2.getNumeroNotifiche());
	}
	
	/** Verifica che se un Observer viene eliminato dall'elenco dei
	 * registrati smette di essere notificato e rimane aggiornato
	 * all'ultima notifica ricevuta
	 */
	@Test
	public void testDetach() {
		
		subject.setValore(7);
		subject.detach(o2);
		
		subject.setValore(4);
		
		assertEquals(4, o1.getUltimoValore());
		assertEquals(7, o2.getUltimoValore());
		
		assertEquals(2, o1.getNumeroNotifiche());
		assertEquals(1, o2.getNumeroNotifiche());
	}

}
