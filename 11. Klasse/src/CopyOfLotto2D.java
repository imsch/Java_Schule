import java.awt.Dimension;
import java.util.Random;

import javax.swing.Box;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class CopyOfLotto2D{
	final static int anzahlZiehungen = 1;
	static int[] zahlenpool = new int[49];
	static int[][] ziehung = new int[6][anzahlZiehungen];
	static int[] eingabe = new int[6];
	static Random rnd = new Random();
	
	static JTextField z1=new JTextField(2);
	static JTextField z2=new JTextField(2);
	static JTextField z3=new JTextField(2);
	static JTextField z4=new JTextField(2);
	static JTextField z5=new JTextField(2);
	static JTextField z6=new JTextField(2);
	
	static JFrame frame = new JFrame();
	

	public static void eingabeDialog()
	{	
		JPanel myPanel= new JPanel();
		myPanel.add(new JLabel("Lottozahlen eingeben: "));
		myPanel.add(z1);
		myPanel.add(Box.createHorizontalStrut(15));
		myPanel.add(z2);
		myPanel.add(Box.createHorizontalStrut(15));
		myPanel.add(z3);
		myPanel.add(Box.createHorizontalStrut(15));
		myPanel.add(z4);
		myPanel.add(Box.createHorizontalStrut(15));
		myPanel.add(z5);
		myPanel.add(Box.createHorizontalStrut(15));
		myPanel.add(z6);
		myPanel.add(Box.createHorizontalStrut(15));
		
		JOptionPane.showConfirmDialog(null, myPanel, "LOTTO",JOptionPane.OK_CANCEL_OPTION);
		
	}
	
	public static void auswertung(int [] eingabe, int[][] ziehung)
	{
		JPanel myPanel = new JPanel();
		JPanel myPanel2=new JPanel();
		JFrame frame =new JFrame();
		
		myPanel.add(new JLabel("Ihr Tip: " +eingabe[0]+" "+eingabe[1]+" "+eingabe[2]+ " "+eingabe[3]+ " "+eingabe[4]+ " "+eingabe[5]));
		myPanel2.add(new JLabel("Die Lottozahlen sind: " +ziehung[0][0]+" "+ziehung[1][0]+" "+ziehung[2][0]+ " "+ziehung[3][0]+ " "+ziehung[4][0]+ " "+ziehung[5][0] ));
		JOptionPane.showMessageDialog( frame, myPanel);
		JOptionPane.showMessageDialog( frame, myPanel2);
		System.exit(0);
	}
	
	public static void fuelleEigeneZahlen(int[] x)
	{
		x[0]=Integer.parseInt(z1.getText());
		x[1]=Integer.parseInt(z2.getText());
		x[2]=Integer.parseInt(z3.getText());
		x[3]=Integer.parseInt(z4.getText());
		x[4]=Integer.parseInt(z5.getText());
		x[5]=Integer.parseInt(z6.getText());
	}
	
	public static void gibAus(int[] x) {

		for (int y = 0; y < x.length; y++)
			System.out.print(x[y] + " ");
		System.out.println();
	}

	public static void gibAus2D(int[][] x) {
		for (int i = 0; i < anzahlZiehungen; i++) {
			for (int y = 0; y < 6; y++)
				System.out.print(x[y][i] + " ");
			System.out.println();
		}
	}

	public static void fuelleZahlenpool() {
		int x = 1;
		for (int i = 0; i < 49; i++) {
			zahlenpool[i] = x;
			x++;
		}

	}

	public static void ueberpruefen2D(int[][] z) {
		for (int y = 0; y < anzahlZiehungen; y++) {
			for (int i = 0; i < 6;i++) {
				for (int x = 0; x < 6; x++) {
					if (z[x][y] == z[i][y]) {
						z[i][y] = zahlenpool[rnd.nextInt(49)];
					}
				}
				

			}
		}
	}

	public static void ziehen2D(int[][] z) {
		for (int y = 0; y < anzahlZiehungen; y++) {
			for (int x = 0; x < 6; x++) {
				z[x][y] = zahlenpool[rnd.nextInt(49)];
			}
			ueberpruefen2D(z);
		}
	}

	public static void main(String[] args) {
		
		fuelleZahlenpool();
		eingabeDialog();
		fuelleEigeneZahlen(eingabe);
		ziehen2D(ziehung);
		auswertung(eingabe,ziehung);
	}

}
