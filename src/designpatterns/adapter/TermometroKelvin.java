package designpatterns.adapter;

/** Adaptee */
public final class TermometroKelvin {
	private final double k;
	
	public TermometroKelvin(double k) {
		this.k = k;
	}
	
	public double leggiKelvin() {
		return this.k;
	}
}