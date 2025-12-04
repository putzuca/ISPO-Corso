package esseriVer2;

/* Human e'stata modificata: 
 in particolare la definizione di altezza e' ora "int altezza" 
 (altezza espressa in centimetri).
 La modifica pero' e' stata fatta in modo trasparente
 a chi usa Human: l'interfaccia offerta dagli
 oggetti Human e' rimasta immutata.
*/

class Human {
  private int altezza;			/* in centimetri!! */
  private int peso;


/* per non modificare l'interfaccia, dobbiamo lasciare
immutata la segnatura dei metodi setAltezza e getAltezza.
Essi sono infatti quelli coinvolti nella modifica da double a int
che abbiamo imposto ad altezza.
Se vogliamo che, dall'esterno di Human, nessuno si accorga del
cambiamento, dobbiamo fare in modo che i due metodi mantengano la
vecchia segnatura.
Pero' va modificato il loro codice ... */

  public double getAltezza() {     /* stessa segnatura di prima! */
    return ((double)altezza/100);  /* ma codice lievemente diverso */
  }

  public int getPeso() {
    return peso;
  }
                                   /* stessa segnatura di prima! 
                                      ma codice un po' diverso:
                                      confidiamo in un formato metri.centimetri
                                      con due cifre decimali per non perdere precisione*/
  public void setAltezza(double nuovaAltezza) {  			
    altezza = (int)(nuovaAltezza*100);
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
} /* fine classe Human modificata*/

