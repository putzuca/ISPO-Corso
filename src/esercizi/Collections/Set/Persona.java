package esercizi.Collections.Set;

public class Persona implements Comparable<Persona> {
	private String nome;
	private int eta;
	
	public Persona(String nome, int eta) {
		this.nome = nome;
		this.eta = eta;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public int getEta() {
		return this.eta;
	}

	@Override
	public int compareTo(Persona p) {
		return this.nome.compareTo(p.getNome());
	}
	
	public int hashCode() {
		return (this.nome.hashCode());
	}
	
	public boolean equals(Object p) {
		return this.nome.equals(((Persona)p).getNome());
		}
	

}
