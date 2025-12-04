/* Ipotesi per la versione complessiva del sistema,
ottenuta integrando le funzionalita' dello use case CALCOLAPERIMETRO
in quanto sviluppato nella versione precedente.

*/
package ver2FigureGeometriche;

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
    FinestraPrincipale finestra  = new FinestraPrincipale(this);
    finestra.show();
  }

  public double cambiaCerchioECalcolaArea(double nuovoRaggio) {
    ilCerchio.setRaggio(nuovoRaggio);
    return ilCerchio.calcolaArea();
  }

  public double cambiaCerchioECalcolaPerimetro(double nuovoRaggio) {
    ilCerchio.setRaggio(nuovoRaggio);
    return ilCerchio.calcolaPerimetro();
  }

  public double cambiaRettangoloECalcolaArea(double nuovoBase, double nuovaAltezza) {
    ilRettangolo.setBase(nuovoBase);
    ilRettangolo.setAltezza(nuovaAltezza);
    return ilRettangolo.calcolaArea();
  }

  public double cambiaRettangoloECalcolaPerimetro(double nuovoBase, double nuovaAltezza) {
    ilRettangolo.setBase(nuovoBase);
    ilRettangolo.setAltezza(nuovaAltezza);
    return ilRettangolo.calcolaPerimetro();
  }
}
