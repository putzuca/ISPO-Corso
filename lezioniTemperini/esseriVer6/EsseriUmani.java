/* programma per gli esseri umani Ver 6
ridefinizione: nella classe Human e' definito un metodo
descrizione(), che fornisce un'autodescrizione dell'oggetto
su cui viene invocato. 
Una ridefinizione del metodo e' posta in Agricoltore.

Per pietro.descrizione() funzionera' la nuova definizione;
per rosy.descrizione() il sistema usa la versione di Human
*/
package esseriVer6;

class EsseriUmani    
{
  public static void main(String args[]) {
  Agricoltore Pietro;
  Avvocato Rosy;
    
  System.out.println("-------- ESSERI UMANI - Versione 6 --------");
  
  Pietro=new Agricoltore(1.88, 87, 47);
  Rosy= new Avvocato(1.74, 57, 74);

  System.out.print("Rosy: altezza "+Rosy.getAltezza());
  System.out.println(" e peso "+Rosy.getPeso());
  
  System.out.print("Pietro: altezza "+Pietro.getAltezza());
  System.out.println(" e peso "+Pietro.getPeso());
  
  System.out.println();
                        /* ! */
  Pietro.descrizione();
  
  System.out.println();
                        /* ! */
  Rosy.descrizione();
  
  System.out.println();
  System.out.println(" Adesso li facciamo ridere e saltare ...");
  Pietro.salta();
  Rosy.saltaCon(Pietro);
  System.out.println("------------------ FINE -------------------");
  }
}