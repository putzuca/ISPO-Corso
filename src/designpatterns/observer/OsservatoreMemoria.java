package designpatterns.observer;

/** ConcreteObserver */
public final class OsservatoreMemoria implements Osservatore {
	private int ultimoValore;
	private int numeroNotifiche;

	@Override
	public void update(int nuovoValore) {
		this.ultimoValore = nuovoValore;
		this.numeroNotifiche++;
	}
	
	public int getUltimoValore() {
		return this.ultimoValore;
	}
	
	public int getNumeroNotifiche() {
		return this.numeroNotifiche;
	}
}
