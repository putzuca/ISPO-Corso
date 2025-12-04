package esseriVer5;
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

} /* fine classe Avvocato*/

