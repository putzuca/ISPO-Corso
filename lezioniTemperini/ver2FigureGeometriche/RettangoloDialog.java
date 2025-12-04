package ver2FigureGeometriche;
import java.awt.*;
import java.awt.event.*;

class RettangoloDialog extends Dialog implements ActionListener {
  private FinestraPrincipale mamma;
  private Label prompto;
  private TextField textfield1;
  private TextField textfield2;
  private Button bottoneCalcolaArea;
  private Button bottoneCalcolaPerimetro;

  public RettangoloDialog(FinestraPrincipale initMamma) {
    super(initMamma);
    mamma = initMamma;
    prompto = new Label("Scrivi la base e l'altezza");
    textfield1 = new TextField("", 20);
    textfield2 = new TextField("", 20);
    bottoneCalcolaArea = new Button("per avere AREA");
    bottoneCalcolaPerimetro = new Button("per avere PERIMETRO");

    textfield1.addActionListener(this);
    textfield2.addActionListener(this);
    bottoneCalcolaArea.addActionListener(this);
    bottoneCalcolaPerimetro.addActionListener(this);

    setLayout(new FlowLayout()); // scegliamo layout
    add(prompto);
    add(textfield1);
    add(textfield2);
    add(bottoneCalcolaArea);
    add(bottoneCalcolaPerimetro);
    setLocation(200, 200);	// dove
    setSize(200,250);	// quanto grande
  }

  public void actionPerformed(ActionEvent event) {
    Object bottoneAttivato = event.getSource();
    String baseText = textfield1.getText();
    String altezzaText = textfield2.getText();
    try {
    double base = Double.parseDouble(baseText);
    double altezza = Double.parseDouble(altezzaText);
      if (bottoneAttivato == bottoneCalcolaArea) {
        mamma.trattaAreaRettangolo(base, altezza);
      } else {
        if (bottoneAttivato == bottoneCalcolaPerimetro) {
          mamma.trattaPerimetroRettangolo(base, altezza);
        }
      }
    } catch (NumberFormatException e) {
      System.out.println("devi scrivere numeri, corrispondenti a misure di lati o basi ...!");
    }
    this.hide();
  }
}