package esseriVer2;

/* programma per gli esseri umani */

class EsseriUmani     /* Human e'stata modificata: in particolare la
                       definizione di altezza e' ora "int altezza" 
					   (altezza espressa in centimetri).
					   La modifica pero' e' stata fatta in modo trasparente
					   a chi usa Human: l'interfaccia offerta dagli
					   oggetti Human e' rimasta immutata.
					   E' per questo che il programma qui sotto, 
					   identico a prima, non mostra alcun cambiamento. */
{

  public static void main(String args[]) {
  Human Pietro, Rosy;

  System.out.println("-------- ESSERI UMANI - Versione 2 --------");
  System.out.println("-------- main identico, ma class Human cambiata ...");
  
  Pietro= new Human();
  Rosy= new Human();
  Pietro.setPeso(87);
  Pietro.setAltezza(1.88);
  Rosy.setPeso(57);
  Rosy.setAltezza(1.74);
  
  System.out.print("Rosy: altezza "+ Rosy.getAltezza());
  System.out.println(" e peso "+ Rosy.getPeso());
  
  System.out.print("Pietro: altezza "+ Pietro.getAltezza());
  System.out.println(" e peso "+ Pietro.getPeso());
  }
}