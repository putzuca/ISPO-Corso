package ver0_2FigureGeometriche;
class Cerchio extends Figura {
  private double raggio;

  public Cerchio() {
    raggio = 0.0;
  }

  public Cerchio(double initRaggio) {
    raggio = initRaggio;
  }

  public double getRaggio() {
    return raggio;
  }

  public void setRaggio(double nuovoRaggio) {
    raggio = nuovoRaggio;
  }

  public double calcolaArea() {
    double area = Math.PI * raggio * raggio ;
    return area;
  }
}

