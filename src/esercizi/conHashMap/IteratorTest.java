package esercizi.conHashMap;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import java.util.*;

public class IteratorTest {
	
	private List<String> emptyList;
	private List<String> oneElementList;
	private List<String> twoElementsList;
	private String singolo;

	@Before
	public void setUp() {
		this.emptyList = new ArrayList<String>();
		this.oneElementList = new ArrayList<String>();
		this.singolo = new String("singolo");
		this.oneElementList.add(this.singolo);
		this.twoElementsList = new ArrayList<String>();
		this.twoElementsList.add("primo");
		this.twoElementsList.add("secondo");
	}

	@Test
	public void testHasNext_noNext() {
		Iterator<String> it = this.emptyList.iterator();
		assertNotNull(it);
		assertFalse(it.hasNext());
	}
	
	@Test
	public void testHasNext_yesNext() {
		Iterator<String> it = this.oneElementList.iterator();
		assertNotNull(it);
		assertTrue(it.hasNext());
		it.next();
		assertFalse(it.hasNext());
	}
	
	@Test
	public void testNext_oneElement() {
		Iterator<String> it = this.oneElementList.iterator();
		assertNotNull(it);
		assertTrue(it.hasNext());
		String elemento = it.next();
		assertSame(this.singolo, elemento);
	}
	
	@Test
	public void testNext_twoElements() {
		Iterator<String> it = this.twoElementsList.iterator();
		assertNotNull(it);
		assertTrue(it.hasNext());
		assertEquals("primo", it.next());
		assertTrue(it.hasNext());
		assertEquals("secondo", it.next());
		assertFalse(it.hasNext());
	}
	
	@Test
	public void testRemove() {
		Iterator<String> it = this.oneElementList.iterator();
		assertNotNull(it);
		assertTrue(it.hasNext());
		it.next();
		assertFalse(this.oneElementList.isEmpty());
		it.remove();
		assertTrue(this.oneElementList.isEmpty());
	}

}
