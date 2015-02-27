package Schritt3;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class TextDurchsuchen {

	public static void suchen(File f, String suchwort) {
		try {
			BufferedReader reader = new BufferedReader(new FileReader(f));
			String zeile = null;
			int nr = 1; // diese Nummer wird verwendet um in der Ausgabe die
						// Zeilennummer anzugeben
			while ((zeile = reader.readLine()) != null) {
				if (zeile.contains(suchwort)) { // Mit contains wir der String
												// einer Zeile nach der
												// gesuchten Zeichenfolge
												// durchsucht
					System.out.println("Zeile " + nr + ": " + zeile);
					nr++;
				} else
					nr++;
			}
			reader.close();
			System.out.println("Suche beendet!");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String suche = "das";	//Suchwort eingeben
		File datei = new File(
				"/home/janis/Schreibtisch/Java_Projekt/Kopie von Schritt_1.txt");//Dateipfad eingeben
		suchen(datei, suche);

	}

}
