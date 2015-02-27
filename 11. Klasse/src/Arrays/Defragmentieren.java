package Arrays;
import java.util.Random;

public class Defragmentieren {

	static int[] arr = new int[30];
	static Random rnd = new Random();
	static int zufallsWert = rnd.nextInt(100);
	static int zufallsPosition = rnd.nextInt(arr.length);

	public static void gibAus(int[] x) {

		for (int y = 0; y < x.length; y++)
			System.out.print(x[y] + " ");
		System.out.println();
	}

	public static void fuelleArray() {
		for (int i = 0; i < arr.length - 1; i++) {
			arr[zufallsPosition] = zufallsWert;
			zufallsWert = rnd.nextInt(100) + 1;
			zufallsPosition = rnd.nextInt(arr.length);
		}
	}

	public static int scannen(int[] x) {
		int zaehler = 0;
		for (int i = 0; i < x.length; i++)
			if (x[i] == 0)
				zaehler++;
		return zaehler;
	}

	public static void defrag(int[] x) {
		int zwischenspeicher = 0;
		int anzahlNullen = scannen(arr);
		for (int y = 0; y < anzahlNullen; y++) {
			for (int i = 0; i < x.length - 1; i++) {
				if (x[i] == 0) {
					zwischenspeicher = x[i];
					x[i] = x[i + 1];
					x[i + 1] = zwischenspeicher;
				}
			}
		}
	}

	public static void defragFast(int[] x) {
		int zwischenspeicher = 0;
		int anzahlNullen = scannen(arr);
		int z = x.length - 1;
		for (int y = 0; y < anzahlNullen; y++) {

			for (int i = 0; i < x.length - anzahlNullen; i++) {

				if (x[i] == 0) {

					/*
					 * wenn x an der stelle null ist wird das array von hinten
					 * nach einer zahl geprüft die größer null ist ist diese
					 * gefunden wird sie mit der null getauscht
					 */

					if (x[z] > 0) {
						zwischenspeicher = x[z];
						x[z] = x[i];
						x[i] = zwischenspeicher;
					} else {
						z--;
						i--;
					}

				}

			}
		}
	}

	public static void main(String[] args) {

		fuelleArray();
		gibAus(arr);
		System.out.println("Es sind "+scannen(arr)+" leere Speicherplätze vorhanden!");
		defragFast(arr);
		gibAus(arr);

	}
}
