package ver0_1FigureGeometriche;
import java.awt.*;
import java.awt.event.*;

class CerchioDialog extends Dialog implements ActionListener {
  /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
private FinestraPrincipale mamma;
  private Label prompto;
  private TextField textfield;
  private Button bottoneCalcola;

  public CerchioDialog(FinestraPrincipale initMamma) {
    super(initMamma);
    mamma = initMamma;
    prompto = new Label("Scrivi il raggio del cerchio");
    textfield = new TextField("", 30);
    bottoneCalcola = new Button("OK");

    textfield.addActionListener(this);
    bottoneCalcola.addActionListener(this);

    setLayout(new FlowLayout()); // scegliamo layout
    add(prompto);
    add(textfield);
    add(bottoneCalcola);
    setLocation(200, 200);	// dove
    setSize(250,250);	// quanto grande
  }

  public void actionPerformed(ActionEvent event) {
    String radiusText = textfield.getText();
    double radius = Double.parseDouble(radiusText);
    this.setVisible(false); 
    mamma.calcolaCerchio(radius);
  }
}