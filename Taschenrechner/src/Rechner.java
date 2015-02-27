public class Rechner {
	private double zahl1;
	private double zahl2;
	private boolean error;
	private boolean on_off;

	public void Taschenrechner() {
	}

	public void setZahl1(double zahl1) {
		this.zahl1 = zahl1;
	}

	public double getZahl1() {
		return zahl1;
	}

	public void setZahl2(double zahl2) {
		this.zahl2 = zahl2;
	}

	public double getZahl2() {
		return zahl2;
	}

	public double add() {
		return zahl1 + zahl2;
	}

	public double sub() {
		return zahl1 - zahl2;
	}

	public double mult() {
		return zahl1 * zahl2;
	}

	public double div() {
		try {
			return zahl1 / zahl2;
		} catch (Exception e) {
			System.out.println("Teilen durch Null!");
			return 0;
		}
	}

	public void einschalten() {
		on_off = true;
	}

	public void ausschalten() {
		on_off = false;
	}

	public void zahlAusgeben(double zahl) {
		System.out.println(zahl);
	}
}
