package designpatterns.factorymethod;

/** ConcreteCreator */
public final class HtmlCreator extends DocumentoCreator {

	@Override
	protected Documento creaDocumento() {
		return new HtmlDocumento();
	}
	
}
