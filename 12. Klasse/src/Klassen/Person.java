package Klassen;

public class Person {
	private String nName;
	private String vName;
	
	public void setNName(String nach) {
		nName = nach;
	}

	public void setVName(String vorname) {
		vName = vorname;
	}
	public String getNName() {
		return nName;
	}

	public String getVName() {
		return vName;
	}

	public String getName() {
		return "" + nName + ", " + vName;
	}
}
