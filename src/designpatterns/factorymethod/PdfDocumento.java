package designpatterns.factorymethod;

/** ConcreteProduct */
public final class PdfDocumento implements Documento {

	@Override
	public String formato() {
		return "PDF";
	}
	
}
