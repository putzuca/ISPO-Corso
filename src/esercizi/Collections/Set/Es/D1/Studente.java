package esercizi.Collections.Set.Es.D1;

public class Studente {
	private String nome;
	
	public Studente(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public int hashCode() {
		return this.nome.hashCode();
	}
	
	public boolean equals(Object o) {
		return this.nome.equals(((Studente) o).getNome());
	}

}
