package esercizi.Collections.Set;

import static org.junit.Assert.*;

import java.util.HashSet;
import java.util.Set;

import org.junit.Test;

import esercizi.Collections.List.Persona;

public class HashSetTest {
	
	static Persona paolo = new Persona("Paolo", 10);
	static Persona paolo2 = new Persona("Paolo", 10);

	Persona valter = new Persona("Valter", 8);

	@Test
	public void testAddDuplicatiENon() {
		
		System.out.println("hash code paolo: "+ paolo.hashCode());
		System.out.println("hash code paolo2: "+ paolo2.hashCode());
		
		Set<Persona> c = new HashSet<Persona>();
		assertEquals(0, c.size());
		
		
		assertTrue(c.add(paolo));
		assertEquals(1, c.size());
		
		assertTrue(c.add(valter));
		assertEquals(2, c.size());
		
		assertFalse(c.add(paolo));
		assertEquals(2, c.size());
		
		assertFalse(c.add(paolo2));
		assertEquals(2, c.size());
	}

}
