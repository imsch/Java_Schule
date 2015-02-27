
public class Rohstoffe extends Artikel {

	private double einkaufspreis;
	
	public Rohstoffe(double artikelNummer, String bezeichnung, double bestand, double einkaufspreis)
	{
		super(artikelNummer, bezeichnung, bestand);
		this.einkaufspreis=einkaufspreis;
	}
	
	//getter+setter start
	public double getEinkaufsPreis()
	{
		return einkaufspreis;
	}
	
	public void setEinkaufsPreis(double einkaufspreis)
	{
		this.einkaufspreis=einkaufspreis;
	}
	public void print()
	{
		super.print();
		System.out.println("Einkkaufspreis: "+einkaufspreis);
	}
}
