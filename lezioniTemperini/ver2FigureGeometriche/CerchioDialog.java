package ver2FigureGeometriche;
import java.awt.*;
import java.awt.event.*;

class CerchioDialog extends Dialog implements ActionListener {
  private FinestraPrincipale mamma;
  private Label prompto;
  private TextField textfield;
  private Button bottoneCalcolaArea;
  private Button bottoneCalcolaPerimetro;

  public CerchioDialog(FinestraPrincipale initMamma) {
    super(initMamma);
    mamma = initMamma;
    prompto = new Label("Scrivi il raggio del cerchio");
    textfield = new TextField("", 25);
    bottoneCalcolaArea = new Button("per avere AREA");
    bottoneCalcolaPerimetro = new Button("per avere PERIMETRO");

    textfield.addActionListener(this);
    bottoneCalcolaArea.addActionListener(this);
    bottoneCalcolaPerimetro.addActionListener(this);

    setLayout(new FlowLayout()); // scegliamo layout
    add(prompto);
    add(textfield);
    add(bottoneCalcolaArea);
    add(bottoneCalcolaPerimetro);
    setLocation(200, 200);	// dove
    setSize(200,250);	// quanto grande
  }

  public void actionPerformed(ActionEvent event) {
    Object bottoneAttivato = event.getSource();
    String raggioText = textfield.getText();
    try {
      double raggio = Double.parseDouble(raggioText);
      if (bottoneAttivato == bottoneCalcolaArea) {
        mamma.trattaAreaCerchio(raggio);
      } else {
        if (bottoneAttivato == bottoneCalcolaPerimetro) {
          mamma.trattaPerimetroCerchio(raggio);
        }
      }
    } catch (NumberFormatException e) {
      System.out.println("Scrivi un numero!");
    }
    this.hide();
  }
}