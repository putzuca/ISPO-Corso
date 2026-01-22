package designpatterns.proxy;

import static org.junit.Assert.*;

import org.junit.Test;

public class ArchivioTest {

	@Test
	public void testLeggi_accessoConsentito() {
		Archivio proxy = new ArchivioProxy(true);
		
		assertEquals("VALORE(k1)", proxy.leggi("k1"));
	}
	
	@Test(expected = SecurityException.class)
	public void testLeggi_accessoNegato() {
		Archivio proxy = new ArchivioProxy(false);
		
		proxy.leggi("k1");
	}
}
