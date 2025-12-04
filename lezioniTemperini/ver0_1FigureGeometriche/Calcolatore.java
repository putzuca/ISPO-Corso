/* versione iniziale: il calcolatore contiene gli oggetti figura,
ma la finestra principale li usa;

niente trattamento dati inconsistenti 
(per rendersene conto, verificare cosa succede 
in console quando si scrive una lettera invece di un
numero per un dato delle figure ...)
*/
package ver0_1FigureGeometriche;

class Calcolatore {
  private Cerchio ilCerchio;
  private Rettangolo ilRettangolo;

  public Calcolatore() {
    ilCerchio = new Cerchio();
    ilRettangolo = new Rettangolo();
  }

  public static void main(String args[]) {
    Calcolatore ilCalcolatore = new Calcolatore();
    ilCalcolatore.mostraFinestraPrincipale();
  }

  public void mostraFinestraPrincipale() {
    FinestraPrincipale finestra  = new FinestraPrincipale(ilCerchio, ilRettangolo);
    finestra.setVisible(true);
  }
}
