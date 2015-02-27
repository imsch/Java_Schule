package Klassen;

public class KontoTest {

	public static void kontoVergleich(Konto k1,Konto k2)
	{
		if(k1.getKtoStand()>k2.getKtoStand())
		{
			System.out.println(k1.getName()+" hat mehr Geld auf dem Konto als "+k2.getName());
		}
		else System.out.println(k2.getName()+" hat mehr Geld auf dem Konto als "+k1.getName());
	}
	public static void ktoStandAnzeigen(Konto k1)
	{
		System.out.println("Auf dem Konto von "+k1.getName()+" sind "+k1.getKtoStand()+"€");
	}
	public static void einzahlung(Konto k1,int geldmenge) {
		int Kontostand=k1.getKtoStand();
			k1.setKtoStand(Kontostand+geldmenge);
	}
	public static void ueberweisung(Konto k1,Konto k2,int geldmenge)
	{
		int ktoStandSender=k1.getKtoStand();
		int ktoStandEmpfaenger=k2.getKtoStand();
		k1.setKtoStand(ktoStandSender-geldmenge);
		k2.setKtoStand(ktoStandEmpfaenger+geldmenge);
		System.out.println("Überweisung in Höhe von "+geldmenge+"€ vom Konto von "+k1.getName()+" auf das Konto von "+k2.getName());
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Konto kto1=new Konto("Hartmann","Rammsi",0);
		Konto kto2=new Konto("Lichwichsen","Willfried",935);
		Konto kto3=new Konto("Goku","Son",9001);
		ktoStandAnzeigen(kto1);
		ktoStandAnzeigen(kto3);
		ueberweisung(kto1,kto3,65);
		ktoStandAnzeigen(kto1);
		ktoStandAnzeigen(kto3);
	}

}
