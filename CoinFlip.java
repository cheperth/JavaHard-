/*
Learn Java The Hard Way Lesson 29:Do-While loops
This is the source code provided by the book before 
any changes from the Study Drill are applied. 

Study Drill: 

 Change the code so that it uses a while loop instead of 
 a do-while loop. Make sure it compiles and works the same. 
 */ 

import java.util.Scanner;

public class CoinFlip 
{
	public static void main( String[] args ) 
  {
		Scanner keyboard = new Scanner(System.in);
		String coin, again;
		int streak = 0;
		boolean gotHeads;

		do {
			gotHeads = Math.random() < 0.5;

			if ( gotHeads )
				coin = "HEADS";
			else
				coin = "TAILS";

			System.out.println("You flip a coin and it is... " + coin);

			if ( gotHeads ) {
				streak++;
				System.out.println("\tThat's " + streak + " in a row....");
				System.out.print("\tWould you like to flip again (y/n)? ");
				again = keyboard.next();
			}
			else {
				System.out.println("\tYou lose everything!");
				System.out.println("\tShould've quit while you were aHEAD....");
				streak = 0;
				again = "n";
			}
		} while ( again.equals("y") );

		System.out.println( "Final score: " + streak );
	}
}
