
public class Einzelteile extends Artikel{

	private double herstellungskosten;
	
	public Einzelteile(double artikelNummer, String bezeichnung, double bestand, double herstellungskosten)
	{
		super(artikelNummer, bezeichnung, bestand);
		this.herstellungskosten=herstellungskosten;

	}
	public double getHerstellungsKosten()
	{
		return herstellungskosten;
	}
	
	public void setHerstellungsKosten(double herstellungskosten)
	{
		this.herstellungskosten=herstellungskosten;
	}
	public void print()
	{
		super.print();
		System.out.println("Herstellungskosten: "+herstellungskosten);
	}
}
