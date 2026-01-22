package designpatterns.proxy;

/** Real Subject */
public final class ArchivioReale implements Archivio {

	@Override
	public String leggi(String chiave) {
		return "VALORE(" + chiave + ")";
	}

}
