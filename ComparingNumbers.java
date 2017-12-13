/*
Learn Java the Hard Way Lesson 16: More If Statements
This is the original source code provided by the book 
before any changes were made. 

Study Drills: 

1. Add another line of code after line 29 that says System.out.println( "Hey." );. 
Indent it so that it lines up with the println() statement above it, like so:

if ( first != second ) System.out.println( first + " is NOT EQUAL TO " + second ); 
System.out.println( "Hey." );

2. Add curly braces around the body of the final if statement so that the “Hey” line 
is part of the body. Then remove all the other if statement body curly braces so that 
only the last if statement in the program has them. Confirm that everything works as expected.
*/ 


import java.util.Scanner;

public class ComparingNumbers
{
	public static void main( String[] args ) 
  {
		Scanner keyboard = new Scanner(System.in);
		double first, second;

		System.out.print( "Give me two numbers. First: " );
		first = keyboard.nextDouble();
		System.out.print( "Second: " );
		second = keyboard.nextDouble();

		if ( first < second ) {
			System.out.println( first + " is LESS THAN " + second );
		}
		if ( first <= second ) {
			System.out.println( first + " is LESS THAN/EQUAL TO " + second );
		}
		if ( first == second ) {
			System.out.println( first + " is EQUAL TO " + second );
		}
		if ( first >= second ) {
			System.out.println( first + " is GREATER THAN/EQUAL TO " + second );
		}
		if ( first > second ) {
			System.out.println( first + " is GREATER THAN " + second );
		}
		if ( first != second )
			System.out.println( first + " is NOT EQUAL TO " + second );
	}
}
