package Arrays;
import java.util.Random;


public class Arrays {
	
	
	static	int laenge=20;
	static	int[] array=new int [laenge];

		
		public static void gibAus()
		{
			for(int y=0;y<laenge;y++)
				System.out.print(array[y]+" ");
				System.out.println();
		}
	
/*		public static void fuelleArray(){   //Array mit Zahlen von 0 - L�nge-1 f�llen
 		int i=0;
		for(int x=0;x<laenge;x++)
		{	array[x]=i;
			i++;
		}
		}
*/
/*		public static void fuelleArray()   // Array mit ungerade Zahlen f�llen
		{
			int i=1;  
			for(int x=0;x<laenge;x++)
			{	array[x]=i;
				i=i+2;
			}
		}
*/
/*		public static void fuelleArray()   // Array von l�nge - 1 f�llen
		{
			int i=1;  
			for(int x=laenge;x>0;x--)
			{	array[x-1]=i;
				i++;
			}
		}
*/
		public static void fuelleArray()   // Array mit Zufallszahlen f�llen
		{
			Random rnd=new Random();
			
			int i=rnd.nextInt(50);  
			for(int x=0;x<laenge;x++)
			{	array[x]=i;
				i=rnd.nextInt(50+1);
			}
		}
		
		public static boolean arrayScannen(int gesuchteZahl)
		{
			boolean y=false;
			for(int i = 0; i<laenge-1;)
			{	i++;
			
			if (array[i]==gesuchteZahl)
				y= true;
			}
			return y;
			
		}
		
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			int gesuchteZahl=27;
			fuelleArray();
			gibAus();
			if (arrayScannen(gesuchteZahl)==true)
				System.out.println("Die gesuchte Zahl " +gesuchteZahl +" ist enthalten");
			else
				System.out.println("Die gesuchte Zahl " +gesuchteZahl + " ist nicht enthalten");
	}

}
