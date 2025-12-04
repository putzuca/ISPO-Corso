/* programma per gli esseri umani Ver8.2 
in Avvocato viene overridden saltaCon(), scrivendo una versione 
con parametro specializzato
saltaCon(Avvocato)
Idem in Agricoltore: saltaCon(Agricoltore)

Sulle tre versioni di saltaCon NON agisce il binding dinamico:
per eseguire a[i].saltaCon
viene scelto staticamente il metodo di Human, tenendo presente
che a[i], staticamente, e' sempre Human.
*/
package esseriVer8_2;

class EsseriUmani    
{

  public static void main(String args[]) {
   
  Human a[] = new Human[4];
  
  System.out.println("-------- ESSERI UMANI - Versione 8.2 --------");
  
  a[0]=new Human(1.80, 80);
  a[1]=new Agricoltore(1.81, 81, 41);
  a[2]=new Avvocato(1.82, 82, 42);
  a[3]=new Avvocato(1.83, 83, 43);

  System.out.println();
  a[0].descrizione();
  
  System.out.println();
  a[1].descrizione();
  
  System.out.println();
  a[2].descrizione();
  
  System.out.println();
  a[3].descrizione();
  
  
  System.out.println();
  System.out.println(" Adesso li facciamo saltare con a[3] ...");
  for (int i=0; i<4; i++)
      a[i].saltaCon(a[3]);

  System.out.println("------------------ FINE -------------------");
  }
}