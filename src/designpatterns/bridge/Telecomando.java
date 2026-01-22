package designpatterns.bridge;

/** RefinedAbstraction */
public final class Telecomando extends ControlloRemoto {

	public Telecomando(Dispositivo dispositivo) {
		super(dispositivo);
	}

	@Override
	public String premiOn() {
		return "TELECOMANDO: " + dispositivo.accendi();
	}

}
