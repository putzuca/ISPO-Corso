/* programma per gli esseri umani Ver 3*/
package esseriVer3;

class EsseriUmani     /* con la seconda versione di Human ... */
{
  public static void main(String args[]) {
  Human Pietro, Rosy;

  System.out.println("-------- ESSERI UMANI - Versione 3 --------");
  
  Pietro=new Human();
  Rosy= new Human();
  Pietro.setPeso(87);
  Pietro.setAltezza(1.88);
  Rosy.setPeso(57);
  Rosy.setAltezza(1.74);
  
  System.out.print("Rosy: altezza "+Rosy.getAltezza());
  System.out.println(" e peso "+Rosy.getPeso());
  
  System.out.print("Pietro: altezza "+Pietro.getAltezza());
  System.out.println(" e peso "+Pietro.getPeso());
  
  System.out.println(" Adesso li facciamo ridere e saltare ...");
  Pietro.salta();
  Pietro.saltaCon(Rosy);
  System.out.println("------------------ FINE -------------------");
  }
}