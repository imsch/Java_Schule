package Klassen;

public class Konto {
	private int ktoStand;
	private Person person;

	public Konto(String vorname, String nachname, int ktoStand)// Konstruktor
																// sorgt
																// dafür das man
																// alle
																// Eigenschaften
																// beim
																// Initialiseren
																// festlegen
																// kann
																// z.B Konto
																// kto1=new
																// Konto("Hartmann","Rammsi",632);
	{
		person = new Person();
		person.setNName(nachname);
		person.setVName(vorname);
		this.ktoStand = ktoStand;
	}

	public void setKtoStand(int geld) {
		ktoStand = geld;
	}

	public int getKtoStand() {
		return ktoStand;
	}
	public void setNName(String nach) {
		person.setNName(nach);
	}

	public void setVName(String vorname) {
		person.setVName(vorname);
	}
	public String getNName() {
		return person.getNName();
	}

	public String getVName() {
		return person.getVName();
	}

	public String getName() {
		return "" + person.getNName() + ", " + person.getVName();
	}

}
