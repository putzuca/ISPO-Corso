package ver0_1FigureGeometriche;
import java.awt.*;
import java.awt.event.*;

class RettangoloDialog extends Dialog implements ActionListener {
  /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
private FinestraPrincipale mamma;
  private Label prompto;
  private TextField textfield1;
  private TextField textfield2;
  private Button bottoneCalcola;

  public RettangoloDialog(FinestraPrincipale initMamma) {
    super(initMamma);
    mamma = initMamma;
    prompto = new Label("Scrivi la base e l'altezza");
    textfield1 = new TextField("", 30);
    textfield2 = new TextField("", 30);
    bottoneCalcola = new Button("Calcola");

    textfield1.addActionListener(this);
    textfield2.addActionListener(this);
    bottoneCalcola.addActionListener(this);

    setLayout(new FlowLayout()); // scegliamo layout
    add(prompto);
    add(textfield1);
    add(textfield2);
    add(bottoneCalcola);
    setLocation(200, 200);	// dove
    setSize(250,250);	// quanto grande
  }

  public void actionPerformed(ActionEvent event) {
    String baseText = textfield1.getText();
    String altezzaText = textfield2.getText();
    double base = Double.parseDouble(baseText);
    double altezza = Double.parseDouble(altezzaText);
    this.setVisible(false); // ??
    mamma.calcolaRettangolo(base, altezza);
  }
}