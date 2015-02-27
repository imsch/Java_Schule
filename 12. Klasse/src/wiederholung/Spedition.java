package wiederholung;

public class Spedition {

	public static void gibAus2D(int[][] arr) {
		for (int y = 0; y < 2; y++) {
			for (int x = 0; x < 9; x++)
				System.out.print(arr[x][y] + " ");
			System.out.println();
		}
	}

	public static double einzelBerechnung(int[][] arr, int index) {
		double erg;
		int deltaX;
		int deltaY;
		deltaX = arr[(index + 1) % arr.length][0] - arr[index][0]; // Pythagoras
		deltaY = arr[(index + 1) % arr.length][1] - arr[index][1]; // + 1) % arr.length]
																	// um beim letzten
																	// wert den ersten als
																	// vergleichswert zu nehmen
		erg = (double) Math.sqrt((deltaX * deltaX) + (deltaY * deltaY));
		return erg;
	}

	public static void gesamtBerechnung(int[][] arr) {
		double ergebnis = 0;
		for (int i = 0; i <= arr.length - 1; i++)
			ergebnis = ergebnis + einzelBerechnung(arr, i);
		System.out.println(ergebnis);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arrStrecke = { { 15, 10 }, { 10, 55 }, { 30, 90 }, { 70, 95 },
				{ 90, 85 }, { 100, 60 }, { 55, 65 }, { 85, 15 }, { 50, 20 } };
		gibAus2D(arrStrecke);
		gesamtBerechnung(arrStrecke);

	}

}
