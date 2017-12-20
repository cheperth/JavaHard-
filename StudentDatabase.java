/*
Learn Java The Hard Way 55 : An Array of Records
This is the source code after the changes from the study drill were applied. 

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

public class StudentDatabase { 
	public static void main( String[]arge ) { 
		Student[] db; 
		db = new Student[4]; 
		
		db[0] = new Student(); 
		db[0].name = "Esteban"; 
		db[0].credits = 43; 
		db[0].gpa = 2.9; 
		
		db[1] = new Student(); 
		db[1].name = "Dave"; 
		db[1].credits = 15; 
		db[1].gpa = 3.9; 
		
		db[2] = new Student(); 
		db[2].name = "MIchelle"; 
		db[2].credits = 132; 
		db[2].gpa = 3.72; 
		
		db[3] = new Student(); 
		db[3].name = "Dirk"; 
		db[3].credits = 54; 
		db[3].gpa = 4.0; 
		
		for ( int i=0; i<db.length; i++ ) { 
			System.out.println("Name: " + db[i].name); 
			System.out.println("\tCredit hours: " + db[i].credits); 
			System.out.println("\tGPA: " + db[i].gpa + "\n"); 
		}
		
		int maxLoc = 0; 
		int minLoc = 0; 
		int maxCred = 0; 
		int minCred = 0; 
		
		
		for ( int a=1; a<db.length; a++ )
			if ( db[a].credits > db[maxCred].credits )
				maxCred = a; 
		
		for ( int b=1; b<db.length; b++ )
			if ( db[b].credits < db[minCred].credits )
				minCred = b;
		
		
		for ( int i=1; i<db.length; i++ )
			if ( db[i].gpa > db[maxLoc].gpa )
				maxLoc = i; 
			
		for ( int c=1; c<db.length; c++ )
			if ( db[c].gpa < db[minLoc].gpa )
				minLoc = c; 
        		
		System.out.println(db[maxCred].name + " has the higest amount of credits.\n"); 
		System.out.println(db[minCred].name + " has the lowest amouint of credits.\n"); 	
		System.out.println(db[minLoc].name + " has the lowest GPA.\n" );
		System.out.println(db[maxLoc].name + " has the highest GPA.\n" ); 
	}
}
		
		
