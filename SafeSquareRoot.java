/*
Learn Java The Hard Way Lesson 28 : Using Loops for Error-Checking
The is the source code provided by the book before any of the changes 
from the Study Drill were applied.

Study Drill: 
Add another input protection loop toward the top of the program. 
Ask them “Are you ready?!?” and don’t go on until they reply "YES!". 
Remember to use .equals() to compare Strings and use ! for “not”.
*/ 


import java.util.Scanner;

public class SafeSquareRoot 
{
	public static void main( String[] args ) 
   {
		Scanner keyboard = new Scanner(System.in);
		double x, y;

		System.out.print("Give me a number, and I'll find it's square root. ");
		System.out.print("(No negatives, please.) ");
		x = keyboard.nextDouble();

		while ( x < 0 ) {
			System.out.println("I won't take the square root of a negative.");
			System.out.print("\nNew number: ");
			x = keyboard.nextDouble();
		}

		y = Math.sqrt(x);

		System.out.println("The square root of "+x+" is "+y);
	}
}
