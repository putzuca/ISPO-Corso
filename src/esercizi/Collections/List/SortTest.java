package esercizi.Collections.List;

import static org.junit.Assert.*;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import org.junit.Test;

public class SortTest {

	@Test
	public void testSort_Comparable() {
		List<Persona> l = new LinkedList<Persona>();
		l.add(new Persona("Valter", 5));
		l.add(new Persona("Paolo", 10));
		l.add(new Persona("Giacomo", 7));
		l.add(new Persona("Alessandro", 8));
		
		Collections.sort(l);
		
		assertEquals("Alessandro", l.get(0).getNome());
		assertEquals("Giacomo", l.get(1).getNome());
		assertEquals("Paolo", l.get(2).getNome());
		assertEquals("Valter", l.get(3).getNome());
		
		assertEquals("Alessandro", Collections.min(l).getNome());
		assertEquals("Valter", Collections.max(l).getNome());
	}
	
	@Test
	public void testSort_Comparator() {
		List<Persona> l = new LinkedList<Persona>();
		l.add(new Persona("Valter", 5));
		l.add(new Persona("Paolo", 10));
		l.add(new Persona("Giacomo", 7));
		l.add(new Persona("Alessandro", 8));
		
		ComparatorePersonePerEta comparator = new ComparatorePersonePerEta();
		Collections.sort(l, comparator);
		
		assertEquals("Valter", l.get(0).getNome());
		assertEquals("Giacomo", l.get(1).getNome());
		assertEquals("Alessandro", l.get(2).getNome());
		assertEquals("Paolo", l.get(3).getNome());
	}

}
