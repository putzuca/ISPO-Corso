package esempi;
public class Rettangolo 
{
	private int altezza, larghezza;
	private Punto vertice;
	private String colore;
	  
	public Rettangolo(Punto vertice, int altezza,
	                int larghezza, String colore) 
	{
		this.altezza = altezza;
		this.larghezza = larghezza;
		this.vertice = new Punto(vertice.getX(), vertice.getY()); 
		this.colore = colore;
	}
	
	public void trasla(int x, int y)
	{ 
		this.vertice.setX(this.vertice.getX() + x); 
		this.vertice.setY(this.vertice.getY() + y);
	}

}
