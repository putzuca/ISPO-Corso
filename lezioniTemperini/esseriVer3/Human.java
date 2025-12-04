/* da Human seconda versione, con altezza in cm ...

abbiamo aggiunto saltaCon() per vedere l'interazione tra
oggetti mediante scambio di messaggi 
*/
package esseriVer3;

class Human {
  private int altezza;			/* in centimetri!! */
  private int peso;

  public double getAltezza() {     
    return ((double)altezza/100);        
  }

  public int getPeso() {
    return peso;
  }

  public void setAltezza(double nuovaAltezza) {  			
    altezza = (int)(nuovaAltezza*100);
  }

  public void setPeso(int nuovoPeso) {
    peso=nuovoPeso;
  }

  public void salta() {
      System.out.println("Sto saltando! (e peso " + peso +")");
  }

   /* abbiamo aggiunto questo metodo per vedere l'interazione tra
      oggetti mediante scambio di messaggi */
  public void saltaCon(Human conChi) {
      System.out.println("Sto saltando e facendo saltare! (e peso " + peso +")");
      conChi.salta();
  }

  public void ridi() {
      System.out.println("Sto ridendo!");
  }
} /* fine classe Human modificata*/

