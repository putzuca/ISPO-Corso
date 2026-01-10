package esercizi.Collections.Set;

import static org.junit.Assert.*;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

import org.junit.Test;

import esercizi.Collections.List.Persona;

public class TreeSetTest {

	@Test
	public void testAddDuplicatiEnon_ClassCastExc() {
		ComparatorePersone comparator = new ComparatorePersone();
		Set<Persona> c = new TreeSet<Persona>(comparator);
		Persona paolo = new Persona("Paolo", 10);
		Persona valter = new Persona("Valter", 8);
		Persona valter2 = new Persona("Valter", 10);

		assertTrue(c.add(paolo));
		assertTrue(c.add(valter));
		assertFalse(c.add(valter));
		assertFalse(c.add(valter2));
		assertEquals(2, c.size());
		
		Iterator<Persona> it = c.iterator();
		assertSame(paolo, it.next());
		assertSame(valter, it.next());
	}

}
