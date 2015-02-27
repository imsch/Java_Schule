package aufgaben;

public class StudentDatabase {

	private Student[] studenten;
	private static int index = 0;
	private int size;

	public Student[] getStudenten() {
		return studenten;
	}

	public void setStudenten(Student[] studenten) {
		this.studenten = studenten;
	}

	public static int getIndex() {
		return index;
	}

	public static void setIndex(int index) {
		StudentDatabase.index = index;
	}

	public StudentDatabase(int size) {
		studenten = new Student[size];
		this.size = size;
	}

	public void printMe() {
		for (int i = 0; i < studenten.length; i++) {
			if (studenten[i] != null) {
				studenten[i].printMe();
				System.out.println("-------------------------");
			}
		}
	}

	public void addStudent(String name, String studiengang, int alter, int note) {
		Student stud = new Student(name, studiengang, alter, note);
		studenten[index] = stud;
		index++;
	}

	/*
	 * public void deleteStudent(String matNr) { for (int i = 0; i < size; i++)
	 * { if (studenten[i] != null) { if
	 * (studenten[i].getMatNr().contains(matNr)) { studenten[i] = null; } } } }
	 */
	public void deleteStudent(int indexNr) {
		if (studenten[indexNr] != null) {
			studenten[indexNr] = null;
		}
	}

	public void bubbleSort() {
		boolean esWurdeSortiert = false;
		do {
			esWurdeSortiert = false;
			for (int i = 0; i < size - 1; i++) {
				if (studenten[i] == null && studenten[i + 1] != null) {
					studenten[i] = studenten[i + 1];
					studenten[i + 1] = null;
					esWurdeSortiert = true;
				}
			}
		} while (esWurdeSortiert);
	}

	public void backSort() {
		for (int i = 0; i < size; i++) {
			
				if (studenten[i] == null) {
					for (int x=size-1; x > i; x--) {
						if(studenten[x]!=null)
						{
							Student stud=studenten[i];
							studenten[i]=studenten[x];
							studenten[x]=stud;
						}

					}
				}
			} 
	}

	public int numberOfStudents() {
		int anzahl = 0;
		for (int i = 0; i < studenten.length; i++) {
			if (studenten[i] != null)
				anzahl++;
		}
		return anzahl;
	}

	public double durchschnittsNote() {
		double summeDerNoten = 0;
		for (int i = 0; i < studenten.length; i++)
			if (studenten[i] != null) {
				summeDerNoten = summeDerNoten + studenten[i].getNote();
			}
		if (numberOfStudents() != 0 && summeDerNoten != 0)
			return (double) summeDerNoten / numberOfStudents();
		else
			return 0;
	}

	public double durchschnittsAlter() {
		double summeDesAlters = 0;
		for (int i = 0; i < studenten.length; i++)
			if (studenten[i] != null) {
				summeDesAlters = summeDesAlters + studenten[i].getAlter();
			}
		if (numberOfStudents() != 0 && summeDesAlters != 0)
			return (double) summeDesAlters / numberOfStudents();
		else
			return 0;
	}

	public void printArray() {
		for (int i = 0; i < studenten.length; i++) {
			System.out.println(studenten[i]);
		}
	}

}
