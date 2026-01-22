package tracce;

public class CarattereStringa {
	
	public static boolean charInString(String s, char c) {
		if (s == null || s.isEmpty())
			return false;
		else if (s.charAt(0) == c)
			return true;
		else
			return charInString(s.substring(1), c);
	}
}
