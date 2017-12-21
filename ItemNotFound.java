/*
Learn Java The Hard Way Lesson 
This is the original source code provided by the book 
before any of the changes from the study drill were applied.

Study Drill: 

Either create a new array with different values or change some 
of the names in the array of Greek mortal heroes so that there 
are some duplicates. Then add a second for loop that uses a counter 
to determine if a value is found.
*/ 


import java.util.Scanner;

public class ItemNotFound 
{
	public static void main( String[] args ) 
  {
		Scanner keyboard = new Scanner(System.in);

		String[] heroes = 
    {
			"Abderus", "Achilles", "Aeneas", "Ajax", "Amphitryon",
			"Bellerophon", "Castor", "Chrysippus", "Daedalus", "Diomedes",
			"Eleusis", "Eunostus", "Ganymede", "Hector", "Iolaus", "Jason",
			"Meleager", "Odysseus", "Orpheus", "Perseus", "Theseus"
		};
		String guess;
		boolean found;

		System.out.println( "Pop Quiz!" );
		System.out.print( "Name any *mortal* hero from Greek mythology: " );
		guess = keyboard.next();

		found = false;
		for ( String hero : heroes ) 
    {
			if ( guess.equals(hero) ) 
      {
				System.out.println( "That's one of them!" );
				found = true;
			}
		}

		if ( found == false ) 
    {
			System.out.println("No, " + guess + " wasn't a Greek mortal hero.");
		}
	}
}
