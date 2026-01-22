package designpatterns.bridge;

/* ConcreteImplementor */
public final class Radio implements Dispositivo {

	@Override
	public String accendi() {
		return "RADIO ON";
	}

}
