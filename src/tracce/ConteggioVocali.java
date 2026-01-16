package tracce;

import java.util.Scanner;

/* Scrivere un metodo di classe ricorsivo che riceve in ingresso una stringa 
 * e calcola il numero di vocali contenute in tale stringa 
 * (una soluzione non ricorsiva è considerata errata).
 */
public class ConteggioVocali {
	public static int contaVocali(String s) {
		if (s.length() == 0)
			return 0;
		int contributo = 0;
		char c = Character.toLowerCase(s.charAt(0));
		String resto = s.substring(1);
		if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')
			contributo = 1;
		return contributo + contaVocali(resto);
			
	}
	
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Inserisci stringa");
		int c = contaVocali(scan.nextLine());
		System.out.println("La stringa ha " + c + " vocali");
		scan.close();
		
	}

}
