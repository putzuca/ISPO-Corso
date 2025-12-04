package esseriVer9;
class Human {
  protected int altezza;			/* in centimetri!! */
  protected int peso;

public Human()
{
 altezza = peso = 0;
 }

public Human(double initAlt, int initPes)
{
 altezza = (int)(initAlt*100);
 peso = initPes;
 }

/* ------------------------------------------------ */
  public double getAltezza() {     
    return ((double)altezza/100);         
  }

  public int getPeso() {
    return peso;
  }
                                
  public void setAltezza(double nuovaAltezza) {  			
    altezza = (int)(nuovaAltezza*100);
  }

/* cambiato, per far si' che il peso sia controllato
prima di essere assegnato */
  public void setPeso(int nuovoPeso) {
    if (nuovoPeso<=250)
       peso=nuovoPeso;
  }

  public void salta() {
      System.out.println("Sto saltando! (e peso " + peso +")");
  }

  public void saltaCon(Human conchi) {
      System.out.println("Sto saltando e facendo saltare! (e peso " + peso +")");
      conchi.salta();
  }

  public void ridi() {
      System.out.println("Sto ridendo!");
  }


  public void descrizione() {
      System.out.println("Sono un umano.");
  }
} /* fine classe Human modificata*/

