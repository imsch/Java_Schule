package array_fortgeschritten;

public class stringArray {

	//Aufgabe 1
	static String s1 = new String("Das Leben ist schon schoen!");
	static String s2 = new String("schoen");

	public static boolean stringIstEnthalten(String groﬂ, String klein) {
		boolean gefunden = false;
		for (int i = 0; i < groﬂ.length() - klein.length()+1; i++) {
			if (groﬂ.charAt(i) == klein.charAt(0)) {
				gefunden = true;
				for (int x = 1; x < klein.length(); x++) {
					if (groﬂ.charAt(x + i) != klein.charAt(x))
						gefunden = false;
				}
			}
		}
		if (gefunden == true)
			return true;
		else
			return false;
	}

	public static void suchen()					
	{
		if (stringIstEnthalten(s1, s2))
			System.out.print("Das Wort '" + s2 + "' ist in dem Satz '" + s1
					+ "' enthalten!");
		else
			System.out.print("Das gesuchte Wort ist nicht enthalten!");
	}
	
	//Aufgabe 2
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		suchen();
	}
}
