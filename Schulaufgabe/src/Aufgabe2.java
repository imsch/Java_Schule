
public class Aufgabe2 {

public static void zaehlen(){
	int c1=0;
	int c2=0;
	int c3=0;
	int c4=0;
	int c5=0;
	for (int i=0;i<10;i++)
	{
		c1++;
			for (int j =0;j<10;j++)
			{
				c2++;
				if(i==j)
				{c3++;}
				else
				{c4++;}
			}
	}
	c5++;
	System.out.println(c1+" "+c2+" "+c3+" "+c4+" "+c5);
}



public static void main(String[] args){
	zaehlen();
}
}
