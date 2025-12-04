/* programma per gli esseri umani Ver4
uso di costruttori */
package esseriVer4;

class EsseriUmani    
{

  public static void main(String args[]) {
  Human Pietro, Rosy;

  System.out.println("-------- ESSERI UMANI - Versione 4 --------");
  
  Pietro=new Human();
  Rosy= new Human(1.74, 57);

/*  Pietro.setPeso(87);
  Pietro.setAltezza(1.88);
  Rosy.setPeso(57);
  Rosy.setAltezza(1.74);
*/

  System.out.print("Rosy: altezza "+Rosy.getAltezza());
  System.out.println(" e peso "+Rosy.getPeso());
  
  System.out.print("Pietro: altezza "+Pietro.getAltezza());
  System.out.println(" e peso "+Pietro.getPeso());
  
  System.out.println(" Adesso li facciamo ridere e saltare ...");
  Pietro.salta();
  Rosy.ridi();
  Pietro.saltaCon(Rosy);
  System.out.println("------------------ FINE -------------------");
  }
}