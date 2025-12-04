/* programma per gli esseri umani ver7
due aspetti:
1) in questo programma funzionano i medesimi oggetti
della ver.6; ma sono assegnati a variabili di classe Human.
L'assegnazione e' corretta e anche tutto il resto continua
ad essere corretto e funzionare, perche' c'e' compatibilita'
di tipo tra Human e le sue sottoclassi.

2) la scelta del metodo con il quale rispondere al 
messaggio pietro.descrizione() avviene seguendo il
meccanismo del binding dinamico: giustamente l'oggetto
di tipo agricoltore collegato a pietro si rivolge alla
classe agricoltore per cercare il codice da eseguire.
*/
package esseriVer7;

class EsseriUmani    
{

  public static void main(String args[]) {
  /* 
    Agricoltore Pietro;
    Avvocato Rosy;
  */
  Human Pietro, Rosy;
  
  System.out.println("-------- ESSERI UMANI - Versione 7 --------");
  
  Pietro=new Agricoltore(1.88, 87, 47);
  Rosy= new Avvocato(1.74, 57, 74);

  System.out.print("Rosy: altezza "+Rosy.getAltezza());
  System.out.println(" e peso "+Rosy.getPeso());
  
  System.out.print("Pietro: altezza "+Pietro.getAltezza());
  System.out.println(" e peso "+Pietro.getPeso());
  System.out.println();

  System.out.println("---- avvocati o agricoltori, sempre umani ----");
  System.out.println(" Adesso li facciamo ridere e saltare ...");
  Pietro.salta();
  Rosy.saltaCon(Pietro);
  System.out.println("----------------------------------------------");

  System.out.println();
  System.out.println("----- Pietro.descrizione() da Agricoltore !----");
  Pietro.descrizione();
  
  System.out.println();
  System.out.println("------- Rosy.descrizione() da Human ----");
  Rosy.descrizione();
  
  System.out.println("------------------ FINE -------------------");
  }
}