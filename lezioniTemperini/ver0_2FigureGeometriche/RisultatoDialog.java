package ver0_2FigureGeometriche;
import java.awt.*;
import java.awt.event.*;

class RisultatoDialog extends Dialog implements ActionListener {
  /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
private FinestraPrincipale mamma;
  private Label risultatoLabel;
  private Button bottoneOk;

  public RisultatoDialog(FinestraPrincipale initMamma, String risultato) {
    super(initMamma);
    setMamma(initMamma);
    risultatoLabel = new Label(risultato);
    bottoneOk = new Button("OK");

    bottoneOk.addActionListener(this);

    setLayout(new FlowLayout()); // scegliamo layout
    add(risultatoLabel);
    add(bottoneOk);
    setLocation(200, 200);	// dove
    setSize(250,250);	// quanto grande
  }

  public void actionPerformed(ActionEvent event) {
    Object bottoneAttivato = event.getSource();
    if (bottoneAttivato == bottoneOk) this.setVisible(false); // ??
  }

public FinestraPrincipale getMamma() {
	return mamma;
}

public void setMamma(FinestraPrincipale mamma) {
	this.mamma = mamma;
}
}