
public class Aufgabe5 {

	public static void vergleicheDatum(int t1, int m1, int j1, int t2, int m2, int j2)
	{
		int x = t1 - t2;
		int y = m1 - m2;
		int z = j1 - j2;
		if(x>0 && y>=0 && z >=0 ){
			System.out.println("2kleiner1");
		}
		else if (x==0 && y==0 && z==0)
			System.out.println("gleich");
		else System.out.println("2größer1");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		vergleicheDatum(20,11,2013,22,9,2013);
		
	}

}
