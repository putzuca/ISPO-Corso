package designpatterns.bridge;

/** RefinedAbstraction */
public final class App extends ControlloRemoto {

	public App(Dispositivo dispositivo) {
		super(dispositivo);
	}

	@Override
	public String premiOn() {
		return "APP: " + dispositivo.accendi();
	}

}
