package array_fortgeschritten;

import java.util.Random;

public class bubblesort {
	
	static int [] array= new int[10];
	static boolean sortiert = false;

	public static void gibAus(int[] arr)
	{
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i]+" ");
		System.out.println();
	}
	
	public static void sortieren (int[] arr)
	{
		sortiert=false;
		int zsp=0;
		for(int i=0;i<arr.length-1;i++)
		{
			
			if(arr[i]>arr[i+1])
			{
				zsp=arr[i];
				arr[i]=arr[i+1];
				arr[i+1]=zsp;
				sortiert=true;
			}
		}
	}
	public static void fuelleArray(int [] arr) {
		Random rnd = new Random();
		int zufallsWert = rnd.nextInt(10)-2;
		for (int i = 0; i < arr.length - 1; i++) {
			arr[i] = zufallsWert;
			zufallsWert = rnd.nextInt(10)-2;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		fuelleArray(array);
		gibAus(array);
		do{
			sortieren(array);
			gibAus(array);
		}
		while(true == sortiert);
		

	}

}
