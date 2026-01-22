package tracce;

public class Triangolo {
	private double a, b, c;		// i tre lati del triangolo
	
	public void setLati(double a, double b, double c) {
		
		if (a <= 0 || b <= 0 || c <= 0)
            throw new IllegalArgumentException("I lati devono essere positivi.");

        if (a + b <= c || a + c <= b || b + c <= a)
            throw new IllegalArgumentException("I lati non formano un triangolo valido.");
        
		this.a = a;
		this.b = b;
		this.c = c;
	}
	
	public double getPerimetro() {
		return this.a + this.b + this.c;
	}
	
	public double getArea() {
		double s = this.getPerimetro() / 2;			// semiperimetro
		return Math.sqrt(s * (s - a) * (s - b) * (s - c));
	}
	
	public double differenzaPerimetro(Triangolo t) {
        if (t == null)
            throw new IllegalArgumentException("Triangolo nullo.");
		return this.getPerimetro() - t.getPerimetro();
	}

}
