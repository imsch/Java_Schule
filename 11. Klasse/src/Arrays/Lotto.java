package Arrays;
import java.util.Random;


public class Lotto {

	static int[] zahlenpool=new int[49];
	static int[] ziehung=new int[6];
	static Random rnd=new Random();
	
	public static void gibAus(int[] x)
	{  
		
		for(int y=0;y<x.length;y++)
			System.out.print(x[y]+" ");
			System.out.println();
	}
	
	public static void fuelleZahlenpool()
	{
		int x=1;
		for(int i=0;i<49;i++)
		{
			zahlenpool[i]=x;
			x++;
		}
			
	}
	
	public static void ueberpruefen(int[] z)
	{
		for(int i=0;i<6;i++)
		{
			for(int x=0;x<6;x++)
			{
				if(z[i]==z[x])
					z[i]=zahlenpool[rnd.nextInt(49)];
			}
		}
	}

	
	public static void ziehen(int[] x)
	{
		
		for (int i=0;i<6;i++)
			{
			x[i]=zahlenpool[rnd.nextInt(49)];
			}
		ueberpruefen(x);
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		fuelleZahlenpool();
		gibAus(zahlenpool);
		ziehen(ziehung);
		gibAus(ziehung);


	}

}
