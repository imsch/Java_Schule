package Arrays;
import java.util.Random;

public class Lotto2D {
	static int[] zahlenpool = new int[49];
	static int[][] ziehung = new int[6][10];
	final static int anzahlZiehungen = 1;
	static Random rnd = new Random();

	public static void gibAus(int[] x) {

		for (int y = 0; y < x.length; y++)
			System.out.print(x[y] + " ");
		System.out.println();
	}

	public static void gibAus2D(int[][] x) {
		for (int i = 0; i < anzahlZiehungen; i++) {
			for (int y = 0; y < 6; y++)
				System.out.print(x[y][i] + " ");
			System.out.println();
		}
	}

	public static void fuelleZahlenpool() {
		int x = 1;
		for (int i = 0; i < 49; i++) {
			zahlenpool[i] = x;
			x++;
		}

	}

	public static void ueberpruefen2D(int[][] z) {
		for (int y = 0; y < anzahlZiehungen; y++) {
			for (int i = 0; i < 6;i++) {
				for (int x = 0; x < 6; x++) {
					if (z[x][y] == z[i][y]) {
						z[i][y] = zahlenpool[rnd.nextInt(49)];
					}
				}
				

			}
		}
	}

	public static void ziehen2D(int[][] z) {
		for (int y = 0; y < anzahlZiehungen; y++) {
			for (int x = 0; x < 6; x++) {
				z[x][y] = zahlenpool[rnd.nextInt(49)];
			}
			ueberpruefen2D(z);
		}
	}

	public static void main(String[] args) {
		fuelleZahlenpool();
		gibAus(zahlenpool);
		System.out.println();
		ziehen2D(ziehung);
		gibAus2D(ziehung);

	}

}
