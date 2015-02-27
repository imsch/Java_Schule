
public class Artikelverwaltung {
	
	public static void main(String[] args) {
		
		Rohstoffe r1=new Rohstoffe(12345,"Eisen",100,150.345);
		Handelswaren h1=new Handelswaren(54321,"Drucker",20.0,249.99,299.99,true);
		Erzeugnisse ez1=new Erzeugnisse(6789,"Fluxkompensator",3.0,1503.33,2000,false);
		Einzelteile et1=new Einzelteile(9876,"Prozessor",5000,300);

		
		h1.print();
		
		ez1.print();
		


	}

}
