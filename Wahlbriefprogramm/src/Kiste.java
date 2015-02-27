public class Kiste {
	int groeﬂe;
	int[] kiste = new int[groeﬂe];

	void Kiste(int groeﬂe) {
		this.groeﬂe=groeﬂe;
	}
	public void setGroeﬂe(int groeﬂe)
	{
		this.groeﬂe=groeﬂe;
	}
	public int getGroeﬂe()
	{
		return groeﬂe;
	}
	public void gibAus(int[] arr)
	{
		System.out.print("Kiste 1 enth‰lt die Unterlagen: ");
		for (int y = 0; y < arr.length; y++)
			System.out.print(arr[y] + " ");
		System.out.println();
	}
}
