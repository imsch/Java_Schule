import java.util.Scanner;

public class Annahme {
	static final int[] kiste1 = new int[10];
	static final int[] kiste2 = new int[10];
	static final int[] kiste3 = new int[10];
	static final Scanner scanner = new Scanner(System.in);

	public static void gibAusKisten(int[] a, int[] b, int[] c) {

		System.out.print("Kiste 1 enthält die Unterlagen: ");
		for (int y = 0; y < a.length; y++)
			System.out.print(a[y] + " ");
		System.out.println();

		System.out.print("Kiste 2 enthält die Unterlagen: ");
		for (int y = 0; y < b.length; y++)
			System.out.print(b[y] + " ");
		System.out.println();

		System.out.print("Kiste 3 enthält die Unterlagen: ");
		for (int y = 0; y < c.length; y++)
			System.out.print(c[y] + " ");
		System.out.println();
	}

	public static void kisteFestlegen(int briefnummer) {
		if (briefnummer < 1)
			System.out.println("Der Brief hat eine falsche Nummer!");
		else if (briefnummer <= 10) {
			if (überprüfe(kiste1, briefnummer) == false)
				kiste1[briefnummer - 1] = briefnummer;
			else
				System.out.println("Brief ist doppelt!");
		} else if (briefnummer <= 20) {
			if (überprüfe(kiste2, briefnummer) == false)
				kiste2[briefnummer - 11] = briefnummer;
			else
				System.out.println("Brief ist doppelt!");
		} else if (briefnummer <= 30) {
			if (überprüfe(kiste3, briefnummer) == false)
				kiste3[briefnummer - 21] = briefnummer;
			else
				System.out.println("Brief ist doppelt!");
		} else
			System.out.println("Der Brief hat eine falsche Nummer!");
	}

	public static int annahme() {
		int brief;
		System.out.println("Bitte geben sie die Briefnummer ein: ");
		brief = scanner.nextInt();
		return brief;

	}

	public static boolean überprüfe(int[] kistenNummer, int briefnummer) {
		boolean enthalten = false;
		for (int i = 0; i < kistenNummer.length - 1; i++) {
			if (kistenNummer[i] == briefnummer)
				enthalten = true;
		}
		return enthalten;
	}

	public static boolean jaNeinAbfrage() throws Exception {
		String antwort = "y";
		String eingabe=scanner.next();
		antwort = eingabe;
		if (antwort.charAt(0) == 'y')
			return true;
		else if (antwort.charAt(0) == 'n')
			return false;
		else
			throw new Exception("Falsche Eingabe");

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean naechsterBrief = false;
		boolean naechsteKiste=false;
		do {
			kisteFestlegen(annahme());
			System.out.println("Naechsten Brief Annehmen?(y/n)");
			try {
				naechsterBrief = jaNeinAbfrage();
			} catch (Exception ex) {
				System.out.println("Fehler: "+ ex.toString());
			}
		} while (naechsterBrief == true);
		
		System.out.println("Kisten anzeigen?");
		try {
			naechsteKiste = jaNeinAbfrage();
		} catch (Exception ex) {
			System.out.println("Fehler: "+ ex.toString());}
		if(naechsteKiste==true)
			gibAusKisten(kiste1,kiste2,kiste3);
	}

}
