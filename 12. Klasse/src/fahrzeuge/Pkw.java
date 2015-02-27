package fahrzeuge;

public class Pkw extends Fahrzeug{
private String fahrzeugtyp="Pkw";
private String modellBezeichnung;
public Pkw(){
	//.........				//Aufruf des Konstruktors der Basisklasse
	System.out.println("Geben Sie die Modellbezeichnung ein: ");
	modellBezeichnung = eingabe.next();
}

public void print()
{
			//........
}
}
