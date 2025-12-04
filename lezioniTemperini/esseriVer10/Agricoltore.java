package esseriVer10;
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

/**************** metodi definiti nella medesima classe
                  ma con diversa segnatura              ******/  
    public void saltaCon(Agricoltore conchi) {
      System.out.println("Sto saltando con un agricoltore e facendolo saltare! (e peso " + peso +")");
      conchi.salta();
  }
 
 /* AGGIUNTO  rispetto a prima */
    public void saltaCon(Avvocato conchi) {
      System.out.println("Sto saltando con un avvocato e facendolo saltare! (e peso " + peso +")");
      conchi.salta();
  }


public void descrizione() {
      descriviRaccolto();
  }

} /* fine classe Agricoltore*/

