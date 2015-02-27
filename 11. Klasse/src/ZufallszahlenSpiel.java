import java.util.Random;
import java.util.Scanner;


public class ZufallszahlenSpiel {
static Random rnd=new Random();
static Scanner scanner = new Scanner(System.in);
static int eingabe;
static int fehlversuche=0;

	public static void main(String[] args) {
		boolean ergGefunden=false;
		int zahl = rnd.nextInt(100);
		System.out.println("Geschätze Zahl eingeben: ");
		eingabe=scanner.nextInt();
		while(ergGefunden==false){
		if(eingabe<zahl)
			{System.out.println("Die gesuchte Zahl ist größer!");
			System.out.print("Geschätze Zahl eingeben: ");
			eingabe=scanner.nextInt();
			fehlversuche++;
			}
		
			else if(eingabe>zahl)
			{System.out.println("Die gesuchte Zahl ist kleiner ");
		
			System.out.println("Geschätze Zahl eingeben: ");
			eingabe=scanner.nextInt();
			fehlversuche++;
			}
				else 
					{System.out.println("Die Zahl wurde gefunden! Anzahl Fehlversuche: "+fehlversuche);
					ergGefunden=true;}
				
		
		}	

	}

}
