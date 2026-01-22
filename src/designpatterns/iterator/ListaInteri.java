package designpatterns.iterator;

/** ConcreteAggregate */
public final class ListaInteri implements Lista {
	

	private final int[] elementi;

	public ListaInteri(int[] elementi) {
		this.elementi = elementi.clone();
	}
	
	@Override
	public Iteratore iterator() {
		return new ListaInteriIteratore(elementi);
	}

}
