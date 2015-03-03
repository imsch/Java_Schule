package paketGeLa_Auftragsbearbeitung;

public class Getraenk {
	String bezeichnung;
	double lagermenge;
	double vkPreis;
	public Getraenk(String bezeichnung, double lagermenge, double vkPreis){
		this.bezeichnung=bezeichnung;
		this.lagermenge=lagermenge;
		this.vkPreis=vkPreis;
	}
	public String getBezeichnung() {
		return bezeichnung;
	}
	public void setBezeichnung(String bezeichnung) {
		this.bezeichnung = bezeichnung;
	}
	public double getLagermenge() {
		return lagermenge;
	}
	public void setLagermenge(double lagermenge) {
		this.lagermenge = lagermenge;
	}
	public void setVkPreis(double vkPreis) {
		this.vkPreis = vkPreis;
	}
	public double getVkPreis()
	{
		return vkPreis;
	}

}
