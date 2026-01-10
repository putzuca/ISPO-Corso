package esercizi.Collections.Set.Es.D3;

public class Studente implements Comparable<Studente> {
	private String nome;
	
	public Studente(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return this.nome;
	}

	@Override
	public int compareTo(Studente s) {
		return this.nome.compareTo(s.getNome());
	}
}
