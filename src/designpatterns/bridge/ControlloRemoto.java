package designpatterns.bridge;

/** Abstraction */
public abstract class ControlloRemoto {
	protected final Dispositivo dispositivo;
	
	protected ControlloRemoto(Dispositivo dispositivo) {
		this.dispositivo = dispositivo;
	}
	
	public abstract String premiOn();
}
