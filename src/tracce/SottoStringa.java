package tracce;

import java.util.Scanner;

public class SottoStringa {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Inserisci una stringa\n");
		String s = scan.nextLine();
		System.out.println("\nLa stringa ha " + s.length() + " caratteri");
		System.out.println("Ora inserisci due numeri interi, il primo minore del secondo"
				+ " ed entrambi compresi tra 0 e " + (s.length()-1));
		System.out.println("\nInserisci il primo\n");
		int a = scan.nextInt();
		System.out.println("\nInserisci il secondo\n");
		int b = scan.nextInt();
		String sub = s.substring(a , b);
		System.out.println("\nLa sottostringa di " + s + " compresa tra la posizione " 
		+ a + " (inclusa) e la posizione " + b + " (esclusa) è " + sub);
		scan.close();
	}

}
