package esercizi.Collections.Map.Es;

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
		// scrivere il codice di questo metodo
	}
}
