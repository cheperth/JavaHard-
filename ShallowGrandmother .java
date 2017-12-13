/*
Learn Java the Hard Way Lesson 14 Compound Boolean Expression. 
This is the original source code provided by the book 
before any changes are made.

Study Drill: 

Many people have two grandmothers. Let’s pretend the other grandmother just wants you to be happy. 
Add a question “How happy do you make them?” and a variable to hold its answer. 
Then add a Boolean variable called allowed2 and write a new expression that’s true 
when the person is close to your age and makes you happy (a happiness number more than 7 out of 10).
*/ 

import java.util.Scanner;

public class ShallowGrandmother 
{
	public static void main( String[]args ) 
  {
		Scanner keyboard = new Scanner(System.in);
		int age;
		double income, cute;
		boolean allowed;

		System.out.print( "Enter your age: " );
		age = keyboard.nextInt();

		System.out.print( "Enter your yearly income: " );
		income = keyboard.nextDouble();

		System.out.print( "How cute are you, on a scale from 0.0 to 10.0? " );
		cute = keyboard.nextDouble();

		allowed = ( age > 25 && age < 40 && ( income > 50000 || cute >= 8.5 ) );

		System.out.println( "Allowed to date my grandchild? " + allowed );
	}
}

