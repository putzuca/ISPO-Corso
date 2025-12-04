package ver0_1FigureGeometriche;
import java.awt.*;
import java.awt.event.*;

public class FinestraPrincipale extends Frame implements ActionListener { // WindowListener??
  /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
private Cerchio ilCerchio;
  private Rettangolo ilRettangolo;
  private Button bottoneCerchio;
  private Button bottoneRettangolo;
  private Button bottoneFine;

  public FinestraPrincipale(Cerchio initCerchio, Rettangolo initRettangolo) {
    ilCerchio = initCerchio;
    ilRettangolo = initRettangolo;
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
    setLocation(100, 100);	// dove
    setSize(250,250);	// quanto grande
  }

  public void actionPerformed(ActionEvent event) {
    Object bottoneAttivato = event.getSource();
    if (bottoneAttivato == bottoneFine) System.exit(0);
    else {
      if (bottoneAttivato == bottoneCerchio) {
        CerchioDialog laDialog = new CerchioDialog(this);
        laDialog.setVisible(true);
      } else {
        if (bottoneAttivato == bottoneRettangolo) {
          RettangoloDialog laDialog = new RettangoloDialog(this);
          laDialog.setVisible(true);
        }
      }
    }
  }

  public void calcolaCerchio(double nuovoRaggio) {
    ilCerchio.setRaggio(nuovoRaggio);
    double area = ilCerchio.calcolaArea();
    String risultato = "L'area del cerchio � " + area;
    RisultatoDialog laDialog = new RisultatoDialog(this, risultato);
    laDialog.setVisible(true);
  }

  public void calcolaRettangolo(double nuovoBase, double nuovaAltezza) {
    ilRettangolo.setBase(nuovoBase);
    ilRettangolo.setAltezza(nuovaAltezza);
    double area = ilRettangolo.calcolaArea();
    String risultato = "L'area del rettangolo � " + area;
    RisultatoDialog laDialog = new RisultatoDialog(this, risultato);
    laDialog.setVisible(true);
  }
}
