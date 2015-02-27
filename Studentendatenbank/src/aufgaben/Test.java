package aufgaben;

import java.util.Random;

public class Test {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentDatabase database=new StudentDatabase(10);
		Random rnd=new Random();
		int alter;
		int note;
		for(int i=0;i<10;i++){
			alter=rnd.nextInt(40)+18;
			note=rnd.nextInt(5)+1;
			database.addStudent("Hans Maier", "Klukheit", alter,note);
		}
		database.deleteStudent(2);
		database.deleteStudent(5);
		database.deleteStudent(7);
		database.printArray();
		System.out.println();
		database.backSort();
		database.printArray();
	}
}
