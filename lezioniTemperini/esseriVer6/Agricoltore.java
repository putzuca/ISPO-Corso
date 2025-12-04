package esseriVer6;
class Agricoltore extends Human {

  private int fattori;

public Agricoltore()
{
 altezza = peso = fattori = 0;
 }

public Agricoltore(double initAlt, int initPes, int numFat)
{
 altezza = (int)(initAlt*100);
 peso = initPes;
 fattori = numFat;
 }

/* ------------------------------------------------ */
  public int getFattori() {     
    return (fattori);         
  }

  public void setFattori(int nuovoNumFat) {
    fattori=nuovoNumFat;
  }

  public void descriviRaccolto() {
      System.out.println("Il raccolto non e' male; io peso "+peso+" e ho " + fattori +" fattori.");
  }
  
  /* AGGIUNTO: ridefinizione */
  public void descrizione() {
      descriviRaccolto();
  }

} /* fine classe Agricoltore*/

