package designpatterns.proxy;

/** Proxy (di tipo Protection: controlla l'accesso) */
public final class ArchivioProxy implements Archivio {
	private final Archivio reale;
	private final boolean autorizzato;

	public ArchivioProxy(boolean autorizzato) {
		this.reale = new ArchivioReale();
		this.autorizzato = autorizzato;
	}

	@Override
	public String leggi(String chiave) {
		if (!autorizzato)
			throw new SecurityException("Accesso negato");
		return reale.leggi(chiave);
	}

}
