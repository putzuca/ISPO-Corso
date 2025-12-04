package ver0_1FigureGeometriche;
class Rettangolo extends Figura {
  private double base;
  private double altezza;

  public Rettangolo() {
    base = 0.0;
    altezza = 0.0;
  }

  public Rettangolo(double initBase, double initAltezza) {
    base = initBase;
    altezza = initAltezza;
  }

  public double getBase() {
    return base;
  }

  public double getAltezza() {
    return altezza;
  }

  public double calcolaArea() {
    double area = base * altezza;
    return area;
  }

  public void setBase(double nuovaBase) {
    base = nuovaBase;
  }

  public void setAltezza(double nuovaAltezza) {
    altezza = nuovaAltezza;
  }
}




