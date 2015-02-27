public class Erzeugnisse extends HauptArtikel {

	private double herstellungskosten;

	public Erzeugnisse(double artikelNummer, String bezeichnung,
			double bestand, double herstellungskosten, double verkaufspreis,boolean vermindert) {
		super(artikelNummer, bezeichnung, bestand, verkaufspreis,vermindert);
		this.herstellungskosten = herstellungskosten;

	}

	public double getHerstellungsKosten() {
		return herstellungskosten;
	}

	public void setHerstellungsKosten(double herstellungskosten) {
		this.herstellungskosten = herstellungskosten;
	}

	public void print() {
		super.print();
		System.out.println("Herstellungskosten: " + herstellungskosten);
	}
}
