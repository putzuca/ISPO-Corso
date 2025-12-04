package esseriVer8_1;
class Avvocato extends Human {

private int causeVinte;

public Avvocato()
{
 altezza = peso = causeVinte = 0;
 }

public Avvocato(double initAlt, int initPes, int numCauseVinte)
{
 super (initAlt, initPes);
 causeVinte = numCauseVinte;
 }

/* ------------------------------------------------ */
  public int getCauseVinte() {     
    return (causeVinte);         
  }

  public void setCauseVinte(int nuovoCauseVinte) {
    causeVinte=nuovoCauseVinte;
  }

  public void celebrati() {
      System.out.println("Sono un avvocato che ha vinto " + causeVinte +" cause, io. E peso "+peso);
  }

  public void descrizione() {
      celebrati();
  }
  
  /* metodo overloaded: un avvocato salta in un modo con un 
  avvocato e in un altro modo con gli altri umani ...
  */
  public void saltaCon(Avvocato conChi) {
      System.out.println("Sono un avvocato che salta con un altro avvocato (e peso " + peso +")");
      conChi.salta();
  }
  
  public void saltaCon(Human conChi) {
      System.out.println("Sono un avvocato che salta con un umano (e peso " + peso +")");
      conChi.salta();
  }

} /* fine classe Avvocato*/

