/* programma per gli esseri umani Ver8.1 

saltaCon() definito in Avvocato, in modo overloaded
(con parametro Human in un caso e Avvocato nell'altro)
*/
package esseriVer8_1;

class EsseriUmani    
{

  public static void main(String args[]) {
   
    Agricoltore Pietro=new Agricoltore(1.87,87,4);
    Avvocato Rosy =new Avvocato(1.71,58,21);
  
  Avvocato a[] = new Avvocato[4];
  
  System.out.println("-------- ESSERI UMANI - Versione 8.1 --------");
  
  a[0]=new Avvocato(1.80, 80, 40);
  a[1]=new Avvocato(1.81, 81, 41);
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
  System.out.println(" Adesso facciamo saltare a[0] e a[1] con Pietro e Rosy ...");
  for (int i=0; i<2; i++) {
      a[i].saltaCon(Pietro);
      a[i].saltaCon(Rosy);
   }
  System.out.println("------------------ FINE -------------------");
  }
}