package designpatterns.observer;

import java.util.ArrayList;
import java.util.List;

/** Subject e ConcreteSubject */
public class Contatore {
	private final List<Osservatore> osservatori = new ArrayList<Osservatore>();
	private int valore;
	
	public void attach(Osservatore o) {
		if (o != null && !this.osservatori.contains(o))
			this.osservatori.add(o);
	}
	
	public void detach(Osservatore o) {
		if (this.osservatori.contains(o))
			this.osservatori.remove(o);
	}
	
	public void setValore(int valore) {
		this.valore = valore;
		this.notifyObservers();
	}
	
	private void notifyObservers() {
		for (Osservatore o : this.osservatori)
			o.update(this.valore);				// PUSH: passa il nuovo valore
	}
}
