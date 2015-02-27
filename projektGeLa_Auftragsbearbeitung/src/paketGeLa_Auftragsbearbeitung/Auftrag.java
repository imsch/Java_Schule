package paketGeLa_Auftragsbearbeitung;

public class Auftrag {

	private String auftragsdatum;
	private Kunde seinKunde;
	private Auftragsposition[] positionsliste;
	
	void Auftrag(){
		
	}
	public Auftragsposition holeAuftragsPositionsstelle(int stelle){
		return positionsliste[stelle];
	}
	public int anzahlAuftragspositionen(){
		return positionsliste.length+1;
	}
	public String Auftragsdatum(){
		return auftragsdatum;
	}
	public void hintufügenAuftragsPosition(Auftragsposition neuePosition){
		
	}
}
