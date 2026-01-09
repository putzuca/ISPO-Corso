package esercizi.conArrayList;

import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

public class Borsa {
	private List<Attrezzo> attrezzi;
	
	public Borsa() {
		this.attrezzi = new ArrayList<Attrezzo>();
	}
	
	public boolean addAttrezzo(Attrezzo attrezzo) {
		return this.attrezzi.add(attrezzo);
	}
	
	public int getPesoIterator() {
		int pesoTotale = 0;
		Iterator<Attrezzo> iteratore = this.attrezzi.iterator();
		while (iteratore.hasNext()) {
			Attrezzo a;
			a = iteratore.next();
			pesoTotale += a.getPeso();
		}
		return pesoTotale;
	}
	
	public Attrezzo removeAttrezzo(String nomeAttrezzo) {
		Attrezzo a = null;
		Iterator<Attrezzo> iteratore = this.attrezzi.iterator();
		while (iteratore.hasNext()) {
			a = iteratore.next();
			if (a.getNome().equals(nomeAttrezzo)) {
				iteratore.remove();
				return a;
			}
		}
		return null;
	}
	
	public int getPesoForEach() {
		int pesoTotale = 0;
		for(Attrezzo a : this.attrezzi)
			pesoTotale += a.getPeso();
		return pesoTotale;
	}
}
