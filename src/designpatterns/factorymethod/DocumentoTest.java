package designpatterns.factorymethod;

import static org.junit.Assert.*;

import org.junit.Test;

public class DocumentoTest {
	
    /**
     * Verifica che, usando un {@link PdfCreator}, il metodo pubblico del Creator
     * ({@link DocumentoCreator#descriviDocumento()}) crei internamente un documento PDF
     * tramite il Factory Method e restituisca la descrizione attesa.
     */
    @Test
    public void testDescriviDocumento_pdf() {
        DocumentoCreator c = new PdfCreator();
        assertEquals("Documento creato: PDF", c.descriviDocumento());
    }
    
    /**
     * Verifica che, usando un {@link HtmlCreator}, il metodo pubblico del Creator
     * ({@link DocumentoCreator#descriviDocumento()}) crei internamente un documento HTML
     * tramite il Factory Method e restituisca la descrizione attesa.
     */
    @Test
    public void testDescriviDocumento_html() {
        DocumentoCreator c = new HtmlCreator();
        assertEquals("Documento creato: HTML", c.descriviDocumento());
    }
}
