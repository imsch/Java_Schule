package musiktest;

class Eins{
	
	public long f;
	public static long g=2;
	public Eins(long f){
		this.f=f;
	}
	public Object clone(){
		return new Eins(f+g);
	}
}

class Zwei{
	public Eins h;
	public Zwei(Eins eins)
	{
		h=eins;
	}
	public Object clone(){
		return new Zwei(h);
	}
}


public class TestZwei {
	static Klang k1=new Klang();
	public static void main(String[] args) {
		Eins e1 = new Eins(1), e2;
		Zwei z1=new Zwei(e1), z2;
		System.out.println(Eins.g +"-");
		System.out.println(z1.h.f);
		e2=(Eins) e1.clone();
		z2=(Zwei) z1.clone();
		e1.f=4;
		Eins.g=5;
		System.out.print(e2.f+"-");
		System.out.print(e2.g + "-");
		System.out.print(z1.h.f+"-");
		System.out.print(z2.h.f+"-");
		System.out.println(z2.h.g);
		System.out.println(k1);

	}

}
