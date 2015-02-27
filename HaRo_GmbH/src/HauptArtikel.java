public class HauptArtikel extends Artikel {

	private double verkaufspreis;
	private double vMwSt = 0.07;
	private double nMwSt = 0.19;
	private boolean vermindert;

	public HauptArtikel(double artikelNummer, String bezeichnung,
			double bestand, double verkaufspreis, boolean vermindert) {
		super(artikelNummer, bezeichnung, bestand);
		this.verkaufspreis = verkaufspreis;
		this.vermindert=vermindert;

	}

	public double getVerkaufsPreis() {
		return verkaufspreis;
	}

	public void setVerkaufsPreis(double verkaufspreis) {
		this.verkaufspreis = verkaufspreis;
	}

	public void print() {
		super.print();
		System.out.println("Verkaufspreis: " + verkaufspreis);
		if(vermindert)
		{System.out.println("MwSt-Satz: "+vMwSt);}
		else System.out.println("MwSt-Satz: "+nMwSt);
		System.out.println("Abgaben bei Verkauf des kompletten Lagerbestands: " +mwstBerechnen());
	}
	public double mwstBerechnen()
	{
		if(vermindert)return getBestand()*verkaufspreis*vMwSt;
		else return getBestand()*verkaufspreis*nMwSt;
	}
	

}
