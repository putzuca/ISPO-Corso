/* programma per gli esseri umani Ver8 
polimorfismo di inclusione: un array di 4 Human
viene riempito con 4 istanze (Human, Agricoltore,
Avvocato e ancora Avvocato.
Comunque sono tutti Human!
E li facciamo saltare ed autodescriversi.

Stavolta abbiamo aggiunto un metodo descrizione()
anche nella classe Avvocato. Cosi' adesso gli avvocati
e gli agricoltori hanno delle capacita' di descrizione
specializzate rispetto ai semplici Human.
*/
package esseriVer8;

class EsseriUmani    
{

  public static void main(String args[]) {
  /* 
    Agricoltore Pietro;
    Avvocato Rosy;
  */
  Human a[] = new Human[4];
  int i;
  
  System.out.println("-------- ESSERI UMANI - Versione 8 --------");
  
  a[0]=new Human(1.80, 80);
  a[1]=new Agricoltore(1.81, 81, 41);
  a[2]=new Avvocato(1.82, 82, 42);
  a[3]=new Avvocato(1.83, 83, 43);

  for (i=0; i<4; i++) {
      System.out.println();
      a[i].descrizione();
     }  
  
  System.out.println();
  System.out.println(" Adesso li facciamo saltare ...");
  for (i=0; i<4; i++)
      a[i].salta();

  System.out.println("------------------ FINE -------------------");
  }
}