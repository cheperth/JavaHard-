/*
Learn Java The Hard Way Lesson 18:If Statements with Strings
This is the original provided source code provided by the 
book before any changes were made. 

Study Drills: 

1. Pick a second secret word that will also work. Then add an OR to the first if statement 
so that typing EITHER word makes it print out “That’s correct!”. For example, 
if I wanted the new secret word to be “mogul”, I could change the if statement 
to look like this: if ( guess.equals(secret) || guess.equals("mogul") ) { Pick a different word for yours, though.
*/ 

import java.util.Scanner;

public class SecretWord 
{
	public static void main( String[] args )
  {
		Scanner keyboard = new Scanner(System.in);
		String secret = "please", guess;

		System.out.print( "What's the secret word? " );
		guess = keyboard.next();

		if ( guess.equals(secret) ) {
			System.out.println( "That's correct!" );
		}
		else {
			System.out.println( "No, the secret word isn't \"" + guess + "\"." );
		}

		if ( guess == secret ) {
			System.out.println( "(This will never ever show, no matter what.)" );
		}
	}
}
