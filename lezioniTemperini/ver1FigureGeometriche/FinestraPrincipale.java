package ver1FigureGeometriche;
import java.awt.*;
import java.awt.event.*;

public class FinestraPrincipale extends Frame implements ActionListener {
  private Calcolatore ilCalcolatore;
  private Button bottoneCerchio;
  private Button bottoneRettangolo;
  private Button bottoneFine;

  public FinestraPrincipale(Calcolatore initCalcolatore) {
	ilCalcolatore = initCalcolatore;
    bottoneCerchio = new Button("Cerchio");
    bottoneRettangolo = new Button("Rettangolo");
    bottoneFine = new Button("FINE");

    bottoneCerchio.addActionListener(this);
    bottoneRettangolo.addActionListener(this);
    bottoneFine.addActionListener(this);
    setLayout(new FlowLayout()); // scegliamo layout
    add(bottoneCerchio); // piazzamo i bottoni
    add(bottoneRettangolo);
    add(bottoneFine);
    setLocation(200, 100);	// dove
    setSize(250,250);	// quanto grande
  }

  public void actionPerformed(ActionEvent event) {
    Object bottoneAttivato = event.getSource();
    if (bottoneAttivato == bottoneFine) System.exit(0);
    else {
      if (bottoneAttivato == bottoneCerchio) {
        CerchioDialog laDialog = new CerchioDialog(this);
        laDialog.show();
      } else {
        if (bottoneAttivato == bottoneRettangolo) {
          RettangoloDialog laDialog = new RettangoloDialog(this);
          laDialog.show();
        }
      }
    }
  }

  public void trattaAreaCerchio(double nuovoRaggio) {
    double area = ilCalcolatore.cambiaCerchioECalcolaArea(nuovoRaggio);
    String risultato = "L'area del cerchio � " + area;
    RisultatoDialog laDialog = new RisultatoDialog(this, risultato);
    laDialog.show();
  }

  public void trattaAreaRettangolo(double nuovoBase, double nuovaAltezza) {
    double area
      = ilCalcolatore.cambiaRettangoloECalcolaArea(nuovoBase, nuovaAltezza);
    String risultato = "L'area del rettangolo � " + area;
    RisultatoDialog laDialog = new RisultatoDialog(this, risultato);
    laDialog.show();
  }
}
