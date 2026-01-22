package designpatterns.adapter;

/** Adapter */
public final class TermometroAdapter implements TermometroCelsius {
	private final TermometroKelvin adaptee;			// riferimento all'Adaptee
	
	public TermometroAdapter(TermometroKelvin adaptee) {
		this.adaptee = adaptee;
	}

	/** Delega all'Adaptee e traduce il suo metodo in quello di Target */
	@Override
	public double leggiCelsius() {
		return (this.adaptee.leggiKelvin() - 273.15);
	}
}