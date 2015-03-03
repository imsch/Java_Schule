package paketGeLa_Auftragsbearbeitung;

import java.util.ArrayList;

public class Auftrag {

	private String auftragsdatum;
	private Kunde seinKunde;
	private ArrayList<Auftragsposition> positionsliste = new ArrayList<Auftragsposition>();

	public Auftrag(Kunde seinKunde, Auftragsposition minPosition,
			String auftragsdatum) {
		this.seinKunde = seinKunde;
		hintufügenAuftragsPosition(minPosition);
		this.auftragsdatum = auftragsdatum;
	}

	public Auftragsposition holeAuftragsPositionsstelle(int stelle) {
		return positionsliste.get(stelle);
	}

	public int anzahlAuftragspositionen() {
		return positionsliste.size() + 1;
	}

	public String Auftragsdatum() {
		return auftragsdatum;
	}

	public void hintufügenAuftragsPosition(Auftragsposition neuePosition) {
		positionsliste.add(neuePosition);
	}

	public double berechneAuftragssumme() {
		double auftragssumme = 0;
		for (int i = 0; i < positionsliste.size(); i++) {
			auftragssumme = auftragssumme
					+ holeAuftragsPositionsstelle(i).berechneVkPreis();
		}
		return auftragssumme;
	}

	public String konsolenanzeigeAKop() {
		return "Auftragsbestätigung \r\rAuftrag des Kunden "
				+ seinKunde.getName() + " vom " + Auftragsdatum()
				+ "\r\rArtikel: \t\tMenge\tVKP/St.\tGesamt"
				+ "\r----------------------------------------------------";
	}

	public String konsolenangzeigeAPos() {
		String returnString = "";
		for (int i = 0; i < positionsliste.size(); i++) {
			returnString = returnString
					+ holeAuftragsPositionsstelle(i)
							.konsolenanzeigeAuftragsposition() + "\r";
		}
		returnString = returnString
				+ "----------------------------------------------------\rAuftragssumme:\t\t\t\t"
				+ berechneAuftragssumme();
		return returnString;

	}
}
