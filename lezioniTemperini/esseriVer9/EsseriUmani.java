/* programma per gli esseri umani 
esempio di modifiche per ottenere il controllo
del peso in assegnazione ad un oggetto
(controllo eseguito dall'oggetto stesso, che eventualmente
non procede all'update se non puo'
*/
package esseriVer9;

class EsseriUmani    
{

  public static void main(String args[]) {

  Human Pietro;
  
  System.out.println("-------- ESSERI UMANI - Versione 9 - controllo del peso --------");
  
  Pietro=new Human(1.87, 86);

  System.out.println();
  System.out.print("Pietro: altezza "+Pietro.getAltezza());
  System.out.println(" e peso "+Pietro.getPeso());
  
  System.out.println();
  
  System.out.println("Adesso tentiamo di assegnare 2500 al peso di Pietro!");
  Pietro.setPeso(2500);

  System.out.println();
  System.out.print("Pietro: altezza "+Pietro.getAltezza());
  System.out.println(" e peso "+Pietro.getPeso());
  
  System.out.println("------------------ FINE -------------------");
  }
}