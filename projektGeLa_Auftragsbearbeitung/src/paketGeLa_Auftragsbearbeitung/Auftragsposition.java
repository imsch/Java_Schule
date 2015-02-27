package paketGeLa_Auftragsbearbeitung;

public class Auftragsposition {

	private double menge;
	Getraenk getraenk;
	
	void Auftragsposition(double menge, Getraenk getraenk)
	{
		this.menge=menge;
		this.getraenk=getraenk;
	}
}
