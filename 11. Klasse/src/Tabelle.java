public class Tabelle {

	public static int rechnen(int a, int b) // berechnen des ergebnisses
	{
		int x = a;
		int y = b;
		int erg = x * y;
		return erg;

	}
	

	
	public static void main(String[] args) {
		final int maxSpalten=20;
		final int maxZeilen=20;
				
		int a = 1;
		int b = 1;
		
		
		System.out.print("   ||");
		for(int x=1;x<maxSpalten+1;x++)  //obere Zeile der Tabelle
		{
			if(x<10){
			System.out.print("   "+x+"|");
			}
			else if(x<100)
				System.out.print("  "+x+"|");
			
		}
		System.out.println();
		
		for(int spalte=1;spalte<=(maxSpalten+1)*5;spalte++)//Linie ziehen
			System.out.print("-");
			System.out.println();
		
			for (int z = 1; z < maxZeilen+1; z++) {          //erste Spalte
			if(z<10)
			System.out.print("| "+z+"||");
			else
				System.out.print("|"+z+"||");
			
			
			for (int n = 0; n < maxSpalten;) {      //beginn mit der Tabelle
			
				rechnen(a, b);
				if (rechnen(a, b) < 10)
					System.out.print("   ");
				else if (rechnen(a, b) < 100)
					System.out.print("  ");
				else if (rechnen(a, b) < 1000)
					System.out.print(" ");
				System.out.print(rechnen(a, b) + "|");
				n++;
				a++;
			}

			b++;//Zeilenwechsel
			a = 1; //Zurücksetzen des Zählers
			
			System.out.println();
			for(int spalte=1;spalte<=(maxSpalten+1)*5;spalte++)//Linie ziehen
				System.out.print("-");
				System.out.println();
		}
	}

}
