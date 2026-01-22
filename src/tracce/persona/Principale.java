package tracce.persona;

public class Principale {
	public static void main(String[] args) {
		Persona p1, p2;
		p1 = new Persona();
		p2 = new Persona();
		
		p1.nome = "Marco";
		p1.cognome = "Rossi";
		p1.eta = 25;
		p2.nome = "Anna";
		p2.cognome = "Bianchi";
		p2.eta = 34;
		
		Persona p3 = p1;
		System.out.println(p1.dettagli());
		System.out.println(p2.dettagli());
		System.out.println(p3.dettagli());
		
		if (p3 == p1)
			System.out.println("p3 è un alias di p1");
		
		p3.eta = 99;
				
		System.out.println("Dopo p3.eta=99, p1.eta = " + p1.eta);

	}
}
