package esercizi.conArrayList;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import java.util.*;

public class ListTest {
	
	private Collection<Integer> c;
	private Collection<Integer> t;

	@Before
	public void setUp() {
		c = new LinkedList<Integer>();
		t = new ArrayList<Integer>();
		
		c.add(1);
		c.add(2);
		c.add(3);
		
		t.add(1);
		t.add(2);
	}

	@Test
	public void testRemoveAll() {
		assertTrue(c.removeAll(t));
		Iterator<Integer> it = this.c.iterator();
		assertTrue(it.hasNext());
		assertEquals(3, it.next().intValue());
		assertFalse(it.hasNext());
	}
	
	@Test
	public void testRetainAll() {
		assertTrue(c.retainAll(t));
		Iterator<Integer> it = this.c.iterator();
		assertTrue(it.hasNext());
		assertEquals(1, it.next().intValue());
		assertTrue(it.hasNext());
		assertEquals(2, it.next().intValue());
		assertFalse(it.hasNext());
	}
	
	@Test
	public void testContains() {
		assertTrue(c.contains(3));
		assertFalse(c.contains(4));
		assertTrue(t.contains(2));
		assertFalse(t.contains(3));
	}
	
	@Test
	public void testContainsAll() {
		assertTrue(c.containsAll(t));
		assertFalse(t.containsAll(c));
	}
}
