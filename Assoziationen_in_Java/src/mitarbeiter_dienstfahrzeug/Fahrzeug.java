package mitarbeiter_dienstfahrzeug;

public class Fahrzeug {
	private String kennzeichen;
	private Mitarbeiter person;
	
	public Fahrzeug(String kennzeichen)
	{
		this.kennzeichen=kennzeichen;
	}
	public void setKennzeichen(String kennzeichen){
		this.kennzeichen=kennzeichen;
	}
	public String getKennzeichen(){
		return kennzeichen;
	}
	public void setPerson(Mitarbeiter person)
	{
		this.person=person;
	}
	public Mitarbeiter getPerson(){
		return person;
	}

}
