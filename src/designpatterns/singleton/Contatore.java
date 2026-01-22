package designpatterns.singleton;

public final class Contatore {
	private static final Contatore INSTANCE = new Contatore();
	private int valore;
	
	private Contatore() {}
	
	public static Contatore getInstance() {
		return INSTANCE;
	}
	
	public void incrementa() {
		valore++;
	}
	
	public int getValore() {
		return valore;
	}
}
