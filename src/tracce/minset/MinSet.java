package tracce.minset;

import java.util.Iterator;

public class MinSet<T extends Comparable<T>> extends Set<T> {
	private T min;					// il minimo dell’insieme
	
	// costruisce un MinSet inizializzando opportunamente min
	public MinSet() {
		this.min = null;
	}
	
	// aggiunge il nuovo valore a this, aggiornando il campo
	// min nel caso il nuovo valore sia il nuovo minimo
	public void add(T val) {
		super.add(val);
		if (this.min == null)
			this.min = val;
		else if (this.min.compareTo(val) > 0)
			this.min = val;
	}
	
	// rimuove una occorrenza di val da this, aggiornando il
	// min in tutti i casi in cui sia necessario
	public void remove(T val) {
		super.remove(val);									// si potrebbe controllare prima di rimuovere con
		if (min != null && this.min.compareTo(val) == 0) {  // boolean eraMin = (min != null && this.min.compareTo(val) == 0)
			this.min = null;
			Iterator<T> it = super.iterator();
			if (it.hasNext())
				this.min = it.next();
			while (it.hasNext()) {
				T e = it.next();
				if (this.min.compareTo(e) > 0)
					this.min = e;
			}	
		}
	}
}
