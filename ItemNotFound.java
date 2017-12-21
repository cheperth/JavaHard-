/*
Learn Java The Hard Way Lesson 50 : Saying Something Is NOT in an Array
This is the source code after the changes from the study drill were applied.

Study Drill: 

Create a new array with different values or change some 
of the names in the array of Greek mortal heroes so that there 
are some duplicates. Then add a second for loop that uses a counter 
to determine if a value is found.
*/ 

import java.util.Scanner;

public class ItemNotFound 
{ 
	public static void main(String[]args) 
	{
		Scanner keyboard = new Scanner(System.in); 
		
		String[]heroes = 
		{ 
			"Abderus", "Achilles", "Aeneas", "Ajax", "Amphitryon", 
			"Bellerophon", "Castor", "Chrysippus", "Daedalus", "Diomedes", 
			"Eleusis", "Eunostus", "Ganymede", "Hector", "Iolaus", "Jason", 
			"Meleager", "Odysseus", "Orpheus", "Perseus", "Theseus", "Abderus", 
			"Achilles", "Aeneas", "Ajax", "Amphitryon"
		}; 
		String guess; 
		boolean found; 
		int counter = 0; 
		
		
		
		System.out.println( "Pop Quiz!" ); 
		System.out.print( "Name any *mortal* hero from Greek mythology: "); 
		
		guess = keyboard.next();  
		for ( String hero : heroes ) 
		{ 
			if ( guess.equals(hero) ) 
			{  
			counter++;
			} 
                } 
	    System.out.println( counter ); 
	}
} 
