package esercizi.conHashMap;

import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

public class Borsa {
	private Map<String, Attrezzo> attrezzi;
	
	public Borsa() {
		this.attrezzi = new HashMap<String, Attrezzo>();
	}
	
	public boolean addAttrezzo(Attrezzo attrezzo) {
		boolean aggiunto = false;
		if (!this.attrezzi.containsKey(attrezzo.getNome())) {
			this.attrezzi.put(attrezzo.getNome(), attrezzo);
			aggiunto = true;
		}
		return aggiunto;
	}
	
	public int getPesoIterator() {
		int pesoTotale = 0;
		Collection<Attrezzo> c = this.attrezziInBorsa();
		Set<Attrezzo> s = new HashSet<Attrezzo>();
		s.addAll(c);
		Iterator<Attrezzo> iteratore = s.iterator();
		while (iteratore.hasNext()) {
			Attrezzo a;
			a = iteratore.next();
			pesoTotale += a.getPeso();
		}
		return pesoTotale;
	}
	
	public Attrezzo removeAttrezzo(String nomeAttrezzo) {
		Attrezzo a = null;
		Collection<Attrezzo> c = this.attrezziInBorsa();
		Set<Attrezzo> s = new HashSet<Attrezzo>();
		s.addAll(c);
		Iterator<Attrezzo> iteratore = s.iterator();
		while (iteratore.hasNext()) {
			a = iteratore.next();
			if (a.getNome().equals(nomeAttrezzo)) {
				iteratore.remove();
				return a;
			}
		}
		return null;
	}
	
	public Collection<Attrezzo> attrezziInBorsa() {
		return this.attrezzi.values();
	}
	
	public int getPesoForEach() {
		int pesoTotale = 0;
		Collection<Attrezzo> c = this.attrezziInBorsa();
		Set<Attrezzo> s = new HashSet<Attrezzo>();
		s.addAll(c);
		for(Attrezzo e : s)
			pesoTotale += e.getPeso();
		return pesoTotale;
	}
}
