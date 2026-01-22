package tracce.piggybank;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class PiggyBank {
	private List<Coin> monete;
	
	public PiggyBank() {
		this.monete = new ArrayList<Coin>();
	}

	public void save(Coin c) {
		this.monete.add(c);
	}
	
	public Coin extract(Coin c) {
		int idc = this.monete.indexOf(c);
		if (idc >= 0) {
			return this.monete.remove(idc);
		}
		else
			return null;
	}
	
	public Iterator<Coin> breakPiggyBank() {
	    List<Coin> tutteLeMonete = new ArrayList<Coin>(this.monete);
	    this.monete.clear();                 // salvadanaio svuotato
	    return tutteLeMonete.iterator();
	}
	
	public double total() {
		double t = 0;
		for(Coin c : this.monete) {
			t +=  c.value() * 100;		// risultato non in dollari ma in centesimi
		}
		return t;
	}
}
