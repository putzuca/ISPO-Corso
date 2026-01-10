package esercizi.Collections.Set.Es.D2;

import java.util.Set;
import java.util.TreeSet;

public class Aula {
	private Set<Studente> studenti;
	
	public Aula() {
		ComparatoreStudentiPerNome cmp = new ComparatoreStudentiPerNome();
		this.studenti = new TreeSet<Studente>(cmp);
	}
	
	public boolean addStudente(Studente studente) {
		return this.studenti.add(studente);
	}
}
