public class Artikel {

	private double artikelNummer;
	private String bezeichnung;
	private double bestand;
	
	//Konstruktor
	public Artikel(double artikelNummer,String bezeichnung,double bestand)
	{
		this.artikelNummer=artikelNummer;
		this.bezeichnung=bezeichnung;
		this.bestand=bestand;
	}
	
	
	//getter+setter start
	public double getArtikelNummer()
	{
		return artikelNummer;
	}
	
	public String getBezeichnung()
	{
		return bezeichnung;
	}
	
	public double getBestand()
	{
		return bestand;
	}
	
	public void setArtikelNummer(double artikelNummer)
	{
		this.artikelNummer=artikelNummer;
	}
	
	public void setBezeichnung(String bezeichnung)
	{
		this.bezeichnung=bezeichnung;
	}

	public void setBestand(double bestand)
	{
		this.bestand=bestand;
	}
	//getter+setter ende
	
	public void bestandAendern(double aenderung){
		this.bestand=this.bestand+(aenderung);
	}
	public void print(){
		System.out.println();
		System.out.println("Artikelnummer: "+artikelNummer);
		System.out.println("Bezeichnung:"+bezeichnung);
		System.out.println("Bestand im Lager: "+bestand);
	}

}
