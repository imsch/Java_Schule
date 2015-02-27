
public class piBerechnen {

	
	
	public static void main(String[] args) {
		double zaehler=2.0;
		double nenner=1.0;
		final double delta=0.0000000000000000001;
		double bruch=zaehler / nenner;
		double erg=bruch;
		double ergAlt=erg;
		
		
		do{
			
			nenner=nenner+2;
			bruch=zaehler/nenner;
			erg=ergAlt*bruch;
			ergAlt=erg;
			
			zaehler=zaehler+2;
			bruch=zaehler/nenner;
			erg=bruch*ergAlt;
			ergAlt=erg;
			
			
			System.out.println(erg*2);
		}
		while(Math.abs(erg*2-ergAlt*2)<delta);
		System.out.print(erg*2);

	}

}
