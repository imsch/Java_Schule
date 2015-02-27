package array_fortgeschritten;

import java.util.Random;

public class Nikolaus_Wirth {

	static int[] array = new int[200000];
	static int[] arrayKopie = new int[200000];

	public static void kopiereArray(int[] arr, int[] arr1) {
		System.arraycopy(arr, 0, arr1, 0, arr1.length);
	}

	public static void gibAus(int[] arr) {
		for (int i = 0; i < arr.length; i++)
			System.out.print(arr[i] + " ");
		System.out.println();
	}

	public static void fuelleArray(int[] arr) {
		Random rnd = new Random();
		int zufallsWert = rnd.nextInt(arr.length) - arr.length/2;
		for (int i = 0; i < arr.length - 1; i++) {
			arr[i] = zufallsWert;
			zufallsWert = rnd.nextInt(arr.length) - arr.length/2;
		}
	}

	public static void wirth(int[] arr) {
		int tmp;
		for (int i = 1; i < arr.length; i++) {
			for (int j = arr.length - 1; j >= 1; j--)
				if (arr[j - 1] > arr[j]) {
					tmp = arr[j - 1];
					arr[j - 1] = arr[j];
					arr[j] = tmp;
				}
		}
	}

	public static long wirthUnoptimiert(int[] arr) {
		long start;
		long ende;
		long benoetigteZeit;
		fuelleArray(array);
		kopiereArray(array, arrayKopie);
		System.out.println(array[0]+" "+array[array.length-1]);
		start = System.currentTimeMillis();
		wirth(array);
		ende = System.currentTimeMillis();
		System.out.println(array[0]+" "+array[array.length-1]);
		benoetigteZeit = ende - start;
		System.out.println(benoetigteZeit + "ms");

		return benoetigteZeit;
	}

	public static void wirthOpt(int[] arr) {
		
		int laenge=arr.length;

		int tmp;
		for (int i = 1; i < laenge; i++) {
			for (int j = arr.length - 1; j >= 1; j--)
				if (arr[j - 1] > arr[j]) {
					tmp = arr[j - 1];
					arr[j - 1] = arr[j];
					arr[j] = tmp;
				}
			laenge--;
		}

	}

	public static long wirthOptimiert(int[] arr) {
		long start;
		long ende;
		long benoetigteZeit;

		System.out.println(arrayKopie[0]+" "+arrayKopie[arrayKopie.length-1]);
		start = System.currentTimeMillis();
		wirthOpt(arrayKopie);
		ende = System.currentTimeMillis();
		System.out.println(arrayKopie[0]+" "+arrayKopie[arrayKopie.length-1]);
		benoetigteZeit = ende - start;
		System.out.println(benoetigteZeit + "ms opt");

		return benoetigteZeit;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double zeitUnopt = wirthUnoptimiert(array);
		double zeitOpt = wirthOptimiert(arrayKopie);
		double verbesserung=zeitUnopt/zeitOpt*100;
		System.out.println(verbesserung-100 + "% schneller");

	}

}
