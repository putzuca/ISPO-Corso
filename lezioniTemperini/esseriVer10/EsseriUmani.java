/* programma per gli esseri umani 
overloading:
in Agricoltore e' stata aggiunta una seconda versione di saltaCon, 
capace di lavorare con
parametro di tipo Avvocato*/
package esseriVer10;

class EsseriUmani    
{

  public static void main(String args[]) {
   
    Agricoltore Pietro, Pippo;
    Avvocato Rosy;
    
  System.out.println("-------- ESSERI UMANI - Versione 10 --------");
  
  Pietro=new Agricoltore(1.88, 87, 47);
  Pippo=new Agricoltore(1.65, 66, 100);
  Rosy= new Avvocato(1.74, 57, 74);

  System.out.print("Rosy: altezza "+Rosy.getAltezza());
  System.out.println(" e peso "+Rosy.getPeso());
  
  System.out.print("Pietro: altezza "+Pietro.getAltezza());
  System.out.println(" e peso "+Pietro.getPeso());
  
  System.out.print("Pippo: altezza "+Pippo.getAltezza());
  System.out.println(" e peso "+Pippo.getPeso());
  
  
  System.out.println();
  System.out.println(" Adesso li facciamo ridere e saltare ...");
  Pietro.saltaCon(Pippo);
  Pietro.saltaCon(Rosy);
  Rosy.saltaCon(Pietro);
  System.out.println("------------------ FINE -------------------");
  }
}