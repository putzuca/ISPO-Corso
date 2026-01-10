package esercizi.Collections.Set.Es.D3;

import java.util.TreeSet;
import java.util.Set;

public class Aula {
	private Set<Studente> studenti;
	
	public Aula() {
		this.studenti = new TreeSet<Studente>();
	}
	
	public boolean addStudente(Studente studente) {
		return this.studenti.add(studente);
	}
}
