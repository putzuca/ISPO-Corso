package designpatterns.bridge;

/** ConcreteImplementor */
public final class Tv implements Dispositivo {

	@Override
	public String accendi() {
		return "TV ON";
	}

}
