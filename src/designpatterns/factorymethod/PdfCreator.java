package designpatterns.factorymethod;

/** ConcreteCreator */
public final class PdfCreator extends DocumentoCreator {

	@Override
	protected Documento creaDocumento() {
		return new PdfDocumento();
	}

}
