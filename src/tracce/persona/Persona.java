package tracce.persona;

/** Rappresenta una generica persona con nome, cognome ed età */
public class Persona {
	public String nome, cognome;
	public int eta;
	
	/** Costruisce una persona a partire dai suoi nome, cognome ed età */
	public Persona(String nome, String cognome, int eta) {
		this.nome = nome;
		this.cognome = cognome;
		this.eta = eta;
	}
	
	/** Costruisce una generica persona senza nome, cognome o età */
	public Persona() {
		this.nome = null;
		this.cognome = null;
		this.eta = 0;
	}
	
	/** Restituisce una stringa coi dettagli di una persona (nome, cognome ed età) */
	public String dettagli() {
		return "Nome: " + nome + "\n"
				+ "Cognome: " + cognome + "\n"
				+ "Età: " + eta + "\n";
	}
}
