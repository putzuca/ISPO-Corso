package esseriVer8_1;
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
  
  public void descrizione() {
      descriviRaccolto();
  }
  
  
  /* metodo overloaded: un agricoltore salta in un modo con un 
  agricoltore e in un altro modo con gli altri umani ...
  */
  public void saltaCon(Agricoltore conChi) {
      System.out.println("Sono un agricolo che salta con un altro agricolo (e peso " + peso +")");
      conChi.salta();
  }
  
  public void saltaCon(Human conChi) {
      System.out.println("Sono un agricolo che salta con un umano (e peso " + peso +")");
      conChi.salta();
  }
  

} /* fine classe Agricoltore*/

