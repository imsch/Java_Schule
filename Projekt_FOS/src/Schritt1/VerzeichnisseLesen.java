package Schritt1;

import java.io.File;

public class VerzeichnisseLesen {

	private static void listDir(File dir, String abstand) {// abstand sorgt für
															// bessere Übersicht
															// in der Konsole

		File[] files = dir.listFiles();// ein Filearray wird erstellt und eine
										// Liste der Unterordner des Zielpfades
										// gespeichert.
		if (files != null) { // Es wird überprüft ob das Zielverzeichnis und
								// benötigte Berechtigungen vorhanden sind. Ist
								// das Ziel kein Ordner oder nicht vorhanden
								// wird eine selbstgeschriebene "Fehlermeldung"
								// ausgegeben.
			for (int i = 0; i < files.length; i++) {
				System.out.print(abstand + files[i].getAbsolutePath());// Das
																		// zuvor
																		// erstellte
																		// Array
																		// wird
																		// abgelaufen
																		// und
																		// ausgegeben
																		// außerdem
																		// wird
																		// geprüft
																		// ob
																		// das
																		// aktuelle
																		// File
																		// eine
																		// Datei
																		// oder
																		// ein
																		// Ordner
																		// ist
				if (files[i].isDirectory()) { // Ist es ein Ordner wird ans Ende
												// des Dateipfades (Ordner)
												// geschrieben und die Methode
												// ruft sich selbst auf.
					System.out.print(" (Ordner)\n");
					listDir(files[i], abstand + " " + abstand); // ruft sich
																// selbst auf
				} else {
					System.out.print(" (Datei)\n");// Ist es eine Datei wird
													// (Datei) ans Ende
													// geschrieben
				}
			}
		} else
			System.out
					.println("FEHLER: Der angegebene Pfad verweist nicht auf einen Ordner oder das Ziel ist nicht vorhanden!");
	}

	public static void listTXT(File dir, String abstand) {
		File[] files = dir.listFiles();
		if (files != null) { // Erforderliche Berechtigungen etc. sind vorhanden
			for (int i = 0; i < files.length; i++) {
				if (files[i].isFile()) {
					if (files[i].getAbsolutePath().indexOf(".txt") != -1) { // Der
																			// Pfadstring
																			// wird
																			// nach
																			// .txt
																			// durchsucht
																			// und
																			// nur
																			// wenn
																			// .txt
																			// enthalten
																			// ist
																			// wird
																			// etwas
																			// ausgegeben
						System.out
								.println(abstand + files[i].getAbsolutePath());
					}
				} else if (files[i].isDirectory())// rekursiv damit alle
													// Unterordner mit
													// berücksichtigt werden.
					listTXT(files[i], abstand + " " + abstand);
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String abstandhalter = "| ";// hier wird ein Abstandhalter festgelegt,
									// welcher anzeigen soll, das man sich in
									// einem Unterordner befindet
		File f = new File("/home/janis/Schreibtisch/Java_Projekt/");
		listDir(f, abstandhalter);

	}
}
