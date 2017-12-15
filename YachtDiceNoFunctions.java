Learn Java The Hard Way Lesson 35 : Displaying Dice with Functions
This is the original code provided by the book before any of the changes 
from the study drill were applied. 

Study Drill: 

Adda sixth dice. Notice howeasy it isto displayr6 byjustadding a single 
function call. (Don’t forget to also add the sixth dice to the Boolean 
expression involving allSame.)
*/ 

public class YachtDiceNoFunctions 
{
	public static void main( String[] args ) 
  {
		int r1, r2;

		do {
			r1 = 1 + (int)(Math.random()*6);
			r2 = 1 + (int)(Math.random()*6);
			int total = r1 + r2;
			System.out.println("\nYou rolled a " + r1 + " and a " + r2);
			System.out.println("+---+");
			if ( r1 == 1 ) 
      {
				System.out.println("|   |");
				System.out.println("| o |");
				System.out.println("|   |");
			}
			else if ( r1 == 2 ) 
      {
				System.out.println("|o  |");
				System.out.println("|   |");
				System.out.println("|  o|");
			}
			else if ( r1 == 3 ) 
      {
				System.out.println("|o  |");
				System.out.println("| o |");
				System.out.println("|  o|");
			}
			else if ( r1 == 4 ) 
      {
				System.out.println("|o o|");
				System.out.println("|   |");
				System.out.println("|o o|");
			}
			else if ( r1 == 5 ) 
      {
				System.out.println("|o o|");
				System.out.println("| o |");
				System.out.println("|o o|");
			}
			else if ( r1 == 6 ) 
      {
				System.out.println("|o o|");
				System.out.println("|o o|");
				System.out.println("|o o|");
			}
			System.out.println("+---+");


			System.out.println("+---+");
			if ( r2 == 1 ) 
      {
				System.out.println("|   |");
				System.out.println("| o |");
				System.out.println("|   |");
			}
			else if ( r2 == 2 ) 
      {
				System.out.println("|o  |");
				System.out.println("|   |");
				System.out.println("|  o|");
			}
			else if ( r2 == 3 ) 
      {
				System.out.println("|o  |");
				System.out.println("| o |");
				System.out.println("|  o|");
			}
			else if ( r2 == 4 ) 
      {
				System.out.println("|o o|");
				System.out.println("|   |");
				System.out.println("|o o|");
			}
			else if ( r2 == 5 )
      {
				System.out.println("|o o|");
				System.out.println("| o |");
				System.out.println("|o o|");
			}
			else if ( r2 == 6 ) 
      {
				System.out.println("|o o|");
				System.out.println("|o o|");
				System.out.println("|o o|");
			}
			System.out.println("+---+");

			System.out.println("The total is " + total + "\n");
		} while ( r1 != r2 );

		System.out.println("Doubles!  Nice job.");
	}
}
