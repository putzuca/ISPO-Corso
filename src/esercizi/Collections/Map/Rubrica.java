package esercizi.Collections.Map;

import java.util.*;

public class Rubrica {
	private Map<String,Integer> rubrica;
	
	public Rubrica() {
		this.rubrica = new HashMap<String,Integer>();
	}
	
	public void inserisci(String nome, Integer numero) {
		this.rubrica.put(nome, numero);
	}
	
	public void rimuovi(String nome) {
		this.rubrica.remove(nome);
	}
	
	public Set<String> nomiInRubrica() {
		return this.rubrica.keySet();
	}
	
	public Integer dammiIlNumeroDi(String nome) {
		return this.rubrica.get(nome);
	}
	
	public Integer aggiornaNumero(String nome, Integer numero) {
		return this.rubrica.put(nome, numero);
	}
	
	public String toString(){
		String str = new String ();
		str += "---------------------------\n";
		str += "Rubrica\n";
		Set<String> nomi = nomiInRubrica();
		for(String s : nomi) {
			
			str += s;
			str += ": ";
			str += this.rubrica.get(s);
			str += "\n";
		}
		str += "---------------------------\n";
		return str;
	}
	
	public static void main(String[] args) {
		Rubrica r = new Rubrica();
		String s1 = new String("Paolo"), s2 = new String("Fabio");
		String s3 = new String("Anna"), s4 = new String("Carla");
		r.inserisci(s1, 390112461); // inserisco Paolo->390112461 in rubrica
		r.inserisci(s2, 390108361); // inserisco Fabio->390108361 in rubrica
		r.inserisci(s3, 39062888); // inserisco Anna->39062888 in rubrica
		System.out.println(r.toString()); // stampo la rubrica
		// verifico se ho il numero di Carla
		Integer numeroCercato = r.dammiIlNumeroDi(s4);
		if (numeroCercato == null)

		System.out.println("Il numero di "+s4+" non esiste");

		else

		System.out.println("Il numero di "+s4+" è "+numeroCercato);
		r.rimuovi(s2); // tolgo i dati relativi a Fabio dalla rubrica
		// cambio il numero di Paolo (e mi faccio stampare il numero vecchio)
		Integer nuovoNumero = 39066777;
		Integer vecchioNumero = r.aggiornaNumero(s1,nuovoNumero);
		System.out.println("Aggiornato il numero di "+s1+

		" da "+vecchioNumero+" a "+nuovoNumero);

		System.out.println(r.toString()); // stampo la rubrica
	}
}

