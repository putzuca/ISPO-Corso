package esercizi.conArray;

public class Borsa {
	private Attrezzo[] attrezzi;
	private int numeroAttrezzi;
	
	public Borsa() {
		this.numeroAttrezzi = 0;
		this.attrezzi = new Attrezzo[10];
	}
	
	public void addAttrezzo(Attrezzo attrezzo) {
		this.attrezzi[this.numeroAttrezzi] = attrezzo;
		this.numeroAttrezzi++;
	}
	
	public int getPeso() {
		int pesoTotale = 0;
		for(int i=0; i<this.numeroAttrezzi; i++) {
			Attrezzo a;
			a = this.attrezzi[numeroAttrezzi];
			pesoTotale += a.getPeso();
		}
		return pesoTotale;
	}

}
