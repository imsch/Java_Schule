package mobiltarife;

public class Tarif {

public static double tarif1(int minuten)
{
	double ggb=11.75;
	double minpreis=0.5;
	double monatspreis=(double)ggb+minpreis*minuten;
	return monatspreis;
}
public static double tarif2(int minuten)
{
	double ggb=19.25;
	double minpreis=0.25;
	double monatspreis=(double)ggb+minpreis*minuten;
	return monatspreis;
}
public static double tarif3(int minuten)
{
	double ggb=22.75;
	double minpreis=0.375;
	int freiminuten=30;
	double monatspreis;
	if(minuten<=freiminuten)
		monatspreis=ggb;
	else
	monatspreis=(double)ggb+minpreis*minuten-30*minpreis;
	return monatspreis;
}

public static void main(String[] args) {
	System.out.println("Min| Tarif1| Tarif2| Tarif3");
	for(int i=10;i<=100;i=i+10)
	{
		if(i<100)
		System.out.println(i+" | "+tarif1(i)+" | "+tarif2(i)+" | "+tarif3(i));
		else
			System.out.println(i+"| "+tarif1(i)+" | "+tarif2(i)+" | "+tarif3(i));
	}
	
}
}
