package Arrays;

public class ArrayWerteTauschen {
	static	int laenge=20;
	static	int[] array=new int [laenge];

		
		public static void gibAus()
		{
			for(int y=0;y<laenge;y++)
				System.out.print(array[y]+" ");
		}
	
		
		public static void fuelleArray(){   //Array mit Zahlen von 0 - Länge-1 füllen
 		int i=0;
		for(int x=0;x<laenge;x++)
		{	array[x]=i;
			i++;
		}
		}
		
		public static void tauscheWerte()
		{
			int zwischenSpeicher=0;
			for(int i=0;i<laenge-1;i++)
			{
				zwischenSpeicher=array[i];
				array[i]=array[i+1];
				array[i+1]=zwischenSpeicher;
				i++;
			}
		}
		
		public static void kehreUm()
		{
			int zwischenSpeicher=0;
			int x=laenge-1;
			for(int i=0;i<laenge/2;i++)   // /2 weil sonst die werte zurück getauscht werden :D
			{
				zwischenSpeicher=array[i];
				array[i]=array[x];
				array[x]=zwischenSpeicher;
				x--;
			}
		}
		
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		fuelleArray();
		gibAus();
		System.out.println();
		kehreUm();
		gibAus();

	}

}
