package esercizi.Collections.List;

import static org.junit.Assert.*;

import org.junit.Test;

public class PersonaTest {

	@Test
	public void testCompareTo() {
		Persona p1 = new Persona("Paolo", 10);
		Persona p2 = new Persona("Valter", 5);
		
		assertTrue(p1.compareTo(p2) < 0);
		
		Persona p3 = new Persona("Anna", 8);
		assertTrue(p1.compareTo(p3) > 0);
		
		Persona p4 = new Persona("Paolo", 10);
		assertTrue(p1.compareTo(p4) == 0);
	}
	
	@Test
	public void testCompare() {
		Persona paolo = new Persona("Paolo", 61);
		Persona anna = new Persona("Anna", 55);
		ComparatorePersonePerEta comparator = new ComparatorePersonePerEta();
		
		assertTrue(comparator.compare(paolo, anna) > 0);
		assertTrue(comparator.compare(anna, paolo) < 0);
		assertTrue(comparator.compare(paolo, paolo) == 0);
		assertEquals(0, comparator.compare(anna, anna));
	}

}
