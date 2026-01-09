package esercizi.Collections;

import java.util.Comparator;

public class ComparatorePersonePerEta implements Comparator<Persona> {

	@Override
	public int compare(Persona p1, Persona p2) {
		return p1.getEta() - p2.getEta();
	}
	
}
