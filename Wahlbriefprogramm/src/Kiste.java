public class Kiste {
	int groe�e;
	int[] kiste = new int[groe�e];

	void Kiste(int groe�e) {
		this.groe�e=groe�e;
	}
	public void setGroe�e(int groe�e)
	{
		this.groe�e=groe�e;
	}
	public int getGroe�e()
	{
		return groe�e;
	}
	public void gibAus(int[] arr)
	{
		System.out.print("Kiste 1 enth�lt die Unterlagen: ");
		for (int y = 0; y < arr.length; y++)
			System.out.print(arr[y] + " ");
		System.out.println();
	}
}
