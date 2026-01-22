package designpatterns.bridge;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class ControlloRemotoTest {
	private Dispositivo tv, radio;
	private ControlloRemoto telTv, appTv, appRadio;
	
	@Before
	public void setUp() throws Exception {
		tv = new Tv();
		radio = new Radio();
		telTv = new Telecomando(tv);
		appTv = new App(tv);
		appRadio = new App(radio);
	
	
	}
	/** Verifica che uno stesso Dispositivo può essere
	 *  controllato da due RefinedAbstraction diverse */
	@Test
	public void testPremiOn_Tv() {
		
		assertEquals("TELECOMANDO: TV ON", telTv.premiOn());
		assertEquals("APP: TV ON", appTv.premiOn());
		
	}
	/** Verifica che due Dispositivi possono essere controllati
	 *  con due istanze della stessa RefinedAbstraction */
	@Test
	public void testPremiOn_App() {

		assertEquals("APP: TV ON", appTv.premiOn());
		assertEquals("APP: RADIO ON", appRadio.premiOn());
		
	}

}
