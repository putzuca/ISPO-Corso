package tracce.predicate;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Principale<T> {
	public Iterator<T> filter(Predicate<T> p, Iterator<? extends T> it) {
		List<T> lista = new ArrayList<T>();
		
		
		while (it.hasNext()) {
			T prossimo = it.next();
			if (p.evaluate(prossimo))
				lista.add(prossimo);
		}
		
		return lista.iterator();
	}


}
