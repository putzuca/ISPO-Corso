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
		boolean eraMin = (min != null && this.min.compareTo(val) == 0);
		
		super.remove(val);
		
		if (eraMin) {
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
	// proviamo a scrivere una cosa a caso per vedere se si può
}
