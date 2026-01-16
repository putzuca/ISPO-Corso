package tracce;

import java.util.Scanner;

public class FraseStringa {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Verifichiamo se una frase contiene una stringa\n");
		boolean contieneStringa = false;
		System.out.println("Inserisci una frase\n");
		String f = scan.nextLine();
		System.out.println("\nOra inserisci una stringa\n");
		String s = scan.nextLine();
		if (f.contains(s))
			contieneStringa = true;
		System.out.println("\n" + contieneStringa);
		System.out.println("\n" + f.toUpperCase());
		scan.close();
	}

}
