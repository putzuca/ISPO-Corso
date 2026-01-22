package designpatterns.iterator;

import java.util.NoSuchElementException;

/** ConcreteIterator */
public final class ListaInteriIteratore implements Iteratore {
	private final int[] elementi;
	private int corrente = 0;

	public ListaInteriIteratore(int[] elementi) {
		this.elementi = elementi;
	}

	@Override
	public boolean hasNext() {
		return corrente < this.elementi.length;
	}
	
	@Override
	public int next() {
		if (!this.hasNext())
			throw new NoSuchElementException();
		return elementi[corrente++];
	}	
}
