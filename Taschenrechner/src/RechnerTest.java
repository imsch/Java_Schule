
public class RechnerTest {

	public static void main(String[] args) {
		Rechner r1=new Rechner();
		r1.setZahl1(5);
		r1.setZahl2(2);
		
		r1.einschalten();
		double erg=r1.add();
		r1.zahlAusgeben(erg);
		

	}

}
