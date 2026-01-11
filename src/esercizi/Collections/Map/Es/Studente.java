package esercizi.Collections.Map.Es;

public class Studente {
	private String matricola;
	private String meseDiNascita;
	
	public Studente(String matricola, String meseDiNascita) {
		this.matricola = matricola;
		this.meseDiNascita = meseDiNascita;
	}
	
	public String getMatricola() {
		return this.matricola;
	}
	
	public String getMeseDiNascita() {
		return this.meseDiNascita;
	}
	
	public int hashCode() {
		return this.matricola.hashCode();
	}
	
	public boolean equals(Object o) {
		return this.matricola.equals(((Studente) o).getMatricola());
	}
}
