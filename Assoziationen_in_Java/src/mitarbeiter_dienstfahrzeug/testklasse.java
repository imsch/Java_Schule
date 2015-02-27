package mitarbeiter_dienstfahrzeug;

public class testklasse {
	
	private static void fahrzeugVerleihen(Mitarbeiter m,Fahrzeug f){
		m.setFahrzeug(f);
		f.setPerson(m);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Fahrzeug f1=new Fahrzeug("AB-CD 123");
		Fahrzeug f2=new Fahrzeug("HU-RE 666");
		Mitarbeiter m2=new Mitarbeiter("Hubert");
		Mitarbeiter m1=new Mitarbeiter("Hans");
		fahrzeugVerleihen(m1,f1);
		fahrzeugVerleihen(m2,f2);
		System.out.println(m1.getName()+" "+m1.getFahrzeug().getKennzeichen());
		System.out.println(m2.getName()+" "+m2.getFahrzeug().getKennzeichen());
	}

}
