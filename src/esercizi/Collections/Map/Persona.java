package esercizi.Collections.Map;

public class Persona implements Comparable<Persona> {
	private String nome;
	
	public Persona(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return this.nome;
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
