/*
Learn Java The Hard Way 46 : Nested For Loops
This is the original source code provided by the book before any of the 
changes from the Strudy Drill were applied. 

Study Drill: 

1)Change the order of the loops so that the “c” loop is on the 
inside and the “n” loop is on the outside. How does the output change? 
2) Look at the second set of nested loops (“AB”). Change the print() 
statement to println(). How does the output change? (Then change it back to print().)
*/ 

public class NestingLoops
{
	public static void main( String[] args ) 
  {
		// this is #1 - I'll call it "CN"
		for ( char c='A'; c <= 'E'; c++ ) 
    {
			for ( int n=1; n <= 3; n++ ) 
      {
				System.out.println( c + " " + n );
			}
		}

		System.out.println("\n");

		// this is #2 - I'll call it "AB"
		for ( int a=1; a <= 3; a++ ) 
    {
			for ( int b=1; b <= 3; b++ ) 
      {
				System.out.print( "(" + a + "," + b + ") " );
			}
			// * You will add a line of code here.
		}

		System.out.println("\n");
	}
}
