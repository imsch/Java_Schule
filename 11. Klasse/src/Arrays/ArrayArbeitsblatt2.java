package Arrays;
import java.util.Random;


public class ArrayArbeitsblatt2 {

	static int[] a= new int[100];
	static int[] b=new int[100];
	static int[] c=new int[100];
	static Random rnd = new Random();
	
	public static void gibAus(int[] x)
	{  
		
		for(int y=0;y<x.length;y++)
			System.out.print(x[y]+" ");
			System.out.println();
	}
	
	public static void subtraktion(int[] x, int[] y,  int[] z)
	{
		for (int i=0; i<z.length;i++)
		{
			z[i]=x[i]-y[i];
		}
	}
	
	public static void kopieren(int[] x, int[] y)
	{
		for(int i=0;i<x.length;i++)
		{
			y[i]=x[i];
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		for(int i=0;i<a.length;i++)
			a[i]=rnd.nextInt(110+1)+9;
		
		kopieren(a,b);
		a[0]=10;
		subtraktion(a,b,c);
		
		
		
		gibAus(a);
		gibAus(b);
		gibAus(c);
		

	}

}
