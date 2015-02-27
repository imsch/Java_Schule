package Arrays;

public class ArraysVerschieben {

	static int[] a=new int[5];
	
	public static void gibAus(int[] x)
	{  
		
		for(int y=0;y<x.length;y++)
			System.out.print(x[y]+" ");
			System.out.println();
	}
	
	public static void rightShift()
	{
		for(int i=a.length-1;i>0;i--)
		{
			a[i]=a[i-1];
		}
		a[0]=0;
		//gibAus(a)
		
	}
	
	public static void leftShift()
	{
		
		for(int i=0;i<a.length-1;i++)
		{
			a[i]=a[i+1];
		}
		a[a.length-1]=0;
		//gibAus(a);

	}
	
	public static void ringShiftRight(int z)
	{
		int x;
		for(int p=0;p<z;p++)
		{
		for(int y=0;y<a.length;y++)
		{
			x=a[4];
			rightShift();
			a[0]=x;
			gibAus(a);
		}
		}
	}
	
	public static void ringShiftLeft(int z)
	{
		int x;
		for(int p=0;p<z;p++)
		{
		for(int y=a.length;y>0;y--)
		{
			x=a[0];
			leftShift();
			a[4]=x;
			gibAus(a);
		}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=0;i<a.length;i++)
			a[i]=i+1;
		gibAus(a);
		ringShiftLeft(1);

	}

}
