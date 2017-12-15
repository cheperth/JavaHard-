/*
Learn Java The Hard Way Lesson Nested For Loops
This is the original source code provided by the book 
before any of the changes from the study drill were applied. 

Study Drill: 

1. Change the order of the loops so that the “c” loop is 
on the inside and the “n” loop is on the outside.
2. Add a System.out.println() statement where indicated 
(after the close brace of the inner loop (the “b” loop), 
but still inside the outer loop). 
*/ 

public class NestingLoops 
{
	public static void main( String[] args )
  {
		// this is #1 - I'll call it "CN"
		for ( char c='A'; c <= 'E'; c++ ) {
			for ( int n=1; n <= 3; n++ ) {
				System.out.println( c + " " + n );
			}
		}

		System.out.println("\n");

		// this is #2 - I'll call it "AB"
		for ( int a=1; a <= 3; a++ ) {
			for ( int b=1; b <= 3; b++ ) {
				System.out.print( "(" + a + "," + b + ") " );
			}
			// * You will add a line of code here.
		}

		System.out.println("\n");
	}
}
