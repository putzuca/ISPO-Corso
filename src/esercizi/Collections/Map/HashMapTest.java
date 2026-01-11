package esercizi.Collections.Map;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.junit.Before;
import org.junit.Test;

public class HashMapTest {
	private Map<Persona, Eta> m, n;
	private Persona p1, p2, p3;
	private Eta e1, e2, e3;

	@Before
	public void setUp() {
		
		this.p1 = new Persona("Luca");
		this.p2 = new Persona("Marta");
		this.p3 = new Persona("Aldo");
		
		this.e1 = new Eta(13);
		this.e2 = new Eta(5);
		this.e3 = new Eta(9);
		
		this.m = new HashMap<Persona, Eta>();
		this.m.put(p1, e1);
		
		this.n = new HashMap<Persona, Eta>();
		this.n.put(p2, e2);
		this.n.put(p3, e3);

	}

	@Test
	public void testPut() {
		assertEquals(1, this.m.size());
		
		assertNull(this.m.put(p2, e2));
		assertEquals(2, this.m.size());
		
		assertEquals(e1, this.m.put(p1, e2));
		assertEquals(2, this.m.size());
		
		assertNull(this.m.put(p3, e3));
		assertEquals(3, this.m.size());

	}
	
	@Test
	public void testGet() {
		assertEquals(e1, this.m.get(p1));
		assertNull(this.m.get(p2));

	}
	
	@Test
	public void testRemove() {
		assertEquals(1, this.m.size());
		
		assertEquals(e1, this.m.remove(p1));
		assertEquals(0, this.m.size());
	}
	
	@Test
	public void testContainsKey() {
		this.m.put(p2, e2);
		
		assertTrue(this.m.containsKey(p1));
		assertTrue(this.m.containsKey(p2));
		assertFalse(this.m.containsKey(p3));
	}
	
	@Test
	public void testPutAll() {
		this.m.putAll(n);
		
		assertTrue(this.m.containsKey(p2));
		assertTrue(this.m.containsKey(p3));
		assertEquals(3, this.m.size());
	}
	
	@Test
	public void testClear() {
		this.n.clear();
		
		assertFalse(this.n.containsKey(p2));
		assertFalse(this.n.containsKey(p3));
		assertEquals(0, this.n.size());
	}
	
	@Test
	public void testKeySet() {
		Set<Persona> s = new HashSet<Persona>(n.keySet());
		
		assertTrue(s.contains(p2));
		assertTrue(s.contains(p3));
		assertEquals(2, s.size());
	}
	
	@Test
	public void testValues() {
		List<Eta> l = new ArrayList<Eta>(n.values());
		
		assertTrue(l.contains(e2));
		assertTrue(l.contains(e3));
		assertEquals(2, l.size());

	}
}
