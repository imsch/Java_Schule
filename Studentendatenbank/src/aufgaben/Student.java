package aufgaben;

import java.util.Random;

public class Student {
	private String name;
	private int matNr;
	private String studiengang;
	private int alter;
	private int note;

	public Student(String name, String studiengang, int alter, int note) {
		this.name = name;
		this.studiengang = studiengang;
		this.alter = alter;
		this.note = note;
		matNr = StudentDatabase.getIndex();
	}

	public int getNote() {
		return note;
	}

	public void setNote(int note) {
		this.note = note;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	/*public void setMatNr(String matNr) {
		this.matNr = matNr;
	}

	public String getMatNr() {
		return matNr;
	}*/

	public void setStudiengang(String studiengang) {
		this.studiengang = studiengang;
	}

	public String getStudiengang() {
		return studiengang;
	}

	public void setAlter(int alter) {
		this.alter = alter;
	}

	public int getAlter() {
		return alter;
	}

	public String generiereMatNr() {
		long time = System.currentTimeMillis();
		long age = this.alter;
		long note = this.note;
		String name= this.name;
		Random rnd = new Random();
		String genMatNr = this.studiengang.charAt(rnd.nextInt(this.studiengang.length()))+String.valueOf(time * note / age)+name.charAt(rnd.nextInt(name.length()-1));
		return genMatNr;

	}

	/*
	 * public boolean istVorhanden(long[] arr, long matNr) { boolean
	 * istVorhanden = false; long speicher=matNr;
	 * 
	 * for (int x = 0; x < arr.length; x++) { if (arr[x]==speicher) {
	 * istVorhanden = true; }
	 * 
	 * }
	 * 
	 * return istVorhanden; }
	 */

	public void printMe() {
		System.out.println("Name des Students: " + this.name);
		System.out.println("Matrikelnummer: " + this.matNr);
		System.out.println("Studiengang: " + this.studiengang);
		System.out.println(("Alter: " + this.alter));
		System.out.println("Note: " + this.note);
	}

}
