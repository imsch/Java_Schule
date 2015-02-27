
public class QuadratZahlen {

	
public static void quadratZahlenBerechnen(int x){    //berechnen der Quadratzahlen von 1 bis x//
	for(int i =0; i<=x;i++)
	{
		int y=i*i;
		System.out.println(i+"² = "+ y);
	}
}



public static void main(String[] args) {
		quadratZahlenBerechnen(10);
	}

}
