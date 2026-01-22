package designpatterns.factorymethod;

/** Creator */
public abstract class DocumentoCreator {
	// Factory Method
	protected abstract Documento creaDocumento();
	
	// Operazione usata solo dall'interfaccia Product (Documento)
	public String descriviDocumento() {
		Documento d = creaDocumento();
		return "Documento creato: " + d.formato();
	}
}
