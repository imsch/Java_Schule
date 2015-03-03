package paketGeLa_Auftragsbearbeitung;

public class Auftragsposition {

	private double menge;
	Getraenk getraenk;

	public Auftragsposition(double menge, Getraenk getraenk) {
		this.menge = menge;
		this.getraenk = getraenk;
	}

	public double getMenge() {
		return menge;
	}

	public void setMenge(double menge) {
		this.menge = menge;
	}

	public Getraenk getGetraenk() {
		return getraenk;
	}

	public void setGetraenk(Getraenk getraenk) {
		this.getraenk = getraenk;
	}

	public double berechneVkPreis() {
		return menge * getraenk.getVkPreis();
	}

	public String konsolenanzeigeAuftragsposition() {
		return getGetraenk().getBezeichnung() + "\t" + menge + "\t"
				+ getGetraenk().getVkPreis() + "\t" + berechneVkPreis();
	}
}
