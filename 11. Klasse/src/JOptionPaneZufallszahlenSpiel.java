
import java.util.Random;
import java.util.Scanner;

import javax.swing.JOptionPane;


public class JOptionPaneZufallszahlenSpiel {
static Random rnd=new Random();
static Scanner scanner = new Scanner(System.in);
static int eingabe;
static int fehlversuche=0;
 

	public static void main(String[] args) {
		
		boolean ergGefunden=false;
		int zahl = rnd.nextInt(100);
		String ans=JOptionPane.showInputDialog(null,"Geschätze Zahl eingeben: ");
		int eingabe=Integer.parseInt(ans);
		while(ergGefunden==false){
		if(eingabe<zahl)
			{ans=JOptionPane.showInputDialog(null,"Die gesuchte Zahl ist größer! " + "Geschätze Zahl eingeben: ");
			fehlversuche++;
			eingabe=Integer.parseInt(ans);
			
			}
		
			else if(eingabe>zahl)
			{ans=JOptionPane.showInputDialog(null,"Die gesuchte Zahl ist kleiner! " + "Geschätze Zahl eingeben: ");
			fehlversuche++;
			eingabe=Integer.parseInt(ans);
			}
				else 
					{
					
					JOptionPane.showMessageDialog(null,"Die gesuchte Zahl wurde gefunden! Anzahl der Fehlversuche:  "+ fehlversuche );
					ergGefunden=true;}
				
		
		}	

	}

}
