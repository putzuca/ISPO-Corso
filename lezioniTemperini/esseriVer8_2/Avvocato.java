package esseriVer8_2;
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
  
  /* metodo specializzato per lavorare su avvocati ...
  solo che questo overriding di saltaCon(Human) definito in Human
  non viene usato con binding dinamico, percio' viene chiamato
  solo su oggetti che sono staticamente Avvocati
    */
  public void saltaCon(Avvocato conChi) {
      System.out.println("Sono un avvocato che salta con un altro avvocat (e peso " + peso +")");
      conChi.salta();
  }

} /* fine classe Avvocato*/

