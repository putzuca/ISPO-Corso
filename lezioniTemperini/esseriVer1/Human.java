package esseriVer1;

class Human {
  private double altezza;             /* altezza in metri    */
  private int peso;                   /* peso in chilogrammi */
  
  public double getAltezza() {
    return altezza;
  }

  public int getPeso() {
    return peso;
  }

  public void setAltezza(double nuovaAltezza) {
    altezza=nuovaAltezza;
  }

  public void setPeso(int nuovoPeso) {
    peso=nuovoPeso;
  }

  public void salta() {
      System.out.println("Sto saltando!");
  }

  public void ridi() {
      System.out.println("Sto ridendo!");
  }
} /* fine classe Human*/

