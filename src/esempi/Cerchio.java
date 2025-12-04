package esempi;
public class Cerchio
{
	private int raggio;
	private Punto centro;
	private String colore;
	
	public Cerchio(Punto centro, int raggio, String colore)
	{
		this.raggio = raggio;
		this.centro = new Punto(centro.getX(), centro.getY());
		this.colore = colore;
	}
	
	public void trasla(int x, int y)
	{
	    this.centro.setX(this.centro.getX() + x);
	    this.centro.setY(this.centro.getY() + y);
	}

}
