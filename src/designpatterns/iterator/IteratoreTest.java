package designpatterns.iterator;

import static org.junit.Assert.*;

import java.util.NoSuchElementException;

import org.junit.Test;

public class IteratoreTest {
	
	/** Verifica la scansione della lista con next e hasNext */
    @Test
    public void testHasNext_Next() {
    	int[] elementi = {10, 20, 30};
        Lista lista = new ListaInteri(elementi);
        Iteratore it = lista.iterator();

        assertTrue(it.hasNext());
        assertEquals(10, it.next());
        assertTrue(it.hasNext());
        assertEquals(20, it.next());
        assertTrue(it.hasNext());
        assertEquals(30, it.next());
        assertFalse(it.hasNext());
    }

    /** Verifica che next su lista vuota lanci un'eccezione */
    @Test(expected = NoSuchElementException.class)
    public void testNext_listaSenzaElementi() {
    	int[] elementi = new int[0];
        Lista lista = new ListaInteri(elementi);
        Iteratore it = lista.iterator();
        assertFalse(it.hasNext());
        it.next();
    }
}