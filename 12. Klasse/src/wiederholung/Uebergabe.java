package wiederholung;

import java.util.Scanner;

public class Uebergabe {
	static double[] y = new double[21];
	static Scanner scanner = new Scanner(System.in);
	static double eingabe;
	static double m = 1; // Steigung
	static double t = 1; // Y-Achsenabschnitt

	public static void gibAus(double[] x) {

		for (int y = 0; y < x.length; y++)
			System.out.print(x[y] + " ");
		System.out.println();
	}

	public static void funktionsWerteBerechnen(double b) {

		for (int x = 0; x < y.length; x++)
			y[x] = m * x + b;
		gibAus(y);
	}

	public static double groesserNull(double[] arr) {
		int zaehler = 0;
		for (int i = 0; i < arr.length; i++)
			if (arr[i] > 0) // wenn ein Wert des arrays >0 dann zaehler +1
				zaehler++;
		return zaehler;

	}

	public static void verschieben(double b) {
		for (int i = 0; i < 5; i++) {
			System.out
					.println("Ums welchen Wert wollen sie den Graphen verschieben?");
			eingabe = scanner.nextDouble();
			b = t + eingabe; // das neue t wird geändert auf basis der eingabe
								// und des alten t
			t = b;
			funktionsWerteBerechnen(t);
			System.out.println(groesserNull(y) + " Werte sind größer Null!");
		}
	}

	public static double flaecheBerechnen(double[] arr) {
		double flaeche = 0;
		double laenge = arr.length - 1;
		double hoehe = arr[arr.length - 1];
		double nullstelle = -t / m;

		if (nullstelle == 0) {
			flaeche = (laenge * hoehe) / 2;
		} else if (nullstelle > 0) {
			double kleineFlaeche = 0;
			double großeFlaeche = 0;
			kleineFlaeche = ((nullstelle * arr[0]) / 2) * (-1);
			großeFlaeche = ((laenge - nullstelle) * hoehe) / 2;
			flaeche = kleineFlaeche + großeFlaeche;
		} else {
			double kleineFlaeche = 0;
			double großeFlaeche = 0;
			kleineFlaeche = ((nullstelle * arr[0]) / 2) * -1;
			großeFlaeche = ((arr.length + nullstelle) * hoehe) / 2;
			flaeche = großeFlaeche - kleineFlaeche;
		}

		return flaeche;
	}

	public static void mUndBBerechnen(int x1, int y1, int x2, int y2) {
		
		double steigung = (double) (y2 - (y1)) / (x2 - (x1)); 
		//(double) um java zu sagen dass ein double zugewiesen werden soll (Typecasting)

		double verschiebung = y1 - steigung * x1;

		if (verschiebung > 0)
			System.out.println("Y=" + steigung + "X+" + verschiebung);
		else if (verschiebung == 0)
			System.out.println("Y=" + steigung + "X");
		else
			System.out.println("Y=" + steigung + "X" + verschiebung);
	}

	public static void main(String[] arguments) {
		funktionsWerteBerechnen(t);
		//System.out.println(groesserNull(y) + " Werte sind größer Null!");
		System.out.println("Die Fläche unter dem Graphen beträgt: "
				+ flaecheBerechnen(y) + " FE");
		mUndBBerechnen(2, -3, 4, 8);

	}
}
