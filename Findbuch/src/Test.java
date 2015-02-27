import javax.swing.JOptionPane;

public class Test {

	static String[][] tabelle = new String[10][1000];

	static public void fuelleTabelle(String[][] table) {

		for (int y = 1; y < 10; y++) 
		{
			for(int x=0;x<3;x++)
			{
			if(x==0){
				String name = JOptionPane.showInputDialog(null, "Name: ");
			table[x][y] = name;
			}
			if(x==1){
				String gender = JOptionPane.showInputDialog(null, "Geschlecht: ");
			table[x][y] = gender;
			}
			if(x==2){
				String birth = JOptionPane.showInputDialog(null, "Geburtstag: ");
			table[x][y] = birth;
			}
			}
		}

	}

	static public void gibAusUeberschrift() {
		for (int x = 0; x < 3; x++) {
			System.out.print(tabelle[x][0] + " ");
		}
		System.out.println();
		System.out.println();
	}

	static public void gibAusTabelle() {
		for (int y = 1; y < 10; y++) {
			for (int x = 0; x < 3; x++) {
				System.out.print(tabelle[x][y] + " ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		tabelle[0][0] = "Name";
		tabelle[1][0] = "Geschlecht";
		tabelle[2][0] = "Geburtstag";
		String q=tabelle[1][1];
		String test="m";
		gibAusUeberschrift();
		if(q==test)
			gibAusTabelle();
		else{
		fuelleTabelle(tabelle);
		gibAusTabelle();}
		
	}

}
