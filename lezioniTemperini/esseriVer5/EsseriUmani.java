/* programma per gli esseri umani Ver 5
uso di ereditarieta'
*/
package esseriVer5;

class EsseriUmani    
{

  public static void main(String args[]) {
  Agricoltore Pietro;
  Avvocato Rosy;

  System.out.println("-------- ESSERI UMANI - Versione 5 --------");
  
  Pietro=new Agricoltore(1.88, 87, 47);
  Rosy= new Avvocato(1.74, 57, 74);

  System.out.print("Rosy: altezza "+Rosy.getAltezza());
  System.out.println(" e peso "+Rosy.getPeso());
  
  System.out.print("Pietro: altezza "+Pietro.getAltezza());
  System.out.println(" e peso "+Pietro.getPeso());
  
  System.out.println();
  Pietro.descriviRaccolto();
  
  System.out.println();
  Rosy.celebrati();
  
  System.out.println();
  System.out.println(" Adesso li facciamo ridere e saltare ...");
  Pietro.salta();
  Rosy.saltaCon(Pietro);
  System.out.println("------------------ FINE -------------------");
  }
}