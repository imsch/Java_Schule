import java.util.Random;

public class Zufallsgenerator {

	static Random rnd = new Random();
	static int[] treffer = new int[100];
	static int zufallszahl;
	static int trefferMax;
	static int trefferMin;
	
	public static void maxTreffer(int[] x)
	{
		for(int i =0;i<x.length;i++)
		{
			if(trefferMax<x[i])
				trefferMax=x[i];
		}
	}
	
	public static void minTreffer(int[] x)
	{
		trefferMin=x.length;
		for(int i =0;i<x.length;i++)
		{
			if(trefferMin>x[i])
				trefferMin=x[i];
		}
	}
	

	public static void trefferZaehlen() {
		for (int i = 0; i <= 10000; i++) {
			zufallszahl = rnd.nextInt(100);
			treffer[zufallszahl] = treffer[zufallszahl] + 1;
		}
	}

	public static void gibAusZahlen(int[] x) {
		for (int y = 1; y < x.length + 1; y++) {
			System.out.print(x[y - 1] + " ");
			if (y % 20 == 0)
				System.out.println();
		}
	}

	public static void gibAusBalken(int[] x) {
		for (int y = 0; y < x.length; y++) {
			if (y < 10)
				System.out.print(" ");
			System.out.print(y + " ");
			for (int i = 0; i < x[y]; i++) {

				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public static void gibAusSkalierung(int[] x)
	{
		maxTreffer(x);
		System.out.println();
		System.out.print("0%|");
		for(int i=0;i<trefferMax;i++)
		{
			System.out.print("*");
		}
		System.out.print("|100%");

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		trefferZaehlen();
		gibAusZahlen(treffer);
		gibAusBalken(treffer);
		gibAusSkalierung(treffer);

	}

}
