package wiederholung;

import java.util.Random;

public class Sortieralgorithmen {
	long time = System.currentTimeMillis();

	public static void fuelleArray(int[] arr) {
		Random rnd = new Random();
		for (int i = 0; i < arr.length; i++) {
			arr[i] = rnd.nextInt(100000);
		}
	}

	public static void gibAus(int[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

	public static void bubbleSort(int[] array) {
		boolean sortiert = false;
		int speicher;
		do {
			sortiert = false;
			for (int i = 0; i < array.length - 1; i++) {
				if (array[i + 1] < array[i]) {
					speicher = array[i];
					array[i] = array[i + 1];
					array[i + 1] = speicher;
					sortiert = true;
				}
			}
		} while (sortiert == true);

	}

	public static void selectionSort(int[] array) {
		int speicher = 0;
		for (int i = 0; i < array.length - 1; i++) {
			speicher = array[i]; // Der Startwert wid festgelegt
			int index = i; // Der Index des Startwertes wird festgelegt
			for (int x = i; x < array.length - 1; x++) { // x=i weil der Teil
															// davor nicht
															// betrachtet werden
															// darf
															// ( alles mit
															// kleinstem wert
															// überschrieben)
				if (array[x] < speicher) { // wenn es einen kleineren wert gibt
											// als der momentanige im ZS
											// wird wert und position im array
											// gespeichert
					speicher = array[x];
					index = x;
				}
			}
			array[index] = array[i]; // ist der kleinste wert gefunden wird
										// getauscht
			array[i] = speicher;
		}

	}

	public static void sSMitZeit(int[] arr) {
		long zeit1 = System.currentTimeMillis();
		selectionSort(arr);
		long zeit2 = System.currentTimeMillis();
		long endzeit = zeit2 - zeit1;
		System.out.println(endzeit + " ms");
	}

	public static void bSMitZeit(int[] arr) {
		long zeit1 = System.currentTimeMillis();
		bubbleSort(arr);
		long zeit2 = System.currentTimeMillis();
		long endzeitMs = zeit2 - zeit1;
		long endzeitSec = endzeitMs/1000;
		long endzeitMin = endzeitSec/60;
		System.out.println(endzeitMs + " ms");
		System.out.println(endzeitSec + " sec");
		System.out.println(endzeitMin + " min");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = new int[500000];
		fuelleArray(array);
		bSMitZeit(array);

	}

}
