package esercizi.Collections.Map.Es.S2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Aula {
	private Set<Studente> studenti;
	
	public Aula() {
		this.studenti = new HashSet<Studente>();
	}
	
	public boolean addStudente(Studente studente) {
		return this.studenti.add(studente);
	}
	
	public Map<String, List<Studente>> meseDiNascita2Studenti() {
		List<Studente> tmp;
		Map<String, List<Studente>> mappa;
		
		mappa = new HashMap<String, List<Studente>>();
		
		for(Studente s : this.studenti) {
			tmp = mappa.get(s.getMeseDiNascita());
			if (tmp == null) {
				tmp = new ArrayList<Studente>();
				mappa.put(s.getMeseDiNascita(), tmp);
			}
			tmp.add(s);
		}
		return mappa;
	}
}
