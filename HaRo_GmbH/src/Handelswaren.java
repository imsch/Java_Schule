public class Handelswaren extends HauptArtikel {

	private double einkaufspreis;

	public Handelswaren(double artikelNummer, String bezeichnung,
			double bestand, double einkaufspreis, double verkaufspreis,boolean vermindert) {
		super(artikelNummer, bezeichnung, bestand, verkaufspreis,vermindert);
		this.einkaufspreis = einkaufspreis;

	}

	public double getEinkaufsPreis() {
		return einkaufspreis;
	}

	public void setEinkaufsPreis(double einkaufspreis) {
		this.einkaufspreis = einkaufspreis;
	}

	public void print() {
		super.print();
		System.out.println("Einkaufspreis: " + einkaufspreis);
	}
}
