/*versione 1: dopo le versioni iniziali.
Questa e' piu' rispettosa dei ruoli:
- il calcolatore calcola su oggetti di sua proprieta' (cerchi e rettangoli)
e la finestra principale riceve e smista ordini 
piu' consoni ad un'interfaccia grafica

la finestra principale dialoga con le finestre accessorie e
manda messaggi al calcolatore per avere l'area delle figure

c'e' un puntatore al calcolatore nella finesra principale

trattamento dati inconsistenti effettuato

gli oggetti dialog vengono creati nuovi ogni volta che servono

QUESTO sistema si puo' assimilare al risultato della
consegna dello USE CASE CALCOLAREA.

Aggiungendo il trattamento del perimetro
(cioe' sviluppando lo USE CASE CALCOLAPERIMETRO e 
integrando quel che si ottiene con quanto sviluppato qui,
si ottiene il sistema complessivo 
*/
package ver1FigureGeometriche;

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

  public double cambiaRettangoloECalcolaArea(double nuovoBase, double nuovaAltezza) {
    ilRettangolo.setBase(nuovoBase);
    ilRettangolo.setAltezza(nuovaAltezza);
    return ilRettangolo.calcolaArea();
  }



}
