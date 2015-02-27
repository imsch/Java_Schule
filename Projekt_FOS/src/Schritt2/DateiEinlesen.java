package Schritt2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class DateiEinlesen {

	public static void lesen(File f) {
		try { // try benötigt, da das Ziel möglicherweise keine lesbare oder
				// Vorhandene Datei oder ein Ordner sein könnte
			BufferedReader reader = new BufferedReader(new FileReader(// filereader
																		// liest
																		// das
																		// Dokument
																		// Zeichen
																		// für
																		// Zeichen
																		// aus
																		// und
																		// übergibt
																		// das
																		// an
																		// den
																		// Bufferedreader
																		// zur
																		// performance
																		// steigerung
					f));
			String zeile = null;
			while ((zeile = reader.readLine()) != null) { // readLine liest eine
															// Zeile und
															// speichert diese
															// in den String
															// zeile
				System.out.println(zeile);
			}
			reader.close(); // gibt verwendeten Speicher wieder frei
		} catch (Exception e) {
			e.printStackTrace(); // gibt aus welcher Fehler wo aufgetreten ist
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File datei = new File(
				"/home/janis/Schreibtisch/Java_Projekt/Kopie von Schritt_1.txt"); // zu
																					// dursuchende
																					// Datei
		lesen(datei);

	}

}
