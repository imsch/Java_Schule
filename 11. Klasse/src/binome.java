public class binome {

	static int potenz = 9;

	static int[] zeile2 = new int[potenz + 1];

	public static void gibAus(int[] x) {

		for (int y = 0; y < x.length; y++)
			System.out.print(x[y] + " ");
		System.out.println();
	}

	public static void pascal() {
		for (int i = 1; i <= potenz; i++) {
			for(int n=0;n<)
			int[] zeile1 = new int[i];
			zeile1[0]=1;
			zeile1[zeile1.length-i] = zeile1[i-1] + zeile1[i-1];
			zeile2=zeile1;
			gibAus(zeile2);
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		pascal();

	}

}
