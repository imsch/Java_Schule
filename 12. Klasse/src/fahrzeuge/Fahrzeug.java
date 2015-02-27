package fahrzeuge;

import java.util.*;

public class Fahrzeug {
	private float preis;
	private String herstellerName;
	protected static Scanner eingabe = new Scanner(System.in);

	public Fahrzeug() { // Konstruktor
		System.out.println();
		System.out.print("Geben Sie den Herstellernamen ein: ");
		herstellerName = eingabe.next();
		System.out.print("Geben Sie den Preis ein: ");
		try {
			preis = eingabe.nextFloat();
		} catch (InputMismatchException e) {
			System.out.println("Keine gültige Preisangabe!");
			System.exit(1);
		}

	}

	public void print() {
		System.out.println();
		System.out.println("Herstellename: " + herstellerName);
		System.out.println("Preis: "+preis);
	}
}
