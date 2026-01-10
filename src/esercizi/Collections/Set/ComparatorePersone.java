package esercizi.Collections.Set;

import java.util.Comparator;

import esercizi.Collections.List.Persona;

public class ComparatorePersone implements Comparator<Persona> {
	public int compare(Persona p1, Persona p2) {
		return p1.getNome().compareTo(p2.getNome());
	}
}
