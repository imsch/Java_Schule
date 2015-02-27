package mitarbeiter_dienstfahrzeug;

public class Mitarbeiter {
	String name;
	Fahrzeug dienstwagen;

	public Mitarbeiter(String name) {
		this.name = name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
	public void setFahrzeug(Fahrzeug f){
		dienstwagen=f;
	}
	public Fahrzeug getFahrzeug(){
		return dienstwagen;
	}

}
