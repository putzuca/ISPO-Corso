package tracce.minset;

import java.util.ArrayList;
import java.util.Iterator;

public class Set<T> {
	private ArrayList<T> contents = new ArrayList<T>();
	public Iterator<T> iterator() {
		return contents.iterator();
	}
	
	public void add(T val) {
		if (!contents.contains(val))
			contents.add(val);
	}
	
	public void remove(T val) {
		contents.remove(val);
	}
}
