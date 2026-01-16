package tracce;

import java.util.ArrayList;

public class Autorimessa {
	private ArrayList<String> box;
	
	public Autorimessa() {
		this.box = new ArrayList<String>();
	}
	
	public void parcheggia(String unaTarga) {
		if (this.cercaTarga(unaTarga) == -1)
			this.box.add(unaTarga);
	}
	
	public void rimuovi(String unaTarga) {
		if (this.cercaTarga(unaTarga) > -1)
			this.box.remove(unaTarga);
	}
	
	public int numeroAuto() {
		return this.box.size();
	}
	
	private int cercaTarga(String unaTarga) {
			return this.box.indexOf(unaTarga);
	}
}
