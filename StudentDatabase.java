/*
Learn Java The Hard Way 55 : An Array of Records
This is the original source code provided by the book 
before any of the changes from the study drill were applied. 

Study Drill: 

1) Add some more code to put values into the fields for your new student. 
Give this new student a higher GPA than “Dave” and confirm that the code 
correctly labels them as having the highest GPA. 
2) Add code so that the program also finds the student with the fewest credits.
*/ 

class Student 
{
	String name;
	int credits;
	double gpa;
}

public class StudentDatabase 
{
	public static void main( String[] args ) 
  {
		Student[] db;
		db = new Student[3];

		db[0] = new Student();
		db[0].name = "Esteban";
		db[0].credits = 43;
		db[0].gpa = 2.9;

		db[1] = new Student();
		db[1].name = "Dave";
		db[1].credits = 15;
		db[1].gpa = 4.0;

		db[2] = new Student();
		db[2].name = "Michelle";
		db[2].credits = 132;
		db[2].gpa = 3.72;

		for ( int i=0; i<db.length; i++ ) {
			System.out.println("Name: " + db[i].name);
			System.out.println("\tCredit hours: " + db[i].credits);
			System.out.println("\tGPA: " + db[i].gpa + "\n");
		}

		int maxLoc = 0;
		for ( int i=1; i<db.length; i++ )
			if ( db[i].gpa > db[maxLoc].gpa )
				maxLoc = i;

		System.out.println(db[maxLoc].name + " has the highest GPA.");
	}
}
