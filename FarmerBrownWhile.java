/*
Learn Java The Hard Lesson  47 : Generating and Filtering Values
This is the source code provided by the book after the 
changes from the study drill were applied. 

Study Drill: 

There is no reason to make the “sheep” loop try 11 or 12 or more sheep 
because we can’t afford them.) See if you can change the loop bounds to 
only test combinations that make sense.
*/ 

public class FarmerBrownWhile 
{ 
	public static void main( String[] args ) 
	{ 
		int s = 1; 
		while ( s <= 10 )
		{ 
			int g = 1; 
			while ( g <= 28 ) 
			{ 
				int c = 1; 
				while ( c <= 100 ) 
				{ 
					if ( s+g+c == 100 && 10.00*s + 3.50*g + 0.50*c == 100.00 ) 
					{ 
						System.out.print( s + " sheep, " ); 
						System.out.print( g + " goats, and " ); 
						System.out.println( c + " chickens." ); 

					} 
					c++; 
				} 
				g++; 
		    } 
			s++; 
		}  
	} 
}
