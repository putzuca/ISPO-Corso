package designpatterns.factorymethod;

/** ConcreteProduct */
public final class HtmlDocumento implements Documento {

	@Override
	public String formato() {
		return "HTML";
	}
	
}
