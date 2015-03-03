package paketGeLa_Auftragsbearbeitung;

public class Starter {

	public static void main(String[] args) {
		
		Kunde kunde1=new Kunde("Finke Getränke KG");
		Getraenk getraenk1 = new Getraenk("Cola light, 0,3l", 500, 1.10);
		Getraenk getraenk2 = new Getraenk("Lemonlimonade, 0,3l", 500, 0.90);
		Getraenk getraenk3 = new Getraenk("Apfelschorle, 0,5l", 1000, 1.00);
		Getraenk getraenk4 = new Getraenk("Blauquelle, 0,7l", 1000, 0.45);
		Getraenk getraenk5 = new Getraenk("Himbeersaft, 1,0l", 300, 1.75);
		
		Auftragsposition pos1= new Auftragsposition(50, getraenk1);
		Auftragsposition pos2= new Auftragsposition(60, getraenk2);
		Auftragsposition pos3= new Auftragsposition(70, getraenk1);
		
		Auftrag auftrag1 = new Auftrag(kunde1, pos1, "21.06.2014");
		
		auftrag1.hintufügenAuftragsPosition(pos2);
		auftrag1.hintufügenAuftragsPosition(pos3);
		
		System.out.println(auftrag1.konsolenanzeigeAKop());
		System.out.println(auftrag1.konsolenangzeigeAPos());
	}

}
